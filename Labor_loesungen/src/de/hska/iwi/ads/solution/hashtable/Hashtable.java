package de.hska.iwi.ads.solution.hashtable;

import de.hska.iwi.ads.dictionary.AbstractHashMap;

import java.util.Iterator;

public class Hashtable<K extends Comparable<K>, V> extends AbstractHashMap<K, V> {
    public Hashtable(int capacity) {
        super(capacity);
    }

    @Override
    public V put(K key, V value) {
        Iterator<Entry<K, V>> it = entrySet().iterator();
        hashtable[]

        return value;
    }

}