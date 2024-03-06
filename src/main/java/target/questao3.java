
package target;

import java.util.Scanner;

public class questao3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe uma palavra:");
        String palavra = scan.nextLine();
        int tam=palavra.length();
        
        for(int i=0; i<=palavra.length(); i++){
            System.out.print(palavra.charAt(tam - 1));
            tam--;
        }
    }
}
