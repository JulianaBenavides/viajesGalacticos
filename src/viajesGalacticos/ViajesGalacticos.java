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

    // Métodos principales
    public static void selectShip() {
        System.out.println("\n=== SELECCIONAR NAVE ===");
        for (int i = 0; i < ships.length; i++) {
            System.out.println((i + 1) + ". " + ships[i] + " (Velocidad: " + speed[i] + " km/s)");
        }
        System.out.print("Selecciona una nave: ");
        selectedShip = read.nextInt() - 1;
    }

    public static void selectPlanet() {
        System.out.println("\n=== SELECCIONAR DESTINO ===");
        for (int i = 0; i < planets.length; i++) {
            System.out.println((i + 1) + ". " + planets[i] + " (Distancia: " + distances[i] + " millones km)");
        }
        System.out.print("Selecciona un planeta: ");
        selectedPlanet = read.nextInt() - 1;
    }

    public static void calculateTravelTime() {
        double time = distances[selectedPlanet] / speed[selectedShip];
        System.out.println("\nTiempo de viaje: " + String.format("%.2f", time) + " horas");
    }

    public static void calculateFuelNeeded() {
        double fuelNeeded = (distances[selectedPlanet] / 1000) * (consumedFuel[selectedShip] / 1000);
        System.out.println("Combustible necesario: " + String.format("%.2f", fuelNeeded) + " litros");
    }

    public static void showMenu() {
        System.out.println("\n========== VIAJES GALÁCTICOS ==========");
        System.out.println("1. Seleccionar Nave");
        System.out.println("2. Seleccionar Destino");
        System.out.println("3. Calcular Tiempo de Viaje");
        System.out.println("4. Calcular Combustible");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
    }
}