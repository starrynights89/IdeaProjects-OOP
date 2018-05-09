package GenericsDemo;

public class KeyValuePair <K, V> {

    private K key;
    private V value;

    public void put(K newKey, V newValue) {
        key = newKey;
        value = newValue;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
