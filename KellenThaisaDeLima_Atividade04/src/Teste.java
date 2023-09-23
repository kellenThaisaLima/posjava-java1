import java.util.Arrays;

import java.util.List;
import java.util.Iterator;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Teste {
	
	private static Passeio passeio = new Passeio();
	private static Carga carga = new Carga();
	
	private static Passeio vetPasseio[] = new Passeio[2];
	private static Carga vetCarga[] = new Carga[2];
	
	private static Leitura l = new Leitura();	

	public static void main(String arg[]) {

		System.out.println("Sistema de Gestão de Veículos  -  Menu Inicial");
		
		boolean continua = true;
		int opcao = 0;
		
		while(continua) {
			System.out.println("\n\t\t\t MENU INICIAL");
			System.out.println("\t(1)Cadastrar veículo de PASSEIO");
			System.out.println("\t(2)Cadastrar veículo de CARGA");
			System.out.println("\t(3)Imprimir todos os veículos de PASSEIO");
			System.out.println("\t(4)Imprimir todos os veículos de CARGA");
			System.out.println("\t(5)Imprimir todos os veículos de PASSEIO pela placa");
			System.out.println("\t(6)Imprimir todos os veículos de CARGA pela placa");
			System.out.println("\t(7)Sair do Sistema");
			
			try {
				opcao = Integer.parseInt(l.entDados("\n\tEscolha uma opção"));
				
			} catch (NumberFormatException nfe) {
				System.out.println("Deve ser um valor inteiro - Pressione <ENTER>");
				l.entDados("");
				
				continue;
			}
			
			switch (opcao) {
			case 1: {
				
				for (int i = achaVagoPasseio(); i < vetPasseio.length; i++) {		
					if(i == -1) {
						l.entDados("\nVetor de PASSEIO esta cheio!! Pressione <ENTER>");
						break;
					}
					
					passeio = new Passeio();
					
					vetPasseio[i] = cadPasseio(passeio);			
					
																			
					l.entDados("\nPASSEIO armazenado na posição " + i + " do vetor - Pressione <ENTER>");		
					
					
					String respPass = l.entDados("\nDeseja cadastrar outro PASSEIO? <s/n>");
					
					if(respPass.equalsIgnoreCase("n")) {
						break;
					}
					
					if (achaVagoPasseio() == -1) {
						
						l.entDados("\nVetor de PASSEIO está cheio!! - Pressione <ENTER>");
						break;
						}						
					
					}				
					
				break;
				}
				
			case 2:
				for (int i = achaVagoCarga(); i < vetCarga.length; i++) {
					if(i == -1) {
						l.entDados("\nVetor de CARGA esta cheio!! Pressione <ENTER>");
						break;
					}
					
					carga = new Carga();
					vetCarga[i] = cadCarga(carga);
					
					l.entDados("\nCARGA armazenado na posição " + i + " do vetor - Pressione <ENTER>");
					
					String respCarg = l.entDados("\nDeseja cadastrar outro CARGA? <s/n>");
					
					if(respCarg.equalsIgnoreCase("n")) {
						break;
					}
					
					if (achaVagoCarga() == -1) {
						
						l.entDados("\nVetor de CARGA está cheio!! - Pressione <ENTER>");
						break;
												
					}
					
				}
				break;

			
			case 3:{
				
				System.out.println("\nPASSEIO - Impressão de TODOS os veículos");
				System.out.println("======================================================");
				for (int i = 0; i < vetPasseio.length; i++) {
					if(vetPasseio[i] != null) {
						impPasseio(vetPasseio[i], i);					
					}
					else {
						l.entDados("\nSem mais VEÍCULOS PASSEIO para imprimir - Pressione <ENTER>");
					}					
				}
				System.out.println("======================================================");
			}
			break;
			
			case 4:{
				
				System.out.println("\nCARGA - Impressão de TODOS os veículos");
				System.out.println("======================================================");
				for (int i = 0; i < vetCarga.length; i++) {
					if(vetCarga[i] != null) {
						impCarga(vetCarga[i], i);					
					}
					else {
						l.entDados("\nSem mais VEÍCULOS CARGA para imprimir - Pressione <ENTER>");
					}					
				}
				System.out.println("======================================================");
			}
			break;
			
			case 5:
				
				System.out.println("\nConsulta pela PLACA - Veículos de PASSEIO");
				System.out.println("\n====================================================");
				
				passeio = new Passeio();
				
				boolean existePlacaPass = false;
				
				String placaPass = l.entDados("\nInforme a placa a ser pesquisada:");
				
				passeio.setPlaca(placaPass);
				
				for (int i = 0; i < vetPasseio.length; i++) {
					if(vetPasseio[i].getPlaca().equalsIgnoreCase(passeio.getPlaca())) {
						impPasseio(vetPasseio[i], i);
						existePlacaPass = true;
					}					
				}
				if(!existePlacaPass) {
					l.entDados("\n\t\t\t=======NÃO existe veículo de PASSEIO com essa PLACA - Pressione <ENTER>");
				}
				
				break;
				
			case 6:
				
				System.out.println("\nConsulta pela PLACA - Veículos de CARGA");
				System.out.println("\n====================================================");
				
				carga = new Carga();
				
				boolean existePlacaCarg = false;
				
				String placaCarg = l.entDados("\nInforme a placa a ser pesquisada:");
				
				carga.setPlaca(placaCarg);
				
				for (int i = 0; i < vetCarga.length; i++) {
					if(vetCarga[i].getPlaca().equalsIgnoreCase(carga.getPlaca())) {
						impCarga(vetCarga[i], i);
						existePlacaCarg = true;
					}					
				}
				if(!existePlacaCarg) {
					l.entDados("\n\t\t\t=======NÃO existe veículo de CARGA com essa PLACA - Pressione <ENTER>");
				}
				
				break;
				
			case 7:
				
				continua = false;
				break;				
		
			default:
				
				l.entDados("\nO valor de ser >=1 e <=7 <Pressione <ENTER...>");
				break;
				
			}
		}	
	}	



	public static int achaVagoPasseio() {
		for (int i = 0; i < vetPasseio.length; i++) {
			if(vetPasseio[i] == null) {
				return i;
				}
			}return -1;			
		}		
	
	public static int achaVagoCarga() {
		for (int i = 0; i < vetCarga.length; i++) {
			if(vetCarga[i] == null) {
				return i;
				}
			}return -1;			
		}
	
	public static Passeio cadPasseio(Passeio passeio) {		
		System.out.println("\n\n=====================================================");
		System.out.println("Cadastro de Veículos de PASSEIO");
		System.out.println("======================================================");
		passeio.setQtdPassageiros(Integer.parseInt(l.entDados("Quantidade de Passageiros.:")));
		passeio.setPlaca(l.entDados("Placa.:"));			
		passeio.setMarca(l.entDados("Marca.:"));
		passeio.setModelo(l.entDados("Modelo.:"));
		passeio.setCor(l.entDados("Cor.:"));
		passeio.setQtdRodas(Integer.parseInt(l.entDados("Quantidade de Rodas.:")));
		passeio.setVelocMax(Integer.parseInt(l.entDados("Velocidade Máxima.:")));
		passeio.getMotor().setQtdPist(Integer.parseInt(l.entDados("Quantidade de Pistões de Motor.:")));
		passeio.getMotor().setPotencia(Integer.parseInt(l.entDados("Potência de Motor.:")));	
		
		return passeio;
		
	}
	
	public static void impPasseio(Passeio passeio, int i) {
		
		System.out.println("\nPasseio armazenado no endereço: " + i + "(do vetor vetPasseio)");
		System.out.println("Quantidade de Passageiros: " + passeio.getQtdPassageiros());
		System.out.println("Placa: " + passeio.getPlaca());
		System.out.println("Marca: " + passeio.getMarca());
		System.out.println("Modelo: " + passeio.getModelo());
		System.out.println("Cor: " + passeio.getMarca());
		System.out.println("Quantidade de Rodas: " + passeio.getQtdRodas());
		System.out.println("Velocidade Máxima: " + passeio.getVelocMax());
		System.out.println("Quantidade de Pistões do Motor: " + passeio.getMotor().getQtdPist());
		System.out.println("Potência do Motor: " + passeio.getMotor().getPotencia());
		System.out.println("Quantidade Total de Letras: " + passeio.calcular());
		passeio.calcVel(i);	
		
	}
	
	public static Carga cadCarga(Carga carga) {
		System.out.println("\n\n=====================================================");
		System.out.println("Cadastro de Veículos de CARGA");
		System.out.println("======================================================");
		carga.setCargaMax(Integer.parseInt(l.entDados("Carga Máxima.:")));
		carga.setTara(Integer.parseInt(l.entDados("Tara.:")));
		carga.setPlaca(l.entDados("Placa.:"));
		carga.setMarca(l.entDados("Marca.:"));
		carga.setModelo(l.entDados("Modelo.:"));
		carga.setCor(l.entDados("Cor.:"));
		carga.setQtdRodas(Integer.parseInt(l.entDados("Quantidade de Rodas.:")));
		carga.setVelocMax(Integer.parseInt(l.entDados("Velocidade Máxima.:")));
		carga.getMotor().setQtdPist(Integer.parseInt(l.entDados("Quantidade de Pistões de Motor.:")));
		carga.getMotor().setPotencia(Integer.parseInt(l.entDados("Potência de Motor.:")));
		
		return carga;
		
	}
	
	public static void impCarga(Carga carga, int i) {
		
		System.out.println("\nCarga armazenado no endereço: " + i + "(do vetor vetCarga)");
		System.out.println("Carga Máxima:" + carga.getCargaMax());
		System.out.println("Tara:" + carga.getTara());
		System.out.println("Placa: " + carga.getPlaca());
		System.out.println("Marca: " + carga.getMarca());
		System.out.println("Modelo: " + carga.getModelo());
		System.out.println("Cor: " + carga.getMarca());
		System.out.println("Quantidade de Rodas: " + carga.getQtdRodas());
		System.out.println("Velocidade Máxima: " + carga.getVelocMax());
		System.out.println("Quantidade de Pistões do Motor: " + carga.getMotor().getQtdPist());
		System.out.println("Potência do Motor: " + carga.getMotor().getPotencia());
		System.out.println("Quantidade Total de Números: " + carga.calcular());
		carga.calcVel(i);	
		
	}		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
		
