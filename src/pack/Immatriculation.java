package pack;

public class Immatriculation {
	
	/**
	 * this attribute resolves the complexity of adding more implementations (Immatriculation / Html or Applet)
	 */
	Pays pays;
	
	void displayPays() {
		pays.myPays();
	}
	
	void setPays(Pays pays) {
		this.pays = pays;
	}
	
}




