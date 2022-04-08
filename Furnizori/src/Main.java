import java.sql.SQLException;
import java.util.*;
public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		
		Livrari liv = new Livrari();
		liv.setLivrari();

		Livrare l = liv.getLiv();
		
		l.afiseaza();

		
			
		
		
		/*
		 * System.out.println(cmp.getDenumire()); System.out.println(fz.getNume());
		 */
	

	}

}
