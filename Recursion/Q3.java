// Find the factorial of a number using recursion

package Recursion;

public class Q3 {

    public static void printFact(int n, int fact){
        if(n == 0){
            System.out.println(fact);
            return;
        }
        fact *= n;
        printFact(n-1, fact);
    }
    public static void main(String args[]){
        printFact(5, 1);
    }
}


// ouput

// 120