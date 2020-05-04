/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.langagebase;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author jgueguin
 */
public class StructCtrlTest {

    @Test
    public void verifieChoixUtil_If_Ok() {

        int a = 10, b = 2;

        String choix = "C";

        System.out.println("*********** ");
        System.out.println("Menu IF");
        System.out.println("A add ; B = soustr, C= div; D= *"); //A add ; B = soustr, C= div; D= *

        if (choix == "A") {
            System.out.println(a + b);
            assertEquals(a + b, 12);
        } else if (choix == "B") {
            System.out.println(a - b);
            assertEquals(a - b, 8);
        } else if (choix == "C") {
            System.out.println(a / b);
            assertEquals(a / b, 5);
        } else if (choix == "D") {
            System.out.println(a * b);
            assertEquals(a * b, 20);
        } else {
            fail("error");

        }

    }

    @Test
    public void verifieChoixUtilSwitch_OK() {

        int a = 10, b = 2;
        String choix = "C";

        System.out.println("*********** ");
        System.out.println("Menu SWITCH");
        System.out.println("A add ; B = soustr, C= div; D= *"); //A add ; B = soustr, C= div; D= *

        switch (choix) {
            case "A":
                System.out.println("choix A");
                System.out.println(a + b);
                assertEquals(a + b, 12);
                break;

            case "B":
                System.out.println("choix B");
                System.out.println(a - b);
                assertEquals(a - b, 8);
                break;

            case "C":
                System.out.println("choix C");
                System.out.println(a / b);
                assertEquals(a / b, 5);
                break;

            case "D":
                System.out.println("choix D");
                System.out.println(a * b);
                assertEquals(a * b, 20);
                break;

            default:
                fail("Operation non permise");
                break;
        }

    }

    @Test
    public void verifie1PlusPetitQue2Et2PlusPetitQue3_OK() {

        int a = 1, b = 2, c = 3;

        if (!(a < b && b < c)) {
            fail("Erreur");

        }

    }

    @Test
    public void ifElseOK() {
        int a = 10, b = 20, c = 30;

        if (a == b && b == c) {

            //code correspondant si test est vrai
        } else if (a < 10) {
            //code si test est faux   
        } else {
        }
    }

    @Test
    public void forEachOK() {

        System.out.println("*********");
        System.out.println("ForEach");
        System.out.println("*********");

        ArrayList<String> pays = new ArrayList<>();

        pays.add("Espagne");
        pays.add("Italie");
        pays.add("Portugal");

        for (String paysAct : pays) {

            System.out.println(paysAct);
        }

    }

    @Test
    public void forTableMul3OK() {

        System.out.println("*********");
        System.out.println(" Boucle For");
        System.out.println("*********");

        for (int i = 1; i < 11; i++) {
            System.out.println(3 * i);

        }

    }

    @Test
    public void factorielle8Equal40320_OK() {

        System.out.println(" factorielle");
        int j = 1;
        int res = 8;

        for (int i = 7; i > 1; i--) {

            res = res * i;
        }

        System.out.println(res);
        assertEquals(res, 40320);
    }

    @Test
    public void tablesMultiplicationsde2a10_OK() {
        System.out.println(" tablesmul de 2 à 10 avec les 10 premiers éléments");

        // Si on a besoin de tableuax flexibles, utiliser l'interpréteur jython dans java
        for (int i = 2; i < 11; i++) {

            for (int j = 1; j < 11; j++) {

                System.out.print(" " + i + "*" + j + "= " + i * j + "");

            }
            System.out.println("");

        }

    }

    @Test
    public void boucleWhile_OK() {
        System.out.println("************");
        System.out.println("Boucle While");

        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }

    }

    @Test
    public void whileSommeDeUnADixEgal55_OK() {
        System.out.println("************");
        System.out.println("Boucle Exo while resultat 55");

        int sum = 0;
        int i = 0;
        while (i < 11) {
            sum = sum + i;
            i++;
        }
        assertEquals(sum, 55);

    }

    @Test
    public void doWhile_OK() {

        System.out.println("Do while ");

        String choix;
        
        do {
            choix = "C";
        } while (choix != "Q");

    }

}
