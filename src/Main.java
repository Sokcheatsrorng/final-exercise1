import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] oldItems = new int[10];
        for (int i = 0; i < 10; i++) {
            oldItems[i] = i + 10;
        }
        int[] newItems = new int[20];
        System.arraycopy(oldItems, 0, newItems, 0, 10);
        oldItems = newItems;
        System.out.println("1. Input Number");
        System.out.println("2. Output Number");
        System.out.println("3. Exit");
        System.out.print("Choose the option: ");
        int opt = new Scanner(System.in).nextInt();
        switch (opt) {
            case 1 -> {
                Scanner scanner = new Scanner(System.in);
                for (int j : newItems) {
                    System.out.print("Enter number : ");
                    Integer number = scanner.nextInt();
                    newItems[j] = number;
                    if (newItems[j] < 0) {
                        break;
                    }
                }
            }
            case 2 -> {
                for (int j : newItems) {
                    System.out.println("Number : "+j);
                }
            }
            case 3 ->{
                System.exit(0);
            }
            default -> System.out.println("Invailed Option!");
        }
    }
}