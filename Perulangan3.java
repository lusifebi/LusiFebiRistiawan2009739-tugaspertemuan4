/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perulangan;

import java.util.Scanner;

/**
 *
 * @author Lusi Febi Ristiawan
 */
public class Perulangan3 {
    public static void main(String[] args){
        int N;
        int i;
        int j;
        
        Scanner data = new Scanner(System.in);
        
        System.out.println("Masukkan N: ");        
        N = data.nextInt();
        
        if(N != 0 && N <= 1000){
            for(i =1; i <= N; i++){
                for(j = 1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
