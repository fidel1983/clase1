package futbol;

public class Defensor extends Futbolista implements Jugable {
	
	private String barrida;

	public String getBarrida() {
		return barrida;
	}

	public void setBarrida(String barrida) {
		this.barrida = barrida;
	}

	
	public void jugar() {
		
		System.out.println("Defendiendo");
		
	}

	@Override
	public int obtenerMinutosJugados() {
		// TODO Auto-generated method stub
		return 0;
	}

}
