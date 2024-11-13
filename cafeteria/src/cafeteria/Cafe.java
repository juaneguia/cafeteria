package cafeteria;


public abstract class Cafe {
	
	protected double precioBase;
	
	public  Cafe() {
	}
	public Cafe(double precioBase) {
		super();
		this.precioBase = precioBase;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public abstract double calcularPrecio(); 
		
	
}