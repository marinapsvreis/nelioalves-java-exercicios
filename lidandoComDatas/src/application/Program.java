package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//mudando o sdf3 para GMT
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//data de agora
		Date x1 = new Date();
		Date x2 = new Date (System.currentTimeMillis());
		Date x3 = new Date (0L);
		Date x4 = new Date (1000L * 60L * 60L * 5L);
		
		//passando a informação		
		Date y1 = sdf1.parse("10/04/2022");
		Date y2 = sdf2.parse("10/04/2022 18:12:00");
		Date y3 = Date.from(Instant.parse("2022-04-10T18:12:00Z"));
		Date y4 = Date.from(Instant.parse("2022-04-10T18:12:00Z"));
		
		//imprimindo no formato sdf2		
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("y3: " + sdf3.format(y4));
		System.out.println();
		System.out.println("Hora local do sistema:");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println();
		System.out.println("GMT");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));

	}

}
