package model;

import java.util.ArrayList;
import java.util.Calendar;

public class Autos {
	
	private String patente;
	private Calendar fechaPatentamiento;
	private char tipoCombustible;
	private boolean equipoMultimedia;
	private boolean aireAcondicionado;
	private boolean gps;
	private Modelos modelos;
	protected ArrayList<Mantenimientos> mantenimientos = new ArrayList<Mantenimientos>();
	
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public Calendar getFechaPatentamiento() {
		return fechaPatentamiento;
	}
	public void setFechaPatentamiento(Calendar fechaPatentamiento) {
		this.fechaPatentamiento = fechaPatentamiento;
	}
	public char getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(char tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	public boolean isEquipoMultimedia() {
		return equipoMultimedia;
	}
	public void setEquipoMultimedia(boolean equipoMultimedia) {
		this.equipoMultimedia = equipoMultimedia;
	}
	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}
	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}
	public boolean isGps() {
		return gps;
	}
	public void setGps(boolean gps) {
		this.gps = gps;
	}
	public Modelos getModelos() {
		return modelos;
	}
	public void setModelos(Modelos modelos) {
		this.modelos = modelos;
	}
    public ArrayList<Mantenimientos> getMantenimientos() {
        return mantenimientos;
    }

    public void setCalificaciones() {
    	mantenimientos.add(new Mantenimientos());
    }

    public void setMantenimientos(int indice, Calendar fechaMantenimiento) {
    	mantenimientos.get(indice).setFechaMantenimiento(fechaMantenimiento);
    }
	
	
	

}