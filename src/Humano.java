public class Humano {
	String nombre;
	int edad;
	double peso;
	int estatura;
	
	Humano(String nombre, int edad, double peso, int estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.estatura = estatura;
	}
	
	void cumplirAnos() {
		edad++;
	}
	
	void cambiarPeso (double nuevoPeso) {
		peso = nuevoPeso;
	}
	
	void cambiarEstatura (int nuevaEstatura) {
		estatura = nuevaEstatura;
	}
	
	String getNombre () {
		return nombre;
	}

	@Override
	public String toString() {
		return "Humano [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", estatura=" + estatura + "]";
	}
	
}
