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
public class Prostitucion extends DelitoMenor {

    private String nombreSolicitante;

    public Prostitucion() {
    }

    public Prostitucion(String nombreSolicitante, String nombrePolicia, int idPolicia, int numCelda, String descripcion, String nombreVictima, boolean culpable, String sentencia, String fecha, int numDelito) {
        super(nombrePolicia, idPolicia, numCelda, descripcion, nombreVictima, culpable, sentencia, fecha, numDelito);
        this.nombreSolicitante = nombreSolicitante;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    @Override
    public String toString() {
        return super.toString() + "Prostitucion{\n" 
                + "nombreSolicitante\n=" + nombreSolicitante + '}';
    }
    

}
