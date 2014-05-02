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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

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
	
	
	public Tela(){
		instanciarElementos();		
		janela.getContentPane().setLayout(new BorderLayout());
		
		setPainelLogin();
		setOpcaoLogin();
		setPainelBotoes();
				
		setConfigJanela();
	}
	
	private void instanciarElementos(){
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
	}
	
	private void setPainelLogin(){
		painelLogin.setLayout(new GridLayout(2,1));
		painelLogin.add(lblCodigo);
		painelLogin.add(txtCodigo);
		painelLogin.add(lblSenha);
		painelLogin.add(txtSenha);		
		janela.add(painelLogin, BorderLayout.NORTH);
	}
	
	private void setOpcaoLogin(){
		grupoRDB.add(rdbOperador);
		grupoRDB.add(rdbGerente);
		painelSelecaoFunc.add(rdbOperador);
		painelSelecaoFunc.add(rdbGerente);
		janela.add(painelSelecaoFunc, BorderLayout.CENTER);
	}
	
	private void setPainelBotoes(){
		painelBotoes.setLayout(new FlowLayout());
		
		painelBotoes.add(btnOK);
		btnOK.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				codigo = Integer.parseInt(txtCodigo.getText());
				senha = Integer.parseInt(txtSenha.getText());
				//TODO verificar se é operador ou gerente que foi selecionado no radioButton
				//TODO verificar com os usuarios de teste
				//TODO criar a classe TratadorBotoes()
				//TODO lançar e implementar os eventos dos botoes para classe TratadorBotoes()
			}
		});
		
		painelBotoes.add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		janela.add(painelBotoes, BorderLayout.SOUTH);
	}
	
	private void setConfigJanela(){
		janela.setSize(200,140);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
		janela.setResizable(false);
	}

	public static void main(String[] args) {
		new Tela();
	}

}
