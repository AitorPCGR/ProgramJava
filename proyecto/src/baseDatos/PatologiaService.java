package baseDatos;
import dto.PatologiaDTO;
import dao.PatologiaDAO;

public class PatologiaService {

	public PatologiaDTO buscarPorId(int id) {

		PatologiaDAO pdao = new PatologiaDAO();
		pdao.buscarPorID(id);
		return null;
	}
}


