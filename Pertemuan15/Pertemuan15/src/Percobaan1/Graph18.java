package Percobaan1;
public class Graph18 {
    int vertex;
    DoubleLinkedLists list[];

    public Graph18(int v){
        vertex = v;
        list = new DoubleLinkedLists[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedLists();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
        // list[asal].addLast(tujuan, jarak);
    }
    
    // list[tujuan].addFirst(asal, jarak);

    public void degree(int asal) throws Exception{
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            //inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            //outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' +asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' +asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' +asal) + ": " + (totalIn + totalOut));

        
        //System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + list[asal].size());
    }

    public void removeEdge(int asal, int tujuan) throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdge(){
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
    }

    public void printGraph()throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean cekEdge(int asal, int tujuan) throws Exception{
        if (list[asal].getByData(tujuan) !=-1) {
            return true;
        }else{
            return false;
        }
    }

    public void updateJarak(int asal, int tujuan, int jarak) throws Exception{
        list[asal].updateData(tujuan, jarak);
    }

    public void hitungEdge() throws Exception{
        System.out.print("Total edge: ");
        int edge=0;
        for (int i = 0; i < list.length; i++) {
            Node18 current = list[i].head;
            while (current != null) {
                current.data = current.jarak;
                current = current.next;
                edge++;
            }
            
        }
        System.out.println(edge);
    }



} 