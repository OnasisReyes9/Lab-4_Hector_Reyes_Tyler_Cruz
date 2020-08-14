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

    public Violacion(int edadVictima, double puntuacionGravedad, String descripcion, String nombreVictima, boolean culpable, String sentencia, String fecha, int numDelito, String pais) {
        super(puntuacionGravedad, descripcion, nombreVictima, culpable, sentencia, fecha, numDelito, pais);
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
        return super.toString() + "Violacion\n"
                + "\nedadVictima: " + edadVictima + '\n';
    }

}
