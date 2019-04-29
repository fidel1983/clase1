package futbol;

public class Arquero extends Futbolista implements Jugable {
	
	private String posicion;
	
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public void jugar() {
		System.out.println("Atajando");
		
	}
	@Override
	public int obtenerMinutosJugados() {
		
		return 0;
	}
	
	
	
}
