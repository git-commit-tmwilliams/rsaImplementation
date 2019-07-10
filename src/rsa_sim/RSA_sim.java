/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa_sim;

/**
 * Marleigh Williams
 * Jamie Leary
 * @author ElizabethReed PC
 */
public class RSA_sim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Encrypter EN = new Encrypter(); //eventually want to pass in keys
        Decrypter DC = new Decrypter();
        
        char randomChar = 'a';
        int asciival = EN.ascii2int(randomChar);
        char answer = DC.int2ascii(asciival);
        
        System.out.println("The ascii value for " + randomChar + " is " + asciival);
        System.out.println("The character corresponding to the ascii value " + asciival + " is " + answer);
    }
    
}
