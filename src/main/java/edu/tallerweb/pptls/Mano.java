package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	private Forma forma;
	private final Resultado[][] matriz = new Resultado[5][5];
	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
		public Mano(final Forma forma){
			this.forma = forma;
			cargarLaMatriz();
			
		}
	public Mano(final Forma forma) {
		throw new RuntimeException("No implementado aún");
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		return matriz[this.forma.getValor()][otra.forma.getValor()]
	}
	private void cargarLaMatriz(){
		this.matriz[Forma.TIJERA.getValor()][Forma.PAPEL.getValor()] = Resultado.GANA;
		this.matriz[Forma.TIJERA.getValor()][Forma.LAGARTO.getValor()] = Resultado.GANA;
		this.matriz[Forma.PAPEL.getValor()][Forma.PIEDRA.getValor()] = Resultado.GANA;
		this.matriz[Forma.PAPEL.getValor()][Forma.SPOCK.getValor()] = Resultado.GANA;
		this.matriz[Forma.PIEDRA.getValor()][Forma.LAGARTO.getValor()] = Resultado.GANA;
		this.matriz[Forma.PIEDRA.getValor()][Forma.TIJERA.getValor()] = Resultado.GANA;
		this.matriz[Forma.LAGARTO.getValor()][Forma.SPOCK.getValor()] = Resultado.GANA;
		this.matriz[Forma.LAGARTO.getValor()][Forma.PAPEL.getValor()] = Resultado.GANA;
		this.matriz[Forma.SPOCK.getValor()][Forma.TIJERA.getValor()] = Resultado.GANA;
		this.matriz[Forma.SPOCK.getValor()][Forma.PIEDRA.getValor()] = Resultado.GANA;
		this.matriz[Forma.TIJERA.getValor()][Forma.TIJERA.getValor()] = Resultado.EMPATA;
		this.matriz[Forma.PAPEL.getValor()][Forma.PAPEL.getValor()] = Resultado.EMPATA;
		this.matriz[Forma.PIEDRA.getValor()][Forma.PIEDRA.getValor()] = Resultado.EMPATA;
		this.matriz[Forma.LAGARTO.getValor()][Forma.LAGARTO.getValor()] = Resultado.EMPATA;
		this.matriz[Forma.SPOCK.getValor()][Forma.SPOCK.getValor()] = Resultado.EMPATA;
	}
}