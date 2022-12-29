public class Main{
    public static void main(String[] args){
        BangunRuang bangunruang = new BangunRuang();
        bangunruang.volume();
        bangunruang.keliling();

        System.out.println("");

        Balok balok = new Balok();
        balok.panjang = 14;
        balok.lebar = 8;
        balok.tinggi = 6;
        balok.hasilkeliling();
        balok.hasilvolume();
        
        Kubus kubus = new Kubus();
        kubus.sisi = 7;
        kubus.hasilkeliling();
        kubus.hasilvolume();
        
        Tabung tabung = new Tabung();
        tabung.tinggi = 10;
        tabung.jarijari = 6;
        tabung.hasilkeliling();
        tabung.hasilvolume();
    }
}