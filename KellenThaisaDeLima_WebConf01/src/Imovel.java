
public class Imovel {
	
	private int valAluguel = 0;
	private String tipoMaterial = "";
	private Proprietario proprietario = new Proprietario();
	private Endereco enderecoImovel = new Endereco();
	
	public int getValAluguel() {
		return valAluguel;
	}
	public void setValAluguel(int valAluguel) {
		this.valAluguel = valAluguel;
	}
	public String getTipoMaterial() {
		return tipoMaterial;
	}
	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public Endereco getEnderecoImovel() {
		return enderecoImovel;
	}
	public void setEnderecoImovel(Endereco enderecoImovel) {
		this.enderecoImovel = enderecoImovel;
	}	
	
}
