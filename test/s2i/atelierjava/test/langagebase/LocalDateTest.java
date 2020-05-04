/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2i.atelierjava.test.langagebase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author jgueguin
 */
public class LocalDateTest {

    @Test
    public void convertir_30_04_2020_vers_2020_04_30_OK() {
        // create a formater 
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // create a LocalDate object
        LocalDate date = LocalDate.parse("30-04-2020", format1);
        String texte = date.format(format2);

        assertEquals(texte, "2020-04-30");

    }

    @Test
    public void ajouterUnAUn() {

        System.out.println("ajouterUnAUn");

        // create a LocalDate object
        LocalDate now = LocalDate.now();

        System.out.println(now);

        now = now.plusYears(1);
        now = now.plusMonths(1);
        now = now.plusDays(1);
        
        System.out.println(now);

    }

}
