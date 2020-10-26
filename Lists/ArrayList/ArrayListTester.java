package com.data;

import com.data.ArrayList.DynamicArray;

public class ArrayListTester {
    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>();
        for (int i = 0; i < 10; i++) {
            array.add(i + 1);
        }
        array.removeAt(7);
        array.remove(5);
        System.out.println(array.size());
        System.out.println(array);
        array.clear();
        System.out.println(array);
        System.out.println(array.size());
    }
}
