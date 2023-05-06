package com.ceomarin.proyecto_class.test;
import com.ceomarin.proyecto_class.clases.*;
import java.util.ArrayList;

public class ProjectTest {
	public static void main(String[] args) {
		
		Project proyecto1 =  new Project();
		proyecto1.setNombre("runway");
		proyecto1.setDescripcion("esté es el proyecto runway");
		proyecto1.setInitialCost(5500.0);
		//System.out.println(proyecto1.elevatorPitch());
		
		Project proyecto2 = new Project();
		proyecto2.setNombre("secondProject");
		proyecto2.setDescripcion("esté es el proyecto secondProject");
		proyecto2.setInitialCost(25500.0);
		//System.out.println(proyecto2.elevatorPitch());
		
		ArrayList<Project> arrProjects = new ArrayList<Project>();
		arrProjects.add(proyecto1);
		arrProjects.add(proyecto2);
		
		Portfolio portafolio = new Portfolio();
		portafolio.setProjects(arrProjects);
		portafolio.showPortfolioCost();
		double costoTotal = portafolio.getPortfolioCost();
		System.out.println("Costo total del portafolio: "+costoTotal);
		
	}
}
