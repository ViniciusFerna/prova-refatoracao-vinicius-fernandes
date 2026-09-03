package br.com.fiapRide.model;

public class Veiculo {
	
	private String individuo;
	
	private String placa;
	
	private double gasolina;
	
	private boolean manutencaoEmDia;
	
	public Veiculo(String individuo, String placa, double gasolina, boolean manutencaoEmDia) {
		this.setIndividuo(individuo);
		this.setPlaca(placa);
		this.setGasolina(gasolina);
		this.setManutencaoEmDia(manutencaoEmDia);
	}
	
	
	public void adicionarGasolina(int quantidade) { // Adiciona gasolina no valor já presente
		if (quantidade < 0) {
			System.out.println("Valor inválido");
		} else {
			gasolina = gasolina + quantidade;
		}
		
	}
	
	public void subtrairGasolina(int quantidade) { // Subtai gasolina no valor já presente
		if (quantidade < 0) {
			System.out.println("Valor inválido");
		} else {
			gasolina = gasolina - quantidade;
		}
		
	}

	
	public String getIndividuo() {
		return individuo;
	}

	public void setIndividuo(String individuo) {
		this.individuo = individuo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getGasolina() {
		return gasolina;
	}

	public void setGasolina(double gasolina) {
		if (gasolina < 0) { // Caso a gasolina seja menor que 0 setta de volta para 0 e pede denovo
			System.out.println("Valor inválido. Tente novamente!");
		} else {
			this.gasolina = gasolina;
		}
		
	}
	
	public boolean isManutencaoEmDia() {
		return manutencaoEmDia;
	}


	public void setManutencaoEmDia(boolean manutencaoEmDia) {
		this.manutencaoEmDia = manutencaoEmDia;
	}

}
