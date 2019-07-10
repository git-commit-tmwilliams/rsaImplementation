package rsa_sim;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Jamie!
 * Marleigh
 * @author ElizabethReed PC
 */
public class Encrypter {
    
    PublicKey PublicK = new PublicKey(); //need e and n values to encrypt

    public int ascii2int(char a){
        int b = (int) a;
        return b;
    }
    
    public char int2ascii(int b){ //convert random number back to ascii
        char a = (char) b;
        return a;
    }
   
    public StringBuilder toBase256(int middleman, int new_base){
        
        StringBuilder sb = new StringBuilder();
        new_base = 256;
        
         //divide method
        int remainder = middleman % new_base;
        char asciiRemainder = int2ascii(remainder);
        
        int semi_quotient = (middleman - remainder) / new_base;
        
         while (semi_quotient != 0) {

            remainder = semi_quotient % new_base; // until your semi quotient reaches zero
            asciiRemainder = int2ascii(remainder);
            sb.append(asciiRemainder); // add to stringbuilder
            
            semi_quotient = (semi_quotient - remainder) / new_base;

        }
            return(sb.reverse());
    }
     
    public int cipherInt(StringBuilder toBase256){ //change later
        int newNum = 0;
        return newNum;
    }
   
    
    public void encrypt(PublicKey PK, int plaintext){ //pass in the public key values and 
        //Ciphertext = Plaintext * e mod n
        int n = PK.n();
        int e = PK.e(n);
        int ciphertext = (plaintext * e) % n;
    }
   
}
