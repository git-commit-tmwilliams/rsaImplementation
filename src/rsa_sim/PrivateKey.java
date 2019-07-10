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
public class PrivateKey extends Keys{ //extend keys
    
    Keys key1;
    
    PrivateKey(){
        int d;
    }
    
    PrivateKey(Keys input){
        input = key1;
        int d;
    }
    
    int d(int e, int n){
        //use extended euclidean algorithm for ed = 1 mod (p − 1)(q − 1)
        int d = 29; //change later to include calcuation method
        return d;
    }
    
}
