import java.util.*;

 // Compiler version JDK 11.0.2

 class Pattern
 {
   public static void main(String args[])
   { 
    int n = 9;
    
    //outer loop
    for(int i=1; i<=n; i++) {
      for(int j=1; j<=i; j++) {
        System.out.print(j+" ");    
      }
      System.out.println();
    }
   }
 }
