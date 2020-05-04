/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.langagebase;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author jgueguin
 */
public class VariableTest {

    @BeforeMethod
    public void avantChaqueTest() {
        System.out.println("@BeforeMethod");
    }
    
    @AfterMethod 
    public void apresChaqueTest() {
        System.out.println("@AfterMethod");
    }
    
    @BeforeClass
    public static void avantPremierTest() {
        System.out.println("@BeforeTest");
    }
    
    @AfterClass
    public static void apresDernierTest() {
        System.out.println("@AfterTest");
    }
    
    // créer 1 new fonction de test : vérify que  c du string"100" +50 = 150 (avec assertion)
    
    @Test    
    public void string100PlusInt50Equal150_OK() {
        
        String c = "100";
        
        double res = Integer.parseInt(c) + 50;
        
        assertEquals(res, 150.0 );
        
    }        
    
    
    
    
    
    @Test
    public void typeVariableOK() {//        
        byte b = 127; //-127 à 128
        short s = 1000; // 2 bytes
        int a = 2; // 4 bytes
        // long l; // /8 bytes

        
        //types décimaux
        
        float f = (float) 12.34; // simple précision
        double d = 12.34; // double précision
        
        //booleéan
        boolean numn = true; // true or false
        
        //string
        String texte = "coucou";
        texte = null;
        
        char c = 'a'; // ancestral

        //type entiers
    }

    
    @Test
    public void conversionOK() {

        // conversion
        
        Byte monByte = 127;
        String res = monByte.toString(); // conversion type => string
        
        monByte = Byte.parseByte("100"); // conversionstring => byte
        //Exercice
        // creer var a = "1000", bvar b= "12.34", var c =123
        // res = (a+b) * (a-c) afficher résultat
        String a = "1000";
        String b = "12.34";
        int c = 123;

        //  double res = (Short.parseShort(a) + Double.parseDouble(b) ) * (Short.parseShort(a) -c );
        double res2 = (Integer.parseInt(a) + Double.parseDouble(b)) * (Short.parseShort(a) - c);

        assertEquals(res2,887822.18);
        
               

    }

}
