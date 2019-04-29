package cerradura;


public class Cerradura {
	
	private  Integer clave;
	private Integer cantidadFallos;
	private int contFallidos;
	private int contExitoso;
	private boolean estaBloqueada;
	private boolean estaCerrada;
	
	
	public Cerradura(Integer clavedeApertura, Integer fallos) {
		
		clave = clavedeApertura ;
		cantidadFallos = fallos;
		estaBloqueada=false;
		estaCerrada=true;
		contFallidos=0;
		contExitoso=0;
		
	}

	
	public Integer getClave() {
		return clave;
	}

	
	public void setClave(Integer clave) {
		this.clave = clave;
	}

	
	public Integer getCantidadFallos() {
		return cantidadFallos;
	}

	
	public void setCantidadFallos(Integer cantidadFallos) {
		this.cantidadFallos = cantidadFallos;
	}
	
	public Boolean abrir (Integer clave) {
		if(estaBloqueada) {
			System.out.println("esta bloqueada");
			return false;
		}
		else {
			if (this.getClave().equals(clave)) {
				
				estaCerrada=false;
				contExitoso=contExitoso+1;
				return new Boolean (true);
			}
			else {
				
				contFallidos=contFallidos+1;
				if(contFallidos==getCantidadFallos()) {
					
					estaBloqueada=true;
				}
				
				return new Boolean(false);
				
			}
			
			
		}
		
		
	}
	
	public void cerrar() {
		
		estaCerrada=true;
		
	}
	
	public Boolean estaAbierta() {
		
		return !estaCerrada;
	}
    
	public Boolean estaCerrada() {
		
		return estaCerrada;
	}
	public Boolean fueBloqueada() {
		
		return estaBloqueada;
	}
	public Integer contarAperturasExitosas() {
		
		return contExitoso; 
	}
	public Integer contarAperturasFallidas() {
		
		return contFallidos;
	}
}
