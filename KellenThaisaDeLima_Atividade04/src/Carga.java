
final public class Carga extends Veiculo implements Calcular {
	
	private int cargaMax;
	private int tara;
	
	public Carga() {
		this.cargaMax = 0;
		this.tara = 0;
	}

	public Carga(int cargaMax, int tara) {
		this.cargaMax = cargaMax;
		this.tara = tara;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	final public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getTara() {
		return tara;
	}

	final public void setTara(int tara) {
		this.tara = tara;
	}

	@Override
	public float calcVel(float velocMax) {
		return this.getVelocMax() * 100000;
		
	}

	@Override
	public int calcular() {
		int somaNum = 0;
		
		somaNum+=getMotor().getQtdPist();
		somaNum+=getMotor().getPotencia();
		somaNum+=getVelocMax();
		somaNum+=getQtdRodas();
		somaNum+=getCargaMax();
		somaNum+=getTara();
		
		return somaNum;
	}

}
