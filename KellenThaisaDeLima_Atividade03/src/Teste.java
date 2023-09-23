public class Teste {

	public static void main(String arg[]) {

		
		Passeio Veiculo1 = new Passeio();
		Veiculo1.setPlaca("AAAA0001");
		Veiculo1.setMarca("VW");
		Veiculo1.setModelo("Gol");
		Veiculo1.setCor("Azul");
		Veiculo1.setVelocMax(120);
		Veiculo1.setQtdRodas(4);
		Veiculo1.getMotor().setQtdPist(2);
		Veiculo1.getMotor().setPotencia(100);	
		
		Passeio Veiculo2 = new Passeio();
		Veiculo2.setPlaca("CCCC0001");
		Veiculo2.setMarca("VW");
		Veiculo2.setModelo("Golf");
		Veiculo2.setCor("Azulado");
		Veiculo2.setVelocMax(120);
		Veiculo2.setQtdRodas(4);
		Veiculo2.getMotor().setQtdPist(2);
		Veiculo2.getMotor().setPotencia(100);
		
		Passeio Veiculo3 = new Passeio();
		Veiculo3.setPlaca("DDDD0001");
		Veiculo3.setMarca("VW");
		Veiculo3.setModelo("Voyage");
		Veiculo3.setCor("Branco");
		Veiculo3.setVelocMax(120);
		Veiculo3.setQtdRodas(4);
		Veiculo3.getMotor().setQtdPist(2);
		Veiculo3.getMotor().setPotencia(100);
		
		Passeio Veiculo4 = new Passeio();
		Veiculo4.setPlaca("EEEE0001");
		Veiculo4.setMarca("VW");
		Veiculo4.setModelo("Mob");
		Veiculo4.setCor("Preto");
		Veiculo4.setVelocMax(120);
		Veiculo4.setQtdRodas(4);
		Veiculo4.getMotor().setQtdPist(2);
		Veiculo4.getMotor().setPotencia(100);
		
		Passeio Veiculo5 = new Passeio();
		Veiculo5.setPlaca("BBBB0001");
		Veiculo5.setMarca("VW");
		Veiculo5.setModelo("Belina");
		Veiculo5.setCor("Cinza");
		Veiculo5.setVelocMax(120);
		Veiculo5.setQtdRodas(4);
		Veiculo5.getMotor().setQtdPist(2);
		Veiculo5.getMotor().setPotencia(100);
		
		Carga Veiculo6 = new Carga();
		Veiculo6.setPlaca("AAAA0000");
		Veiculo6.setMarca("Mercedes");
		Veiculo6.setModelo("Unimog-13000");
		Veiculo6.setCor("Marron");
		Veiculo6.setVelocMax(10);
		Veiculo6.setQtdRodas(8);
		Veiculo6.getMotor().setQtdPist(80);
		Veiculo6.getMotor().setPotencia(1000);
		Veiculo6.setCargaMax(20000);
		Veiculo6.setTara(100);
		
		
		Carga Veiculo7 = new Carga();
		Veiculo7.setPlaca("AAAA0001");
		Veiculo7.setMarca("Mercedes");
		Veiculo7.setModelo("Unimog-13001");
		Veiculo7.setCor("Preto");
		Veiculo7.setVelocMax(15);
		Veiculo7.setQtdRodas(8);
		Veiculo7.getMotor().setQtdPist(80);
		Veiculo7.getMotor().setPotencia(1000);
		Veiculo7.setCargaMax(20000);
		Veiculo7.setTara(100);
		
		
		Carga Veiculo8 = new Carga();
		Veiculo8.setPlaca("AAAA0002");
		Veiculo8.setMarca("Mercedes");
		Veiculo8.setModelo("Unimog-13002");
		Veiculo8.setCor("Mate");
		Veiculo8.setVelocMax(14);
		Veiculo8.setQtdRodas(8);
		Veiculo8.getMotor().setQtdPist(80);
		Veiculo8.getMotor().setPotencia(1000);
		Veiculo8.setCargaMax(20000);
		Veiculo8.setTara(100);
		
		
		Carga Veiculo9 = new Carga();
		Veiculo9.setPlaca("AAAA0003");
		Veiculo9.setMarca("Mercedes");
		Veiculo9.setModelo("Unimog-13003");
		Veiculo9.setCor("Rosa");
		Veiculo9.setVelocMax(13);
		Veiculo9.setQtdRodas(8);
		Veiculo9.getMotor().setQtdPist(80);
		Veiculo9.getMotor().setPotencia(1000);
		Veiculo9.setCargaMax(20000);
		Veiculo9.setTara(100);
		
		
		Carga Veiculo10 = new Carga();
		Veiculo10.setPlaca("AAAA0004");
		Veiculo10.setMarca("Mercedes");
		Veiculo10.setModelo("Unimog-13004");
		Veiculo10.setCor("Laranja");
		Veiculo10.setVelocMax(12);
		Veiculo10.setQtdRodas(8);
		Veiculo10.getMotor().setQtdPist(80);
		Veiculo10.getMotor().setPotencia(1000);
		Veiculo10.setCargaMax(20000);
		Veiculo10.setTara(100);		

		
		System.out.println("***********************************");
		System.out.println("Veículo:"+ Veiculo1.hashCode() + " - Tipo:" + Veiculo1.getClass().getName());		
        System.out.println("***********************************");
		System.out.println("Placa: " + Veiculo1.getPlaca());
		System.out.println("Marca: " + Veiculo1.getMarca());
		System.out.println("Modelo: " + Veiculo1.getModelo());
		System.out.println("Cor: " + Veiculo1.getCor());
		System.out.println("Velocidade Máxima: " + Veiculo1.getVelocMax());		
		System.out.println("Quantidade de Rodas: " + Veiculo1.getQtdRodas());		
		System.out.println("Quantidade de Pista: " + Veiculo1.getMotor().getQtdPist());
		System.out.println("Potencia: " + Veiculo1.getMotor().getPotencia());		
		System.out.println("Velocidade Calculada: " +  Veiculo1.calcVel(Veiculo1.getVelocMax()));
		System.out.println("Quantidade de Passageiros: " + Veiculo1.getQtdPassageiros());		

		System.out.println("***********************************");
		System.out.println("Veículo:"+ Veiculo2.hashCode() + " - Tipo:" + Veiculo2.getClass().getName());		
        System.out.println("***********************************");
		System.out.println("Placa: " + Veiculo2.getPlaca());
		System.out.println("Marca: " + Veiculo2.getMarca());
		System.out.println("Modelo: " + Veiculo2.getModelo());
		System.out.println("Cor: " + Veiculo2.getCor());
		System.out.println("Velocidade Máxima: " + Veiculo2.getVelocMax());		
		System.out.println("Quantidade de Rodas: " + Veiculo2.getQtdRodas());		
		System.out.println("Quantidade de Pista: " + Veiculo2.getMotor().getQtdPist());
		System.out.println("Potencia: " + Veiculo2.getMotor().getPotencia());		
		System.out.println("Velocidade Calculada: " +  Veiculo2.calcVel(Veiculo2.getVelocMax()));
		System.out.println("Quantidade de Passageiros: " + Veiculo2.getQtdPassageiros());	

		System.out.println("***********************************");
		System.out.println("Veículo:"+ Veiculo3.hashCode() + " - Tipo:" + Veiculo3.getClass().getName());		
        System.out.println("***********************************");
		System.out.println("Placa: " + Veiculo3.getPlaca());
		System.out.println("Marca: " + Veiculo3.getMarca());
		System.out.println("Modelo: " + Veiculo3.getModelo());
		System.out.println("Cor: " + Veiculo3.getCor());
		System.out.println("Velocidade Máxima: " + Veiculo3.getVelocMax());		
		System.out.println("Quantidade de Rodas: " + Veiculo3.getQtdRodas());		
		System.out.println("Quantidade de Pista: " + Veiculo3.getMotor().getQtdPist());
		System.out.println("Potencia: " + Veiculo3.getMotor().getPotencia());		
		System.out.println("Velocidade Calculada: " +  Veiculo3.calcVel(Veiculo3.getVelocMax()));
		System.out.println("Quantidade de Passageiros: " + Veiculo3.getQtdPassageiros());	

		System.out.println("***********************************");
		System.out.println("Veículo:"+ Veiculo4.hashCode() + " - Tipo:" + Veiculo4.getClass().getName());		
        System.out.println("***********************************");
		System.out.println("Placa: " + Veiculo4.getPlaca());
		System.out.println("Marca: " + Veiculo4.getMarca());
		System.out.println("Modelo: " + Veiculo4.getModelo());
		System.out.println("Cor: " + Veiculo4.getCor());
		System.out.println("Velocidade Máxima: " + Veiculo4.getVelocMax());		
		System.out.println("Quantidade de Rodas: " + Veiculo4.getQtdRodas());		
		System.out.println("Quantidade de Pista: " + Veiculo4.getMotor().getQtdPist());
		System.out.println("Potencia: " + Veiculo4.getMotor().getPotencia());		
		System.out.println("Velocidade Calculada: " +  Veiculo4.calcVel(Veiculo4.getVelocMax()));
		System.out.println("Quantidade de Passageiros: " + Veiculo4.getQtdPassageiros());	

		System.out.println("***********************************");
		System.out.println("Veículo:"+ Veiculo5.hashCode() + " - Tipo:" + Veiculo5.getClass().getName());		
        System.out.println("***********************************");
		System.out.println("Placa: " + Veiculo5.getPlaca());
		System.out.println("Marca: " + Veiculo5.getMarca());
		System.out.println("Modelo: " + Veiculo5.getModelo());
		System.out.println("Cor: " + Veiculo5.getCor());
		System.out.println("Velocidade Máxima: " + Veiculo5.getVelocMax());		
		System.out.println("Quantidade de Rodas: " + Veiculo5.getQtdRodas());		
		System.out.println("Quantidade de Pista: " + Veiculo5.getMotor().getQtdPist());
		System.out.println("Potencia: " + Veiculo5.getMotor().getPotencia());		
		System.out.println("Velocidade Calculada: " +  Veiculo5.calcVel(Veiculo5.getVelocMax()));
		System.out.println("Quantidade de Passageiros: " + Veiculo5.getQtdPassageiros());	
       

		System.out.println("***********************************");
		System.out.println("Veículo:"+ Veiculo6.hashCode() + " - Tipo:" + Veiculo6.getClass().getName());	
        System.out.println("***********************************"); 
		System.out.println("Marca: " + Veiculo6.getMarca());
		System.out.println("Modelo: " + Veiculo6.getModelo());
		System.out.println("Cor: " + Veiculo6.getCor());
		System.out.println("Velocidade Máxima: " + Veiculo6.getVelocMax());		
		System.out.println("Quantidade de Rodas: " + Veiculo6.getQtdRodas());		
		System.out.println("Quantidade de Pista: " + Veiculo6.getMotor().getQtdPist());
		System.out.println("Potencia: " + Veiculo6.getMotor().getPotencia());		
		System.out.println("Velocidade Calculada: " +  Veiculo6.calcVel(Veiculo6.getVelocMax()));
		System.out.println("Carga Máxima: " + Veiculo6.getCargaMax());
		System.out.println("Tara: " + Veiculo6.getTara());

		System.out.println("***********************************");
		System.out.println("Veículo:"+ Veiculo7.hashCode() + " - Tipo:" + Veiculo7.getClass().getName());	
        System.out.println("***********************************"); 
		System.out.println("Marca: " + Veiculo7.getMarca());
		System.out.println("Modelo: " + Veiculo7.getModelo());
		System.out.println("Cor: " + Veiculo7.getCor());
		System.out.println("Velocidade Máxima: " + Veiculo7.getVelocMax());		
		System.out.println("Quantidade de Rodas: " + Veiculo7.getQtdRodas());		
		System.out.println("Quantidade de Pista: " + Veiculo7.getMotor().getQtdPist());
		System.out.println("Potencia: " + Veiculo7.getMotor().getPotencia());		
		System.out.println("Velocidade Calculada: " +  Veiculo7.calcVel(Veiculo7.getVelocMax()));
		System.out.println("Carga Máxima: " + Veiculo7.getCargaMax());
		System.out.println("Tara: " + Veiculo7.getTara());

		System.out.println("***********************************");
		System.out.println("Veículo:"+ Veiculo8.hashCode() + " - Tipo:" + Veiculo8.getClass().getName());		
        System.out.println("***********************************"); 
		System.out.println("Marca: " + Veiculo8.getMarca());
		System.out.println("Modelo: " + Veiculo8.getModelo());
		System.out.println("Cor: " + Veiculo8.getCor());
		System.out.println("Velocidade Máxima: " + Veiculo8.getVelocMax());		
		System.out.println("Quantidade de Rodas: " + Veiculo8.getQtdRodas());		
		System.out.println("Quantidade de Pista: " + Veiculo8.getMotor().getQtdPist());
		System.out.println("Potencia: " + Veiculo8.getMotor().getPotencia());		
		System.out.println("Velocidade Calculada: " +  Veiculo8.calcVel(Veiculo8.getVelocMax()));
		System.out.println("Carga Máxima: " + Veiculo8.getCargaMax());
		System.out.println("Tara: " + Veiculo8.getTara());

		System.out.println("***********************************");
		System.out.println("Veículo:"+ Veiculo9.hashCode() + " - Tipo:" + Veiculo9.getClass().getName());		
        System.out.println("***********************************"); 
		System.out.println("Marca: " + Veiculo9.getMarca());
		System.out.println("Modelo: " + Veiculo9.getModelo());
		System.out.println("Cor: " + Veiculo9.getCor());
		System.out.println("Velocidade Máxima: " + Veiculo9.getVelocMax());		
		System.out.println("Quantidade de Rodas: " + Veiculo9.getQtdRodas());		
		System.out.println("Quantidade de Pista: " + Veiculo9.getMotor().getQtdPist());
		System.out.println("Potencia: " + Veiculo9.getMotor().getPotencia());		
		System.out.println("Velocidade Calculada: " +  Veiculo9.calcVel(Veiculo9.getVelocMax()));
		System.out.println("Carga Máxima: " + Veiculo9.getCargaMax());
		System.out.println("Tara: " + Veiculo9.getTara());

		System.out.println("***********************************");
		System.out.println("Veículo:"+ Veiculo10.hashCode() + " - Tipo:" + Veiculo10.getClass().getName());	
        System.out.println("***********************************"); 
		System.out.println("Marca: " + Veiculo10.getMarca());
		System.out.println("Modelo: " + Veiculo10.getModelo());
		System.out.println("Cor: " + Veiculo10.getCor());
		System.out.println("Velocidade Máxima: " + Veiculo10.getVelocMax());		
		System.out.println("Quantidade de Rodas: " + Veiculo10.getQtdRodas());		
		System.out.println("Quantidade de Pista: " + Veiculo10.getMotor().getQtdPist());
		System.out.println("Potencia: " + Veiculo10.getMotor().getPotencia());		
		System.out.println("Velocidade Calculada: " +  Veiculo10.calcVel(Veiculo10.getVelocMax()));
		System.out.println("Carga Máxima: " + Veiculo10.getCargaMax());
		System.out.println("Tara: " + Veiculo10.getTara());

		

	}

}
