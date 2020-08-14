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
public class Secuestrador {
    
    private String nombreVictima;
    private double cantRescate;

    public Secuestrador() {
    }

    public Secuestrador(String nombreVictima, double cantRescate) {
        this.nombreVictima = nombreVictima;
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
}
