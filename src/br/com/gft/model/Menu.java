package br.com.gft.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Menu{
	private static ArrayList<Carro> carros = new ArrayList<Carro>();
	private static ArrayList<Aviao> avioes = new ArrayList<Aviao>();
	private static ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
	public static ArrayList<Carro> getCarros() {
		return carros;
	}
	public static void setCarros(ArrayList<Carro> carros) {
		Menu.carros = carros;
	}
	public static ArrayList<Aviao> getAvioes() {
		return avioes;
	}
	public static void setAvioes(ArrayList<Aviao> avioes) {
		Menu.avioes = avioes;
	}
	public static ArrayList<Caminhao> getCaminhoes() {
		return caminhoes;
	}
	public static void setCaminhoes(ArrayList<Caminhao> caminhoes) {
		Menu.caminhoes = caminhoes;
	}
	public static void novoCarro(List<Carro> carros) {
		setCarros((ArrayList<Carro>) carros);
	}
	public static void novoAviao(List<Aviao> avioes) {
		setAvioes((ArrayList<Aviao>) avioes);
	}
	public static void novoCaminhao(List<Caminhao> caminhoes) {
		setCaminhoes((ArrayList<Caminhao>) caminhoes);
	}
	public static void listarVeiculos(int escolhaLista) {
		if(escolhaLista==1) {
			int listaCarro = carros.size();
			if(listaCarro!=0) {
				for(Carro carro: getCarros()) {
					System.out.println(carro.toString());	
					}
				}
			else {
				System.out.println("Não existem carros ainda!\n");
			}
			}
			
		else if(escolhaLista==2) {
			int listaAviao = avioes.size();
			if(listaAviao!=0) {
				for(Aviao aviao: getAvioes()) {
					System.out.println(aviao.toString());	
				}
			}
			else {
				System.out.println("Não existem avioes ainda!\n");
			}
		}
		else if(escolhaLista==3) {
		int listaCaminhoes = caminhoes.size();
			if(listaCaminhoes!=0) {
			for(Caminhao caminhao: getCaminhoes()) {
				System.out.println(caminhao.toString());
			}
			}
			else {
				System.out.println("Não existem caminhoes ainda!\n");
			}	
		}
	}
	public static void selecaoDeVeiculos() {
		Scanner ler = new Scanner(System.in);
		int gas=0,escolha,opcMovimento,verLista;
		String  corCaminhao, corAviao,cor ,corCriacao, marcaCriacao,modelo,placa,gasAviao;
		double preco;
		float gasCaminhao;
		while(true){
			System.out.printf("\nDigite 1 para criar um carro "+"\nDigite 2 para criar um avião"+"\nDigite 3 para criar um caminhão"+"\nDigite 4 para listar todos os veiculos"+"\nDigite 0 para sair\n");
			escolha = ler.nextInt();	
				if(escolha ==1) {
						System.out.println("--------------------------");
						marcaCriacao = ler.nextLine();
						System.out.printf("Digite a marca:");
						marcaCriacao = ler.nextLine();
						System.out.println("\n--------------------------");
						System.out.printf("Digite o modelo:");
						modelo=ler.nextLine();
						System.out.println("--------------------------");
						System.out.printf("Digite a cor do carro:");
						corCriacao=ler.nextLine();
						System.out.printf("--------------------------");
						System.out.printf("\nDigite a placa:");
						placa=ler.nextLine();
						System.out.printf("--------------------------");
						System.out.printf("\nDigite o preço do carro:");
						preco=ler.nextDouble();
						System.out.printf("--------------------------");
						Carro carro = new Carro(marcaCriacao, modelo, corCriacao, placa, preco);
						ArrayList<Carro> car = new ArrayList<>();
						car.add(carro);
						novoCarro(car);
						System.out.println("--------------------------");
						do {
						System.out.printf("\nDigite 1 para ligar\n"
								+ "Digite 2 para desligar o carro\n"
								+ "Digite 3 para frear o carro\n"
								+ "Digite 4 para abastecer\n"
								+ "Digite 5 para acelerar\n"
								+ "Digite 6 para definir ou trocar a cor do carro\n"
								+ "Digite 7 para voltar ao menu\n");
						opcMovimento = ler.nextInt();
						if(opcMovimento==1) {
							carro.ligar();
							continue;
						}
						else if(opcMovimento==2){
							carro.desligar();
						}
						else if(opcMovimento==3){
							carro.frear();
						}
						else if(opcMovimento==4){
							System.out.println("\nDigite a quantidade de gasolina que voce deseja colocar");
							gas=ler.nextInt();
							carro.abastecer(gas);
						}
						else if(opcMovimento==5){
							carro.acelerar();
						}
						else if(opcMovimento==6){
							System.out.println("\nEscreva uma cor: ");
							cor=ler.nextLine();
							cor=ler.nextLine();
							carro.pintar(cor);
						}
						}while(opcMovimento!=7);
				}
				else if(escolha ==2) {
					System.out.println("--------------------------");
					marcaCriacao = ler.nextLine();
					System.out.printf("Digite a compania area:");
					marcaCriacao = ler.nextLine();
					System.out.println("\n--------------------------");
					System.out.printf("Digite o modelo:");
					modelo=ler.nextLine();
					System.out.println("--------------------------");
					System.out.printf("Digite a cor do aviao:");
					corCriacao=ler.nextLine();
					System.out.printf("--------------------------");
					System.out.printf("\nDigite a numeração de aviao:");
					placa=ler.nextLine();
					System.out.printf("--------------------------");
					System.out.printf("\nDigite o preço do avião:");
					preco=ler.nextDouble();
					System.out.printf("--------------------------");
					Aviao aviao = new Aviao(marcaCriacao, modelo, corCriacao, placa, preco);
					ArrayList<Aviao> aviaoes = new ArrayList<>();
					aviaoes.add(aviao);
					novoAviao(avioes);
					System.out.println("--------------------------");
					do {
					System.out.printf("\nDigite 1 para ligar\n"
							+ "Digite 2 para desligar o aviao\n"
							+ "Digite 3 para frear o aviao\n"
							+ "Digite 4 para abastecer\n"
							+ "Digite 5 para acelerar\n"
							+ "Digite 6 para definir ou trocar a cor do aviao\n"
							+ "Digite 7 para voltar ao menu\n");
					opcMovimento = ler.nextInt();
					if(opcMovimento==1) {
						aviao.ligar();
						continue;
					}
					else if(opcMovimento==2){
						aviao.desligar();
					}
					else if(opcMovimento==3){
						aviao.frear();
					}
					else if(opcMovimento==4){
						System.out.println("\nDigite a quantidade de gasolina que voce deseja colocar");
						gasAviao=ler.nextLine();
						aviao.abastecer(gasAviao);
					}
					else if(opcMovimento==5){
						aviao.acelerar();
					}
					else if(opcMovimento==6){
						System.out.println("\nEscreva uma cor: ");
						corAviao = ler.nextLine();
						aviao.pintar(corAviao);
					}
					}while(opcMovimento!=7);
			}
				else if(escolha ==2) {
					System.out.println("--------------------------");
					marcaCriacao = ler.nextLine();
					System.out.printf("Digite a marca do caminhão:");
					marcaCriacao = ler.nextLine();
					System.out.println("\n--------------------------");
					System.out.printf("Digite o modelo:");
					modelo=ler.nextLine();
					System.out.println("--------------------------");
					System.out.printf("Digite a cor do caminhão:");
					corCriacao=ler.nextLine();
					System.out.printf("--------------------------");
					System.out.printf("\nDigite a placa do caminhão:");
					placa=ler.nextLine();
					System.out.printf("--------------------------");
					System.out.printf("\nDigite o preço do caminhao:");
					preco=ler.nextDouble();
					System.out.printf("--------------------------");
					Caminhao caminhao = new Caminhao(marcaCriacao, modelo, corCriacao, placa, preco);
					ArrayList<Caminhao> caminhoes = new ArrayList<>();
					setCaminhoes(caminhoes);
					caminhoes.add(caminhao);
					novoCaminhao(caminhoes);
					System.out.println("--------------------------");
					do {
					System.out.printf("\nDigite 1 para ligar\n"
							+ "Digite 2 para desligar o \n"
							+ "Digite 3 para frear o caminhão\n"
							+ "Digite 4 para abastecer\n"
							+ "Digite 5 para acelerar\n"
							+ "Digite 6 para definir ou trocar a cor do caminhão\n"
							+ "Digite 7 para voltar ao menu\n");
					opcMovimento = ler.nextInt();
					if(opcMovimento==1) {
						caminhao.ligar();
						continue;
					}
					else if(opcMovimento==2){
						caminhao.desligar();
					}
					else if(opcMovimento==3){
						caminhao.frear();
					}
					else if(opcMovimento==4){
						System.out.println("\nDigite a quantidade de gasolina que voce deseja colocar");
						gasCaminhao=ler.nextFloat();
						caminhao.abastecer(gasCaminhao);
					}
					else if(opcMovimento==5){
						caminhao.acelerar();
					}
					else if(opcMovimento==6){
						System.out.println("\nEscreva uma cor: ");
						corCaminhao = ler.nextLine();
						caminhao.pintar(corCaminhao);
					}
					}while(opcMovimento!=7);
			}
			else if(escolha == 4) {
				System.out.println("Digite 1 para ver a lista de carros\n"+"Digite 2 para ver a lista de avioes\n"+"Digite 3 para ver a lista de caminhões\n");
				verLista=ler.nextInt();
				listarVeiculos(verLista);
				
			}
			else if(escolha==0) {
				ler.close();
				break;
			}
			else {
				System.out.println("Pressione um tecla para continuar!");
				ler.nextLine();
				}
		}
	}
}
