package cafeteria;

public class Mocha extends Cafe{
	
	private double costoLecheVapor;
	private double costoChoco;
	
	public Mocha(double precioBase, double costoLecheVapor, double costoChoco) {
		super(precioBase);
		this.costoLecheVapor = costoLecheVapor;
		this.costoChoco = costoChoco;
	}

	public double getCostoLecheVapor() {
		return costoLecheVapor;
	}

	public void setCostoLecheVapor(double costoLecheVapor) {
		this.costoLecheVapor = costoLecheVapor;
	}

	public double getCostoChoco() {
		return costoChoco;
	}

	public void setCostoChoco(double costoChoco) {
		this.costoChoco = costoChoco;
	}

	public double calcularCostoExtra() {
		double costoExtra=(costoChoco+costoLecheVapor);
		return costoExtra;
	}
	
	@Override
	public double calcularPrecio() {
		return super.getPrecioBase()+calcularCostoExtra();
	}
	

}
