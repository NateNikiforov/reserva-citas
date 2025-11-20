package sistema;

public class PrecioNormal implements EstrategiaPrecio {
    @Override
    public double calcular(double base) {
        return base;
    }
}
