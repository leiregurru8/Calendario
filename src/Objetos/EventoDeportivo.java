package Objetos;
import java.util.Date;

public class EventoDeportivo extends Evento {

private double duracion;
private String objetivo;
public EventoDeportivo(String nombre,Date fecha,double duracion, String objetivo) {
	super(nombre,fecha);
	this.duracion = duracion;
	this.objetivo = objetivo;
}
public double getDuracion() {
	return duracion;
}
public void setDuracion(double duracion) {
	this.duracion = duracion;
}
public String getObjetivo() {
	return objetivo;
}
public void setObjetivo(String objetivo) {
	this.objetivo = objetivo;
}


}
