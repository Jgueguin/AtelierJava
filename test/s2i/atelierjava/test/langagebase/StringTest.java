/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.langagebase;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jgueguin
 */
public class StringTest {

    @Test
    public void test1() {

        String[] couleurs = "rouge, vert, bleu".split(",");
        assertEquals(couleurs.length, 3);

        List<String> listeCouleurs = Arrays.asList(couleurs);
        System.out.println(listeCouleurs);

        int a = 10;
        float b = 20;
        String nom = "Tom";

        String texte = a + " " + b + " " + nom;

        String.format("valeur a : %d,valeur b,%f, valeur nom: %s", a, b, nom);
        System.out.println(texte);

        String txt1 = "PAris";
        String txt2 = "Paris";
        assertTrue(txt1.equalsIgnoreCase(txt2));

        String cmd = "git init";
        assertTrue(cmd.startsWith("git"));
        assertTrue(cmd.endsWith("init"));

        assertTrue("ainsi parlait Zarahoostra".contains("lait"));
        assertEquals("ainsi parlait Zarahoostra".indexOf("Zara"), 14);

        assertEquals("ainsi parlait Zarahoostra ainsi parlait Zarahoostra".split("ainsi").length, 3);

    }

    @Test
    public void regexMatches_OK() {
        String prenomNom = "Thomas Digna";

//Check Numéro Telephone
        String tel = "0618431466";
        String regex = "[0][1-8][0-9]{8}";
        assertTrue(tel.matches(regex));

        // check email
        String email = "jgueguin@hotmail.com";
        String regex2 = "[\\p{Alnum}]{2,}@[a-zA-Z0-9_-]{2,}.[a-z]{2,}";
        assertTrue(email.matches(regex2));

        // check date validity        
        assertTrue("30/04/2020".matches("[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}"));
    }

    @Test
    public void regexSplit_OK() {

        System.out.println("**************");
        System.out.println("regexSplit_OK");

        Pattern p = Pattern.compile("([a-z]{2,}@)(.+)");
        Matcher m = p.matcher("jgueguin@hotmail.com");
        m.find();
        System.out.println(m.groupCount());
        
        for (int i=0; i<=m.groupCount(); i++) {

            System.out.println(i + " " + m.group(i));

        }
        System.out.println("**************");
    }

    @Test
    public void splitDate_OK() {

        System.out.println("**************");
        System.out.println("Split DATE_OK");

        Pattern p = Pattern.compile("([0-9]{1,2})/([0-9]{1,2})/([0-9]{4})");
        Matcher m = p.matcher("30/04/2020");
        m.find();

        assertEquals(m.group(1), "30");
        assertEquals(m.group(2), "04");
        assertEquals(m.group(3), "2020");
               
        System.out.println("**************");
    }
    
    
    
    
    
    
    
    
    
}
