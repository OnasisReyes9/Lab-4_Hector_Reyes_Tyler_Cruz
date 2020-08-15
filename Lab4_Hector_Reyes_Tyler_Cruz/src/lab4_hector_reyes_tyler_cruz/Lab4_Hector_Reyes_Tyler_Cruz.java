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
    //static ArrayList<Criminal> criminales = new ArrayList();
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
            System.out.println("10. Modificar Delito");
            System.out.println("11. Modificar Criminal");
            System.out.println("12. Modificar Agente");
            System.out.print("-> Escoja: ");
            int opcion = leer.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    agregarDelito();
                    break;
                case 2:
                    agregarCriminal();
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
                    if (Organizacion.getAgentes().isEmpty()) {
                        System.out.println("No existen ");
                    } else {
                        for (int i = 0; i < Organizacion.getAgentes().size(); i++) {
                            System.out.println(i + ". " + Organizacion.getAgentes().get(i));
                        }
                    }
                    break;
                case 7:
                    if (delitos.isEmpty()) {
                        System.out.println("No existen delitos");
                    } else {
                        System.out.print("Ingrese pos del delito a eliminar: ");
                        int pos = leer.nextInt();
                        while (pos < 0 || pos >= delitos.size()) {
                            System.out.print("Ingrese una posición válida: ");
                            pos = leer.nextInt();
                        }
                        delitos.remove(pos);
                    }
                    break;
                case 8:
                    if (Organizacion.getCriminales().isEmpty()) {
                        System.out.println("No existen criminales");
                    } else {
                        System.out.print("Ingrese pos del criminal a eliminar: ");
                        int pos = leer.nextInt();
                        while (pos < 0 || pos >= Organizacion.getCriminales().size()) {
                            System.out.print("Ingrese una posición válida: ");
                            pos = leer.nextInt();
                        }
                        Organizacion.getCriminales().remove(pos);
                    }
                    break;
                case 9:
                    if (Organizacion.getAgentes().isEmpty()) {
                        System.out.println("No existen ");
                    } else {
                        System.out.print("Ingrese pos del agente a eliminar: ");
                        int pos = leer.nextInt();
                        while (pos < 0 || pos >= Organizacion.getAgentes().size()) {
                            System.out.print("Ingrese una posición válida: ");
                            pos = leer.nextInt();
                        }
                        Organizacion.getAgentes().remove(pos);
                    }
                    break;
                case 10:
                    if (delitos.isEmpty()) {
                        System.out.println("No existen delitos");
                    } else {
                        System.out.print("Ingrese posición del delito a modificar: ");
                        int pos = leer.nextInt();
                        while (pos < 0 || pos >= delitos.size()) {
                            System.out.print("Ingrese una posición válida: ");
                            pos = leer.nextInt();
                        }
                        modificarDelito(pos);
                    }
                    break;
                case 11:
                    if (Organizacion.getCriminales().isEmpty()) {
                        System.out.println("No existen criminales");
                    } else {
                        System.out.print("Ingrese posición del criminal a modificar: ");
                        int pos = leer.nextInt();
                        while (pos < 0 || pos >= Organizacion.getCriminales().size()) {
                            System.out.print("Ingrese una posición válida: ");
                            pos = leer.nextInt();
                        }
                        modificarCriminal(pos);
                    }
                    break;
                case 12:
                    if (Organizacion.getAgentes().isEmpty()) {
                        System.out.println("No existen ");
                    } else {
                        System.out.print("Ingrese pos del agente a modificar: ");
                        int pos = leer.nextInt();
                        while (pos < 0 || pos >= Organizacion.getAgentes().size()) {
                            System.out.print("Ingrese una posición válida: ");
                            pos = leer.nextInt();
                        }
                        modificarAgente(pos);
                    }
                    break;
                case 13:
                    System.out.print("Ingrese posición del agente con el que hará el delito: ");
                    int pos = leer.nextInt();
                    System.out.println("");
                    int tipoAgente = 0;
                    while (tipoAgente < 1 || tipoAgente > 3) {
                        int i = 0;
                        System.out.println("1. Terrorista");
                        System.out.println("2. Asesino");
                        System.out.println("3. Secuestrador");
                        System.out.print("-> Escoja el tipo de agente: ");
                        tipoAgente = leer.nextInt();
                        switch (tipoAgente) {
                            case 1:
                                int n = 0;
                                boolean terrorista = false;
                                i = 0;
                                for (Object o : Organizacion.getAgentes()) {
                                    if (o instanceof Terrorista && i == pos) {
                                        terrorista = true;
//                                        ((Terrorista) Organizacion.getAgentes().get(pos)).CometerDelito(Organizacion.getAgentes().get(i).getPaisResidencia(),
//                                                 ((Terrorista) Organizacion.getAgentes().get(pos)).getCiudadAtacar(),
//                                                ((Terrorista) Organizacion.getAgentes().get(pos)));
                                    }
                                    i++;
                                    
                                }
                                break;
                            case 2:
                                boolean asesino = false;
                                i = 0;
                                for (Object o : Organizacion.getAgentes()) {
                                    if (o instanceof Terrorista && i == pos) {
                                        asesino = true;

                                    }
                                    i++;
                                }
                                break;
                            case 3:
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Opción inexistete");
            }//fin switch
            System.out.println("");
        }//fin while
    }

    public static void agregarDelito() {
        System.out.print("Ingrese descripcion del delito: ");
        String descripcionDel = leer.nextLine();
        descripcionDel = leer.nextLine();
        System.out.print("Ingrese nombre de la victima: ");
        String nombreVictima = leer.next();
        System.out.print("Ingrese 1 si es culpable o cualquier otro caracter en caso contrario: ");
        int culp = leer.nextInt();
        boolean culpable = true;
        if (culp != 1) {
            culpable = false;
        }
        System.out.print("Ingrese sentencia: ");
        String sentencia = leer.next();
        System.out.print("Ingrese fecha: ");
        String fecha = leer.nextLine();
        fecha = leer.nextLine();
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
                                delitos.add(new Terrorismo(artefacto, victimas, gravedad, descripcionDel, nombreVictima, culpable, sentencia, fecha, delitos.size()+1, pais));
                                break;
                            case 2:
                                System.out.print("Ingrese nombre del arma: ");
                                String nombreArma = leer.next();
                                System.out.print("Ingrese número de cuerpos: ");
                                int cuerpos = leer.nextInt();
                                delitos.add(new Asesinato(nombreArma, cuerpos, gravedad, descripcionDel, nombreVictima, culpable, sentencia, fecha, delitos.size()+1, pais));
                                break;
                            case 3:
                                System.out.print("Ingrese edad: ");
                                int edad = leer.nextInt();
                                delitos.add(new Violacion(edad, gravedad, descripcionDel, nombreVictima, culpable, sentencia, fecha, delitos.size()+1, pais));
                                break;
                            case 4:
                                System.out.print("Ingrese tiempo retenido: ");
                                String tiempo = leer.next();
                                System.out.print("Ingrese 1 si el cuerpo fue devuelto vivo o cualquier "
                                        + "otro caracter en caso contrario: ");
                                int vivoMuerto = leer.nextInt();
                                boolean vivo = true;
                                if (vivoMuerto != 1) {
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
                                delitos.add(new TraficoDrogras(nombreDroga, cantDrogas, gravedad, descripcionDel, nombreVictima, culpable, sentencia, fecha, delitos.size()+1, pais));
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
                    delitos.add(new DelitoMenor(nombrePolicia, idPolicia, celda, descripcionDel, nombreVictima, culpable, sentencia, fecha, delitos.size()+1, pais));
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
        while (edad < 1) {
            System.out.print("Ingrese edad válida: ");
            edad = leer.nextInt();
        }
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
        String descFis = leer.next();
        Organizacion.getCriminales().add(new Criminal(nombre, edad, genero, pais, encarcelado, descFis));
    }

    public static void agregarAgente() {
        System.out.print("Ingrese nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese edad: ");
        int edad = leer.nextInt();
        while (edad < 1) {
            System.out.print("Ingrese edad válida: ");
            edad = leer.nextInt();
        }
        System.out.print("Ingrese 1 si es hombre o cualquier otro caracter en caso contraio: ");
        String sexo = leer.next();
        String genero = "";
        if (sexo == "1") {
            genero = "Hombre";
        } else {
            genero = "Mujer";
        }
        System.out.print("Ingrese País de Recidencia: ");
        String pais = leer.next();
        boolean encarcelado = false;
        System.out.print("Descripcion Física: : ");
        String descFis = leer.next();
        System.out.println("");
        int tipoAgente = 0;
        while (tipoAgente < 1 || tipoAgente > 3) {
            System.out.println("1. Terrorista");
            System.out.println("2. Asesino");
            System.out.println("3. Secuestrador");
            System.out.print("-> Escoja el tipo de agente: ");
            tipoAgente = leer.nextInt();
            switch (tipoAgente) {
                case 1:
                    System.out.print("Ingrese país donde se hará el ataque: ");
                    String paisAtacar = leer.next();
                    System.out.print("Ingrese ciudad donde se hará el ataque: ");
                    String ciudadAtacar = leer.next();
                    Organizacion.getAgentes().add(new Terrorista(paisAtacar, ciudadAtacar, nombre, edad, genero, pais, encarcelado, descFis));
                    break;
                case 2:
                    System.out.print("Ingrese nombre de la victima: ");
                    String nombreVictima = leer.next();
                    System.out.print("Ingrese nombre de arma: ");
                    String nombreArma = leer.next();
                    Organizacion.getAgentes().add(new Asesino(nombreVictima, nombreArma, nombre, edad, genero, pais, encarcelado, descFis));
                    break;
                case 3:
                    System.out.print("Ingrese nombre de victima: ");
                    nombreVictima = leer.next();
                    System.out.print("Ingrese cantidad por rescate: ");
                    double cantRescate = leer.nextDouble();
                    while (cantRescate < 1) {
                        System.out.print("Ingrese cantidad válida por rescate: ");
                        cantRescate = leer.nextDouble();
                    }
                    Organizacion.getAgentes().add(new Secuestrador(nombreVictima, cantRescate, nombre, edad, genero, pais, encarcelado, descFis));
                    break;
                default:
                    System.out.println("Opción no válida");
            }//fin switch
        }
    }

    public static void modificarDelito(int pos) {
        System.out.print("Ingrese descripcion del delito: ");
        String descripcionDel = leer.nextLine();
        descripcionDel = leer.nextLine();
        System.out.print("Ingrese nombre de la victima: ");
        String nombreVictima = leer.next();
        System.out.print("Ingrese 1 si es culpable o cualquier otro caracter en caso contrario: ");
        int culp = leer.nextInt();
        boolean culpable = true;
        if (culp != 1) {
            culpable = false;
        }
        System.out.print("Ingrese sentencia: ");
        String sentencia = leer.next();
        System.out.print("Ingrese fecha: ");
        String fecha = leer.nextLine();
        fecha = leer.nextLine();
        System.out.print("Ingrese país: ");
        String pais = leer.next();
        ((Delito) delitos.get(pos)).setDescripcion(descripcionDel);
        ((Delito) delitos.get(pos)).setNombreVictima(nombreVictima);
        ((Delito) delitos.get(pos)).setCulpable(culpable);
        ((Delito) delitos.get(pos)).setSentencia(sentencia);
        ((Delito) delitos.get(pos)).setFecha(fecha);
        ((Delito) delitos.get(pos)).setPais(pais);
    }

    public static void modificarCriminal(int pos) {
        System.out.print("Ingrese nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese edad: ");
        int edad = leer.nextInt();
        while (edad < 1) {
            System.out.print("Ingrese edad válida: ");
            edad = leer.nextInt();
        }
        System.out.print("Ingrese 1 si es hombre o cualquier otro caracter en caso contraio: ");
        int sexo = leer.nextInt();
        String genero = "";
        if (sexo == 1) {
            genero = "Hombre";
        } else {
            genero = "Mujer";
        }
        System.out.print("Ingrese País: ");
        String pais = leer.next();
        System.out.print("Ingrese 1 si está encarcelado o cualquier otro caracter en caso contrario: ");
        int encarcelar = leer.nextInt();
        boolean encarcelado = true;
        if (encarcelar != 1) {
            encarcelado = false;
        }
        System.out.print("Descripcion Física: : ");
        String descFis = leer.nextLine();
        descFis = leer.nextLine();
        (Organizacion.getCriminales().get(pos)).setNombre(nombre);
        (Organizacion.getCriminales().get(pos)).setEdad(edad);
        (Organizacion.getCriminales().get(pos)).setGenero(genero);
        (Organizacion.getCriminales().get(pos)).setPaisResidencia(pais);
        (Organizacion.getCriminales().get(pos)).setEncarcelado(encarcelado);
        (Organizacion.getCriminales().get(pos)).setDescripcionFisica(descFis);
    }

    public static void modificarAgente(int pos) {

        System.out.print("Ingrese nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese edad: ");
        int edad = leer.nextInt();
        while (edad < 1) {
            System.out.print("Ingrese edad válida: ");
            edad = leer.nextInt();
        }
        System.out.print("Ingrese 1 si es hombre o cualquier otro caracter en caso contraio: ");
        int sexo = leer.nextInt();
        String genero = "";
        if (sexo == 1) {
            genero = "Hombre";
        } else {
            genero = "Mujer";
        }
        System.out.print("Ingrese País de Recidencia: ");
        String pais = leer.next();
        boolean encarcelado = false;
        System.out.print("Descripcion Física: : ");
        String descFis = leer.next();
        System.out.println("");
        int tipoAgente = 0;
        while (tipoAgente < 1 || tipoAgente > 3) {
            System.out.println("1. Terrorista");
            System.out.println("2. Asesino");
            System.out.println("3. Secuestrador");
            System.out.print("-> Escoja el tipo de agente: ");
            tipoAgente = leer.nextInt();
            switch (tipoAgente) {
                case 1:
                    System.out.print("Ingrese país donde se hará el ataque: ");
                    String paisAtacar = leer.next();
                    System.out.print("Ingrese ciudad donde se hará el ataque: ");
                    String ciudadAtacar = leer.next();
                    Organizacion.getAgentes().get(pos).setNombre(nombre);
                    Organizacion.getAgentes().get(pos).setEdad(edad);
                    Organizacion.getAgentes().get(pos).setGenero(genero);
                    Organizacion.getAgentes().get(pos).setPaisResidencia(pais);
                    Organizacion.getAgentes().get(pos).setEncarcelado(encarcelado);
                    Organizacion.getAgentes().get(pos).setDescripcionFisica(descFis);
                    ((Terrorista) Organizacion.getAgentes().get(pos)).setPaisAtacar(paisAtacar);
                    ((Terrorista) Organizacion.getAgentes().get(pos)).setCiudadAtacar(ciudadAtacar);
                    break;
                case 2:
                    System.out.print("Ingrese nombre de la victima: ");
                    String nombreVictima = leer.next();
                    System.out.print("Ingrese nombre de arma: ");
                    String nombreArma = leer.next();
                    Organizacion.getAgentes().get(pos).setNombre(nombre);
                    Organizacion.getAgentes().get(pos).setEdad(edad);
                    Organizacion.getAgentes().get(pos).setGenero(genero);
                    Organizacion.getAgentes().get(pos).setPaisResidencia(pais);
                    Organizacion.getAgentes().get(pos).setEncarcelado(encarcelado);
                    Organizacion.getAgentes().get(pos).setDescripcionFisica(descFis);
                    ((Asesino) Organizacion.getAgentes().get(pos)).setNombreVictima(nombreVictima);
                    ((Asesino) Organizacion.getAgentes().get(pos)).setArma(nombreArma);
                    break;
                case 3:
                    System.out.print("Ingrese nombre de victima: ");
                    nombreVictima = leer.next();
                    System.out.print("Ingrese cantidad por rescate: ");
                    double cantRescate = leer.nextDouble();
                    ((Secuestrador) Organizacion.getAgentes().get(pos)).setNombreVictima(nombreVictima);
                    ((Secuestrador) Organizacion.getAgentes().get(pos)).setCantRescate(cantRescate);
                    break;
                default:
                    System.out.println("Opción no válida");
            }//fin switch
        }//fin wile
    }

}
