package sistema;

/* FACTORY METHOD
 * Esta clase permite crear objetos Usuario sin que la lógica principal 
 * conozca los detalles de cada tipo de usuario.
 * Facilita extender el sistema agregando otros tipos de usuarios.
 */
public class UsuarioFactory {

    public static Usuario crearPaciente(String nombre) {
        return new Paciente(nombre);
    }
}