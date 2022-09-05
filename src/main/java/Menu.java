import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = true;
        System.out.println("Gymnasium Menu");
        do {
            System.out.println("Pulsa el numero adecuado para la accion a realizar.");
            System.out.println("1. Registra un gimnasio");
            System.out.println("2. Registra un entrenador");
            System.out.println("3. Registra un cliente");
            System.out.println("4. Mira un gimnasio");
            System.out.println("5. Mira un entrenador");
            System.out.println("6. Mira un cliente");
            System.out.println("0.- Salir");

            Integer eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    Gimnasio gim = new Gimnasio();
                    break;

                case 2:
                    Entrenador ent = new Entrenador();
                    break;

                case 3:
                    Cliente cli = new Cliente();
                    break;
                case 4:
                    //gimnasio toString();
                    break;

                case 5:
                    //entrenador toString();
                    break;

                case 6:
                    //cliente toString();
                    break;
                case 0:
                    salir = false;
                    break;
                default:
                    System.out.println("Debe introducir un numero que haya en pantalla");
            }
        } while (salir);
    }
}
