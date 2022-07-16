public class Mundo {

	public static void main(String[] args) {
		Humano mario = new Humano("Mario Casas", 36, 75.0, 180);
		Humano ana = new Humano("María Valverde", 35, 52.0, 164);
		
		mario.cumplirAnos();
		ana.cambiarPeso(53);
		mario.cambiarEstatura(181);
		ana.cumplirAnos();
		
		System.out.println(mario);
		System.out.println(ana);
	}
}
