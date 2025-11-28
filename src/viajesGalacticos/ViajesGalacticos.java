package viajesGalacticos;
 
import java.util.Random;
import java.util.Scanner;

public class ViajesGalacticos {

     // Elementos necesarios
 
    static Scanner read = new Scanner(System.in);
 
    static String[] planets = { "Mercurio", "Venus", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno" };
    static double[] distances = { 91.7, 41.4, 78.3, 628.7, 1.275, 2.724, 4.351 };
 
    static String[] ships = { "Elyón", "Argos", "Deméter", };
    static double[] speed = { 50.000, 28.000, 30.000 };
 
    // static double[] oxygen = { 1.209, 100.8 , 453.6 };
    static double[] consumedFuel = { 450, 250, 350 };
 
    static int selectedShip;
    static int selectedPlanet;
 
    static int[] loading = new int[101];
 
    // eventos aletorios
 
    static boolean exit = false;

     public static void travel() {

        int option;

        do {
            showMenu();
            option = read.nextInt();
            switch (option) {
                case 0:
                    exit = true;

                    break;
                case 1:
                    selectPlanet();

                    break;
                case 2:
                    selectShip();

                    break;
                case 3:
                    startTravel();
                    break;
                default:
                    System.err.println("Opción incorrecta");

            }
        } while (!exit);
        System.out.println();
        System.out.println("--[!Gracias por utilizar el programa¡]--");
        read.close();

    }

    public static void showMenu() {

        System.out.println();
        System.out.println(" ______________________");
        System.out.println("/_____________________/|");
        System.out.println("|       ______       | |");
        System.out.println("| ====> [MENÚ] <==== | |");
        System.out.println("|       ¨¨¨¨¨¨       | |");
        System.out.println("|  1.Elegir planeta  | |");
        System.out.println("|  2.Elegir nave     | |");
        System.out.println("|  3.Iniciar viaje   | |");
        System.out.println("|  0.Salir           | |");
        System.out.println("|____________________|_|");
        System.out.println();
        System.out.print("====> Elegir opción: ");

    }

    
    private static void showtPlanet() {

        System.out.println(" _________________");
        System.out.println("|___[PLANETAS]___|");
        System.out.println("|                |");
        System.out.println("|~~> 1. Mercurio |");
        System.out.println("|~~> 2. Venus    |");
        System.out.println("|~~> 3. Marte    |");
        System.out.println("|~~> 4. Júpiter  |");
        System.out.println("|~~> 5. Saturno  |");
        System.out.println("|~~> 6. Urano    |");
        System.out.println("|~~> 7. Neptuno  |");
        System.out.println("|________________|");
        System.out.println();
        System.out.print("====> Elegir un planeta: ");

    }

    public static void showShip() {
 
        System.out.println(" ______________________ ");
        System.out.println("|________[NAVES]_______|");
        System.out.println("|                      |");
        System.out.println("|~~~> 1. Nave Argos    |");
        System.out.println("|~~~> 2. Nave Deméter  |");
        System.out.println("|~~~> 3. Nave Pegasus  |");
        System.out.println("|______________________|");
        System.out.println();
        System.out.print("===> Elegir una nave: ");
    }

    public static void startTravel() {
        calculateResourse();
        Random random = new Random();
        read.nextLine();
        for (int progress = 0; progress <= 100; progress += 10) {
            if (progress == 0) {
                System.out.println("""
                        |=====================================|
                        |=========> INICIO DEL VIAJE <========|
                        |=====================================|
                        """);
            }
            if (progress == 20) {
                System.out.println("""
                        |=====================================|
                        |=========> VIAJE EN PROCESO <========|
                        |=====================================|
                        """);
            }
            if (progress == 50) {
                System.out.println("""
                        |=====================================|
                        |=========> MITAD DEL VIAJE <=========|
                        |=====================================|
                        """);
 
                if (random.nextInt(10) < 3) {
                    System.out.println("""
                                   [!ALERTA¡] [!ALERTA¡] [!ALERTA¡] [!ALERTA¡] [!ALERTA¡] [!ALERTA¡]
 
                            ~~~~~[Lluvia de meteoritos] [Lluvia de meteoritos] [Lluvia de meteoritos]~~~~ """);
 
                    randomEventsSolution();
                }
            }
            if (progress == 70) {
                System.out.println("""
                        |=====================================|
                        |=========> VIAJE EN PROCESO <========|
                        |=====================================|
                        """);
            }
            if (progress == 100) {
                System.out.println("""
                        |=====================================|
                        |======> HAZ LLEGADO AL DESTINO <=====|
                        |=====================================|
                        """);
 
            }
 
        }
 
    }

    
}