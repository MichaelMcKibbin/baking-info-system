package com.michaelmckibbin.baking;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class MySort<T> {

    public void mergeSort(MyLinkedList<T> list, Comparator<T> comparator) {
        if (list.size() <= 1) {
            return;
        }

        int mid = list.size() / 2;
        MyLinkedList<T> left = new MyLinkedList<>();
        MyLinkedList<T> right = new MyLinkedList<>();

        // Populate left half
        for (int i = 0; i < mid; i++) {
            left.add(list.get(i));
        }

        // Populate right half
        for (int i = mid; i < list.size(); i++) {
            right.add(list.get(i));
        }

        mergeSort(left, comparator);
        mergeSort(right, comparator);

        merge(list, left, right, comparator);
    }

    private void merge(MyLinkedList<T> list, MyLinkedList<T> left, MyLinkedList<T> right,
                       Comparator<T> comparator) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (comparator.compare(left.get(i), right.get(j)) <= 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }
    }
}
