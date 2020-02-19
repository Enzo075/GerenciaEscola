package controller;

import model.Professor;

public class ProfessorController {
	
	public void testaProfessor() {
	 Professor professor = new Professor();
	 professor.setNome("Nelson");
	 professor.setCpf("58361735974");
	 professor.setSalario(1600);
	 professor.setMateria("Matematica");
	 professor.exibe();
	 
	 }
}
