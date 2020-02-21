package controller;

/**
 * Classe criada para armazer as informações registradas e colocar em um arquivo txt
 * 
 * @author eknascimento
 */

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
