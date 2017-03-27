package JSON;

import com.google.gson.Gson;

public class PrincipalPersonaJSON {
	
	public static void main(String[] args) {
		
		Gson gson = new Gson();
		
		Persona p = new Persona("Mikel", 4, false, false);
		
		String jsonpersona = gson.toJson(p);
		
		System.out.println(jsonpersona);
		
		Persona p2 = gson.fromJson(jsonpersona, Persona.class);
		
		System.out.println("Número de hijos =" +p2.getNhijos());
		System.out.println("Nombre =" +p2.getNombre());
		System.out.println("Casado =" +p2.isCasada());
		System.out.println("Parado =" +p2.isParado());
		
	}

}
