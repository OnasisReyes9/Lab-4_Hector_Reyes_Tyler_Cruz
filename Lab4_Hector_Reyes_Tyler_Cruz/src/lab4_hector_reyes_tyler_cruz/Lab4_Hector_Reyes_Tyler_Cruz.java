/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_hector_reyes_tyler_cruz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Onasis Reyes
 */
public class Lab4_Hector_Reyes_Tyler_Cruz {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Delito> delitos = new ArrayList();
    static ArrayList<Criminal> criminales = new ArrayList();
    static ArrayList<Agente> agentes = new ArrayList();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        boolean continuar = true;
        while (continuar == true) {
            System.out.println("0. Salir");
            System.out.println("1. Agregar Delito");
            System.out.print("-> Escoja: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    agregarDelito();
                    break;

            }
        }
    }

    public static void agregarDelito() {
        System.out.print("Ingrese descripcion del delito: ");
        String descripcionDel = leer.next();
        System.out.print("Ingrese nombre de la victima: ");
        String nombreVictima = leer.next();
        System.out.print("Ingrese 1 si es culpable o cualquier otro caracter en caso contrario: ");
        String culp = leer.next();
        boolean culpable = true;
        if (culp != "1") {
            culpable = false;
        }
        System.out.print("Ingrese sentencia: ");
        String sentencia = leer.next();
        System.out.print("Ingrese fecha: ");
        String fecha = leer.next();
        System.out.print("Ingrese país: ");
        String pais = leer.next();
        System.out.println("");
        int opcDelito = 0;
        while (opcDelito < 1 || opcDelito > 2) {
            System.out.println("1. Delito Grave");
            System.out.println("2. Delito Menor");
            System.out.print("-> Escoja el delito: ");
            opcDelito = leer.nextInt();
            switch (opcDelito) {
                case 1:
                    int delGrave = 0;
                    while (delGrave < 1 || delGrave > 5) {
                        System.out.print("Ingrese puntuacion de grvedad[1-5]: ");
                        double gravedad = leer.nextDouble();
                        System.out.println("");
                        System.out.println("1. Terrorismo");
                        System.out.println("2. Asesinato");
                        System.out.println("3. Violacion");
                        System.out.println("4. Secuestro");
                        System.out.println("5. Trafico de Drogas");
                        System.out.print("-> Escoja: ");
                        delGrave = leer.nextInt();
                        switch (delGrave) {
                            case 1:
                                System.out.print("Ingrese nombre del artefacto usado: ");
                                String artefacto = leer.next();
                                System.out.print("Ingrese numero de victimas: ");
                                int victimas = leer.nextInt();
                                break;
                            case 2:
                                System.out.print("Ingrese nombre del arma: ");
                                String nombreArma = leer.next();
                                System.out.print("Ingrese número de cuerpos: ");
                                int cuerpos = leer.nextInt();
                                break;
                            case 3:
                                System.out.print("Ingrese edad: ");
                                int edad = leer.nextInt();
                                System.out.print("Ingrese victima: ");
                                String victima = leer.next();
                                break;
                            case 4:
                                
                                break;
                            case 5:
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Ingrese nombre del policia: ");
                    String nombrePolicia = leer.next();
                    System.out.print("Ingrese id del policia: ");
                    int idPolicia = leer.nextInt();
                    System.out.print("Ingrese número de celda: ");
                    int celda = leer.nextInt();
                    delitos.add(new DelitoMenor(nombrePolicia, idPolicia, celda, descripcionDel, nombreVictima, culpable, sentencia, fecha, delitos.size(), pais));
                    break;
                default:
                    System.out.println("Favor ingrese una opción válida.");
            }
        }
    }

}
