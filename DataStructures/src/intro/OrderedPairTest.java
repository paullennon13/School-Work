package intro;

import java.util.Scanner;

public class OrderedPairTest {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print ("Who is the head of household? ");
        String boss = input.nextLine();
        System.out.print ("Who is dependent? ");
        String dependent = input.nextLine();
        System.out.print ("What implementation to use ? (1 for pair, 2 for array, 3 for chain) ");
        OrderedPairInterface <String> couple = null;

        switch (input.nextInt() ) {
            case 1:
                couple = new OrderedPair <>(boss, dependent);
                break;
            case 2:
                couple = new OrderedPairArr <>(boss, dependent);
                break;
            case 3:
                couple = new OrderedChain <> (boss, dependent);
                break;
            default:
                System.exit(0);
        }

        System.out.println ("Boss is " + couple.getFirst() + ", dependent is " + couple.getSecond());
        OrderedPairInterface <String> copied = couple.copy();

        System.out.println (couple.equals(copied) ? "copied is the same":"copy failed");
        couple.swap();
        System.out.print ("After reverse: ");
        System.out.println ("Boss is " + couple.getFirst() + ", dependent is " + couple.getSecond());

      //  String cs = couple.toString();
        System.out.println ("The new couple is " + couple) ;
        System.out.println (couple.equals(copied) ? "copied is the same":"copy failed"); ;
        input.close();
    }
}