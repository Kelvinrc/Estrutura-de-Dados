/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fun.with.sequences;

import java.util.Scanner;

/**
 *
 * @author ph
 */
public class FunWithSequences {

    public static int compara(int c, int[] f) {
        int aux = 500;
        for (int h = 0; h < f.length; h++) {
            if (c == f[h]) {
                return 500;
            }
            if (c != f[h]) {
                aux = c;
            }

            if ((h == f.length) && (aux == c)) {

                return aux;

            }
        }
        return aux;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int[] ls1;
        int[] ls2;
        

        n1 = sc.nextInt();
        ls1 = new int[n1];
        for (int i = 0; i < n1; i++) {

            ls1[i] = sc.nextInt();

        }
        n2 = sc.nextInt();
        ls2 = new int[n2];
        for (int j = 0; j < n2; j++) {

            ls2[j] = sc.nextInt();

        }
        
        int k = 0;
        int aux;
        for (int c = 0; c < n1; c++) {
            compara(ls1[c], ls2);

            if (compara(ls1[c], ls2) != 500) {
                
                System.out.print(compara(ls1[c], ls2)+ " ");
                k++;
            }
        }
    }
}
