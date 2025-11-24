package sistema;

import java.util.List;

public interface CitaDAO {
    void guardarCita(Usuario usuario, double precio);
    List<String> listarCitas();      // para mostrar info completa
    List<Usuario> listarUsuarios();  // para mostrar solo pacientes
}
