package LD;
import Formularios.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class MetodosLogin {

	Pool metodospool = new Pool();

	public int validar_ingreso(){

	    String usuario = Login.txtUsuario.getText();
	    String clave = String.valueOf(Login.jpassClave.getPassword());

	    int resultado=0;
	    
	    String SSQL="SELECT * FROM usuarios WHERE usuario='"+usuario+"' AND clave=sha1('"+clave+"')";

	    Connection conect = null;

	    try {

	        conect = metodospool.dataSource.getConnection();
	        Statement st = conect.createStatement();
	        ResultSet rs = st.executeQuery(SSQL);

	        if(rs.next()){

	            resultado=1;

	        }

	    } catch (SQLException ex) {

	        JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);

	    }finally{


	        try {

	            conect.close();

	        } catch (SQLException ex) {

	            JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);

	        }

	    }

	return resultado;

	}
	private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) { 
		 
		 MetodosLogin metodoslogin = new MetodosLogin();
		 if(metodoslogin.validar_ingreso()==1){
		                  
		                    this.dispose();

		                    JOptionPane.showMessageDialog(null, "Bienvenido\n Has ingresado "
		                    + "satisfactoriamente al sistema", "Mensaje de bienvenida",
		                    JOptionPane.INFORMATION_MESSAGE);

		                    Formulario1 formformulario1 = new Formulario1();          
		                    formformulario1.setVisible(true);

		     }else {
		                    
		                    JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
		                    + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
		                    JOptionPane.ERROR_MESSAGE);
		            
		     }


		}                                           

}
