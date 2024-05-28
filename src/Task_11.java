import java.util.Scanner;
public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово: ");
        String word = scanner.nextLine();

        boolean isMumbaYumba = checkMumbaYamba(word);
        if (isMumbaYamba) {
            System.out.println("Cлово принадлежит языку Мумба- Юмба.");
        } else {
            System.out.println("Cлово  не принадлежит языку Мумба- Юмба.");
        }

    }

    public static boolean checMumbaYumba(String word) {
        if (word.contains("bb")) {
            return false;
        }
        for (int i = 0;i < word.length() - 2;i++) {
            if (word.charAt(i) == word.charAt(i + i) && word.charAt(i) == word.charAt(i + 2)) {
                return false;
            }
        }
        return true;
    }
}
boolean isMumbaYumba = checMumbaYumba
    }
}
