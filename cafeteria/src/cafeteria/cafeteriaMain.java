package cafeteria;

public class cafeteriaMain {
	
	public static void main(String[] args) {
		
		Cafe cappu1 = new cappucino(1.0, 1.0, 1.0, 1.0);
		Cafe mocha1 = new Mocha(2.0, 1.0, 1.5);
		Cafe latte1 = new Latte(1.5, 1.0, 3.0);
		
		System.out.println("EL precio es de: " + cappu1.calcularPrecio());
		System.out.println("EL precio es de: " + mocha1.calcularPrecio());
		System.out.println("EL precio es de: " + latte1.calcularPrecio());

	}

}
