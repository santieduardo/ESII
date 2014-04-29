import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela {
	
	JFrame janela;
	JPanel painelLogin, painelBotoes;
	JLabel lblCodigo, lblSenha;
	JTextField txtCodigo, txtSenha;
	JButton btnOK, btnCancelar;
	
	
	public Tela(){
		instanciarElementos();		
		janela.getContentPane().setLayout(new BorderLayout());
		
		setPainelLogin();		
		setPainelBotoes();
				
		setConfigJanela();
	}
	
	private void instanciarElementos(){
		janela = new JFrame("Insira seus dados");
		lblCodigo = new JLabel("Código:");
		lblSenha = new JLabel("Senha:");
		txtCodigo = new JTextField();
		txtSenha = new JTextField();
		btnOK = new JButton("OK");
		btnCancelar = new JButton("Cancelar");
		painelLogin = new JPanel();
		painelBotoes = new JPanel();
	}
	
	private void setPainelLogin(){
		painelLogin.setLayout(new GridLayout(2,1));
		painelLogin.add(lblCodigo);
		painelLogin.add(txtCodigo);
		painelLogin.add(lblSenha);
		painelLogin.add(txtSenha);		
		janela.add(painelLogin, BorderLayout.NORTH);
	}
	
	private void setPainelBotoes(){
		painelBotoes.setLayout(new FlowLayout());
		painelBotoes.add(btnOK);
		painelBotoes.add(btnCancelar);
		janela.add(painelBotoes, BorderLayout.SOUTH);
	}
	
	private void setConfigJanela(){
		janela.setSize(200,120);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
		janela.setResizable(false);
	}

	public static void main(String[] args) {
		new Tela();
	}

}
