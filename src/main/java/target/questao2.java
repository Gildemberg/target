
package target;

import java.util.Scanner;

public class questao2 {

    public static boolean fibonacci(int num){
        int a=0, b=1;
        while(a<=num){
            if(a==num){
                return true;
            }
            System.out.print(a+",");
            int temp=a;
            a=b;
            b=temp+b;
        }
        return false;
    }
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número:");
        int num = scan.nextInt();
        if(fibonacci(num)){
            System.out.println(num+" pertence a sequência fibonacci");
        }else {
            System.out.println(num+" não pertence a sequência fibonacci");
        }
    }
    
}
