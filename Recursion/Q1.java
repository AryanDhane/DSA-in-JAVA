package Recursion;

public class Q1 {

    public static void printNum(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNum(n - 1);
    }
    public static void main(String[] args) {
        printNum(5);       
    }
}


// output:

// 5
// 4
// 3
// 2
// 1