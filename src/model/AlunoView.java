package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.AlunoController;

//import controller.AlunoController;
//import model.Data;

public class AlunoView {

	private static JFrame janela;

	private static JButton botao1;
	private static JButton botao2;

	private static JLabel jlbNome;
	private static JLabel jlbMatricula;
	private static JLabel jlbData;
	private static JLabel jlbGenero;

	private static JTextField txtNome;
	private static JTextField txtMatricula;
	private static JTextField txtData;
	private static JTextField txtGenero;

	public AlunoView() {

		iniciaGui();
	}

	public void iniciaGui() {

		janela = new JFrame("Cadastro Aluno");
		janela.getContentPane().setLayout(null);
		// cria a janela e da o nome dela

		botao1 = new JButton("Salvar");
		botao1.setBounds(100, 200, 90, 25);
		botao1.addActionListener(new CadastraListener());
		// cria o botao salvar

		botao2 = new JButton("Cancelar");
		botao2.setBounds(300, 200, 90, 25);
		botao2.addActionListener(new CancelaListener());

		jlbNome = new JLabel();
		jlbNome.setText("Nome do Aluno:");
		jlbNome.setBounds(10, 20, 115, 20);

		jlbMatricula = new JLabel();
		jlbMatricula.setText("Matricula do Aluno:");
		jlbMatricula.setBounds(10, 55, 115, 20);

		jlbData = new JLabel();
		jlbData.setText("Data do Nascimento:");
		jlbData.setBounds(10, 90, 125, 20);

		jlbGenero = new JLabel();
		jlbGenero.setText("Genero do aluno:");
		jlbGenero.setBounds(10, 125, 115, 20);

		txtNome = new JTextField();
		txtNome.setBounds(135, 20, 300, 20);

		txtMatricula = new JTextField();
		txtMatricula.setBounds(135, 55, 300, 20);

		txtData = new JTextField();
		txtData.setBounds(135, 90, 300, 20);

		txtGenero = new JTextField();
		txtGenero.setBounds(135, 125, 25, 20);

		janela.getContentPane().add(botao1);
		janela.getContentPane().add(botao2);

		janela.getContentPane().add(jlbNome);
		janela.getContentPane().add(txtNome);
		janela.getContentPane().add(jlbMatricula);
		janela.getContentPane().add(txtMatricula);
		janela.getContentPane().add(jlbData);
		janela.getContentPane().add(txtData);
		janela.getContentPane().add(jlbGenero);
		janela.getContentPane().add(txtGenero);

		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		janela.setSize(500, 300);
	}

	public class CadastraListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			AlunoController alunoController = new AlunoController();

			boolean registrado = true;

			try {

				String nome = txtNome.getText();
				String matricula = txtMatricula.getText();
				String data = txtData.getText();
				String genero = txtGenero.getText();
				// pega o que esta escrito nessas variaveis

				String tiraEspacoBrancoNome = nome.trim();
				String tiraEspacoBrancoMatricula = matricula.trim();

				char converteChar = genero.charAt(0);

				String quebraData[] = data.split("/");
				int dia = Integer.parseInt(quebraData[0]);
				int mes = Integer.parseInt(quebraData[1]);
				int ano = Integer.parseInt(quebraData[2]);

				int coun1 = tiraEspacoBrancoNome.length();
				int coun2 = tiraEspacoBrancoMatricula.length();
				int coun3 = genero.length();

				//  VALIDAÇÕES
				
				if (converteChar != 'M' && converteChar != 'F') {
					registrado = false;
				}

				if ((coun1 <= 0) || (coun2 <= 0) || (coun3 != 1)) { 
					registrado = false;
				}
				
				if (quebraData.length != 3) {
					registrado = false;
				}
				
				// FIM DAS VALIDAÇÕES 
				
				Data data2 = new Data(dia, mes, ano);
				Data data1 = data2;
				
				if (registrado) {
					
					alunoController.inserirAluno(matricula, nome, data1, converteChar);
					JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
					
				} else {
					JOptionPane.showMessageDialog(null, "ERRO!\nRevise o que você digitou\n\nLembrete:\nFormato de data é dd/MM/yyyy\nSexo você deverá preencher com a letra m ou f");
				}
				

			} catch (NumberFormatException N) { // Utilizo alguns catchs para tratar exceptions
				JOptionPane.showMessageDialog(null, "Dados inválidos");
			} catch (java.lang.ArrayIndexOutOfBoundsException A) {
				JOptionPane.showMessageDialog(null, "Data errada");
			} catch (java.lang.StringIndexOutOfBoundsException C) {
				JOptionPane.showMessageDialog(null, "Digite o sexo");
			}
			
			txtMatricula.setText("");
			txtNome.setText("");
			txtData.setText("");
			txtGenero.setText("");
		}

	}

	public class CancelaListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			janela.setVisible(false);
		}
	}
}
