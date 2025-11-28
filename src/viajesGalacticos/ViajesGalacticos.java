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
 
    static double[] oxygen = { 1.209, 100.8, 453.6 };
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

    public static int selectPlanet() {

        int option;
        showtPlanet();
        option = read.nextInt();

        switch (option) {
            case 1:
                System.out.println();
                System.out.println("~~[Haz elegido " + planets[0] + "]~~");
                System.out.println(
                        " Es el planeta más cercano al Sol, es pequeño y muy caliente durante el día, su distancia desde la tierra es aproximadamente "  + distances[0]);
                break;
            case 2:
                System.out.println();
                System.out.println("~~[Haz elegido " + planets[1] + "]~~");
                System.out.println(
                        "Su tamaño es parecido a la Tierra, su atmósfera es tóxica y con temperaturas extremas, su distancia desde la tierra es aproximadamente "
                                + distances[1]);
                break;
            case 3:
                System.out.println();
                System.out.println("~~[Haz elegido " + planets[2] + "]~~");
                System.out.println(
                        "Es un planeta que tiene un color rojo, con montañas y cañones gigantes, es posible que tenga agua subterránea, su distancia desde la tierra es aproximadamente "
                                + distances[2]);
                break;
            case 4:
                System.out.println();
                System.out.println("~~[Haz elegido " + planets[3] + "]~~");
                System.out.println(
                        "Es el planeta mas grande del sistema solar y esta compuesto de gases, tiene una Gran Mancha Roja y muchas lunas, su distancia desde la tierra es aproximadamente "
                                + distances[3]);
                break;
            case 5:
                System.out.println();
                System.out.println("~~[Haz elegido " + planets[4] + "]~~");
                System.out.println(
                        "Famoso por sus brillantes anillos compuestos de hielo y roca, tiene más de 80 lunas y es el planeta menos denso por lo que podria flotar en el agua, su distancia desde la tierra es aproximadamente "
                                + distances[4]);
                break;
            case 6:
                System.out.println();
                System.out.println("~~[Haz elegido " + planets[5] + "]~~");
                System.out.println(
                        "Es conocido como el gigante de hielo ya que es el planeta mas frio del sistema solar, con un tono azul verdoso debido al metano en su atmósfera, su distancia desde la tierra es aproximadamente "
                                + distances[5]);
                break;
            case 7:
                System.out.println();
                System.out.println("~~[Haz elegido " + planets[6] + "]~~");
                System.out.println(
                        "Es el planeta más lejano, frío y ventoso, de un color azul intenso, su distancia desde la tierra es aproximadamente "
                                + distances[6]);
                break;

            default:
                System.err.println("Planeta no valido");
                break;
        }
        return selectedPlanet;

    }

     public static int selectShip() {

        int option;
        showShip();
        option = read.nextInt();

        switch (option) {
            case 1:
                System.out.println();
                System.out.println("~~[Haz elegido " + ships[0] + "]~~");
                System.out.println(
                        "Elyón es la nave más poderosa que tenemos, esta nave tiene una capacidad máxima de 8 tripulantes, tiene una capacidad de kg de oxigeno para alrededor de 6 meses, tambien cuenta con una capacidad de 45 toneladas de combustible y su velocidad es "
                                + speed[0]);
                break;

            case 2:
                System.out.println();
                System.out.println("~~[Haz elegido " + ships[1] + "]~~");
                System.out.println(
                        "Esta nave esta diseñada para carga útil por lo cual el máximo de tripulantes es de 4 personas. Su capacidad de oxigeno es kg para un solo mes. Su capacidad de combustible es 25 toneladas y cuenta con una velocidad de "
                                + speed[1]);
                break;

            case 3:
                System.out.println();
                System.out.println("~~[Haz elegido " + ships[2] + "]~~");
                System.out.println(
                        "Deméter cuenta con un sistema de soporte vital avanzado, tiene una capacidad de 6 tripulantes, cuenta con una capacidad de kg de oxigeno para al rededor de 3 meses, tambien cuenta con una capacidad de 35 toneladas de combustible y su velocidad es "
                                + speed[2]);
                break;

            default:
                System.err.println("Opcion no valida");
                break;
        }

        return selectedShip;
    }

    public static void randomEventsSolution() {
 
        System.out.println();
        System.out.println(" _____________________________________________________________________________");
        System.out.println("|Para solucionar los problemas con la nave de forma automatica, presiona ENTER|");
        System.out.println("|_____________________________________________________________________________|");
       
 
        var solution = read.nextLine();
 
    }
 
    public static void calculateResourse() {
 
        double fuel = consumedFuel [selectedShip];
        double oxygen = distances [selectedPlanet] * 100;
        System.out.println("El combustible necesario para el viaje es: " + fuel);
        System.out.println("La cantidad de oxigeno necesaria para este viaje es de: " + oxygen);
    }
}
