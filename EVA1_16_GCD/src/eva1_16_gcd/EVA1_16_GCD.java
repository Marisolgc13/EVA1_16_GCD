/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_gcd;

/**
 *
 * @author Marisol G
 */
public class EVA1_16_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code applicati,on logic here
        System.out.println("MCD 180,48:" + gcd(48, 180));
    }

    public static int gcd(int nume, int divi) {
        if (divi == 0) {
            return nume;
        } else {
            int resi = nume % divi;
            return gcd(divi, resi);
        }
    }
}
