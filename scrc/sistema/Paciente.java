package sistema;

public class Paciente implements Usuario {

    private final String nombre;

    public Paciente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
