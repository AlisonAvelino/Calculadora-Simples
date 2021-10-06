package br.com.cod3r.calc.modelo;

/**
 * 
 * @author AlisonAvelino
 *
 */

@FunctionalInterface
public interface MemoriaObservador {

	public void valorAlterado(String novoValor);
	
}
