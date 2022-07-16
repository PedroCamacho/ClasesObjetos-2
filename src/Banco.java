public class Banco {

	public static void main(String[] args) {
		Cuenta c = new Cuenta ("123890023", "Miguel Pérez", 1800.4f, 0.25f);
		Cuenta d = new Cuenta ("23900839", "Antonio Gómez", 200f, 0.25f);
		Cuenta e = new Cuenta ("151590020", "Javier Sánchez", 1200.2f, 1.25f);
		
		System.out.println("Saldo de c: " + c.leerSaldo());
		System.out.println("Saldo de d: " + d.leerSaldo());
		System.out.println("Saldo de e: " + e.leerSaldo());
	}
}
