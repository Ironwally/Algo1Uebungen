package de.hska.iwi.ads.solution.tree;
import de.hska.iwi.ads.dictionary.MapTest;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTreeTest extends MapTest {
    @Override
    public <K extends Comparable<K>, V> BinarySearchTree<K, V> createMap () {
        return new BinarySearchTree<>();
    }
    @Test
    public void thePreWrittenStuffTest() {
        BinarySearchTree<String,String> tree = createMap();

    }
    @Test
    void testSize () {
        BinarySearchTree<Integer, String> ht = new BinarySearchTree<>();
        ht.put(1,"Hot Pics of Peppa Pig");
        System.out.println("Size of BinarySearchTree: " + ht.size());
        assertEquals(1,ht.size());
    }
    @Test
    void testGet() {
        BinarySearchTree<String, String> ht = new BinarySearchTree<>();
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
        BinarySearchTree<String, String> ht = new BinarySearchTree<>();
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
}
