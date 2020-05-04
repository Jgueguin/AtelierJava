/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.langagebase;

import java.util.ArrayList;
import java.util.HashSet;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author jgueguin
 */
public class SetTest {

    @Test
    public void ajoutDoublon_KO() {
        System.out.println("      ");
        System.out.println("EXO Doublon mettre deux fois la même info dans le Set");

        HashSet<String> capitales = new HashSet();
        capitales.add("Madrid");
        capitales.add("Paris");
        capitales.add("Madrid");

        System.out.println(capitales);
        // on voit qu'on ne peut pas avoir de doublon
        assertEquals(capitales.size(), 2);
    }

    @Test
    public void ajoutContenuListeAvecDoublonDansSet_OK() {
        System.out.println("      ");
        System.out.println("ajout contenu avec doublon dans set");

        ArrayList<String> pays = new ArrayList<>();
        pays.add("Espagne");
        pays.add("Angleterre");
        pays.add("Angleterre");
        pays.add("Espagne");
        System.out.println(pays);
        
        System.out.println("-----------      ");
        
        HashSet<String> newPays = new HashSet();
        newPays.addAll(pays);

        System.out.println(newPays);
        // on voit qu'on ne peut pas avoir de doublon

        assertEquals(newPays.size(),2);
        
    }

}
