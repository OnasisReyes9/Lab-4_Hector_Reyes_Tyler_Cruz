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
public class Hurto extends DelitoMenor {
    
    private String objetoHurtado;
    private double valor;

    public Hurto() {
    }

    public Hurto(String objetoHurtado, double valor, String nombrePolicia, int idPolicia, int numCelda, String descripcion, String nombreVictima, boolean culpable, String sentencia, String fecha, int numDelito, String pais) {
        super(nombrePolicia, idPolicia, numCelda, descripcion, nombreVictima, culpable, sentencia, fecha, numDelito, pais);
        this.objetoHurtado = objetoHurtado;
        this.valor = valor;
    }

    public String getObjetoHurtado() {
        return objetoHurtado;
    }

    public void setObjetoHurtado(String objetoHurtado) {
        this.objetoHurtado = objetoHurtado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Hurto\n"
                + "objetoHurtado: " + objetoHurtado + 
                "\nvalor: " + valor + '\n';
    }
    

    
    
}
