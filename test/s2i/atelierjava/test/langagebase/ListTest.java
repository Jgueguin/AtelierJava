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
public class ListTest {

    @Test
    public void test1() {
        System.out.println("TEST1");
        ArrayList<String> pays = new ArrayList<>();

        pays.add("Espagne");
        pays.add("Angleterre");
        pays.add(1, "France");
        System.out.println(pays);

        assertEquals(pays.get(0), "Espagne");
        ArrayList<String> autrePays = new ArrayList<>();
        autrePays.add("USA");
        autrePays.add("Jamaique");

        pays.addAll(1, autrePays);
        System.out.println(pays);

        pays.clear();
        System.out.println(pays);

        pays.addAll(autrePays);
        System.out.println(pays);

        pays.remove(1);
        System.out.println(pays);
        System.out.println("*-*--*-*-*-*-");
    }

    @Test
    public void removeAllFrancedeGuadeloupeMartiniqueFrance_OK() {
        System.out.println("EXO");

        ArrayList<String> pays = new ArrayList<>();

        pays.add("France");
        pays.add("Guadeloupe");
        pays.add("Martinique");
        pays.add("France");
        System.out.println(pays);

        ArrayList<String> listARemove = new ArrayList<>();
        listARemove.add("France");
        pays.removeAll(listARemove);
      
        System.out.println(pays);
        
        System.out.println("nombre éléments dans la laiste: "+pays.size());
        
        if (pays.contains("Martinique")) {
            System.out.println("Martinique est dans la liste");
        
        }
        
                
        
        System.out.println("*-*--*-*-*-*-");
    }

}
