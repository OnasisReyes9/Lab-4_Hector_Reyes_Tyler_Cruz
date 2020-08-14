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
public class DelitoGrave extends Delito{
 
    private double puntuacionGravedad;

    public DelitoGrave() {
    }

    public DelitoGrave(double puntuacionGravedad, String descripcion, String nombreVictima, boolean culpable, String sentencia, String fecha, int numDelito, String pais) {
        super(descripcion, nombreVictima, culpable, sentencia, fecha, numDelito, pais);
        this.puntuacionGravedad = puntuacionGravedad;
    }

    public double getPuntuacionGravedad() {
        return puntuacionGravedad;
    }

    public void setPuntuacionGravedad(double puntuacionGravedad) {
        this.puntuacionGravedad = puntuacionGravedad;
    }

    

    @Override
    public String toString() {
        return  super.toString() + 
                "DelitoGrave{\n" + 
                "puntuacionGravedad\n=" + puntuacionGravedad + '}';
    }
    
    
}
