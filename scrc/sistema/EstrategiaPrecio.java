package sistema;

/*
 * STRATEGY
 * Define un comportamiento intercambiable para calcular el precio final según
 * el tipo de paciente.
 */
public interface EstrategiaPrecio {
    double calcular(double base);
}