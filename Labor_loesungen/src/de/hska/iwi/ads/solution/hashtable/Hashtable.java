package de.hska.iwi.ads.solution.hashtable;

import de.hska.iwi.ads.dictionary.AbstractHashMap;

import java.util.Iterator;
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
            if(current != null && current.getKey() == key) {
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
        if(size() == hashtable.length) throw new DictionaryFullException();
        //Check Key if already in table and override if so
        int index = 0;
        do {
        int hash = hash(key, index);
        //Iterator doesn't work correctly. When Creating Iterator while Hashtable is still empty, Iterator will auto run till out-off-bounds-exception
        //Iterator<Entry<K,V>> it = this.iterator();
        Entry<K,V> entry = (Entry<K, V>) hashtable[index];
        if(entry != null) {
            V old = entry.getValue();
            hashtable[index].setValue(value);
            return old;
        }
        hashtable[index] = new Entry<>(/*hash,*/key,value);
        size++;
        } while (index < hashtable.length);
        return null;
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
