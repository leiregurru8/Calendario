package Pantallas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import LD.Pool;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class pruebaconexion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pruebaconexion frame = new pruebaconexion();
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
	public pruebaconexion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnComprobarconexion = new JButton("ComprobarConexion");
		btnComprobarconexion.setForeground(Color.BLACK);
		btnComprobarconexion.setBackground(Color.WHITE);
		btnComprobarconexion.setBounds(0, 0, 401, 312);
		btnComprobarconexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pool metodospool = new Pool();
		        java.sql.Connection cn = null;


		        try {

		            cn=metodospool.dataSource.getConnection();

		            if(cn!=null){

		                JOptionPane.showMessageDialog(null, "Conectado");

		            }

		        } catch (SQLException ex) {

		            System.out.println(e);

		        }finally{


		                try {

		                    cn.close();

		                } catch (SQLException ex) {

		                    System.out.println(ex);

		                }


		        }
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnComprobarconexion);
	}
}
