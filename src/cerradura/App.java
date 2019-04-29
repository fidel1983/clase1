package cerradura;

public class App {
	public static void main(String[] args) {
		
		Cerradura c1 = new Cerradura(1245,3);
		
	boolean intento1 = c1.abrir(1245);
		
		System.out.println("fue bloqueada "+c1.fueBloqueada());

	}
}
