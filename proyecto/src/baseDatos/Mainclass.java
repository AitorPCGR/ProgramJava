package baseDatos;

import java.util.List;

public class Mainclass {

	public static void main(String[] args) {
		
		EmpleadoDAO empleado = new EmpleadoDAO();
		List <EmpleadosDTO> Listaempleados = empleado.consultaEmpleadosDepartamentos(20);
		
		for (EmpleadosDTO empleadosDTO : Listaempleados) {
			System.out.println(empleadosDTO.getNombre());
		}
		
	}
	
	
}
