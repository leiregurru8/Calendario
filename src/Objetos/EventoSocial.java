package Objetos;
import java.util.ArrayList;
import java.util.Date;

public class EventoSocial extends Evento {
	private ArrayList <Usuario> ListaAmigos;
	private String notas;
	private String lugar;


	public EventoSocial(String nombre, Date fecha, ArrayList<Usuario> listaAmigos, String notas, String lugar) {
		super(nombre, fecha);
		ListaAmigos = listaAmigos;
		this.notas = notas;
		this.lugar = lugar;
	}
	public ArrayList<Usuario> getListaAmigos() {
		return ListaAmigos;
	}
	public void setListaAmigos(ArrayList<Usuario> listaAmigos) {
		ListaAmigos = listaAmigos;
	}
	public String getNotas() {
		return notas;
	}
	public void setNotas(String notas) {
		this.notas = notas;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


}
