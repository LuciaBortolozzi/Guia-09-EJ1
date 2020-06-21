package model;

import java.util.Calendar;

public class Mantenimientos {

	protected Calendar fechaMantenimiento;
	protected double costoMantenimiento;

	public Calendar getFechaMantenimiento() {
		return fechaMantenimiento;
	}

	public void setFechaMantenimiento(Calendar fechaMantenimiento) {
		this.fechaMantenimiento = fechaMantenimiento;
	}
	
	public double getCostoMantenimiento() {
		return costoMantenimiento;
	}

	public void setCostoMantenimiento(double costoMantenimiento) {
		this.costoMantenimiento = costoMantenimiento;
	}

	public Mantenimientos(){}

	public Mantenimientos(Calendar fechaMantenimiento, double costoMantenimiento) {
		super();
		this.fechaMantenimiento = fechaMantenimiento;
		this.costoMantenimiento = costoMantenimiento;
	}
	
	
}
