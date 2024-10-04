package Casa;
import Model.Gato;
import Model.Animal;
import Model.Perro;

import Model.Conejo;
public class Casa {
	private Animal gato=new Gato();
	private Animal perro=new Perro();
	private Animal conejo=new Conejo();
	
	public Casa() {};
	
	public void realizar_prueba() {
		gato.hacersonido();
		perro.hacersonido();
		conejo.hacersonido();
	}
	
	

}
