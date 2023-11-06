package com.linkedlist;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

    class Node {
        public int key;
        public int val;
        public Node next;
        public Node prev;

        public Node(Integer key, Integer val){
            this.key = key;
            this.val = val;
        }


    }

    Map<Integer, Node> cacheMap ;
    // left ptr -> least recently used key value pair
    // right ptr -> most recently used key value pair
    Node left = null, right = null;

    private int MAX_SIZE = 0;

    public LRUCache(int capacity) {

        MAX_SIZE = capacity;
        cacheMap = new HashMap<>(capacity, 1.0f);

    }

    public int get(int key) {

        if(cacheMap.containsKey(key)){

            Node n = cacheMap.get(key);
            System.out.println("getting value for key : " + n.key + " which is " + n.val );

            if(n != right){
                System.out.println("Moving " + n.key + " to the right");
                moveToRight(n);
                System.out.println("Moved " + n.key + " to the right");

            }
            return n.val;

        } else
            return -1;

    }

    public void put(int key, int value) {

        //even if the map already has the key-value pair we still need to update the map
        //|| cacheMap.size() < MAX_SIZE
        if(key == 13){
            System.out.println("Hello 13");
        }

        if(cacheMap.containsKey(key)){
            Node node = cacheMap.get(key);
            node.val = value;

            if(node != right){
                System.out.println("Moving " + node.key + " to the right");
                moveToRight(node); // it becomes most recent (rightmost) node
                System.out.println("moved " + node.key + " to right");

            }

        } else {
            if(cacheMap.size() >= MAX_SIZE){
                //remove the LRU(leftmost) node
                Node evictNode = left;
                removeNode(evictNode);
                cacheMap.remove(evictNode.key);
            }

            Node node = new Node(key, value);
            //new node becomes the most recent (rightmost) node
            cacheMap.put(key, node);
            addToRight(node);

        }

        System.out.println(" cache " + cacheMap + " size" + cacheMap.size() + " added " + right.key);
    }

    public void moveToRight(Node node){
        removeNode(node);
        addToRight(node);
    }

    public void removeNode(Node n){
        Node p = n.prev;
        Node nxt = n.next;

        //if there are at least 3 nodes and n is the center one
        if(p != null && nxt != null){
            //break the links of n with next and prev node

            if(n.key == 3)
                System.out.println("hello " + n.key + " wtf are you doing?");

            p.next = nxt;
            nxt.prev = p;
            n.next = null;
            n.prev = null;

            System.out.println("Node removed is :" + n.key);

        } else if(p == null && nxt != null ){
            if(n.key == 3)
                System.out.println("hello " + n.key + " wtf are you doing?");

            nxt.prev = null;
            left = nxt;
            n.next = null;


            System.out.println("Node removed is :" + n.key);

        }


        // this is not required because if the node is at the rightmost position, we do not need to remove and add it.

        // else if(p != null && nxt == null) {
        //     right = p;
        //     right.next = null;

        // }
        // if both are null, that case will not arrive

    }

    public void addToRight(Node node){

        if(left == null && right == null){
            left = node;
            right = node;

        } else { // if left == right i.e.  size >= 1
            if(node.key == 3)
                System.out.println("hello " + node.key  + " wtf are you doing?");

            right.next = node;
            node.prev = right;
            right = node;

            System.out.println("After adding Node :" + node.key + " left : " + left.key + " right : " + right.key);
        }

    }

    @Override
    public String toString() {
        Node curr = left;
        StringBuilder sb = new StringBuilder();
        while(curr != null){
            sb.append("[" + curr.key + "," + curr.val + "]->");
            curr = curr.next;
        }

        return sb.toString();
    }

    //[[10],[10,13],[3,17],[6,11],[10,5],[9,10],[13],[2,19],[2],[3],[5,25],[8],[9,22],[5,5],[1,30],[11],[9,12],[7],[5],[8],[9],[4,30],
// [9,3],[9],[10],[10],[6,14],[3,1],[3],[10,11],[8],[2,14],[1],[5],[4],[11,4],[12,24],[5,18],[13],[7,23],[8],[12],[3,27],[2,12],
// [5],[2,9],[13,4],[8,18],[1,7],[6],[9,29],[8,21],[5],[6,30],[1,12],[10],[4,15],[7,22],[11,26],[8,17],[9,29],[5],[3,4],[11,30],
// [12],[4,29],[3],[9],[6],[3,4],[1],[10],[3,29],[10,28],[1,20],[11,13],[3],[3,12],[3,8],[10,9],[3,26],[8],[7],[5],[13,17],[2,27],
// [11,15],[12],[9,19],[2,15],[3,16],[1],[12,17],[9,1],[6,19],[4],[5],[5],[8,1],[11,7],[5,2],[9,28],[1],[2,2],[7,4],[4,22],[7,24],
// [9,26],[13,28],[11,26]]
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(10);

        int[][] operations = {
                {10, 13}, {3, 17}, {6, 11}, {10, 5}, {9, 10}, {13}, {2, 19}, {2}, {3}, {5, 25},
                {8}, {9, 22}, {5, 5}, {1, 30}, {11}, {9, 12}, {7}, {5}, {8}, {9}, {4, 30}, {9, 3},
                {9}, {10}, {10}, {6, 14}, {3, 1}, {3}, {10, 11}, {8}, {2, 14}, {1}, {5}, {4},
                {11, 4}, {12, 24}, {5, 18}, {13}, {7, 23}, {8}, {12}, {3, 27}, {2, 12}, {5},
                {2, 9}, {13, 4}, {8, 18}, {1, 7}, {6}, {9, 29}, {8, 21}, {5}, {6, 30}, {1, 12},
                {10}, {4, 15}, {7, 22}, {11, 26}, {8, 17}, {9, 29}, {5}, {3, 4}, {11, 30}, {12},
                {4, 29}, {3}, {9}, {6}, {3, 4}, {1}, {10}, {3, 29}, {10, 28}, {1, 20}, {11, 13},
                {3}, {3, 12}, {3, 8}, {10, 9}, {3, 26}, {8}, {7}, {5}, {13, 17}, {2, 27},
                {11, 15}, {12}, {9, 19}, {2, 15}, {3, 16}, {1}, {12, 17}, {9, 1}, {6, 19},
                {4}, {5}, {5}, {8, 1}, {11, 7}, {5, 2}, {9, 28}, {1}, {2, 2}, {7, 4}, {4, 22},
                {7, 24}, {9, 26}, {13, 28}, {11, 26}
        };

        for (int[] operation : operations) {
            if (operation.length == 2) {
                int key = operation[0];
                int value = operation[1];
                lruCache.put(key, value);
            } else if (operation.length == 1) {
                int key = operation[0];
                int value = lruCache.get(key);
            }

            System.out.println(lruCache);
        }

    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
