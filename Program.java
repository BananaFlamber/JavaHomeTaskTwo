import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String text = sc.nextLine();
        System.out.print(result(checkChar(textToChar(text))));
    }
    public static char[] textToChar(String text) {
        char [] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }
    public static int checkChar(char[]chars) {
        int result = 0;
        int count = 1;
        for (int j = 0; j < (chars.length -1) / 2; j++) {
            count++;
            if (chars[j] != chars[chars.length - count]) {
                result = result + 1;
            }
        }
        return result;
    }
    public static boolean result(int result) {
        return (result != 0);
    }

}
