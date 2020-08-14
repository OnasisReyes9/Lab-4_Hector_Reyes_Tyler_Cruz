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
public class Terrorista {

    private String paisAtacar, ciudadAtacar;
    
    /*
    metodo
    */
    

    public Terrorista(String paisAtacar, String ciudadAtacar) {
        this.paisAtacar = paisAtacar;
        this.ciudadAtacar = ciudadAtacar;
    }
    void CometerDelito(String pais,String ciudad,Criminal c){
        try {
        validacion(c.getDelitos().size(),pais,ciudad);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    void validacion(int x,String pais,String ciudad) throws MyException{
        if (x > 1) {
            throw new MyException ("El ataque no se pudo hacer");
        }else{
            throw new MyException("Se atacao el pais " + pais + "en la ciudad" + ciudad);
        }
        
    }
    

}
