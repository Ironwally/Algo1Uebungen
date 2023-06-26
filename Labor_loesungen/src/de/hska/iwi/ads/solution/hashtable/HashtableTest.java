package de.hska.iwi.ads.solution.hashtable;

import de.hska.iwi.ads.dictionary.AbstractDictionary;
import de.hska.iwi.ads.dictionary.MapTest;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HashtableTest extends MapTest {

    @Override
    public <K extends Comparable<K>, V> Hashtable<K, V> createMap () {
        return new Hashtable<>(400);
    }

    @Test
    void testSize () {
        Hashtable<Integer, String> ht = new Hashtable<>(2);
        ht.put(1,"Hot Pics of Peppa Pig");
        System.out.println("Size of Hashtable: " + ht.size());
        assertEquals(1,ht.size());
    }

    @Test
    void testGet() {
        Hashtable<String, String> ht = new Hashtable<>(100);
        ht.put("hybrid","Padme Organa");
        ht.put("hot","Hot Pics of Peppa Pig");
        ht.put("op","Anakin OP Sky-boy");
        ht.put("lol","Rey Shitstalker");
        ht.put("vader","Luke, Ich bin dein Vadda!");
        System.out.println("Value of first Elem: " + ht.get("hot"));
        assertEquals("Padme Organa",ht.get("hybrid"));
    }
    @Test
    void testOverride() {
        Hashtable<String, String> ht = new Hashtable<>(100);
        ht.put("hot","Hot Pics of Peppa Pig");
        ht.put("hybrid","Padme Organa");
        ht.put("op","Anakin OP Sky-boy");
        ht.put("lol","Rey Shitstalker");
        ht.put("vader","Luke, Ich bin dein Vadda!");

        System.out.println("Value of Elem: " + ht.get("hot"));
        System.out.println(ht.put("hybrid","Hot Pics of Peppa Pig"));
        System.out.println(ht.put("op","Hot Pics of Peppa Pig"));
        System.out.println(ht.put("lol","Hot Pics of Peppa Pig"));

        System.out.println("Value of Elem: " + ht.get("hybrid"));
        System.out.println("Value of Elem: " + ht.get("op"));
        System.out.println("Value of Elem: " + ht.get("lol"));
        System.out.println("Value of Elem: " + ht.get("vader"));
        assertEquals("Hot Pics of Peppa Pig",ht.get("hot"));
        assertEquals("Hot Pics of Peppa Pig",ht.get("hybrid"));
        assertEquals("Hot Pics of Peppa Pig",ht.get("op"));
        assertEquals("Hot Pics of Peppa Pig",ht.get("lol"));
        assertEquals("Luke, Ich bin dein Vadda!",ht.get("vader"));
    }

    /**
     * Should throw the DictionaryFullException
     */
    @Test
    void testOverflow() {
        Hashtable<String, String> ht = new Hashtable<>(2);
        ht.put("hybrid","Padme Organa");
        ht.put("hot","Hot Pics of Peppa Pig");
        try {
            ht.put("op","Anakin OP Sky-boy");
            assertEquals("AbstractDictionary.DictionaryFullException to be thrown","But nothing was thrown.");
        } catch (AbstractDictionary.DictionaryFullException e) {}
        //Meine eigene obere Methode ist einfach grundsätzlich überlegen
        //assertThrows(AbstractDictionary.DictionaryFullException.class, () -> ht.put("op","Anakin OP Sky-boy"));
    }
}
