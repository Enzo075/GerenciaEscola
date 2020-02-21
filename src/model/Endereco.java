package model;

/**
 * Classe criada para dizer quais informações as outras classes devem pegar
 * 
 * @author eknascimento
 */

public class Endereco {
	
	private String logradouro;
	private int numero;
	private String bairro;
	private String copelemento;
	private Cidade cidade;
	private Estado estado;
	private String cep;
	
	public Endereco() {
		
	}
	
	public Endereco(String logradouro, int numero, String bairro, String copelemento, Cidade cidade, Estado estado,
			String cep) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.copelemento = copelemento;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCopelemento() {
		return copelemento;
	}

	public void setCopelemento(String copelemento) {
		this.copelemento = copelemento;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}
