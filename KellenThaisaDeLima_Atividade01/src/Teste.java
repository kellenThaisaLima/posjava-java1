public class Teste {

	public static void main(String arg[]) {

		
		Veiculo Veiculo1 = new Veiculo();
		Veiculo1.setPlaca("AAAA0001");
		Veiculo1.setMarca("VW");
		Veiculo1.setModelo("Gol");
		Veiculo1.setCor("Azul");
		Veiculo1.setVelocMax(120);
		Veiculo1.setQtdRodas(4);
		Veiculo1.getMotor().setQtdPist(2);
		Veiculo1.getMotor().setPotencia(100);

		
		Veiculo Veiculo2 = new Veiculo("BBBB0001", "GM", "Celta", "Branco", 120, 4);
		Veiculo2.getMotor().setQtdPist(3);
		Veiculo2.getMotor().setPotencia(300);

	
		Veiculo Veiculo3 = new Veiculo("CCCC0001", "Fiat", "Uno", "Vermelho", 120, 4, 50, 200);
		Veiculo Veiculo4 = new Veiculo("DDDD0001", "Hyundai", "HB20", "Cinza", 220, 4, 52, 400);
		Veiculo Veiculo5 = new Veiculo("EEEE0001", "Renault", "Kwid", "Laranja", 100, 4, 3, 120);
		
		Veiculo1.toString();

		
		System.out.println("Veiculo 2");
		System.out.println("Placa: " + Veiculo2.getPlaca());
		System.out.println("Marca: " + Veiculo2.getMarca());
		System.out.println("Modelo: " + Veiculo2.getModelo());
		System.out.println("Cor: " + Veiculo2.getCor());
		System.out.println("Velocidade Máxima: " + Veiculo2.getVelocMax());
		System.out.println("Quantidade de Rodas: " + Veiculo2.getQtdRodas());
		System.out.println("Quantidade de Pista: " + Veiculo2.getMotor().getQtdPist());
		System.out.println("Potencia: " + Veiculo2.getMotor().getPotencia());

		System.out.println("************************************************************");
		System.out.println("Veiculo 3");
		System.out.println("Placa: " + Veiculo3.getPlaca());
		System.out.println("Marca: " + Veiculo3.getMarca());
		System.out.println("Modelo: " + Veiculo3.getModelo());
		System.out.println("Cor: " + Veiculo3.getCor());
		System.out.println("Velocidade Máxima: " + Veiculo3.getVelocMax());
		System.out.println("Quantidade de Rodas: " + Veiculo3.getQtdRodas());
		System.out.println("Quantidade de Pista: " + Veiculo3.getMotor().getQtdPist());
		System.out.println("Potencia: " + Veiculo3.getMotor().getPotencia());
		
		System.out.println("************************************************************");
		System.out.println("Veiculo 4");
		System.out.println("Placa: " + Veiculo4.getPlaca());
		System.out.println("Marca: " + Veiculo4.getMarca());
		System.out.println("Modelo: " + Veiculo4.getModelo());
		System.out.println("Cor: " + Veiculo4.getCor());
		System.out.println("Velocidade Máxima: " + Veiculo4.getVelocMax());
		System.out.println("Quantidade de Rodas: " + Veiculo4.getQtdRodas());
		System.out.println("Quantidade de Pista: " + Veiculo4.getMotor().getQtdPist());
		System.out.println("Potencia: " + Veiculo4.getMotor().getPotencia());
		
		System.out.println("************************************************************");
		System.out.println("Veiculo 5");
		System.out.println("Placa: " + Veiculo5.getPlaca());
		System.out.println("Marca: " + Veiculo5.getMarca());
		System.out.println("Modelo: " + Veiculo5.getModelo());
		System.out.println("Cor: " + Veiculo5.getCor());
		System.out.println("Velocidade Máxima: " + Veiculo5.getVelocMax());
		System.out.println("Quantidade de Rodas: " + Veiculo5.getQtdRodas());
		System.out.println("Quantidade de Pista: " + Veiculo5.getMotor().getQtdPist());
		System.out.println("Potencia: " + Veiculo5.getMotor().getPotencia());		

	}

}
