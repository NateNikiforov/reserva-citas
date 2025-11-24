package sistema;

public class Cita {
    private final Usuario usuario;
    private final double precio;

    public Cita(Usuario usuario, double precio) {
        this.usuario = usuario;
        this.precio = precio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public double getPrecio() {
        return precio;
    }
}
