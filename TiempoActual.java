import java.util.Calendar;
import java.util.GregorianCalendar;

public class TiempoActual {
	public static void main(String[] args) {
		GregorianCalendar tiempo = new GregorianCalendar();
		int hora = tiempo.get(Calendar.HOUR_OF_DAY);
		int min = tiempo.get(Calendar.MINUTE);
		int dia = tiempo.get(Calendar.DAY_OF_MONTH);
		int mes = tiempo.get(Calendar.MONTH) + 1;
		int año = tiempo.get(Calendar.YEAR);
	
		if (hora < 12) {
			System.out.println("Buenos días");
		}else if (hora < 17) {
			System.out.println("Buenas tarde");
		}else {
			System.out.println("Buenas noches");
		}
		System.out.println("Son las " + hora + ":" + min);
		System.out.println("Hoy estamos " + mes + "/" + dia + "/" + año);
	}
}