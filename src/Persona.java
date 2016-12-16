

public class Persona 
{

	private String nombre;
	private int edad; 	//fin sección atributos
	// creando set and get
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public int getEdad() 
	{
		return edad;
	}

	public void setEdad(int edad) 
	{
		this.edad = edad;
	}

	//sección métodos
	public Persona (String nombre_r, int edad_r)
	{
	//Constructor con sobrecarga de nombres al coincidir nombres de parámetros con los de campos
	// this.nombre = nombre_r; //this.nombre es el Campo; nombre_r es el Parámetro
		this.nombre = nombre_r;
		this.edad = edad_r;
	} //this.  solo se usa en Métodos Dinámicos
	
	public Persona()
	{
		
	}
	
	public void mostrarPersona()
	{
		System.out.println("Nombre = " + this.nombre);
		System.out.println("Edad = " + this.edad);
	}
}
	//Fin métodos
	
	
	
	
	
	
	
	
	
	

}
