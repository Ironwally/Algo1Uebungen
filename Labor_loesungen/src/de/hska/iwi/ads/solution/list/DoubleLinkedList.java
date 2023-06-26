package de.hska.iwi.ads.solution.list;

import de.hska.iwi.ads.dictionary.AbstractDoubleLinkedList;

public class DoubleLinkedList<K extends Comparable<K>, V> extends AbstractDoubleLinkedList<K, V> { //AbstractDoubleLinkedList ist nicht abstract --> Wahrscheinlich fehler, sollte aber keine Probleme machen, daher gelassen.

    public V get(Object o) {
        @SuppressWarnings("unchecked")
        K key = (K) o;

        ListElement current = this.head;
        if(current!=null) {
            for (; current != null; current = current.next) {
                if (current.entry.getKey().compareTo(key)==0) return current.entry.getValue();
            }
        }
        return null;
    }

    public V put(K key, V value) {
        ListElement current = this.head;
        ListElement newHead = new ListElement(new SimpleEntry<>(key,value),null,this.head);
        if(current!=null) {
            for (; current.next != null; current = current.next) {
                if (current.entry.getKey().compareTo(key) == 0) {
                    V old = current.entry.getValue();
                    current.entry.setValue(value);
                    return old;
                }
            }

            ListElement oldHead = this.head;
            oldHead.previous = newHead;
        }
        this.head = newHead;
        this.size += 1;
        return null;
    }

    public V delete(K key) {
        throw new UnsupportedOperationException();
    }

}
