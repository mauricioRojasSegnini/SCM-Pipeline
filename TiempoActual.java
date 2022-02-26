import java.util.Calendar;
import java.util.GregorianCalendar;

public class TiempoActual {
	
	public static String Saludar(int hora) {
		String saludo="";
		if (hora < 12) {
			saludo="Buenos días";
		}else if (hora < 17) {
			saludo="Buenas tarde";
		}else {
			saludo="Buenas noches";
		}
		return saludo;
	}
	
	public static String DarLaHora(int hora, int min) {
		return "Son las " + hora + ":" + min;
	}
	
	public static String DarLaFecha(int dia, int mes, int anno) {
		return "Hoy estamos " + dia + "/" + mes + "/" + anno;
	}
	
	public static void main(String[] args) {
		GregorianCalendar tiempo = new GregorianCalendar();
		int hora = tiempo.get(Calendar.HOUR_OF_DAY);
		int min = tiempo.get(Calendar.MINUTE);
		int dia = tiempo.get(Calendar.DAY_OF_MONTH);
		int mes = tiempo.get(Calendar.MONTH) + 1;
		int anno = tiempo.get(Calendar.YEAR);
		System.out.println(Saludar(hora));
		System.out.println(DarLaHora(hora, min));
		System.out.println(DarLaFecha(dia,mes,anno));
	}
}
