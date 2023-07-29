import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        PowerCalculator calc2 = new PowerCalculator();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите операцию с числами(+,-,*,/, ^(возведение в степень)): ");
            String simbol = scanner.nextLine();

            Pattern pattern = Pattern.compile("[+-/*^]");
            Matcher matcher = pattern.matcher(simbol);
            if (!matcher.matches()) {
                throw new InvalidInputException("Некорректный ввод значения (символ)");
            }

            System.out.print("Введите первое число(основание): ");
            int a = scanner.nextInt();
            System.out.print("Введите второе число(степень): ");
            int b = scanner.nextInt();

            if (a == 0 | b <= 0) {
                throw new InvalidInputException("Некорректный ввод значения(число)");
            }

            switch (simbol) {
                case "+":
                    System.out.println("Результат сложения равен: " + calc.sum(a, b));
                    break;

                case "-":
                    System.out.println("Результат вычитания равен: " + calc.difference(a, b));
                    break;

                case "*":
                    System.out.println("Результат умножения равен: " + calc.multiply(a, b));
                    break;

                case "/":
                    System.out.println("Результат деления равен: " + calc.division(a, b));
                    break;

                case "^":
                    System.out.println("Результат возведения в степень равен: " + (int) calc2.calculatePower(a, b));
                    break;

            }
        } catch (InvalidInputException e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Некорректный ввод числа");
        }
    }
}