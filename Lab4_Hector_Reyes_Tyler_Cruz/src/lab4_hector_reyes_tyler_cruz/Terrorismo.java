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
public class Terrorismo extends DelitoGrave {
    
    private String nombreArtefacto;
    private int numVictimas;

    public Terrorismo() {
    }

    public Terrorismo(String nombreArtefacto, int numVictimas, double puntuacionGravedad, String descripcion, String nombreVictima, boolean culpable, String sentencia, String fecha, int numDelito, String pais) {
        super(puntuacionGravedad, descripcion, nombreVictima, culpable, sentencia, fecha, numDelito, pais);
        this.nombreArtefacto = nombreArtefacto;
        this.numVictimas = numVictimas;
    }

    

    public String getNombreArtefacto() {
        return nombreArtefacto;
    }

    public void setNombreArtefacto(String nombreArtefacto) {
        this.nombreArtefacto = nombreArtefacto;
    }

    public int getNumVictimas() {
        return numVictimas;
    }

    public void setNumVictimas(int numVictimas) {
        this.numVictimas = numVictimas;
    }

    @Override
    public String toString() {
        return super.toString() + "Terrorismo\n" 
                + "nombreArtefacto: " + nombreArtefacto 
                + "\nNumVictimas: " + numVictimas + '\n';
    }
    
    
}
