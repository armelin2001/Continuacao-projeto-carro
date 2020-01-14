package br.com.gft.model;

public class Aviao extends Veiculo{
	public Aviao() {
		
	}
	public Aviao(String marca, String modelo, String cor, String placa, double preco) {
		super(marca,modelo,cor,placa,preco);
	}
	// fazendo polimorfismo do metodo abastecer, atraves de uma sobecarga de metodo e tambem ta sendo alterada a assinatura do metodo
	public void abastecer(String qtd) {
		int novoCombustivel = Integer.parseInt(qtd);
		if(isLigado()) {
			System.out.println("Desligue o carro antes de abastecer \n");
		}
		else if(isLigado()==false) {
			if(novoCombustivel>=10000) {
				System.out.println("Voce não pode abastecer mais do que 10000 litros \n");
			}
			else {
				setLitrosCombustivel(novoCombustivel);
				System.out.printf("\nO seu carro possui "+getLitrosCombustivel()+" litros de combustivel\n");
			}
		}
	}
	//fazer alteraçoes
	public void frear() {
		if(isLigado()==true&&getVelocidade()<0) {
			System.out.printf("A sua velocidade atual é de: "+getVelocidade()+" Km/h\n");
			setVelocidade(-10);
		}
		else {
			System.out.println("\nO seu carro ja esta parado!");
		}
	}
	public void acelerar() {
		if(getLitrosCombustivel()<25) {
			System.out.println("\nO seu não possui combustivel o suficiente para acelerar");
		}
		else if(getLitrosCombustivel()>=25) {
			setVelocidade(200);
			setLitrosCombustivel(-15);
			setKm(5);
			System.out.printf("A sua velocidade atual é de: "+getVelocidade()+" Km/h\n");
		}
	}
	
	public String toString() {
		return super.toString();
	}
}
