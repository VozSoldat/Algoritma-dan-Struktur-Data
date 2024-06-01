package Pertemuan14;

public class BinaryTreeMain18 {
    public static void main(String[] args) {
        BinaryTree18 bt = new BinaryTree18();
        // bt.add(6);
        // bt.add(4);
        // bt.add(8);
        // bt.add(3);
        // bt.add(5);
        // bt.add(7);
        // bt.add(9);
        // bt.add(10);
        // bt.add(15);

        bt.addRecursive(6);
        bt.addRecursive(4);
        bt.addRecursive(8);
        bt.addRecursive(3);
        bt.addRecursive(5);
        bt.addRecursive(7);
        bt.addRecursive(9);
        bt.addRecursive(10);
        bt.addRecursive(15);

        System.out.print("PreOrder Traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("inOrder Traversal: ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal: ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node: "+bt.find(5));
        
        // System.out.println("Delete Node 8 ");
        // bt.delete(8);
        
        System.out.println("");
        System.out.print("PreOrder Traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        // bt.addRecursive(9);
        System.out.print("InOrder Traversal: ");
        bt.traverseInOrder(bt.root);
        System.out.println("");

        System.out.print("Jumlah leaf: ");
        // bt.countLeaf(bt.root);
        System.out.println(bt.countLeaf(bt.root));
        System.out.println();

        // bt.printDataDiLeaves(bt.root);
    }
}
