public class Task_08 {
    public static void main(String[] args) {




        public static String convertToCpp(String variable) {
            StringBuilder result = new StringBuilder();
            for (int = 0; i < (variable.length(); i++) {
                if (Character.isLowerCase(variable.charAt(i))) {
                    result.append(Character.isLowerCase(variable.charAt(i)));

                } else {
                    result.append(variable.charAt(i));
                }
            }
            return result.toString()
        }
    }

    public static String convertToJava(String variable) {
        StringBuilder result =new StringBuilder();
        boolean nextUpperCase = false;
        for (int = 0; i < variable.length(); i++) {
            if (variable.charAt(i) == '_') {
                nextUpperCase = true;

            } else {
                if (nextUpperCase) {
                    result.append(Character.toUpperCase(variable.charAt(i)));
                    nextUpperCase = false;
                } else {
                    if (i == 0) {
                        result.append(Character.toUpperCase(variable.charAt(i)));
                    }

                }
            }
        }
        return result.toString();
    }
    }
}
