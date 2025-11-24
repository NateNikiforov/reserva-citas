package sistema;

import java.util.ArrayList;
import java.util.List;

public class CitaDAOImpl implements CitaDAO {

    private final List<Cita> db = new ArrayList<>();

    @Override
    public void guardarCita(Usuario usuario, double precio) {
        db.add(new Cita(usuario, precio));
    }

    @Override
    public List<String> listarCitas() {
        List<String> resultado = new ArrayList<>();
        for (Cita c : db) {
            resultado.add("Paciente: " + c.getUsuario().getNombre() + ", Precio: " + c.getPrecio());
        }
        return resultado;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        List<Usuario> pacientes = new ArrayList<>();
        for (Cita c : db) {
            pacientes.add(c.getUsuario());
        }
        return pacientes;
    }
}
