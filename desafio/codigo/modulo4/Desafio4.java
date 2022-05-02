package desafio.codigo.modulo4;

import java.util.*;

public class Desafio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for(int i = 0; i < 100; i++){
            int numero = scan.nextInt();
            numeros.add(numero);
        }
        
        scan.close();
        
        Integer max = Collections.max(numeros);

        System.out.println(max);

        int position = numeros.indexOf(max) + 1;

        System.out.println(position);
    }
}