/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

import java.util.ArrayList;

/**
 *
 * @author mtret
 */
public class Gcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(gcdPrimeFactors(70, 60) == gcdEuclidian(70, 60));
    }
    
    public static int gcdPrimeFactors(int a, int b){
        ArrayList<Integer> listA = new ArrayList<Integer>();
        ArrayList<Integer> listB = new ArrayList<Integer>();
        ArrayList<Integer> listSame = new ArrayList<Integer>();
        
        for(int i = 2; i <= a; i++){
            if(a % i == 0){
                listA.add(i);
                a /= i;
            }
        }
        for(int i = 2; i <= b; i++){
            if(b % i == 0){
                listB.add(i);
                b /= i;
            }
        }
        for(Integer i : listA){
            if(listB.contains(i)){
                listSame.add(i);
            }
        }
        int sum = 1;
        for(Integer i : listSame){
            sum *= i;
        }
        return sum;
    }
    public static int gcdEuclidian(int a, int b){
        return a == 0 ? b : gcdEuclidian(a % b, a);
    }
    
}
