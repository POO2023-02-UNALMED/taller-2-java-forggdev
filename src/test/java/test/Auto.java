package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos(Auto auto) {
		return auto.asientos.length;
	}
	
	String verificarIntegridad(Auto auto) {
		boolean asientosOriginales = true;
		int registroAsientos = auto.asientos[0].registro;
		String mensaje;
		for (int i = 1; i < auto.asientos.length; i++) {
			if (auto.asientos[i].registro != registroAsientos) {
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
