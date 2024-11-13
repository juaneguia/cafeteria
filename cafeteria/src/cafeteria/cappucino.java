package cafeteria;

public class cappucino extends Cafe{
	private double costoLecheVapor;
	private double costoCacao;
	private double costoCanela;
	
	public cappucino() {
	}

	public cappucino(double precioBase, double costoLecheVapor, double costoCacao, double costoCanela) {
		super(precioBase);
		this.costoLecheVapor = costoLecheVapor;
		this.costoCacao = costoCacao;
		this.costoCanela = costoCanela;
	}

	public double getCostoLecheVapor() {
		return costoLecheVapor;
	}

	public void setCostoLecheVapor(double costoLecheVapor) {
		this.costoLecheVapor = costoLecheVapor;
	}

	public double getCostoCacao() {
		return costoCacao;
	}

	public void setCostoCacao(double costoCacao) {
		this.costoCacao = costoCacao;
	}

	public double getCostoCanela() {
		return costoCanela;
	}

	public void setCostoCanela(double costoCanela) {
		this.costoCanela = costoCanela;
	}
	
	public double calcularCostoExtra() {
		double costoExtra=(costoCacao+costoCanela+costoLecheVapor);
		return costoExtra;
	}
	
	@Override
	public double calcularPrecio() {
		return super.getPrecioBase()+calcularCostoExtra();
	}

}
