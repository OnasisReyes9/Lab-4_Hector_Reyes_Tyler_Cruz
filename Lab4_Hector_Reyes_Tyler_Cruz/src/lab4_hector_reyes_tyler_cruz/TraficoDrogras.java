/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_hector_reyes_tyler_cruz;

/**
 *
 * @author Tyler C
 */
public class TraficoDrogras extends DelitoGrave{
    private String drugName;
    private int cantDrug;

    public TraficoDrogras() {
    }

    public TraficoDrogras(String drugName, int cantDrug, int puntuacionGravedad, String descripcion, String nombreVictima, boolean culpable, String sentencia, String fecha, int numDelito) {
        super(puntuacionGravedad, descripcion, nombreVictima, culpable, sentencia, fecha, numDelito);
        this.drugName = drugName;
        this.cantDrug = cantDrug;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getCantDrug() {
        return cantDrug;
    }

    public void setCantDrug(int cantDrug) {
        this.cantDrug = cantDrug;
    }

    @Override
    public String toString() {
        return "TraficoDrogras{" + "drugName=" + drugName + ", cantDrug=" + cantDrug + '}';
    }
    
}
