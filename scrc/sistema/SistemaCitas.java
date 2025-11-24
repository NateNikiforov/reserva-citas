package sistema;

public class SistemaCitas {

    private final CitaDAO dao = new CitaDAOImpl();

    public void reservarCita(Usuario usuario, EstrategiaPrecio estrategia) {
        double precioBase = 120; // costo estándar de consulta
        double precioFinal = estrategia.calcular(precioBase);
        dao.guardarCita(usuario, precioFinal);

        System.out.println("RESERVA EXITOSA");
        System.out.println("Paciente: " + usuario.getNombre());
        System.out.println("Precio de la consulta: " + precioFinal);
        System.out.println("--------------------------");
    }

    public void listarReservas() {
        System.out.println("CITAS REGISTRADAS:");
        for (String s : dao.listarCitas()) {
            System.out.println(s);
        }
        System.out.println("--------------------------");
    }

    public void listarPacientes() {
        System.out.println("PACIENTES REGISTRADOS:");
        for (Usuario u : dao.listarUsuarios()) {
            System.out.println(u.getNombre());
        }
        System.out.println("--------------------------");
    }
}
