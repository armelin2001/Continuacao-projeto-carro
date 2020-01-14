package br.com.gft.model;

public class Carro extends Veiculo{
	public Carro() {
	
	}
	public Carro(String marca, String modelo, String cor, String placa, double preco) {
		super(marca,modelo,cor,placa,preco);
	}
	public void abastecer(int qtd) {
		if(isLigado()) {
			System.out.println("Desligue o carro antes de abastecer \n");
		}
		else if(isLigado()==false) {
			if(qtd>100) {
				System.out.println("Voce não pode abastecer mais do que 100 litros \n");
			}
			else if(qtd<=100) {
				setLitrosCombustivel(qtd);
				System.out.printf("\nO seu carro possui "+getLitrosCombustivel()+" litros de combustivel\n");
			}
		}
	}
	public void acelerar() {
		if(getLitrosCombustivel()<1) {
			System.out.println("\nO seu carro não possui combustivel o suficiente para acelerar");
		}
		else if(getLitrosCombustivel()>=1) {
			setVelocidade(20);
			setLitrosCombustivel(-1);
			setKm(5);
			System.out.printf("A sua velocidade atual é de: "+getVelocidade()+" Km/h\n");
		}
	}
	public void frear() {
		if(isLigado()==true&&getVelocidade()<0) {
			System.out.printf("A sua velocidade atual é de: "+getVelocidade()+" Km/h\n");
			setVelocidade(-10);
		}
		else {
			System.out.println("\nO seu carro ja esta parado!");
		}
	}
	
	public String toString() {
		return super.toString();
	}
}
