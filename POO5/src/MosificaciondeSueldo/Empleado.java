package MosificaciondeSueldo;

public class Empleado {

private String nombre;
private double sueldo;

public Empleado(String nombre, double sueldo) {
	this.nombre= "David";
	this.sueldo= 3000;
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
public void subeSueldo(double porcentaje) {
    this.sueldo += this.sueldo * (porcentaje / 100);
}
}
