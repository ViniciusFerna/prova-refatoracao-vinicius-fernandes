package br.com.fiapRide.main;

import br.com.fiapRide.model.Veiculo;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo("Carlos", "ABC-6767", 100, true);
		
		if (v1.isManutencaoEmDia()) {
			//Testes
			v1.adicionarGasolina(50);
			System.out.println(v1.getGasolina());
			v1.subtrairGasolina(120);
			System.out.println(v1.getGasolina());
			
			System.out.println("------------------------------");
			
			v1.adicionarGasolina(-50);
			System.out.println(v1.getGasolina());
			
			v1.setGasolina(-100);
			System.out.println(v1.getGasolina());
			v1.setGasolina(100);
			System.out.println(v1.getGasolina());
			
			System.out.println("Dono: " + v1.getIndividuo() + "/ Placa: " + v1.getPlaca() + "/ Gasolina " + v1.getGasolina());
			
			System.out.println("------------------------------");
			
			Veiculo v2 = new Veiculo("Ronaldo", "DEF-1234", -100, true);
			
			System.out.println("Dono: " + v2.getIndividuo() + "/ Placa: " + v2.getPlaca() + "/ Gasolina " + v2.getGasolina());
			
			
		} else {
			System.out.println("Regularize o veículo antes de utilizar a plataforma");
		}
		
	}
	
}
