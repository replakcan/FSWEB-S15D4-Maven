package org.example;
import java.util.ArrayList;
import java.util.Collections;
public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {
    @Override
    public boolean add(T element) {
        if (!this.contains(element)) {
            return super.add(element);
        }
        return false;
    }
    public void sort() {
        Collections.sort(this);
    }
    @Override
    public boolean remove(Object element) {
        boolean result = super.remove(element);
        if (result) {
            this.sort();
        }
        return result;
    }
    public static void main(String[] args) {
        WorkintechList<String> list = new WorkintechList<>();
        list.add("banana");
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.sort();
        System.out.println(list);
        list.remove("banana");
        System.out.println(list);
    }
}