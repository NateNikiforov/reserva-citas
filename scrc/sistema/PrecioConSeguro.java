package sistema;

public class PrecioConSeguro implements EstrategiaPrecio {
    @Override
    public double calcular(double base) {
        return base * 0.5; // 50% de descuento para asegurados
    }
}
