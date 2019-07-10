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
public class Decrypter {
    
    PrivateKey PrivateK = new PrivateKey(); //need d and n values
    
    
     public char int2ascii(int b){ //convert random number back to ascii
        char a = (char) b;
        return a;
    }
     
     public void decrypt(PrivateKey PK, int ciphertext){ //pass in private key
         //Plaintext = Ciphertext * d mod n
         int n = PK.n();
         int e = PK.e(n);
         int d = PK.d(e,n);
         int plaintext = (ciphertext * d) % n; //ascii values
         
     }
         
}
