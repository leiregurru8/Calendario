package LD;
import java.util.Date;

public class EventoEscolar extends Evento{
	private TipoEscolar tipo;
	private String comentario;
public EventoEscolar(String nombre, Date fecha, TipoEscolar tipo, String comentario) {
		super(nombre, fecha);
		this.tipo = tipo;
		this.comentario = comentario;
	}
public TipoEscolar getTipo() {
	return tipo;
}
public void setTipo(TipoEscolar tipo) {
	this.tipo = tipo;
}
public String getComentario() {
	return comentario;
}
public void setComentario(String comentario) {
	this.comentario = comentario;
}

	

}
