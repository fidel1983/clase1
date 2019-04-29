package ejercicio2;

public class Aplicacion {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setLegajo(124);
		g1.setNombre("mariano");
		g1.setSueldo(100f);
	
		Operario o1 = new Operario();
		o1.setLegajo(122);
		o1.setNombre("juan");
		o1.setSueldo(100f);
		
		System.out.println("sueldo gerente "+g1.getSueldo());
		System.out.println("sueldo operario "+o1.getSueldo());
		System.out.println("legajo gerente: "+g1.getLegajo());
	}

}
