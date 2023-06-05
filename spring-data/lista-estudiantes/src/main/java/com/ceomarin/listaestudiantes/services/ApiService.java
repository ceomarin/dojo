package com.ceomarin.listaestudiantes.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceomarin.listaestudiantes.models.Contact;
import com.ceomarin.listaestudiantes.models.Student;
import com.ceomarin.listaestudiantes.repositories.ContactRepository;
import com.ceomarin.listaestudiantes.repositories.StudentRepository;

@Service
public class ApiService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ContactRepository contactRepository;

	public void createStudent(Student student) {
		studentRepository.save(student);
	}
	
	public Student findStudent(Long id) {
		Optional<Student> optionalStudent = studentRepository.findById(id);
		if (optionalStudent.isPresent()) {
			return optionalStudent.get();
		} else {
			return null;
		}
	}
	
	public List<Student> findStudents(){
		return studentRepository.findAll();
	}
	
	public void createContact(Contact contact) {
		contactRepository.save(contact);
	}
}
