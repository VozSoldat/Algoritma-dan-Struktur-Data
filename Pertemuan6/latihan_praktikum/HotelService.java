package Pertemuan6.latihan_praktikum;

public class HotelService {
    Hotel room[] = new Hotel[7];
    int idx;

    void tambahHotel(Hotel h){
        if(idx<room.length){
            room[idx] = h;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll(){
        for ( Hotel h : room){ 
            if (h != null) { // Memeriksa apakah objek Hotel tidak null
                h.tampil();
                System.out.println("___________________________");
            }
        }
        
    }

    void bubbleSortAscending(){
        for (int i = 0; i < room.length-1; i++) {
            for (int j = 1; j < room.length-i; j++) {
                if (room[j].harga < room[j-1].harga) {
                    Hotel tmp = room[j];
                    room[j] = room[j-1];
                    room[j-1] = tmp;
                }
            }
        }
    }

    void bubbleSortDescending(){
        for (int i = 0; i < room.length-1; i++) {
            for (int j = 1; j < room.length-i; j++) {
                if (room[j].bintang > room[j-1].bintang) {
                    Hotel tmp = room[j];
                    room[j] = room[j-1];
                    room[j-1] = tmp;
                }
            }
        }
    }

    void selectionSortAscending(){
        for (int i = 0; i < room.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < room.length; j++) {
                if (room[j].harga < room[idxMin].harga) {
                    idxMin = j;
                }
            }
            Hotel tmp = room[idxMin];
            room[idxMin] = room[i];
            room[i] = tmp;
        }
    }

    void selectionSortDescending(){
        for (int i = 0; i < room.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < room.length; j++) {
                if (room[j].bintang > room[idxMin].bintang) {
                    idxMin = j;
                }
            }
            Hotel tmp = room[idxMin];
            room[idxMin] = room[i];
            room[i] = tmp;
        }
    }

    void selectionSort(){

    }

}
