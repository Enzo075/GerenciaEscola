package model;

/**
 * Classe criada para dizer quais informações as outras classes devem pegar
 * 
 * @author eknascimento
 */

public class Cidade {
	
	public Cidade() {
		
	}
	
	public Cidade(String nome) {
		this.nome = nome;
	}
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
