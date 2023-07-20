public class Guess2 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("задумана буква  в диапазоне A-Z.");
        System.out.print("попытайтесь ее угадать:");
        ch = (char) System.in.read();
        if (ch == answer) System.out.println("правильно!");
        else System.out.println("не угадали");
    }

}
