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
public class Secuestro extends DelitoGrave{
    
    private String tiempo;
    private boolean vivo;

    public Secuestro() {
    }

    public Secuestro(String tiempo, boolean vivo, double puntuacionGravedad, String descripcion, String nombreVictima, boolean culpable, String sentencia, String fecha, int numDelito, String pais) {
        super(puntuacionGravedad, descripcion, nombreVictima, culpable, sentencia, fecha, numDelito, pais);
        this.tiempo = tiempo;
        this.vivo = vivo;
    }

   

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return super.toString() + "Secuestro" 
                + "\nTiempo: " + tiempo 
                + "\nVivo: " + vivo + '\n';
    }
    
    
}
