import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<producto> inventario = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        ArrayList<usuario> usuarios = new ArrayList<>();

        // Creación de usuarios iniciales
        usuarios.add(new Usuario("admin", "admin123", "Administrador"));
        usuarios.add(new Usuario("almacenero", "almacenero123", "Almacenero"));
        usuarios.add(new Usuario("contador", "contador123", "Contador"));

        while (true) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Administrar Productos");
            System.out.println("2. Gestionar Pedidos");
            System.out.println("3. Generar Informes");
            System.out.println("4. Administrar Usuarios");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:

                    break;
                case 2:


                case 3:
                    //
                    Informe informe = new Informe();
                    System.out.println(informe.generarInformeDeInventario(inventario));
                    System.out.println(informe.generarInformeDePedidos(pedidos));
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}