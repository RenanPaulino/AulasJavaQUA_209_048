package etities;

public class Carros extends Veiculo {
	
	public Carros() {
		
	}
	
	public Carros(String modelo, int passageiros, String combustivel, int pneus, int potenciaMotor) {
		super (modelo, passageiros, combustivel, pneus, potenciaMotor);
	}
	
	@Override
	public String toString() {
		return "Modelo: " + this.modelo +
				"\n Passageiros: " + this.passageiros +
				"\n Tipo de Combustivel: " + this.combustivel +
				"\n Quant. Rodas: " + this.pneus +
				"\n Potencia do Motor ou Cilindadras: " + this.potenciaMotor +" cavalos";
	}
}
