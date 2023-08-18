package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	public int cantidadAsientos() {
		return this.asientos.length;
	}
	
	public String verificarIntegridad() {
		boolean asientosOriginales = true;
		int registroAsientos = this.asientos[0].registro;
		String mensaje;
		for (int i = 1; i < this.asientos.length; i++) {
			if (this.asientos[i].registro != registroAsientos) {
				asientosOriginales = false;
				break;
			}
		}
		if (this.registro==this.motor.registro && asientosOriginales) {
			mensaje = "Auto original";
		} else {
			mensaje = "Las piezas no son originales";
		}
		return mensaje;
	}
}
