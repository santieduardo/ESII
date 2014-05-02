package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Usuarios.Gerente;
import Usuarios.Operador;

public class Tela {

	JFrame janela;
	JPanel painelLogin, painelBotoes, painelSelecaoFunc;
	JLabel lblCodigo, lblSenha;
	JTextField txtCodigo, txtSenha;
	JButton btnOK, btnCancelar;
	JRadioButton rdbOperador, rdbGerente;
	ButtonGroup grupoRDB;
	private int codigo;
	private int senha;
	Operador operador;
	Gerente gerente;

	public Tela() {
		instanciarElementos();
		janela.getContentPane().setLayout(new BorderLayout());

		setPainelLogin();
		setOpcaoLogin();
		setPainelBotoes();

		setConfigJanela();
	}

	private void instanciarElementos() {
		operador = new Operador("João", 6312, 5555);
		gerente = new Gerente("Maria", 6312, 3333);

		janela = new JFrame("Login");
		lblCodigo = new JLabel("Código:");
		lblSenha = new JLabel("Senha:");
		txtCodigo = new JTextField();
		txtSenha = new JTextField();
		btnOK = new JButton("OK");
		btnCancelar = new JButton("Cancelar");
		painelLogin = new JPanel();
		painelBotoes = new JPanel();
		painelSelecaoFunc = new JPanel();
		rdbOperador = new JRadioButton("Operador");
		rdbGerente = new JRadioButton("Gerente");
		grupoRDB = new ButtonGroup();

		setNomeElementos();
	}

	private void setNomeElementos() {
		btnCancelar.setName("btnCancelar");
		btnOK.setName("btnOK");
	}

	private void setPainelLogin() {
		painelLogin.setLayout(new GridLayout(2, 1));
		painelLogin.add(lblCodigo);
		painelLogin.add(txtCodigo);
		painelLogin.add(lblSenha);
		painelLogin.add(txtSenha);
		janela.add(painelLogin, BorderLayout.NORTH);
	}

	private void setOpcaoLogin() {
		grupoRDB.add(rdbOperador);
		grupoRDB.add(rdbGerente);
		painelSelecaoFunc.add(rdbOperador);
		painelSelecaoFunc.add(rdbGerente);
		janela.add(painelSelecaoFunc, BorderLayout.CENTER);
	}

	private void setPainelBotoes() {
		painelBotoes.setLayout(new FlowLayout());

		painelBotoes.add(btnOK);
		btnOK.addActionListener(new EventosBotoes());

		painelBotoes.add(btnCancelar);
		btnCancelar.addActionListener(new EventosBotoes());

		janela.add(painelBotoes, BorderLayout.SOUTH);
	}

	private void setConfigJanela() {
		janela.setSize(200, 140);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
		janela.setResizable(false);
	}

	public static void main(String[] args) {
		new Tela();
	}

	private class EventosBotoes implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() instanceof JButton) {
				String nomeBotao = ((JButton) e.getSource()).getName();

				if (nomeBotao.equals("btnCancelar")) {
					System.exit(0);
				}

				// TODO verificar se é operador ou gerente que foi selecionado no radioButton
				// TODO verificar com os usuarios de teste
				// TODO criar a classe TratadorBotoes()
				// TODO lançar e implementar os eventos dos botoes para classe
				// TratadorBotoes()
				if (nomeBotao.equals("btnOK")) {
					codigo = Integer.parseInt(txtCodigo.getText());
					senha = Integer.parseInt(txtSenha.getText());

					if (rdbOperador.isSelected()) {
						isOperadorSelecionado();
					}

					else if (rdbGerente.isSelected()) {
						isGerenteSelecionado();
					}
					
					else{
						JOptionPane.showMessageDialog(null,"Selecione seu cargo");
					}

				}
			}

		}
		
		private void isOperadorSelecionado(){
			if (operador.verificarLogin(codigo, senha)) {
				JOptionPane.showMessageDialog(null,"Login Efetuado como OPERADOR com sucesso");
				JOptionPane.showMessageDialog(null,"CAIXA LIBERADO !");
			} else {
				JOptionPane.showMessageDialog(null,"Dados Incorretos");
			}
		}
		
		private void isGerenteSelecionado(){
			if (gerente.verificarLogin(codigo, senha)) {
				JOptionPane.showMessageDialog(null,"Login Efetuado como GERENTE com sucesso");
				JOptionPane.showMessageDialog(null,"CAIXA LIBERADO !");
			} else {
				JOptionPane.showMessageDialog(null,"Dados Incorretos");
			}
		}
		
	}

}
