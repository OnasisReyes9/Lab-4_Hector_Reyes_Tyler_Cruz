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
public class Criminal {
   
    private ArrayList<Delito> delitos = new ArrayList();
    private String nombre;
    private int edad;
    private String genero;
    private String paisResidencia;
    private boolean encarcelado;
    private String descripcionFisica;

    public Criminal() {
    }

    public Criminal(String nombre, int edad, String genero, String paisResidencia, boolean encarcelado, String descripcionFisica) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.paisResidencia = paisResidencia;
        this.encarcelado = encarcelado;
        this.descripcionFisica = descripcionFisica;
    }

    public ArrayList<Delito> getDelitos() {
        return delitos;
    }

    public void setDelitos(ArrayList<Delito> delitos) {
        this.delitos = delitos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPaisResidencia() {
        return paisResidencia;
    }

    public void setPaisResidencia(String paisResidencia) {
        this.paisResidencia = paisResidencia;
    }

    public boolean isEncarcelado() {
        return encarcelado;
    }

    public void setEncarcelado(boolean encarcelado) {
        this.encarcelado = encarcelado;
    }

    public String getDescripcionFisica() {
        return descripcionFisica;
    }

    public void setDescripcionFisica(String descripcionFisica) {
        this.descripcionFisica = descripcionFisica;
    }

    @Override
    public String toString() {
        return "Criminal\n" +
                "delitos: " + delitos 
                + "\nNombre: " + nombre
                + "\nEdad: " + edad + 
                "\nGenero: " + genero + 
                "\nPaisResidencia: " + paisResidencia 
                + "\nEncarcelado: " + encarcelado 
                + "\nDescripcionFisica: " + descripcionFisica + '\n';
    }
    
    
}
