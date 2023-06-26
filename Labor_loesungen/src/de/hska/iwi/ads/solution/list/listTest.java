package de.hska.iwi.ads.solution.list;

import de.hska.iwi.ads.dictionary.MapTest;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class listTest {
    @Test
    public void createMap () {
        DoubleLinkedList<String,String> list = new DoubleLinkedList<>();

        list.put("hot","Hot Pics of Peppa Pig");
        list.put("Vegeta, Second Season.","It's over NINE-THOUSAND!!!");

        assertEquals("Hot Pics of Peppa Pig",list.get("hot"));
        assertEquals("It's over NINE-THOUSAND!!!",list.get("Vegeta, Second Season."));
    }

    @Test
    public void moore() {
        DoubleLinkedList<String,String> list = new DoubleLinkedList<>();

        list.put("hot","Hot Pics of Peppa Pig");
        list.put("Vegeta, Second Season.","It's over NINE-THOUSAND!!!");

        assertEquals("Hot Pics of Peppa Pig",list.get("hot"));
        list.put("hot","It's over NINE-THOUSAND!!!");
        assertEquals("It's over NINE-THOUSAND!!!",list.get("hot"));
    }
}
