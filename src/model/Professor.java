package model;

/**
 * Classe criada para dizer quais informações as outras classes devem pegar
 * 
 * @author eknascimento
 */

public class Professor extends Funcionario{
	private String materia;
	
	public void exibe() {
		super.exibe();
		System.out.println("Materia do Professor: " + materia);
		
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Professor(String materia) {
		this.materia = materia;
	}
	
	public Professor() {
		System.out.println("Professor criado");
	}
}