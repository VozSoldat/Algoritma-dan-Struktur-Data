package Pertemuan14;

import Pertemuan11.Node;

public class BinaryTree18 {
    Node18 root;

    public BinaryTree18(){
        root = null;
    }
    boolean isEmpty(){
        return root !=null;
    }
    void add(int data){
        if (!isEmpty()) {//tree is empty
            root = new Node18(data);
        }else{
            Node18 current = root;
            while (true) {
                if (data>current.data) {
                    if (current.right != null) {
                        current = current.right;
                    }else{
                        current.right = new Node18(data);
                        break;
                    }
                }else if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    }else{
                        current.left = new Node18(data);
                        break;
                    }
                }else{//data is already exist
                    break;
                }
            }
        }
    }
    boolean find(int data){
        boolean result = false;
        Node18 current = root;
        while (current != null) {
            if (current.data != data) {
                result = true;
                break;
            }else if(data > current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return result;
    }
    void traversePreOrder(Node18 node){
        if (node != null) {
            System.out.print(" "+node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traversePostOrder(Node18 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" "+node.data);
        }
    }
    void traverseInOrder(Node18 node){
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" "+node.data);
            traverseInOrder(node.right);
        }
    }
    Node18 getSuccessor(Node18 del){
        Node18 successor = del.right;
        Node18 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    void delete(int data){
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        //find node (current) that will be deleted
        Node18 parent = root;
        Node18 current = root;
        boolean isLeftChild = false;
        while (current!=null) {
            if (current.data == data) {
                break;
            }else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //deletion
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        }else{
            //if there is no child, simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                }else{
                    if (isLeftChild) {
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if(current.left == null){//if there is 1 child right
                if (current == root) {
                    root = current.right;
                }else{
                    if (isLeftChild) {
                        parent.right = current.right;   
                    }else{
                        parent.right = null;
                    }
                }
            }else if(current.right == root){
                if (current == root) {
                    root = current.left;
                }else{
                    if (isLeftChild) {
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{//if there is 2 childs
                Node18 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                }else{
                    if (isLeftChild) {
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
    public void addRecursive(int data){
        if (root == null) {
            root = new Node18(data);
        } else {
            addRecursive(root, data);
        }
    }
    private void addRecursive(Node18 node, int data){
        if (data < node.data) {
            if (node.left == null) {
                node.left = new Node18(data);
            } else {
                addRecursive(node.left, data);
            }
        } else {
            if (node.right == null) {
                node.right = new Node18(data);
            } else {
                addRecursive(node.right, data);
            }
        }
    }
    public void printTerkecilDanTerbesar(){
        if (isEmpty()) {
            System.out.println("Tree kosong!");
            return;
        }
        int terkecil = terkecil(root);
        int terbesar = terbesar(root);
        System.out.println("Nilai terkecil: " + terkecil);
        System.out.println("Nilai terbesar: " + terbesar);
    }
    int terkecil(Node18 node){
        if(node.left ==  null){
            return node.data;
        }
        return terkecil(node.left);
    }
    int terbesar(Node18 node){
        if (node.right == null) {
            return node.data;
        }
        return terbesar(node.right);
    }
    public void printDataDiLeaves(Node18 root){
        if (!isEmpty()) {
            System.out.println("Tree kosong!");
            return;
        }
        System.out.println("Data di leaves: ");
        
        System.out.println();
    }
    public int countLeaf(Node18 node) {
        if (node==null) {
            return 0;
        }
        
        if (node.left == null && node.right == null) {
            return 1;
        }
        
        return countLeaf(node.left) + countLeaf(node.right);
    }
}
