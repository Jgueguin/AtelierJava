/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.langagebase;

import static java.lang.String.format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author jgueguin
 */
public class DatesEtHeuresTest {

    
    @Test
    public void conversionStringVersDate_OK() throws ParseException {
        
        System.out.println(" String vers Date");
        
        SimpleDateFormat format = new SimpleDateFormat ("dd/MM/yyyy hh:mm");
        Date maDate = format.parse("30/04/2020 11:42");
        System.out.println(format.format(maDate));
        
        
        SimpleDateFormat format2 = new SimpleDateFormat ("Y-MM-dd hh:mm");
        System.out.println(format2.format(maDate));
        
    }
    
    
    
    
    @Test
    public void conversionDateVersStrings_OK() {
        System.out.println(" ");
        System.out.println("Date ");

        Date maDate = new Date();
        
        //formatage de la date
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
                
        String dateHeure = format.format(maDate);

        System.out.println(" ");
        System.out.println(maDate);
        System.out.println(" ");

        System.out.println(dateHeure);
        
        
        
    }

}
