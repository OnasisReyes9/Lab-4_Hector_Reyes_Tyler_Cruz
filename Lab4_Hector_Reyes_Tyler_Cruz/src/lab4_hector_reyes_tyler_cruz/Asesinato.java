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
public class Asesinato extends DelitoGrave {

    private String nombreArma;
    private int numCuerpos;

    public Asesinato() {
    }

    public Asesinato(String nombreArma, int numCuerpos, double puntuacionGravedad, String descripcion, String nombreVictima, boolean culpable, String sentencia, String fecha, int numDelito, String pais) {
        super(puntuacionGravedad, descripcion, nombreVictima, culpable, sentencia, fecha, numDelito, pais);
        this.nombreArma = nombreArma;
        this.numCuerpos = numCuerpos;
    }

    public String getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    public int getNumCuerpos() {
        return numCuerpos;
    }

    public void setNumCuerpos(int numCuerpos) {
        this.numCuerpos = numCuerpos;
    }

    @Override
    public String toString() {
        return super.toString() + "Asesinato\n"
                + "NombreArma: " + nombreArma
                + "\nNumCuerpos: " + numCuerpos + '\n';
    }

}
