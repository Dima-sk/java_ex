package scr.Timus;
import java.util.Scanner;
import java.util.Stack;

public class example28_1654 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine().replaceAll("[^a-z]", "");

            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            StringBuilder result = new StringBuilder();
            for (char ch : stack) {
                result.append(ch);
            }

            System.out.println(result.toString());
        }
}
