package de.hska.iwi.ads.solution.hashtable;

import de.hska.iwi.ads.dictionary.AbstractHashMap;

import java.util.AbstractMap;
//import java.util.Map;
import java.util.Objects;

public class Hashtable<K extends Comparable<K>, V> extends AbstractHashMap<K, V> {
    public Hashtable(int capacity) {
        super(capacity);
    }
    public V get(Object o) {
        @SuppressWarnings("unchecked")
        K key = (K) o;
        int index = 0;
        int hash;
        Entry<K,V> current;
        do{
            hash = hash(key,index);
            current = hashtable[hash];
            if(current != null && current.getKey().compareTo(key)==0) {
                return current.getValue();
            }
            index++;
        } while(current != null && index < hashtable.length);
        
        return null;
    }

    @Override
    public V put(K key, V value) {
        //check value for null
        if(value == null) throw new NullPointerException();
        //Check Key if already in table and override if so
        int index = 0;
        int hash;
        do {
        hash = hash(key, index);
        Entry<K,V> entry = (Entry<K, V>) hashtable[hash];
        if(entry != null && entry.getKey().compareTo(key)==0) {
            V old = entry.getValue();
            hashtable[hash].setValue(value);
            return old;
        }
        if(entry == null) {
            //hashtable[hash].setValue(value);
            hashtable[hash] = new AbstractMap.SimpleEntry<>(key,value);
            this.size++;
            return null;
        }
            index++;
        } while (index < hashtable.length);
        throw new DictionaryFullException();
        //return null;
    }
    /* Es gibt in AbstractHashMap keine remove methoden daher kann ich diese auch nicht überschreiben
    @Override
    public V remove(Object key) {
        throw new UnsupportedOperationException();
    }
*/
    private int hash(K key, int index) {
        return Math.abs(Objects.hashCode(key) % hashtable.length + (index * index)) % hashtable.length;
    }
/*
    private static class Entry<K,V> implements Map.Entry<K,V> {
        final int hash;
        final K key;
        V value;

        protected Entry(int hash, K key, V value) {
            this.hash = hash;
            this.key =  key;
            this.value = value;
        }

        // Map.Entry Ops
        public K getKey() {
            return key;
        }
        public V getValue() {
            return value;
        }
        public V setValue(V value) {
            if (value == null)
                throw new NullPointerException();

            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        public boolean equals(Object o) {
            if (!(o instanceof Map.Entry<?, ?> e))
                return false;

            return (key==null ? e.getKey()==null : key.equals(e.getKey())) &&
                    (value==null ? e.getValue()==null : value.equals(e.getValue()));
        }
        public int hashCode() {
            return hash ^ Objects.hashCode(value);
        }
        public String toString() {
            return key.toString()+"="+value.toString();
        }
    }
    */
}
