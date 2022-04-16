package HashMap;

import java.util.HashMap;
import java.util.LinkedList;

public class HashMaap<K,V>{
    public HashMaap(int i) {
    }

    private class HMNode{
        K key;
        V value;
        public HMNode(K key , V value) {
            this.key = key;
            this.value = value;
        }
        public String toString(){
            return this.key + "@" + this.value;
        }
    }
    public LinkedList<HMNode> [] bucketArray;
    private int size;

    public HashMaap(){
        this(5);
    }
}
