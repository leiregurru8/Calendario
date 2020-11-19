package Pantallas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InicioSesion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InicioSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(169, 58, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Ingresar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPasswordField jpassClave;
				char clave[]=jpassClave.getPassword();

				String clavedef=new String(clave);


				JTextComponent txtUsuario;
				if (txtUsuario.getText().equals("Administrador") && clavedef.equals("12345")){


				                    this.dispose();


				                    JOptionPane.showMessageDialog(null, "Bienvenido\n"
				                    + "Has ingresado satisfactoriamente al sistema",   "Mensaje de bienvenida",
				                    JOptionPane.INFORMATION_MESSAGE);


				                    Formulario1 formformulario1 = new Formulario1();

				                    formformulario1.setVisible(true);


				            }else {


				                    JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
				                    + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
				                    JOptionPane.ERROR_MESSAGE);
				           

				            }
			}
		});
		btnLogin.setBounds(264, 181, 115, 29);
		contentPane.add(btnLogin);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(99, 181, 115, 29);
		contentPane.add(btnRegistrarse);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(81, 58, 96, 26);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Clave");
		lblContrasea.setBounds(69, 118, 96, 23);
		contentPane.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(169, 116, 146, 26);
		contentPane.add(passwordField);
	}
}
