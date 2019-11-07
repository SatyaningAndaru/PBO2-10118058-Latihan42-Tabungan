/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan42.tabungan;
import java.util.Scanner;
/**
 *
 * @author user
 */
class Tabungan {
    private int saldo;
    
    Scanner input= new Scanner(System.in);

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
 
    public int ambilUang(int jumlah){
        
        System.out.print("Jumlah Uang Yang Diambil : Rp. ");
        jumlah=input.nextInt();
        int sisa = saldo -jumlah;
        System.out.println("Saldo Anda Sekarang : Rp. " +sisa);
        return sisa;
    }

    public Tabungan(int saldo) {
        System.out.print("Masukan Saldo Awal: Rp. ");
        saldo=input.nextInt();
        this.saldo = saldo;
    }
    
}
