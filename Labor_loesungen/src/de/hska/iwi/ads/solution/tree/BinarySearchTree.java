package de.hska.iwi.ads.solution.tree;

import de.hska.iwi.ads.dictionary.AbstractBinaryTree;

public class BinarySearchTree<K extends Comparable<K>,V> extends AbstractBinaryTree<K,V> {

    public V get(Object o) {
        @SuppressWarnings("unchecked")
        K key = (K) o;
        Node x = this.root;
        while (x != null) {
            if (key.compareTo(x.entry.getKey()) < 0) {               //If key is smaller than key of x
                x = x.left;
            } else if (key.compareTo(x.entry.getKey()) > 0) {        //If key is bigger than key of x
                x = x.right;
            } else {                                                //If key is equal to key of x
                return x.entry.getValue();
            }
        }
        return null;
    }
    public V put(K key, V value) {
        Node y = null;
        Node x = this.root;
        Node z = new Node(key, value);

        while(x!=null) {
            if(key.compareTo(x.entry.getKey()) == 0) {           //Returns old value and saves new value, if key is already in use.
                V old = x.entry.getValue();
                x.entry.setValue(value);
                return old;
            }
            y = x;
            if(key.compareTo(x.entry.getKey()) < 0) { x = x.left; }
            else if(key.compareTo(x.entry.getKey()) > 0) { x = x.right; }
        }
        if(y==null) this.root = z;
        else if(key.compareTo(y.entry.getKey()) < 0) y.left = z;
        else y.right = z;
        this.size++;
        return null;
    }
}
