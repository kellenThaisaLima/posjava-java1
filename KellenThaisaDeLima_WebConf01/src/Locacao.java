import java.util.Date; 

public class Locacao {
	
	private Date dataInicio = new Date();
	private Date dataFim = new Date();
	private Imovel imovel = new Imovel();

	public Imovel getImovel() {
		return imovel;
	}
	
	public void setImovel(Imovel imovel) {
		if (imovel.getEnderecoImovel()!=(imovel.getProprietario().getEnderecoProprietario())) {
			this.imovel = imovel;
		}else {
			System.out.println("Endereço do Imovel deve ser diferente do endereço de Proprietário");
		}		
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;	}
	
	@Override
	public String toString() {
		
		System.out.println("Locação: " + hashCode());
		System.out.println("Data de Início: " + dataInicio);
		System.out.println("Data Fim: " + dataFim);
		System.out.println("**********Dados Imovel**********");
		System.out.println("Tipo Material:" + imovel.getTipoMaterial());
		System.out.println("Valor do Aluguel:" + imovel.getValAluguel());
		System.out.println("Endereço: Rua " + imovel.getEnderecoImovel().getRua()
				+ ", Número " + imovel.getEnderecoImovel().getNum()
				+ ", Cidade " + imovel.getEnderecoImovel().getCidade().getNomeCid()
				+ ", Código " + imovel.getEnderecoImovel().getCidade().getCodCid());
		System.out.println("**********Dados Proprietário*********:");
		System.out.println("Nome Proprietário:"+ imovel.getProprietario().getNomeProp());
		System.out.println("CPF:" + imovel.getProprietario().getCpfProp());
		System.out.println("Endereço: Rua " + imovel.getProprietario().getEnderecoProprietario().getRua()
				+ ", Número " + imovel.getProprietario().getEnderecoProprietario().getNum()
				+ ", Cidade " + imovel.getProprietario().getEnderecoProprietario().getCidade().getNomeCid()
				+ ", Código " + imovel.getProprietario().getEnderecoProprietario().getCidade().getCodCid());
		System.out.println("*****************************************************");
		
		return null;
	}	
	
}
