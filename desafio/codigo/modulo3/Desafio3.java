package desafio.codigo.modulo3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Desafio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numTotal = scan.nextInt();
        int numFigCompradas = scan.nextInt();

        Set<Integer> setFig = new HashSet<>();

        for ( int i = numFigCompradas ; i > 0 ; i-- ) {
            setFig.add(scan.nextInt());
        }

        scan.close();       
        
        System.out.println(numTotal - setFig.size());
    }
}