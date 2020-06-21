package model;

import java.util.Calendar;
import java.util.TreeSet;

public class Reparaciones extends Mantenimientos{

	private String partes;

	public String getPartes() {
		return partes;
	}

	public void setPartes(String partes) {
		this.partes = partes;
	}
	
	public Reparaciones() {}
	
	public Reparaciones(String partes, Calendar fechaMantenimiento, double costoMantenimiento) {
		super(fechaMantenimiento, costoMantenimiento);
		this.partes = partes;
	}
	
	
}
