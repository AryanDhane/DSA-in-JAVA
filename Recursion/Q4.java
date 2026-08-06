package Recursion;

public class Q4 {
    
    public static void printFib(int a, int b, int n){
        if(n == 0){
            return;
        }
        System.out.println(a);
        printFib(a+b,b,n-1);
    }
public static void main(String args[]){
    printFib(0, 1, 5);
}

}
