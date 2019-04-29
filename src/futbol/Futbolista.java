package futbol;

public abstract class Futbolista extends Empleado {
	
	private String entrenamiento;
	private String dorsal;
	private Integer cantidadepartidos;

	
	public abstract int obtenerMinutosJugados();
	
	public String getDorsal() {
		return dorsal;
	}
	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}
	public String getEntrenamiento() {
		return entrenamiento;
	}
	public void setEntrenamiento(String entrenamiento) {
		this.entrenamiento = entrenamiento;
	}
	public Integer getCantidadepartidos() {
		return cantidadepartidos;
	}
	public void setCantidadepartidos(Integer cantidadepartidos) {
		this.cantidadepartidos = cantidadepartidos;
	}

}
