/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.langagebase;

import java.util.HashMap;
import java.util.HashSet;
import jdk.nashorn.internal.ir.RuntimeNode;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author jgueguin
 */
public class MapTest {

    @Test
    public void test() {
        HashMap<String, Integer> communes = new HashMap<>();
        communes.put("Paris", 75000);
        communes.put("Marseille", 13000);
        communes.put("Toulouse", 31000);

        assertEquals((int) communes.get("Marseille"), 13000);

        System.out.println(communes.keySet());
    }

    @Test
    public void transformMapCommunesMapCodePostaux_OK() {

        System.out.println("Transform");
        HashMap<String, Integer> communes = new HashMap<>();
        communes.put("Paris", 75000);
        communes.put("Marseille", 13000);
        communes.put("Toulouse", 31000);

        HashMap<Integer, String> CodePostaux = new HashMap<>();

        for ( String commune : communes.keySet()) {
            
            int codePostal = communes.get(commune);
            
            CodePostaux.put (codePostal, commune);
            
        }
        
        System.out.println(CodePostaux);
        
        
        
        
    }

}
