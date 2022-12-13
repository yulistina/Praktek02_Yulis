/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02_yulis;

/**
 *
 * @author HP 14-an017AU
 */
public class RectangleAksi {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.panjang = 9;
        r1.lebar= 3;
        
        r1.cetakinfo();
        System.out.println("Luas rectangle "+r1.hitungLuas());
        r1.cetakLuas();
        
        Rectangle r2 = new Rectangle();
        r2.cetakinfo();
        
        Rectangle r3 = new Rectangle(50,30);
        r3.cetakinfo();
        
    }
}
