package ifpr.edu.br.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		
		try {
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date dataNascimento = df.parse("09/11/2016");
			//System.out.println(dataNascimento.toString());
			
			Date dt = new Date();
			System.out.println(df.format(dt));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
