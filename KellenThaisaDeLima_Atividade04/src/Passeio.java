
final public class Passeio extends Veiculo implements Calcular {
	
	private int qtdPassageiros;
	
	public Passeio() {
		this.qtdPassageiros = 0;
	}

	public Passeio(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	final public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	@Override
	public float calcVel(float velocMax) {
		return this.getVelocMax() * 1000;
		
	}

	@Override
	public int calcular() {
		int somaLetras = 0;
		
		somaLetras+=getPlaca().length();
		somaLetras+=getModelo().length();
		somaLetras+=getMarca().length();
		somaLetras+=getCor().length();
				
		return somaLetras;
	}	
	

}
