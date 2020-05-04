/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.objets;

/**
 *
 * @author jgueguin
 */
public class Horloge {

    private int heures;
    private int minutes;
    private int secondes;

    public Horloge(int heures, int minutes, int secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;

    }

    public void afficher() {

        String txt = String.format("H: %d, min: %d, sec: %d", this.heures, this.minutes, this.secondes);
        System.out.println(txt);

    }

    public void avancer1Seconde() {

        this.secondes++;
        if ((this.secondes % 60) == 0) {
            this.secondes = 0;
            this.minutes++;
            if ((this.minutes) % 60 == 0) {
                this.minutes = 0;
                this.heures++;
                if ((this.heures) % 24 == 0) {
                    this.heures = 0;
                    this.secondes=0;

                }

            }
        }
    }

}


