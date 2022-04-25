import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String T = scan.nextLine();

        String respostasCompetidores = scan.nextLine();

        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");

        int count = 0;

        for ( int i = 0 ; i < respostasCompetidoresSplit.length ; i++ ) {
            if ( respostasCompetidoresSplit[i].compareTo(T) == 0 )
                count++;
        }

        System.out.println( count );
    }
}