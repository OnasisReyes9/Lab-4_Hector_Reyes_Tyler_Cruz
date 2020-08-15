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
public class Secuestrador extends Agente{
    
    private String nombreVictima;
    private double cantRescate;

    public Secuestrador() {
    super();
    }

    public Secuestrador(String nombreVictima, double cantRescate, String nombre, int edad, String genero, String paisResidencia, boolean encarcelado, String descripcionFisica) {
        super(nombre, edad, genero, paisResidencia, encarcelado, descripcionFisica);
        this.nombreVictima = nombreVictima;
        this.cantRescate = cantRescate;
    }

    public String getNombreVictima() {
        return nombreVictima;
    }

    public void setNombreVictima(String nombreVictima) {
        this.nombreVictima = nombreVictima;
    }

    public double getCantRescate() {
        return cantRescate;
    }

    public void setCantRescate(double cantRescate) {
        this.cantRescate = cantRescate;
    }
    
    void CometerDelito(String nombre,int ramsom,Criminal c){
        try {
        validacion(c.getDelitos().size(),nombre,cantRescate);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    void validacion(int x,String name,double ransom) throws MyException{
        if (x > 1) {
            throw new MyException ("El ataque no se pudo hacer");
        }else{
            throw new MyException("Nombre de la victima " + name + " cantida por rescate " + ransom);
        }
    }

    @Override
    public String toString() {
        return super.toString() +"Secuestrador{" + "nombreVictima=" + nombreVictima + ", cantRescate=" + cantRescate + '}';
    }
    
    
}
