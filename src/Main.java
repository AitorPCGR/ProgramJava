

public class Main
{
	
	public static final int NUMERO_ALUMNOS = 3;
	
	public static String pedirNombre()
	{
		
		String pedirNombre = null;
		Scanner scanner = null;
		
			scanner = new Scanner(System.in);
			pedirNombre = scanner.nextLine();
				
		return pedirNombre;
	}
	
	public static int pedirEdad()
	{
		
		int pedirEdad = 0;
		Scanner scanner = null;
		
			scanner = new Scanner(System.in);
			pedirEdad = scanner.nextInt();
		
		return pedirEdad;
	}
	
	public static void main(String[] args)
	{
		
		int edadMayor = 0;
		int edad = 0;
		String nombre = null;
		
	//	int edad_2 = 0; int edad_3 = 0; int edad_4 = 0;	int edad_5 = 0;
	//	String nombre_2 = null;	String nombre_3 = null;	String nombre_4 = null;	String nombre_5 = null;
		
		Persona personaMayor = new Persona();
		Persona p = new Persona();
		for(int i = 0; i <= NUMERO_ALUMNOS; i ++)
		{	
			System.out.println("Introduzca nombre: ");
			nombre = pedirNombre();
			System.out.println("Introduzca edad: ");
			edad = pedirEdad();
			
			p.setNombre(nombre);
			p.setEdad(edad);
		
			
			if (edad > edadMayor)
			{
				edadMayor = edad;
						
				personaMayor.setNombre(nombre);
				personaMayor.setEdad(edad);
			}
		}
		
			System.out.println("La persona mayor es: " + personaMayor.getNombre() + "Y su edad es: " + personaMayor.getEdad());
	}
}

