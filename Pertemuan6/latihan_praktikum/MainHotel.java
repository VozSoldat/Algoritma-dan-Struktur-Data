package Pertemuan6.latihan_praktikum;

public class MainHotel {
    public static void main(String[] args) {
        HotelService service = new HotelService();
        Hotel h[] = new Hotel[7];
        h[0] = new Hotel("Hotel ABC", "Surabaya", 200000, Byte.parseByte("5"));
        h[1] = new Hotel("Hotel DEF", "Semarang", 150000, Byte.parseByte("4"));
        h[2] = new Hotel("Hotel GHI", "Bandung", 500000, Byte.parseByte("3"));
        h[3] = new Hotel("Hotel JKL", "Bandung", 450000, Byte.parseByte("2"));
        h[4] = new Hotel("Hotel MNO", "Jakarta", 600000, Byte.parseByte("1"));
        h[5] = new Hotel("Hotel PQR", "Malang", 10000, Byte.parseByte("4"));
        h[6] = new Hotel("Hotel TUV", "Bogor", 300000, Byte.parseByte("1"));

        for (int i = 0; i < h.length; i++) {
            service.tambahHotel((h[i]));
        }
        
        System.out.println("Sebelum");
        service.tampilAll();

        System.out.println("--------------------");
        System.out.println("Sesudah asc bub");
        service.bubbleSortAscending();
        service.tampilAll();

        System.out.println("----------------------");
        System.out.println("Sesudah asc selection");
        service.selectionSortAscending();
        service.tampilAll();

        System.out.println("-----------------");
        System.out.println("Sesudah desc bub");
        service.bubbleSortDescending();
        service.tampilAll();

        System.out.println("-----------------");
        System.out.println("Sesudah desc selection");
        service.selectionSortDescending();
        service.tampilAll();


    }
}
