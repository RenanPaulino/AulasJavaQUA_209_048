package etities;

public class Veiculo {
	protected String modelo;
	protected int passageiros;
	protected String combustivel;
	protected int pneus;
	protected int potenciaMotor;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String modelo, int passageiros, String combustivel, int pneus, int potenciaMotor) {
		this.modelo = modelo;
		this.passageiros = passageiros;
		this.combustivel = combustivel;
		this.pneus = pneus;
		this.potenciaMotor = potenciaMotor;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public int getPneus() {
		return pneus;
	}
	public void setPneus(int pneus) {
		this.pneus = pneus;
	}
	public int getPotenciaMotor() {
		return potenciaMotor;
	}
	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	
/*	@Override
	public String toString() {
		return "Modelo: " + this.modelo +
				"\n Passageiros: " + this.passageiros +
				"\n Tipo de Combustivel: " + this.combustivel +
				"\n Quant. Rodas: " + this.pneus +
				"\n Potencia do Motor ou Cilindadras: " + this.potenciaMotor +" cavalos";
	
	}	*/
	

}
