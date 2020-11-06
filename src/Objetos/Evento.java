package Objetos;
import java.util.Date;

public abstract class Evento {

private String nombre;
private Date fecha;
public Evento(String nombre, Date fecha) {
	super();
	this.nombre = nombre;
	this.fecha = fecha;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Date getFecha() {
	return fecha;
}
public void setFecha(Date fecha) {
	this.fecha = fecha;
}

}
