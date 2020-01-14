package br.com.gft.model;

public class Caminhao extends Veiculo {
	public Caminhao() {
		
	}
	public Caminhao(String marca, String modelo, String cor, String placa, double preco) {
		super(marca,modelo,cor,placa,preco);
	}
	public void abastecer(float qtd) {
		int novoCombustivel = (int)qtd;
		if(isLigado()) {
			System.out.println("Desligue o carro antes de abastecer \n");
		}
		else if(isLigado()==false) {
			if(qtd>=1000) {
				System.out.println("Voce não pode abastecer mais do que 1000 litros \n");
			}
			else if(qtd<1000) {
				setLitrosCombustivel(novoCombustivel);
				System.out.printf("\nO seu carro possui "+getLitrosCombustivel()+" litros de combustivel\n");
			}
		}
	}
	public void acelerar() {
		if(getLitrosCombustivel()<10) {
			System.out.println("\nO seu caminhão não possui combustivel o suficiente para acelerar");
		}
		else if(getLitrosCombustivel()>=10) {
			setVelocidade(10);
			setLitrosCombustivel(-1);
			setKm(2);
			System.out.printf("A sua velocidade atual é de: "+getVelocidade()+" Km/h\n");
		}
	}
	public void frear() {
		if(isLigado()==true&&getVelocidade()<0) {
			System.out.printf("A sua velocidade atual é de: "+getVelocidade()+" Km/h\n");
			setVelocidade(-8);
		}
		else {
			System.out.println("\nO seu caminhao ja esta parado!");
		}
	}
	public String toString() {
		return super.toString();
	}
}
