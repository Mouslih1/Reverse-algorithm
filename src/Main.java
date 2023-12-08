import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("marouane");
        names.add("oussama");
        names.add("ziad");

        // Reverse arraylist of string
        ArrayList<String> newNames = reverseStringArrayList(names);
        System.out.println(newNames);

        // Reverse string
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();
        reverseString(nom);

        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);

        // Reverse arraylist of int
        ArrayList<Integer> newN = reverseIntArrayList(n);
        System.out.println(newN);
    }

    public static void reverseString(String nom)
    {
        StringBuilder nomReverse = new StringBuilder(" ");
        for(int i = 0 ; i < nom.length();i++)
        {
            //System.out.print(nom.charAt(nom.length()-i-1));
            nomReverse.insert(0, nom.charAt(i));
        }
        System.out.println(nomReverse);
    }

    public static ArrayList<String> reverseStringArrayList(ArrayList<String> names)
    {
        ArrayList<String> result = new ArrayList<String>();
        for (int i = names.size()-1 ; i >= 0 ; i--)
        {
            result.add(names.get(i));
        }

        return result;
    }

    public static ArrayList<Integer> reverseIntArrayList(ArrayList<Integer> nb)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = nb.size() - 1; i >= 0; i--)
        {
            result.add(nb.get(i));
        }

        return result;
    }
}