import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Forest> forestList = new ArrayList<Forest>();


       for (int i = 0; i < 4; i++) {

            System.out.print("Podaj nazwe drzewa: ");


            String a = scan.nextLine();
            Forest las = new Forest(i,a);
            forestList.add(las);

        }

        for (Forest x : forestList) {

            x.printForest();

        }




    }
}
