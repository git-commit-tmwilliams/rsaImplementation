package rsa_sim;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Marleigh Williams
 * Jamie Leary
 * @author ElizabethReed PC
 */
public class Keys { //superclass
    
    // key generator 
    
    Keys(){
        
    }
            
//    public boolean isPrime(){
//        
//    }
    Random randomNumbers = new Random();
    
    private int p(){
//        int p = randomNumbers.nextInt(100); //change to random prime later
        int p = 7;
        return p;
    }
    
    private int q(){
//        int q = randomNumbers.nextInt(100); //change to random prime later
        int q = 13;
        return q;
    }
    
     public int n(){
//        int pVal = p();
        int n = p()* q();
        return n;
    }
    
      public int e(int n){

        int middleman = (p()-1)*(q()-1);
        
        //two numbers e and middleman must be coprime, need to check later
        int e = randomNumbers.nextInt(middleman) + 1; //e must fall between 1 and middleman
        e = 5; //for debugging
        return e;
       
    }
}
