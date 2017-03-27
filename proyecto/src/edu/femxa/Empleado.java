package edu.femxa;

public class Empleado {

	private String nombre;
	private int id;
	private int salario;
	private int dpto;
	
	
	public Empleado(String nombre, int id, int salario, int dpto) {
		
		super();
		this.nombre = nombre;
		this.id = id;
		this.salario = salario;
		this.dpto = dpto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getDpto() {
		return dpto;
	}
	public void setDpto(int dpto) {
		this.dpto = dpto;
	}
}
