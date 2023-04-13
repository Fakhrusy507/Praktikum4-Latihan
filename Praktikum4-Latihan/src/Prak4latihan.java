import java.util.HashMap;
import java.util.Scanner;

public class Prak4latihan {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Prak4latihan(String nama, String kelas, String mat, int nim){
        this.nama = nama;
        this.kelas = kelas;
        this.matkulPraktikum = mat;
        this.nim = nim;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Prak4latihan> hMap = new HashMap<>();
        String user_input;
        Prak4latihan data;

        hMap.put("1", new Prak4latihan("Fakhrusy", "3A", "Struktur Data", 2020445));
        hMap.put("2", new Prak4latihan("Syuyukh", "3B", "Basis Data", 2021445));
        hMap.put("3", new Prak4latihan("FS", "3C", "Pemrograman Lanjut", 2022445));

        System.out.print("Masukkan ID: ");
        user_input = input.nextLine();
        data = hMap.get(user_input);

        if (data != null){
            System.out.println("Data Mahasiswa: "+data.nama+", kelas: "+data.kelas+", matkul: "+data.matkulPraktikum +
                    ", nim: "+data.nim);
        }
    }
}