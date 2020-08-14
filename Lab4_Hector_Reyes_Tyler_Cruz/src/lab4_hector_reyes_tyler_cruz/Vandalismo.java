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
public class Vandalismo extends DelitoMenor {
    
    private String edificacion;
    private int pisos;
    private String nombreDueño;

    public Vandalismo() {
    }

    public Vandalismo(String edificacion, int pisos, String nombreDueño, String nombrePolicia, int idPolicia, int numCelda, String descripcion, String nombreVictima, boolean culpable, String sentencia, String fecha, int numDelito) {
        super(nombrePolicia, idPolicia, numCelda, descripcion, nombreVictima, culpable, sentencia, fecha, numDelito);
        this.edificacion = edificacion;
        this.pisos = pisos;
        this.nombreDueño = nombreDueño;
    }

    public String getEdificacion() {
        return edificacion;
    }

    public void setEdificacion(String edificacion) {
        this.edificacion = edificacion;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    @Override
    public String toString() {
        return super.toString() + "Vandalismo{\n" + 
                "edificacion\n=" + edificacion 
                + ", pisos\n=" + pisos 
                + ", nombreDue\u00f1o=" + nombreDueño + '}';
    }

    
    
    
    
}
