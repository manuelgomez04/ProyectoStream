package ejemploConcesionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String  aux;
		//int opcion;
		Scanner sc = new Scanner (System.in);
		
		List <Coche> prueba = new ArrayList<>();
		Coche coche = new Coche("hola", "SDKFS", "340748", 2323, 412341, false, true);
		Coche coche2 = new Coche("adios", "LSDKFS", "1340748", 2323, 412341, false, true);
		CrudCoche crudCoche = new CrudCoche(prueba);
	
		
		
	}	

}
