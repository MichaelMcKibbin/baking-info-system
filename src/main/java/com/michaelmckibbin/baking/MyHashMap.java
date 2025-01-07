package com.michaelmckibbin.baking;

public class MyHashMap {
    private Node[] buckets;
    private int size;

    public MyHashMap() {
        buckets = new Node[10];
        size = 0;
    }

    public void put(String key, Double value) {
        int bucketIndex = getBucketIndex(key);
        Node node = buckets[bucketIndex];
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
            node = node.next;
        }
        node = buckets[bucketIndex];
        Node newNode = new Node(key, value);
        newNode.next = node;
        buckets[bucketIndex] = newNode;
        size++;
    }

    public Double get(String key) {
        int bucketIndex = getBucketIndex(key);
        Node node = buckets[bucketIndex];
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    public void remove(String key) {
        int bucketIndex = getBucketIndex(key);
        Node node = buckets[bucketIndex];
        Node prev = null;
        while (node != null) {
            if (node.key.equals(key)) {
                if (prev == null) {
                    buckets[bucketIndex] = node.next;
                } else {
                    prev.next = node.next;
                }
                size--;
                return;
            }
            prev = node;
            node = node.next;
        }
    }

    public int size() {
        return size;
    }

    private int getBucketIndex(String key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    private class Node {
        String key;
        Double value;
        Node next;

        public Node(String key, Double value) {
            this.key = key;
            this.value = value;
        }
    }
}
