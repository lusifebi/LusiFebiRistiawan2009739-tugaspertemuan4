/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perulangan;

import java.util.Scanner;

/**
 *
 * @author Lusi Febi Ristiawan
 */
public class Perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bilangan; 
        
        Scanner data = new Scanner(System.in);
        System.out.println("Masukkan bilangan: ");
        bilangan = data.nextInt();
        
        if (bilangan > 999){
            System.out.println("Ribuan");
        }
        else {
            System.out.println("Buka Ribuan");
        }

    }
    
}





