package model;

import java.util.ArrayList;
import java.util.Calendar;

public class Autos {
	
	private String patente;
	private int anioPatentamiento;
	private double precioCompra;
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
	public int getAnioPatentamiento() {
		return anioPatentamiento;
	}
	public void setAnioPatentamiento(int anioPatentamiento) {
		this.anioPatentamiento = anioPatentamiento;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
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

    public void setMantenimientos(Calendar fechaMantenimiento) {
    	mantenimientos.add(new Mantenimientos(fechaMantenimiento));
    }

    public void setMantenimientos(int indice, Calendar fechaMantenimiento) {
    	mantenimientos.get(indice).setFechaMantenimiento(fechaMantenimiento);
    }
    
    public void setMantenimientos(Calendar fechaMantenimiento, String partes) {
    	mantenimientos.add(new Reparaciones(partes, fechaMantenimiento));
    }

    public void setMantenimientos(int indice, Calendar fechaMantenimiento, String partes) {
    	mantenimientos.get(indice).setFechaMantenimiento(fechaMantenimiento);
    	((Reparaciones)mantenimientos.get(indice)).setPartes(partes);
    }
    
    public Autos() {}
    
	public Autos(String patente, int anioPatentamiento, double precioCompra, char tipoCombustible,
			boolean equipoMultimedia, boolean aireAcondicionado, boolean gps, Modelos modelos) {
		super();
		this.patente = patente;
		this.anioPatentamiento = anioPatentamiento;
		this.precioCompra = precioCompra;
		this.tipoCombustible = tipoCombustible;
		this.equipoMultimedia = equipoMultimedia;
		this.aireAcondicionado = aireAcondicionado;
		this.gps = gps;
		this.modelos = modelos;
	}
	
	
	

}
