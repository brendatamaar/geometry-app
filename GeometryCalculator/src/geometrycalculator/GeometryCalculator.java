package geometrycalculator;

import java.util.Scanner;

public class GeometryCalculator {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeometryCalculator g = new GeometryCalculator();
        g.main();
    }
    
    public void main(){
        int menu;
        System.out.println("-------APLIKASI KALKULATOR GEOMETRI-------\n");
        System.out.println("Selamat datang, silahkan pilih salah satu menu:\n");
        System.out.println("1. Hitung Luas Persegi\n");
        System.out.println("2. Hitung Keliling Persegi\n");
        System.out.println("3. Hitung Luas Persegi Panjang\n");
        System.out.println("4. Hitung Keliling Persegi Panjang\n");
        System.out.println("5. Hitung Luas Segitiga\n");
        System.out.println("6. Hitung Keliling Segitiga\n");
        System.out.println("7. Hitung Luas Lingkaran\n");
        System.out.println("8. Hitung Keliling Lingkaran\n");
        System.out.println("9. Hitung Volume Kubus\n");
        System.out.println("10. Hitung Volume Balok\n");
        System.out.println("11. Hitung Volume Tabung\n");
        System.out.println("12. Hitung Volume Kerucut\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("masukan angka menu: \n\n");
        menu = sc.nextInt();
        
        switch (menu) {
            case 1:
                {
                    int sisi;
                    //persegi
                    System.out.println("masukan sisi: \n\n");
                    sisi = sc.nextInt();
                    LuasPersegi(sisi);
                    break;
                }
            case 2:
                {
                    int sisi;
                    //persegi
                    System.out.println("masukan sisi: \n\n");
                    sisi = sc.nextInt();
                    KelilingPersegi(sisi);
                    break;
                }
            case 3:
                {
                int panjang, lebar;
                //persegi panjang
                System.out.println("masukan panjang: \n\n");
                panjang = sc.nextInt();
                System.out.println("masukan lebar: \n\n");
                lebar = sc.nextInt();
                KelilingPersegiPanjang(panjang, lebar);
                break;
                }
            case 4:
                {
                int panjang, lebar;
                //persegi panjang
                System.out.println("masukan panjang: \n\n");
                panjang = sc.nextInt();
                System.out.println("masukan lebar: \n\n");
                lebar = sc.nextInt();
                LuasPersegiPanjang(panjang, lebar);
                break;
                }
            case 5:
                {
                int alas, tinggi;
                //persegi panjang
                System.out.println("masukan alas: \n\n");
                alas = sc.nextInt();
                System.out.println("masukan tinggi: \n\n");
                tinggi = sc.nextInt();
                LuasSegitiga(alas, tinggi);
                break;
                }
            case 6:
                {
                int sisi1, sisi2, sisi3;
                //persegi panjang
                System.out.println("masukan sisi 1: \n\n");
                sisi1 = sc.nextInt();
                System.out.println("masukan sisi 2: \n\n");
                sisi2 = sc.nextInt();
                System.out.println("masukan sisi 3: \n\n");
                sisi3 = sc.nextInt();
                KelilingSegitiga(sisi1, sisi2, sisi3);
                break;
                }
            case 7:
                {
                int radius;
                //lingkaran
                System.out.println("masukan jari-jari: \n\n");
                radius = sc.nextInt();
                KelilingLingkaran(radius);
                break;
                }
             case 8:
                {
                int radius;
                //lingkaran
                System.out.println("masukan jari-jari: \n\n");
                radius = sc.nextInt();
                LuasLingkaran(radius);
                break;
                }
             case 9:
                {
                int sisi;
                //lingkaran
                System.out.println("masukan sisi: \n\n");
                sisi = sc.nextInt();
                VolumeKubus(sisi);
                break;
                }
             case 10:
                {
                int panjang, lebar, tinggi;
                //lingkaran
                System.out.println("masukan panjang: \n\n");
                panjang = sc.nextInt();
                System.out.println("masukan lebar: \n\n");
                lebar = sc.nextInt();
                System.out.println("masukan tinggi: \n\n");
                tinggi = sc.nextInt();
                VolumeBalok(panjang, lebar, tinggi);
                break;
                }
             case 11:
                {
                int radius, tinggi;
                System.out.println("masukan jari-jari: \n\n");
                radius = sc.nextInt();
                System.out.println("masukan tinggi: \n\n");
                tinggi = sc.nextInt();
                VolumeTabung(radius, tinggi);
                break;
                }
             case 12:
                {
                int radius, tinggi;
                System.out.println("masukan jari-jari: \n\n");
                radius = sc.nextInt();
                System.out.println("masukan tinggi: \n\n");
                tinggi = sc.nextInt();
                VolumeKerucut(radius, tinggi);
                break;
                }
            default:
                break;
        }
    }
    
    public void LuasPersegi(int sisi) {
        int hasil = sisi*sisi;
        System.out.println("Hasil perhitungan luas persegi: "+hasil);
    }
    
    public void KelilingPersegi(int sisi) {
        int hasil = 4*sisi;
        System.out.println("Hasil perhitungan keliling persegi: "+hasil);
    }
    
    public void LuasPersegiPanjang(int panjang, int lebar) {
        int hasil = panjang*lebar;
        System.out.println("Hasil perhitungan luas persegi panjang: "+hasil);
    }
    
    public void KelilingPersegiPanjang(int panjang, int lebar) {
        int hasil = (panjang+lebar)*2;
        System.out.println("Hasil perhitungan keliling persegi panjang: "+hasil);
    }
    
    public void LuasSegitiga(int alas, int tinggi) {
        int hasil = (alas*tinggi)/2;
        System.out.println("Hasil perhitungan luas segitiga: "+hasil);
    }
    
    public void KelilingSegitiga(int sisi1, int sisi2, int sisi3) {
        int hasil = sisi1+sisi2+sisi3;
        System.out.println("Hasil perhitungan keliling segitiga: "+hasil);
    }
    
    public void LuasLingkaran(int radius) {
        double hasil = Math.PI * (radius * radius);
        System.out.println("Hasil perhitungan luas lingkaran: "+hasil);
    }
    
    public void KelilingLingkaran(int radius) {
        double hasil = Math.PI * 2 * radius;
        System.out.println("Hasil perhitungan keliling persegi: "+hasil);
    }
    
    public void VolumeKubus(int sisi) {
        int hasil = sisi*sisi*sisi;
        System.out.println("Hasil perhitungan volume kubus: "+hasil);
    }
    
    public void VolumeBalok(int panjang, int lebar, int tinggi) {
        int hasil = panjang*lebar*tinggi;
        System.out.println("Hasil perhitungan volume balok: "+hasil);
    }
    
    public void VolumeKerucut(int radius, int tinggi) {
        double hasil = ((Math.PI * (radius * radius)) * tinggi)/3;
        System.out.println("Hasil perhitungan volume tabung: "+hasil);
    }
    
    public void VolumeTabung(int radius, int tinggi) {
        double hasil = (Math.PI * (radius * radius)) * tinggi;
        System.out.println("Hasil perhitungan volume tabung: "+hasil);
    }
    
}

