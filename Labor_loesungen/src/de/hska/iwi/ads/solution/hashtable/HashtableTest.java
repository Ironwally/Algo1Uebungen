package de.hska.iwi.ads.solution.hashtable;

import org.junit.jupiter.api.Test;

public class HashtableTest {

    @Test
    void test() {
        Hashtable<Integer, String> ht = new Hashtable<>(1);
        ht.put(0,"Hot Pics of Peppa Pig.");
        System.out.println(ht.size());
        System.out.println(ht.get(0));
        //assertEquals();
    }
}
