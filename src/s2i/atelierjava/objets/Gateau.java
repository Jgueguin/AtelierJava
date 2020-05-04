/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.objets;

import java.awt.BorderLayout;

/**
 *
 * @author jgueguin
 */
public class Gateau {

    private String typeFarine;
    private int proportionSucre;
    private int proportionFarine;
    private int proportionBeurre;

    public Gateau(String typeFarine, int propFarine, int propBeurre, int propSucre) {
        System.out.println("Constructeur Gateau");
        this.typeFarine = typeFarine;
        this.proportionFarine = propFarine;
        this.proportionBeurre = propBeurre;
        this.proportionSucre = propSucre;
    }

    //Setters
    public void setTypeFarine(String typeFarine) {
        this.typeFarine = typeFarine;
    }

    public void setProportionFarine(int proportionFarine) {

        if (this.proportionSucre + proportionFarine + this.proportionBeurre > 100) {
            this.proportionFarine = 100 - this.proportionBeurre - this.proportionSucre;

        } else {
            this.proportionFarine = proportionFarine;
        }

    }

    public void setProportionSucre(int proportionSucre) {
        if (this.proportionSucre + this.proportionFarine + this.proportionBeurre > 100) {
            this.proportionSucre = 100 - this.proportionBeurre - this.proportionFarine;

        } else {
            this.proportionSucre = proportionSucre;
        }

    }

    public void setProportionBeurre(int proportionBeurre) {

        this.proportionBeurre = proportionBeurre;

    }

    //Getters
    public String gettTypeFarine() {
        return typeFarine;
    }

    public int gettPropFarine() {
        return proportionFarine;
    }

    public int gettPropBeurre() {
        return proportionBeurre;
    }

    public int gettPropSucre() {
        return proportionSucre;
    }

    public void affiche() {
        System.out.println("Gateau " + this.typeFarine);
        System.out.println("Type Farine " + this.typeFarine);
        System.out.println("Prop Farine " + this.proportionFarine);
        System.out.println("Prop Beurre " + this.proportionBeurre);
        System.out.println("Prop Sucre " + this.proportionSucre);

        String.format("Farine: %s, proportion Farine: %d, proportion Sucre: %d, proportion Beurre : %d ",
                this.typeFarine, this.proportionFarine, this.proportionSucre, this.proportionBeurre);
    }

// fonction manger la moitié
    public void mangerLaMoitie() {
        this.proportionBeurre = this.proportionBeurre / 2;
        this.proportionFarine = this.proportionFarine / 2;
        this.proportionSucre = this.proportionSucre / 2;
    }

}
