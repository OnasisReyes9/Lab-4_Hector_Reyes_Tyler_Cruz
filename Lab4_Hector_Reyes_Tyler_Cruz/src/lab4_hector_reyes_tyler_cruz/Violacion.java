/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_hector_reyes_tyler_cruz;

/**
 *
 * @author Onasis Reyes
 */
public class Violacion extends DelitoGrave {
    
    private int edadVictima;

    public Violacion() {
    }

    public Violacion(int edadVictima, int puntuacionGravedad, String descripcion, String nombreVictima, boolean culpable, String sentencia, String fecha, int numDelito) {
        super(puntuacionGravedad, descripcion, nombreVictima, culpable, sentencia, fecha, numDelito);
        this.edadVictima = edadVictima;
    }

    public int getEdadVictima() {
        return edadVictima;
    }

    public void setEdadVictima(int edadVictima) {
        this.edadVictima = edadVictima;
    }

    @Override
    public String toString() {
        return "Violacion{\n" 
                + "edadVictima\n=" + edadVictima + '}';
    }

    
    
    
}
