package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2022-04-10T18:26:00Z"));
		
		System.out.println(sdf.format(d));
		
		//3 horas depois da hora de agora		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//cal.add(Calendar.HOUR_OF_DAY, 3);
		//d = cal.getTime();
		
		//decobrindo um valor de hora, minuto, mes...etc...
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println(sdf.format(d));
		System.out.println(minutes);
		System.out.println(month);

	}

}
