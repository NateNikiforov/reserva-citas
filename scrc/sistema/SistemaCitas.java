package sistema;

/* FACADE
 * Esta clase oculta la complejidad interna del sistema.
 * El cliente solo llama al método reservarCita(), 
 * sin preocuparse por estrategias de precio ni creación de usuarios.
 */
public class SistemaCitas {

    public void reservarCita(Usuario usuario, EstrategiaPrecio estrategia) {

        double precioBase = 120; // costo estándar de consulta
        double precioFinal = estrategia.calcular(precioBase);

        System.out.println("RESERVA EXITOSA ");
        System.out.println("Paciente: " + usuario.getNombre());
        System.out.println("Precio de la consulta: " + precioFinal);
        System.out.println("--------------------------");
    }
}
