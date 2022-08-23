import java.util.Scanner;

public class SimplifiedForIndex {
    public static void main(String[] args) {
        String[] list = {"One", "Two", "Three"};
        int i = 0;
        for (String s : list) {
            System.out.println(s + " is at index " + i++);
            //System.out.println("Elementul de pe pozitia " + i + " este " + s);
            //i++;
            //first change
        }

        int[] daysOfWeek = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(daysOfWeek[3]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String line =   scanner.nextLine();
        System.out.println(line + " had been read");
    }
}