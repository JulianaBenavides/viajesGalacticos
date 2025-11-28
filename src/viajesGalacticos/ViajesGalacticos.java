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
 
    
}
