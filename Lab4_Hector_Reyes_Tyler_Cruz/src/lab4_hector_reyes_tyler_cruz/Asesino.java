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
public class Asesino extends Agente{

    private String nombreVictima, arma;

    public Asesino() {
        super();
    }

    public Asesino(String nombreVictima, String arma, String nombre, int edad, String genero, String paisResidencia, boolean encarcelado, String descripcionFisica) {
        super(nombre, edad, genero, paisResidencia, encarcelado, descripcionFisica);
        this.nombreVictima = nombreVictima;
        this.arma = arma;
    }

    public String getNombreVictima() {
        return nombreVictima;
    }

    public void setNombreVictima(String nombreVictima) {
        this.nombreVictima = nombreVictima;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    void CometerDelito(String nombre, String arma, Criminal c) {
        try {
            validacion(c.getDelitos().size(), nombre, arma);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }

    void validacion(int x, String name, String weapon) throws MyException {
        if (x > 1) {
            throw new MyException("El ataque no se pudo hacer");
        } else {
            throw new MyException("Nombre de la victima " + name + "en la ciudad" + weapon);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Asesino{" + "nombreVictima=" + nombreVictima + ", arma=" + arma + '}';
    }

}
