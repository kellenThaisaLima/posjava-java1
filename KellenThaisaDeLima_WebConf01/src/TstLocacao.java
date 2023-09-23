public class TstLocacao {
	
	public static void main(String arg[]) {

		
		Locacao loc1 = new Locacao();	
		loc1.getImovel().setValAluguel(500);
		loc1.getImovel().setTipoMaterial("Madeira");
		loc1.getImovel().getEnderecoImovel().setRua("Avenida Brasil");
		loc1.getImovel().getEnderecoImovel().setNum(50);
		loc1.getImovel().getEnderecoImovel().getCidade().setNomeCid("São Paulo");
		loc1.getImovel().getEnderecoImovel().getCidade().setCodCid(555);	
		loc1.getImovel().getProprietario().setNomeProp("Silvio Santos");
		loc1.getImovel().getProprietario().setCpfProp(1112223334);
		loc1.getImovel().getProprietario().getEnderecoProprietario().setRua("Faria Lima");
		loc1.getImovel().getProprietario().getEnderecoProprietario().setNum(47);
		loc1.getImovel().getProprietario().getEnderecoProprietario().getCidade().setNomeCid("São Paulo");
		loc1.getImovel().getProprietario().getEnderecoProprietario().getCidade().setCodCid(555);
		
		Locacao loc2 = new Locacao();	
		loc2.getImovel().setValAluguel(500);
		loc2.getImovel().setTipoMaterial("Alvenária");
		loc2.getImovel().getEnderecoImovel().setRua("XV de Novembro");
		loc2.getImovel().getEnderecoImovel().setNum(13);
		loc2.getImovel().getEnderecoImovel().getCidade().setNomeCid("Curitiba");
		loc2.getImovel().getEnderecoImovel().getCidade().setCodCid(236);	
		loc2.getImovel().getProprietario().setNomeProp("Marta Rocha");
		loc2.getImovel().getProprietario().setCpfProp(1112224445);
		loc2.getImovel().getProprietario().getEnderecoProprietario().setRua("Padre Anchieta");
		loc2.getImovel().getProprietario().getEnderecoProprietario().setNum(674);
		loc2.getImovel().getProprietario().getEnderecoProprietario().getCidade().setNomeCid("Curitiba");
		loc2.getImovel().getProprietario().getEnderecoProprietario().getCidade().setCodCid(236);
		
		
		
		loc1.toString();
		loc2.toString();

		


			

	}
}
