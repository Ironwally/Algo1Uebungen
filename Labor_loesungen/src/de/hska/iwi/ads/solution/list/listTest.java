package de.hska.iwi.ads.solution.list;

import de.hska.iwi.ads.dictionary.MapTest;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class listTest extends MapTest{
    @Override
    public <K extends Comparable<K>, V> DoubleLinkedList<K, V> createMap () {
        return new DoubleLinkedList<>();
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
