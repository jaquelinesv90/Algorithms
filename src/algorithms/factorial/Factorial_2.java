package algorithms.factorial;

public class Factorial_2 { 
  
    int factorial(int n) 
    { 
  
        // single line to find factorial 
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1); 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        Factorial_2 obj = new Factorial_2(); 
        int num = 5; 
        System.out.println( 
            "Factorial of " + num 
            + " is " + obj.factorial(num)); 
    } 
} 
  
// This code is contributed by Anshika Goyal. 

