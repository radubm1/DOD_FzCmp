import com.jakewharton.fliptables.FlipTableConverters;

import java.util.List;

class Livrare {
  private List<Furnizor> fz;

  private List<Componenta> cmp;

  private List<Cantitate> cant;

	public Livrare(List<Furnizor> fz, List<Componenta> cmp, List<Cantitate> cant) {
		this.fz = fz;
		this.cmp = cmp;
		this.cant = cant;
	}

	public void afiseaza() {
/*	for (Furnizor f : fz)
		System.out.println(f.getNume() + "|" + f.getOras() +"|" + f.getStare());
	
	for (Componenta c : cmp)
			System.out.println(c.getDenumire() + "|" + c.getCuloare() +"|" + c.getUm());
		
	for (Cantitate cnt : cant)
		System.out.println(cnt.getCant());*/

	//System.out.println(FlipTableConverters.fromIterable(fz, Furnizor.class));
	//System.out.println(FlipTableConverters.fromIterable(cmp, Componenta.class));
	//System.out.println(FlipTableConverters.fromIterable(cant, Cantitate.class));

	String[] headers = { "Row_1", "Row_2", "Row_3", "Row_4","Row_5", "Row_6", "Row_7", "Row_8","Row_9", "Row_10", "Row_11", "Row_12" };

	Object[][] data = new Object[3][];
	data[0]=fz.toArray();
	data[1]= cmp.toArray();
	data[2]=cant.toArray();

	System.out.println(FlipTableConverters.fromObjects(headers, data));

}
  
}
