package clase;

public class Clase {
	public double metodoCajaNegra(String tipoMoneda, int valorMoneda, int cantidadMonedas) {
		if(valorMoneda!=5) {
			return -1;
		}
		if(cantidadMonedas>5000) {
			return -2;
		}
		if(cantidadMonedas<1000) {
			return -3;
		} if(tipoMoneda.equalsIgnoreCase("euro")) {
			return valorMoneda*cantidadMonedas;
		}else if(tipoMoneda.equalsIgnoreCase("dolar")) {
			return (valorMoneda*cantidadMonedas)/1.14;
		}else {
			return 0;
		}
		
	}
}
