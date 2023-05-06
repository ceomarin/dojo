package com.ceomarin.proyecto_class.clases;
import java.util.ArrayList;

public class Portfolio {
private ArrayList<Project> projects;
	
	public Portfolio() {}

	public ArrayList<Project> getProjects() {
		return projects;
	}

	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}
	public double getPortfolioCost() {
		double costoTotalPortafolio = 0;
		 for(Project project :this.getProjects()) {
			 costoTotalPortafolio += project.getInitialCost();
		    }
		 return costoTotalPortafolio;
	}
	public void showPortfolioCost() {
		 for(Project project :this.getProjects()) {
			 System.out.println(project.elevatorPitch());
		    }
	}
}
