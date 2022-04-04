import java.util.List;

class Livrare {
  private List<Furnizor> fz;

  private List<Componenta> cmp;

  private List<Integer> cant;

	public Livrare(List<Furnizor> fz, List<Componenta> cmp, List<Integer> cant) {
		this.fz = fz;
		this.cmp = cmp;
		this.cant = cant;
	}

	public void afiseaza() {
	for (Furnizor f : fz)
		System.out.println(f.getNume() + "|" + f.getOras() +"|" + f.getStare());
	
	for (Componenta c : cmp)
			System.out.println(c.getDenumire() + "|" + c.getCuloare() +"|" + c.getUm());
		
	for (int cnt : cant)
		System.out.println(cnt);
}
  
}
