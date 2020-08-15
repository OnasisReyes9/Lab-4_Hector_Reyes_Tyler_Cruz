/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_hector_reyes_tyler_cruz;

import java.util.ArrayList;

/**
 *
 * @author Onasis Reyes
 */
public class Organizacion {
    
    static ArrayList<Criminal> criminales = new ArrayList();
    static ArrayList<Agente> agentes = new ArrayList();

    public Organizacion() {
    }

    public static ArrayList<Criminal> getCriminales() {
        return criminales;
    }

    public static void setCriminales(ArrayList<Criminal> criminales) {
        Organizacion.criminales = criminales;
    }

    public static ArrayList<Agente> getAgentes() {
        return agentes;
    }

    public static void setAgentes(ArrayList<Agente> agentes) {
        Organizacion.agentes = agentes;
    }
    
}
