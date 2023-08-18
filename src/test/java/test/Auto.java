package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int numAsientos=0;
		for (int i = 0; i < this.asientos.length; i++) {
			if (this.asientos[i] != null) {
				numAsientos++;
			}
		}
		return numAsientos;
	}
	
	String verificarIntegridad() {
		boolean asientosOriginales = true;
		int registroGeneral=this.registro;
		String mensaje;
		for (int i = 0; i < this.asientos.length; i++) {
			if (this.asientos[i] != null && this.asientos[i].registro != registroGeneral) {
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
