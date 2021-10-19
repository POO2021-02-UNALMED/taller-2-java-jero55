package test;
public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		
		int count = 0;
		for (int i = 0; i<asientos.length;i++) {
			if (asientos[i] != null) 
				count+=1;
			
		}
		return count;
	}
	
	String verificarintegridad() {
		if (this.registro != this.motor.registro) 
			return "Las piezas no son originales";
		
		if (this.registro == this.motor.registro) 
			for (int i = 0;i<asientos.length;i++) {
				if (asientos[i] != null) {
					if (asientos[i].registro != this.registro) {
						return "Las piezas no son originales";
					}
				}
			}
		return "Auto original";
	}

	
}
