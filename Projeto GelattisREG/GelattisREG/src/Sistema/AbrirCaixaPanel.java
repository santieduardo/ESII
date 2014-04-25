package Sistema;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;


public class AbrirCaixaPanel extends JPanel {
	private JPasswordField tfSenha;

	/**
	 * Create the panel.
	 */
	public AbrirCaixaPanel() {
		JLabel lblCodigo = new JLabel("Código:");
		lblCodigo.setBounds(41, 89, 37, 14);
		
		JTextField tfCodigo = new JTextField();
		tfCodigo.setBounds(41, 125, 96, 20);
		setLayout(null);
		
		add(lblCodigo);
		add(tfCodigo);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(199, 89, 46, 14);
		add(lblSenha);
		
		tfSenha = new JPasswordField();
		tfSenha.setBounds(196, 125, 86, 20);
		add(tfSenha);
		tfSenha.setColumns(10);
		
		JRadioButton rdbtnCaixa = new JRadioButton("Caixa");
		rdbtnCaixa.setBounds(28, 23, 109, 23);
		add(rdbtnCaixa);
		
		JRadioButton rdbtnGerente = new JRadioButton("Gerente");
		rdbtnGerente.setBounds(28, 49, 109, 23);
		add(rdbtnGerente);
		
		JButton btnNewButton = new JButton("Abrir caixa");
		btnNewButton.setBounds(48, 193, 89, 23);
		add(btnNewButton);

	}
}
