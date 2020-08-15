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
public class Terrorista extends Agente {

    private String paisAtacar, ciudadAtacar;

    public Terrorista() {
        super();
    }

    public Terrorista(String paisAtacar, String ciudadAtacar, String nombre, int edad, String genero, String paisResidencia, boolean encarcelado, String descripcionFisica) {
        super(nombre, edad, genero, paisResidencia, encarcelado, descripcionFisica);
        this.paisAtacar = paisAtacar;
        this.ciudadAtacar = ciudadAtacar;
    }

    public String getPaisAtacar() {
        return paisAtacar;
    }

    public void setPaisAtacar(String paisAtacar) {
        this.paisAtacar = paisAtacar;
    }

    public String getCiudadAtacar() {
        return ciudadAtacar;
    }

    public void setCiudadAtacar(String ciudadAtacar) {
        this.ciudadAtacar = ciudadAtacar;
    }

    void CometerDelito(String pais, String ciudad,  int n) {
        try {
            validacion(n, pais, ciudad);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }

    void validacion(int x, String pais, String ciudad) throws MyException {
        if (x > 1) {
            throw new MyException("El ataque no se pudo hacer");
        } else {
            throw new MyException("Se atacao el pais " + pais + "en la ciudad" + ciudad);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Terrorista{" + "paisAtacar=" + paisAtacar + ", ciudadAtacar=" + ciudadAtacar + '}';
    }

}
