package pack;

public class Main {
	
	/**
	 * We just need to add a new country and implement the Pays interface
	 * @param args
	 */
	public static void main(String[] args) {
		
		Immatriculation imm = new Html();
		imm.setPays(new LUX());
		imm.displayPays();
		
		
		
		Immatriculation imm2 = new Applet();
		imm2.setPays(new USA());
		imm2.displayPays();
		
	}

}
