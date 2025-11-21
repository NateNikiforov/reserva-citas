package sistema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE RESERVA DE CITAS");
        System.out.print("Ingrese nombre del paciente: ");
        String nombre = scanner.nextLine();

        Usuario paciente = UsuarioFactory.crearPaciente(nombre);

        System.out.println("Seleccione tipo de paciente:");
        System.out.println("1. Paciente Normal");
        System.out.println("2. Paciente con Seguro");
        int opc = scanner.nextInt();

        EstrategiaPrecio estrategia = (opc == 2) ? new PrecioConSeguro() : new PrecioNormal();

        SistemaCitas sistema = new SistemaCitas();
        sistema.reservarCita(paciente, estrategia);

        sistema.listarReservas(); // Muestra todas las reservas guardadas
    }
}