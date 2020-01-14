package br.com.gft.model;

public class Veiculo {
	private String marca,modelo,placa,cor;
	private boolean ligado;
	private int litrosCombustivel,velocidade;
	private double preco;
	private float km;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public float getKm() {
		return km;
	}
	public void setKm(float km) {
		this.km = km;
	}
	//construtor
	public Veiculo() {
		
	}
	public Veiculo(String marca, String modelo, String cor, String placa, double preco) {
		setMarca(marca);
		setModelo(modelo);
		setCor(cor);
		setPlaca(placa);
		setPreco(preco);
	}
	public void ligar() {
		if(isLigado()==false) {
			setLigado(true);
			System.out.println("\nO seu veiculo ja esta ligado! ");
		}
		else {
			System.out.println("\nVoce já ligou o veiculo");
		}
	}
	public void desligar() {
		if(isLigado()) {
			System.out.println("\nO veiculo foi desligado");
			setLigado(false);
		}
		else {
			System.out.println("\nVoce já desligou o seu veiculo");
		}
	}
	public void abastecer(int qtd) {
		
	}
	public void acelerar() {
		if(isLigado()==false) {
			System.out.println("\nO seu veiculo precissa estar ligado para acelerar");
		}
	}
	public void frear() {
		if(isLigado()==false) {
			System.out.println("\nLigue o veiculo!");
		}
	}
	public void pintar(String cor) {
		if(isLigado()) {
			System.out.println("\nDesligue o veiculo antes de pintar!");
		}
		else if(isLigado()==false) {
			if(cor==getCor()){
				System.out.printf("\nO seu veiculo ja possui a cor "+getCor());
			}
			else if(cor!=getCor()) {
				setCor(cor);
				System.out.printf("\nA cor do seu veiculo agora é "+getCor());
			}
		}
	}
	public String toString() {
		String retorno ="";
		retorno="\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nCor: "+getCor()+"\nPlaca: "+getPlaca()+"\nPreço: "+getPreco();
		return retorno;
		
	}
}
