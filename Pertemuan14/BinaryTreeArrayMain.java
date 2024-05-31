package Pertemuan14;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray18 bta = new BinaryTreeArray18();
        int[] data = {6, 4, 8, 3, 5, 7, 9,0, 0, 0};
        // int[] data = {0, 1, 2, 3, 4, 5,6};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");

        System.out.print("PreOrder Traversal : ");
        bta.traversePreorder(0);
        System.out.println();

        System.out.print("PostOrder Traversal : ");
        bta.traversePostorder(0);
    }


}
