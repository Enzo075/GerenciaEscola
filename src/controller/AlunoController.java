package controller;

/**
 * Classe criada para armazer as informações registradas e colocar em um arquivo txt
 * 
 * @author eknascimento
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Data;
import model.Endereco;

public class AlunoController {
//	texto = leitor.readLine();
//	String dados[] = texto.split(";");
//	dados[0] = matricula;
//	dados[0] = matricula;
//	dados[0] = matricula;
	
	public void inserirAluno(String matricula, String nome, String rg, String cpf, Data dataNascimento, String resposta,
			String telefone, String cep, String numero, String complemento,String bairro, String logradouro, String cidade, 
			String estado, String senha) {
		
		Data data1 = new Data();
		Aluno aluno1 = new Aluno(matricula, nome, dataNascimento, resposta, rg, cpf, endereco, telefone, senha);
		
		try {
			File arquivo = new File("aluno.txt");
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo,true);
			
			PrintStream gravador = new PrintStream(arquivoOutput);
			gravador.print(aluno1.getMatricula());
			gravador.print(";");
			gravador.print(aluno1.getNome());
			gravador.print(";");
			gravador.print(aluno1.getDataNascimento());
			gravador.print(";");
			gravador.print(aluno1.getSexo());
			gravador.println("");
			
			gravador.close();
			arquivoOutput.close();
			
			JOptionPane.showMessageDialog(null, "Gravado com sucesso");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void listarTodos() {
		
		InputStream is;
		try {
			is = new FileInputStream("aluno.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);
			String texto = leitor.readLine();
			while (texto!=null) {
				
				String dados[] = texto.split(";");
				System.out.print("Matricula " + dados[0] + ";");
				System.out.print("Nome " + dados[1] + ";");
				System.out.print("Mes do aniversario " + dados[2] + ";");
				System.out.println("Sexo " + dados[3] + ";");
				texto = leitor.readLine();
			}
			is.close();
			isr.close();
			leitor.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("Arquivo de entrada não encontrado");
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void listarAniversariante(int mes) {
		
		InputStream is;
		try {
			is = new FileInputStream("aluno.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);
			String texto = leitor.readLine();
			
			while (texto!=null) {
				String dados[] = texto.split(";");
				String data[] = dados[2].split("/");
				int mesDoNascimento = Integer.parseInt(data[1]);
				if (mes == mesDoNascimento) {
					System.out.print("Matricula " + dados[0] + ";");
					System.out.print("Nome " + dados[1] + ";");
					System.out.print("Mes do aniversario " + dados[2] + ";");
					System.out.println("Sexo " + dados[3] + ";");
				}
				texto = leitor.readLine();
				
				
			}
			is.close();
			isr.close();
			leitor.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("Arquivo de entrada não encontrado");
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
