package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 描述：手写hashMap
 *
 * @author lhh
 * @Date 2020/11/1 13:05
 */
public class MyHashMap<K,V>{


    public int size() {
        return 0;
    }


    public boolean containsKey(Object key) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public Object get(Object key) {
        return null;
    }

    public Object put(Object key, Object value) {
        return null;
    }

    public Object remove(Object key) {
        return null;
    }

    public void putAll(Map m) {

    }

    public void clear() {

    }

    public Set keySet() {
        return null;
    }

    public Collection values() {
        return null;
    }

    public Set<Map.Entry> entrySet() {
        return null;
    }

    class Entry<K,V> {

    }
    public static void main(String[] args) {
        System.out.println(1<<4);
        Map<String,String> map=new HashMap<>();
        map.put("a","aaa");
    }
}
