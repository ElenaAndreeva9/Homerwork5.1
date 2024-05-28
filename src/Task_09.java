import java.util.Scanner;
public class Task_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя переменной: ");
        String variable = scanner.nextLine();
        if (isJavaFormat(variable)) {
            String cppFormat = convertToCpp(variable);
            System.out.println("Переменная в формате С++: " + cppFormat);
        } else if (isCppFormat(variable)) {
            String javaFormat = convertToJava(variable);
            System.out.println("Переменная в формате Java: " + javaFormat);
        } else {
            System.out.println("Неверный формат переменной!");
        }
    }





    public class Main {
        public static void main(String[] args) {
        }

        public static boolean isJavaFormat(String variable){
            if (variable.length() == 0) return false;
            if (!Character.isLowerCase(variable.charAt(0))) return false;
            for (int = 1;i < (variable.length();i++) {
                if (i == variable.length() - 1 || !Character.isLowerCase(variable.charAt(i + 1))) {
                    return  false;
                }
            }
        }
            return true;
    }
}

    }
}
