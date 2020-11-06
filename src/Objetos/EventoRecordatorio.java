package Objetos;
import java.util.Date;

public class EventoRecordatorio extends Evento {
	private String lugar;
	private int antelacion;
	public EventoRecordatorio(String nombre, Date fecha, String lugar, int antelacion) {
		super(nombre, fecha);
		this.lugar = lugar;
		this.antelacion = antelacion;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getAntelacion() {
		return antelacion;
	}
	public void setAntelacion(int antelacion) {
		this.antelacion = antelacion;
	}



}
