/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.objets;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import s2i.atelierjava.objets.Horloge;

/**
 *
 * @author jgueguin
 */
public class HorlogeTest {

    @Test
    public void manipHorloge_OK() {

        Horloge horl = new Horloge(23, 59, 59);

        horl.afficher();

        for (long nbTours = 86400; nbTours >= 0; nbTours--) {

            horl.avancer1Seconde();
            horl.afficher();

            System.out.print("\033[H\033[2J");
            System.out.flush();

        }
    }

}
