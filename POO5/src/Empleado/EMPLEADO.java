package Empleado;

import java.util.Date;

public class EMPLEADO {
private String nombre;
private double sueldo;
private Date fechacontrato;

	
	public EMPLEADO (String nombre, double sueldo, int añoContrato, int mesContrato, int diaContrato) {
        this.nombre = "David";
        this.sueldo = 3000;
        this.fechacontrato = new Date(añoContrato - 1900, mesContrato - 1, diaContrato);
    
}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Date getFechacontrato() {
		return fechacontrato;
	}

	public void setFechacontrato(Date fechacontrato) {
		this.fechacontrato = fechacontrato;
	}
	
	

}
