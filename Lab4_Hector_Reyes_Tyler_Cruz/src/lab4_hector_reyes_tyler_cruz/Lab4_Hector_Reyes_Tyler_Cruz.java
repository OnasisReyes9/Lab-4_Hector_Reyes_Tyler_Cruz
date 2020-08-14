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
    // static ArrayList<Criminal> criminales = new ArrayList();
    static ArrayList<Agente> agentes = new ArrayList();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        boolean continuar = true;
        while (continuar == true) {
            System.out.println("0. Salir");
            System.out.println("1. Agregar Delito");
            System.out.println("2. Agregar Criminal");
            System.out.println("3. Agregar Agente");
            System.out.println("4. Listar Delitos");
            System.out.println("5. Listar Criminales");
            System.out.println("6. Listar Agentes");
            System.out.println("7. Eliminar Delito");
            System.out.println("8. Eliminar Criminal");
            System.out.println("9. Eliminar Agente");
            System.out.print("-> Escoja: ");
            int opcion = leer.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    agregarDelito();
                    break;
                case 2:

                    break;
                case 4:
                    if (delitos.isEmpty()) {
                        System.out.println("No existen delitos");
                    } else {
                        for (int i = 0; i < delitos.size(); i++) {
                            System.out.println(i + ". " + delitos.get(i));
                        }
                    }
                    break;
                case 5:
                    if (Organizacion.getCriminales().isEmpty()) {
                        System.out.println("No existen criminales");
                    } else {
                        for (int i = 0; i < Organizacion.getCriminales().size(); i++) {
                            System.out.println(i + ". " + Organizacion.getCriminales().get(i));
                        }
                    }
                    break;
                case 6:
                    if (agentes.isEmpty()) {
                        System.out.println("No existen");
                    } else {
                        for (int i = 0; i < agentes.size(); i++) {
                            System.out.println(i + ". " + agentes.get(i));
                        }
                    }
                    break;
                case 7:
                    if (delitos.isEmpty()) {
                        System.out.println("No existen delitos");
                    } else {

                    }
                    break;
                case 8:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opción inexistete");
            }//fin switch
            System.out.println("");
        }//fin while
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
                                delitos.add(new Terrorismo(artefacto, victimas, gravedad, descripcionDel, nombreVictima, culpable, sentencia, fecha, delitos.size(), pais));
                                break;
                            case 2:
                                System.out.print("Ingrese nombre del arma: ");
                                String nombreArma = leer.next();
                                System.out.print("Ingrese número de cuerpos: ");
                                int cuerpos = leer.nextInt();
                                delitos.add(new Asesinato(nombreArma, cuerpos, gravedad, descripcionDel, nombreVictima, culpable, sentencia, fecha, delitos.size(), pais));
                                break;
                            case 3:
                                System.out.print("Ingrese edad: ");
                                int edad = leer.nextInt();
                                delitos.add(new Violacion(edad, gravedad, descripcionDel, nombreVictima, culpable, sentencia, fecha, delitos.size(), pais));
                                break;
                            case 4:
                                System.out.print("Ingrese tiempo retenido: ");
                                String tiempo = leer.next();
                                System.out.print("Ingrese 1 si el cuerpo fue devuelto vivo o cualquier "
                                        + "otro caracter en caso contrario:");
                                String vivoMuerto = leer.next();
                                boolean vivo = true;
                                if (vivoMuerto != "1") {
                                    vivo = false;
                                }
                                delitos.add(new Secuestro(tiempo, vivo, gravedad, descripcionDel, nombreVictima,
                                        culpable, sentencia, fecha, delitos.size(), pais));
                                break;
                            case 5:
                                System.out.print("Ingrese nombre de la droga: ");
                                String nombreDroga = leer.next();
                                System.out.print("Ingrese cantidad de drogas: ");
                                int cantDrogas = leer.nextInt();
                                delitos.add(new TraficoDrogras(nombreDroga, cantDrogas, gravedad, descripcionDel, nombreVictima, culpable, sentencia, fecha, delitos.size(), pais));
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

    public static void agregarCriminal() {
        System.out.print("Ingrese nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese edad: ");
        int edad = leer.nextInt();
        System.out.print("Ingrese Género: ");
        String genero = leer.next();
        System.out.print("Ingrese País: ");
        String pais = leer.next();
        System.out.print("Ingrese 1 si está encarcelado o cualquier otro caracter en caso contrario: ");
        String encarcelar = leer.next();
        boolean encarcelado = true;
        if (encarcelar != "1") {
            encarcelado = false;
        }
        System.out.print("Descripcion Física: : ");
        String decFis = leer.next();
        Organizacion.getCriminales().add(new Criminal(nombre, edad, genero, pais, encarcelado, decFis));
    }
    
  
    
    

}
