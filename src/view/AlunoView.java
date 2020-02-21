package view;

/**
 * Classe criada para dizer quais informações as outras classes devem pegar
 * 
 * @author eknascimento
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.AlunoController;

import controller.AlunoController;
//import model.Data;

public class AlunoView {

	private JFrame janela;
	
	private JPanel painelDaJanela;
	
	private JButton btnSalvar;
	private JButton btnCancelar;

	private JLabel jlbMatricula;
	private JLabel jlbNome;
	private JLabel jlbRg;
	private JLabel jlbCpf;
	private JLabel jlbData;
	private JLabel jlbGenero;
	private JLabel jlbTelefone;
	private JLabel jlbCep;
	private JLabel jlbNumero;
	private JLabel jlbComplemento;
	private JLabel jlbBairro;
	private JLabel jlbLogradouro;
	private JLabel jlbCidade;
	private JLabel jlbEstado;
	private JLabel jlbSenha;

	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtRg;
	private JTextField txtCpf;
	private JTextField txtData;
	private JTextField txtTelefone;
	private JTextField txtCep;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtLogradouro;
	
	private JPasswordField jpwSenha;
	
	private String[] cidades = {"São Paulo","Osasco","Cotia","Pinheiros"};
	private String[] estados = {"SP","RJ", "Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch"};
		
		
	private JComboBox jcbCidade;
	private JComboBox jcbEstado;

	private JRadioButton rbtGeneroM;
	private JRadioButton rbtGeneroF;
	
	private ButtonGroup grpRadio;

	public AlunoView() {

		iniciaGui();
	}

	public void iniciaGui() {

		janela = new JFrame("Cadastro Aluno");
		// cria a janela e da o nome dela
		
		painelDaJanela = (JPanel)janela.getContentPane();

		btnSalvar = new JButton();
		btnCancelar = new JButton();
		// cria os botoes

		jlbMatricula = new JLabel();
		jlbNome = new JLabel();
		jlbRg = new JLabel();
		jlbCpf = new JLabel();
		jlbData = new JLabel();
		jlbGenero = new JLabel();
		jlbTelefone = new JLabel();
		jlbCep = new JLabel();
		jlbNumero = new JLabel();
		jlbComplemento = new JLabel();
		jlbBairro = new JLabel();
		jlbLogradouro = new JLabel();
		jlbLogradouro = new JLabel();
		jlbCidade = new JLabel();
		jlbEstado = new JLabel();
		jlbSenha = new JLabel();
		// declara o que aparece... exemplo = Nome do aluno:

		txtMatricula = new JTextField();
		txtNome = new JTextField();
		txtRg = new JTextField();
		txtCpf = new JTextField();
		txtData = new JTextField();
		txtTelefone = new JTextField();
		txtCep = new JTextField();
		txtNumero = new JTextField();
		txtComplemento = new JTextField();
		txtBairro = new JTextField();
		txtLogradouro = new JTextField();
		// declara o lugar onde será escrito as coisas

		jpwSenha = new JPasswordField();
		
		jcbCidade = new JComboBox(cidades);
		jcbEstado = new JComboBox(estados);
		
		rbtGeneroM = new JRadioButton();
		rbtGeneroF = new JRadioButton();
		

		btnSalvar = new JButton("Salvar");
		// declara o botõe
		btnSalvar.setBounds(100, 415, 90, 25);
//		btnSalvar.addActionListener(new CadastraListener());
		// cria o botao salvar

		btnCancelar = new JButton("Cancelar");
		// declara os botões
		btnCancelar.setBounds(300, 415, 90, 25);
		btnCancelar.addActionListener(new CancelaListener());
		// cria o botao Cancelar
		
		grpRadio = new ButtonGroup();

		jlbMatricula.setText("Matricula do Aluno:");
		jlbMatricula.setBounds(10, 20, 115, 20);

		jlbNome.setText("Nome do Aluno:");
		jlbNome.setBounds(10, 55, 115, 20);

		jlbRg.setText("RG:");
		jlbRg.setBounds(10, 90, 125, 20);
		
		jlbCpf.setText("CPF:");
		jlbCpf.setBounds(200, 90, 125, 20);
		
		jlbData.setText("Data:");
		jlbData.setBounds(10, 135, 125, 20);
		
		jlbGenero.setText("Genero:");
		jlbGenero.setBounds(200, 135, 125, 20);
		
		jlbTelefone.setText("Telefone:");
		jlbTelefone.setBounds(10, 180, 125, 20);
		
		jlbCep.setText("CEP:");
		jlbCep.setBounds(200, 180, 125, 20);
		
		jlbNumero.setText("Número:");
		jlbNumero.setBounds(450, 225, 125, 20);
		
		jlbComplemento.setText("Complemento:");
		jlbComplemento.setBounds(10, 225, 125, 20);
		
		jlbBairro.setText("Bairro:");
		jlbBairro.setBounds(10, 270, 125, 20);
		
		jlbLogradouro.setText("Logradouro:");
		jlbLogradouro.setBounds(430, 270, 125, 20);
		
		jlbCidade.setText("Cidade:");
		jlbCidade.setBounds(10, 315, 125, 20);
		
		jlbEstado.setText("Estado:");
		jlbEstado.setBounds(200, 315, 125, 20);
		
		jlbSenha.setText("Senha:");
		jlbSenha.setBounds(150, 350, 125, 20);
		
		
		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("######");
			txtMatricula = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		txtMatricula.setBounds(125, 20, 300, 20);
		//fala o tamanho da Matricula e deixa ela formatada
		
		txtNome.setBounds(125, 55, 300, 20);


		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("##.###.###-#");
			txtRg = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		txtRg.setBounds(68 , 90, 81, 20);
		//fala o tamanho do RG e deixa ela formatado
		
		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("###.###.###-##");
			txtCpf = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		txtCpf.setBounds(230, 90, 95, 20);
		//fala o tamanho do CPF e deixa ela formatado
		
		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("##/##/####");
			txtData = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		txtData.setBounds(68, 135, 70, 20);
		//fala o tamanho da data e deixa ela formatada

		rbtGeneroM.setText("Masculino");
		rbtGeneroM.setBounds(250, 135, 86, 20);
		
		rbtGeneroF.setText("Feminino");
		rbtGeneroF.setBounds(350, 135, 79, 20);
		
		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("(##)#####.####");
			txtTelefone = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		txtTelefone.setBounds(68, 180, 95, 20);
		//fala o tamanho do CPF e deixa ela formatado
		
		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("#####-###");
			txtCep = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {
		}
		txtCep.setBounds(230, 180, 95, 20);
		//fala o tamanho do CPF e deixa ela formatado
		
		txtNumero.setBounds(503, 225, 200, 20);
		
		txtComplemento.setBounds(100, 225, 200, 20);
		
		txtBairro.setBounds(100, 270, 200, 20);
		
		txtLogradouro.setBounds(503, 270, 200, 20);
		
		jcbCidade.setSelectedIndex(-1);
		jcbCidade.setBounds(58,315,100,20);
		jcbCidade.setMaximumRowCount(10);
		
		jcbEstado.setSelectedIndex(-1);
		jcbEstado.setBounds(250,315,100,20);
		jcbEstado.setMaximumRowCount(10);
		
		jpwSenha.setBounds(230, 360, 100, 20);
		
		// adiciona os botoes ao grupo
		grpRadio.add(rbtGeneroM);
		grpRadio.add(rbtGeneroF);
		
		janela.getContentPane().add(btnSalvar);
		janela.getContentPane().add(btnCancelar);
		
		janela.getContentPane().add(jlbNome);
		janela.getContentPane().add(txtNome);
		
		janela.getContentPane().add(jlbMatricula);
		janela.getContentPane().add(txtMatricula);
		
		janela.getContentPane().add(jlbData);
		janela.getContentPane().add(txtData);
		
		janela.getContentPane().add(jlbGenero);
		
		janela.getContentPane().add(jlbRg);
		janela.getContentPane().add(txtRg);
		
		janela.getContentPane().add(jlbCpf);
		janela.getContentPane().add(txtCpf);
		
		janela.getContentPane().add(jlbTelefone);
		janela.getContentPane().add(txtTelefone);
		
		janela.getContentPane().add(jlbCep);
		janela.getContentPane().add(txtCep);
		
		janela.getContentPane().add(jlbNumero);
		janela.getContentPane().add(txtNumero);
		
		janela.getContentPane().add(jlbComplemento);
		janela.getContentPane().add(txtComplemento);
		
		janela.getContentPane().add(jlbBairro);
		janela.getContentPane().add(txtBairro);
		
		janela.getContentPane().add(jlbLogradouro);
		janela.getContentPane().add(txtLogradouro);
		
		janela.getContentPane().add(jlbCidade);
		janela.getContentPane().add(jcbCidade);
		
		janela.getContentPane().add(jlbEstado);
		janela.getContentPane().add(jcbEstado);
		
		janela.getContentPane().add(jlbSenha);
		janela.getContentPane().add(jpwSenha);
		
		janela.getContentPane().add(rbtGeneroM);
		janela.getContentPane().add(rbtGeneroF);
		
		janela.getContentPane().setLayout(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(800, 500);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		
	}

	public class CadastraListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			AlunoController alunoController = new AlunoController();

			boolean registrado = true;
			
			
			
			String resposta = "";
			if (rbtGeneroM.isSelected()) {
				resposta += rbtGeneroM.getText();
			}
			if (rbtGeneroF.isSelected()) {
				resposta += rbtGeneroF.getText();
			}
			
			
			String cidadelc = jcbCidade.getSelectedItem().toString();
			if (cidadelc == null) {
				registrado = true;
				JOptionPane.showMessageDialog(null, "Selecione uma cidade");
			}
			
			String estadolc = jcbEstado.getSelectedItem().toString();
			if (estadolc == null) {
				registrado = true;
				JOptionPane.showMessageDialog(null, "Selecione um  estado");
			}
			
			alunoController.inserirAluno(txtMatricula.getText(), txtNome.getText(), txtRg.getText(), txtCpf.getText(),
					txtData.getText(), resposta, txtTelefone.getText(), txtCep.getText(), txtNumero.getText(),
					txtComplemento.getText(), txtBairro.getText(), txtLogradouro.getText(), cidadelc,
					estadolc, jpwSenha.getText());
			
		}
	}
	
	
	class CancelaListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			janela.setVisible(false);
		}
	}
}