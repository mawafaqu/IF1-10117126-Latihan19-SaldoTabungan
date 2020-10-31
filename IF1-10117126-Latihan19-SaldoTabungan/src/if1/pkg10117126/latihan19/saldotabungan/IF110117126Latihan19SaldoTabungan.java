/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117126.latihan19.saldotabungan;

/**
 *
 * @author NAMA : Mawa Faqu Rochman 
 * KELAS: IF-1
 * IF-1 NIM : 10117126 
 * Deskripsi program: Program penghitungan saldo tabungan.
 */
public class IF110117126Latihan19SaldoTabungan {

    static int saldoAkhir;

    static void hitung(int a, int b) {
        saldoAkhir = (a + (a * b / 100));
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        int saldoAwal = 2500000;
        double bunga = 0.15;
        int saldoBulanan;

        do {
            saldoBulanan = (int) (bunga * saldoAwal);
            saldoAwal = (saldoAwal + saldoBulanan);
            System.out.println("Saldo di bulan ke- " + i + " Rp " + saldoAwal);
            i++;
        } while (i <= 6);
    }

}
