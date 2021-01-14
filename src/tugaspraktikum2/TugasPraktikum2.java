/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum2;

/**
 *
 * @author Yuliana
 */
public class TugasPraktikum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,l;
        l=4; //untuk tinggi segitiga
        
        for(i=0; i<=l; i++){ //untuk menentukan tinggi dari segitiga
            for (j=0; j<i; j++){ //untuk membuat kolom kesamping kanan dan mencetak "@"
                System.out.print("@");
            }
            System.out.println("");
        }
       
    }
}
