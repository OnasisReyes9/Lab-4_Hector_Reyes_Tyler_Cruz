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
public class Delito {

    private String descripcion, nombreVictima;
    private boolean culpable;
    private String sentencia, fecha;
    private int numDelito;
    private String pais;

    public Delito() {
    }

    public Delito(String descripcion, String nombreVictima, boolean culpable, String sentencia, String fecha, int numDelito,String pais) {
        this.descripcion = descripcion;
        this.nombreVictima = nombreVictima;
        this.culpable = culpable;
        this.sentencia = sentencia;
        this.fecha = fecha;
        this.pais = pais;
        this.numDelito = numDelito;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreVictima() {
        return nombreVictima;
    }

    public void setNombreVictima(String nombreVictima) {
        this.nombreVictima = nombreVictima;
    }

    public boolean getCulpable() {
        return culpable;
    }

    public void setCulpable(boolean culpable) {
        this.culpable = culpable;
    }

    public String getSentencia() {
        return sentencia;
    }

    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumDelito() {
        return numDelito;
    }

    public void setNumDelito(int numDelito) {
        this.numDelito = numDelito;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Delito\n" 
                + "Descripcion: " + descripcion 
                + "\nNombreVictima: " + nombreVictima 
                + "\nCulpable: " + culpable 
                + "\nSentencia: " + sentencia 
                + "\nFecha: " + fecha 
                + "\nNumDelito: " + numDelito 
                + "\nPais: " + pais + '\n';
    }
    

    
}
