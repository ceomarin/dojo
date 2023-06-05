package com.ceomarin.listaestudiantes.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ceomarin.listaestudiantes.models.Contact;
import com.ceomarin.listaestudiantes.models.Student;
import com.ceomarin.listaestudiantes.services.ApiService;

@RestController
public class ApiController {

	@Autowired
	private ApiService apiService;
	
	@GetMapping("/students/create")
	public Map<String,String> createStudents(@RequestParam(value="firstName")String firstName,@RequestParam(value="lastName")String lastName,@RequestParam(value="age")String age) {
		HashMap<String, String> map = new HashMap<>();
		map.put("firsttName", firstName);
		map.put("lasttName", lastName);
		map.put("age", age);
		
		Student student = new Student(firstName,lastName,Integer.parseInt(age));
		apiService.createStudent(student);
		return map;
	}
	
//	URL:/contacts/create?student=1&address=1234%20Some%20Street&city=Los%20Angeles&state=CA
	@GetMapping("/contacts/create")
	public Map<String,String> createContacts(@RequestParam(value="student")String student,@RequestParam(value="address")String address,@RequestParam(value="city")String city,@RequestParam(value="state")String state) {
		HashMap<String, String> map = new HashMap<>();
		map.put("student", student);
		map.put("address", address);
		map.put("city", city);
		map.put("state", state);
		Long id = Long.parseLong(student);
		Student student1 = apiService.findStudent(id);
		Contact contact = new Contact(address,city,state,student1);
		apiService.createContact(contact);
		return map;
	}
	
	@GetMapping("/students")
	public Map<String,String> showStudents() {
		List<Student> listStudents = apiService.findStudents();
		HashMap<String, String> map = new HashMap<>();

		for (int i = 0; i < listStudents.size(); i++) {
			
			map.put("student"+i, listStudents.get(i).toString());
			
		}
		
		System.out.println(map);

		return map;
	}
}
