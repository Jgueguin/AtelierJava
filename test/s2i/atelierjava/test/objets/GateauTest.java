/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.objets;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import s2i.atelierjava.objets.Gateau;

/**
 *
 * @author jgueguin
 */
public class GateauTest {

    @Test
    public void preparerGateauxOK() {

        Gateau gateau1 = new Gateau("Mais", 80, 25, 5); //Mais 80 15 5
        Gateau gateau2 = new Gateau("Epeautre", 60, 30, 10);// Epeautre 60 30 10

        gateau2.affiche();

        gateau2.mangerLaMoitie();
        gateau2.affiche();
    }

}
