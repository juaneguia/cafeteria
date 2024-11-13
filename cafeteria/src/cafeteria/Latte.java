package cafeteria;

public class Latte extends Cafe {
	
	private double costoLecheVapor;
	private double costoLecheEspuma;
	
	public Latte(double precioBase, double costoLecheVapor, double costoLecheEspuma) {
		super(precioBase);
		this.costoLecheVapor = costoLecheVapor;
		this.costoLecheEspuma = costoLecheEspuma;
	}

	public double getCostoLecheVapor() {
		return costoLecheVapor;
	}

	public void setCostoLecheVapor(double costoLecheVapor) {
		this.costoLecheVapor = costoLecheVapor;
	}

	public double getCostoLecheEspuma() {
		return costoLecheEspuma;
	}

	public void setCostoLecheEspuma(double costoLecheEspuma) {
		this.costoLecheEspuma = costoLecheEspuma;
	}
	
	public double calcularCostoExtra() {
		double costoExtra=(costoLecheEspuma+costoLecheVapor);
		return costoExtra;
	}
	
	@Override
	public double calcularPrecio() {
		return super.getPrecioBase()+calcularCostoExtra();
	}

}
