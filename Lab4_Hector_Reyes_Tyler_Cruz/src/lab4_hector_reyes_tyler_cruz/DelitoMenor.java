/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_hector_reyes_tyler_cruz;

import java.util.Date;

/**
 *
 * @author Onasis Reyes
 */
public class DelitoMenor extends Delito {

    private String nombrePolicia;
    private int idPolicia;
    private int numCelda;

    public DelitoMenor() {
    }

    public DelitoMenor(String nombrePolicia, int idPolicia, int numCelda, String descripcion, String nombreVictima, boolean culpable, String sentencia, String fecha, int numDelito, String pais) {
        super(descripcion, nombreVictima, culpable, sentencia, fecha, numDelito, pais);
        this.nombrePolicia = nombrePolicia;
        this.idPolicia = idPolicia;
        this.numCelda = numCelda;
    }

    public String getNombrePolicia() {
        return nombrePolicia;
    }

    public void setNombrePolicia(String nombrePolicia) {
        this.nombrePolicia = nombrePolicia;
    }

    public int getIdPolicia() {
        return idPolicia;
    }

    public void setIdPolicia(int idPolicia) {
        this.idPolicia = idPolicia;
    }

    public int getNumCelda() {
        return numCelda;
    }

    public void setNumCelda(int numCelda) {
        this.numCelda = numCelda;
    }

    @Override
    public String toString() {
        return super.toString()+ "DelitoMenor"
                + "\nNombrePolicia: " + nombrePolicia
                + "\nIdPolicia: " + idPolicia
                + "\nNumCelda: " + numCelda + '\n';
    }

}
