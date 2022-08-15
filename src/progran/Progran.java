package progran;

import java.util.ArrayList;
import java.util.Scanner;

import etities.Carros;
import etities.Motos;
//import etities.Veiculo;

public class Progran {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Carros carros;
		Motos moto;

		System.out.print("Deseja cadastrar um veiculo? (s/n): ");
		char resp = leia.next().charAt(0);

		ArrayList<Motos> listaMoto = new ArrayList<>();
		ArrayList<Carros> listaCarros = new ArrayList<>();

		while (Character.toLowerCase(resp) == 's') {
			moto = new Motos();
			carros = new Carros();

			System.out.print("\nCadastrar Carro ou Moto? C/M: ");
			resp = leia.next().charAt(0);

			if (Character.toLowerCase(resp) == 'm') {
				listaMoto.add(moto = new Motos());

				leia.nextLine();

				System.out.print("Informe modelo: ");
				moto.setModelo(leia.nextLine());

				System.out.print("Informe o tipo de combustivel: ");
				moto.setCombustivel(leia.nextLine());

				System.out.print("Informe a capacidade de passageiros: ");
				moto.setPassageiros(leia.nextInt());

				System.out.print("Infome quantos pneus: ");
				moto.setPneus(leia.nextInt());

				System.out.print("Informe a potencia do motor: ");
				moto.setPotenciaMotor(leia.nextInt());

			} else if (Character.toLowerCase(resp) == 'c') {

				listaCarros.add(carros = new Carros());

				leia.nextLine();
				System.out.print("Informe modelo: ");
				carros.setModelo(leia.nextLine());

				System.out.print("Informe o tipo de combustivel: ");
				carros.setCombustivel(leia.nextLine());

				System.out.print("Informe a capacidade de passageiros: ");
				carros.setPassageiros(leia.nextInt());

				System.out.print("Infome quantos pneus: ");
				carros.setPneus(leia.nextInt());

				System.out.print("Informe a potencia do motor: ");
				carros.setPotenciaMotor(leia.nextInt());

			}

			System.out.print("\nDeseja cadastrar um veiculo? (s/n): ");
			resp = leia.next().charAt(0);
		}
		if (listaMoto.isEmpty() == false)
			System.out.println("\nLista de motos cadastradas\n");
		for (Motos list : listaMoto) {
			System.out.println("\n" + list);
		}
		if (listaCarros.isEmpty() == false) {
			System.out.println("\nLista de carros cadastradas\n");
			for (Carros list : listaCarros) {
				System.out.println("\n" + list);
			}
		}
		leia.close();
	}

}
