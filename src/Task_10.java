import java.util.Scanner;
public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String input = scanner.nextLine();
        int lenght = input.length();

        if(lenght > 50) {
            throw new RuntimeException("Максимальная длина строки - 50 символов.");
        }

        if (i = 0); i < lenght; i++) {
            for (int j = 0;j < lenght - i - 1 ;j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.println(input.charAt(j));
            }
            System.out.println();
    }
}
