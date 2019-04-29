package ejercicio;

public class Programa1 {
	public static void main(String[] args) {
		Libro libro1 = new Libro();
		libro1.setNombre("fidel");
		
		Libro libro2 = new Libro();
		libro2.setNombre("damian");
		
		System.out.println(libro1.getNombre());
		System.out.println(libro2.getNombre());
		System.out.println(Libro.paginas);
	}
	

}
