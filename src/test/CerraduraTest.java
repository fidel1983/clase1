package test;

import org.junit.Assert;
import org.junit.Test;

import cerradura.Cerradura;

public class CerraduraTest {
	
	@Test
	public void queUnaCerradurraNuevaEsteCerrada() {
		
		Cerradura c1 = new Cerradura(1717, 1);
		
		boolean resultado = c1.estaCerrada();
		
	    Assert.assertTrue(resultado);
	    
	    }
	
	@Test
	public void queCuandoIngresoLaclaveSeAbra() {
		
		Cerradura c2 = new Cerradura(4675, 3);
		
		 c2.abrir(4675);
		
		 boolean resultado = c2.estaAbierta();
			 
		Assert.assertEquals(true, resultado);
	   
	}
	
	@Test
	public void queCuandoIngresoLaClaveNoSeAbra() {
		
		Cerradura c2 = new Cerradura (1245,3);
		
		boolean resultado = c2.abrir(1717);
		
		Assert.assertFalse(resultado);
		
		
	}
	
	@Test
	 public void queLuegoDeDosIntentosSeBloquee(){

		Cerradura c2 = new Cerradura (1245,3);
		
		c2.abrir(1111);
		c2.abrir(1);
		
		boolean resultado = c2.fueBloqueada();
		
		Assert.assertFalse(resultado);

}
	
}