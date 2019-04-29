package herencia;

public class AppHerencia {

	public static void main(String[] args) {
		
		Estudiante estudiante1 = new Estudiante();
		
		estudiante1.setId(1);
		estudiante1.setDni("30168351");
		estudiante1.setNombre("fidel");
		estudiante1.setEstablecimiento("unlam");
		
		Empleado empleado1 = new Empleado();
		
		empleado1.setDni("15506403");
		empleado1.setId(12);
		empleado1.setNombre("Hernan");
		empleado1.setSueldo(1100f);
		
		Persona persona1 = new Persona();
		
		persona1.setDni("20159687");
		persona1.setId(4);
		persona1.setNombre("Emiliano");
		
		Primario primario1 = new Primario();
		
		primario1.setDni("42015666");
		primario1.setId(5);
		primario1.setGrado("5to");
		primario1.setNombre("Juan");
		primario1.setEstablecimiento("escuela1");
		

	}

}
