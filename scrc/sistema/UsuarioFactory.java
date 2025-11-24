package sistema;

public class UsuarioFactory {

    public static Usuario crearPaciente(String nombre) {
        return new Paciente(nombre);
    }
}