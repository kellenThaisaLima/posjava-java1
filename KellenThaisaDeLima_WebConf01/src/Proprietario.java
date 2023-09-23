
public class Proprietario {
	
	private int cpfProp = 0;
	private String nomeProp = "";
	private Endereco enderecoProprietario = new Endereco();	
	
	public Endereco getEnderecoProprietario() {
		return enderecoProprietario;
	}
	public void setEnderecoProprietario(Endereco enderecoProprietario) {
		this.enderecoProprietario = enderecoProprietario;
	}
	public int getCpfProp() {
		return cpfProp;
	}
	public void setCpfProp(int cpfProp) {
		this.cpfProp = cpfProp;
	}
	public String getNomeProp() {
		return nomeProp;
	}
	public void setNomeProp(String nomeProp) {
		this.nomeProp = nomeProp;
	}
	
	
}
