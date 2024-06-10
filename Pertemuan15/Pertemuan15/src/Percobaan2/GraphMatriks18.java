package Percobaan2;

public class GraphMatriks18 {
    int vertex;
    int[][] matriks;

    public GraphMatriks18(int v){
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak){
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan){
        matriks[asal][tujuan] = -1;
    }

    public void printGraph(){
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung "+ (char)('A'+ i)+ ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung "+ (char)('A'+j)+ " ("+ matriks[i][j]+ " m), ");
                }
            }
            System.out.println();
        }
    }

    public int inDegree(int asal){
        int total=0;
        for (int i = 0; i < matriks.length; i++) {
            if (matriks[asal][i] != 0) {
                total++;
            }
            i++;
        }
        return total;
    }

    public int outDegree(int asal){
        int total=0;
        for (int i = 0; i < matriks.length; i++) {
            if (matriks[i][asal] != 0) {
                total++;
            }
            i++;
        }
        return total;
    }
    public int degree(int asal){
        
        return inDegree(asal) + outDegree(asal);
    }

    public boolean cekEdge(int asal, int tujuan){
        return matriks[asal][tujuan] != 0;
    }
}
