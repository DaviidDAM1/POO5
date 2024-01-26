package MosificaciondeSueldo;

public class main {

	public static void main(String[] args) {
		Empleado empleado2 = new Empleado("David", 3000);
		String nombreempelado2 = empleado2.getNombre();
		double sueldoempleado2 = empleado2.getSueldo();
		
		empleado2.subeSueldo(10);
		double nuevoSueldoEmpleado2 = empleado2.getSueldo();
		System.out.println("Nuevo Sueldo de " + empleado2.getNombre() + ": " + nuevoSueldoEmpleado2);
		

	}

}
