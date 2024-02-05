//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;

public class HomeWorkApp {

        public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();

            Random random = new Random();
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            System.out.println("isSumInRange(" + num1 + ", " + num2 + ") = " + isSumInRange(num1, num2));

            int number = random.nextInt();
            System.out.println("printPositiveOrNegative(" + number + ")");
            printPositiveOrNegative(number);

            int numberToCheck = random.nextInt();
            System.out.println("isNegative(" + numberToCheck + ") = " + isNegative(numberToCheck));

            String textToRepeat = "Hello, World!";
            int repeatCount = random.nextInt(5) + 1; // генеруємо випадкову кількість від 1 до 5
            System.out.println("repeatString(\"" + textToRepeat + "\", " + repeatCount + ")");
            repeatString(textToRepeat, repeatCount);

            int year = 2000 + random.nextInt(50); // генеруємо випадковий рік в діапазоні 2000-2049
            System.out.println("isLeapYear(" + year + ") = " + isLeapYear(year));
        }

        // 2. Створіть метод printThreeWords(), який під час виклику повинен надрукувати в стовпець у три слова: Orange, Banana, Apple.
        public static void printThreeWords() {
            System.out.println("printThreeWords");
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
            System.out.println();
        }

        // 3. Створіть метод checkSumSign(), у тілі якого оголосіть дві int змінні a і b, та ініціалізуйте їх будь-якими значеннями, якими захочете.
        // Далі метод повинен підсумувати ці змінні, і якщо їх сума більша або дорівнює 0, то вивести в консоль повідомлення "Сума позитивна", інакше - "Сума негативна";
        public static void checkSumSign() {
            Random random = new Random();
            int a = random.nextInt(201) - 100;
            int b = random.nextInt(201) - 100;
            System.out.println("checkSumSign(" + a + ", " + b + ")");
            int sum = a + b;
            if (sum >= 0) {
                System.out.println("Сума позитивна");
            } else {
                System.out.println("Сума негативна");
            }
            System.out.println();
        }

        // 4. Створіть метод printColor() у тілі якого задайте int змінну value та ініціалізуйте її будь-яким значенням. Якщо значення менше 0 (0 включно),
        // то в консоль метод повинен вивести повідомлення "Червоний", якщо лежить в межах від 0 (0 виключно) до 100 (100 включно), то "Жовтий", якщо більше 100 (100 виключно) - "Зелений";
        public static void printColor() {
            Random random = new Random();
            int value = random.nextInt(250) - 100;
            System.out.println("printColor(" + value + ")");
            if (value <= 0) {
                System.out.println("Червоний");
            } else if (value <= 100) {
                System.out.println("Жовтий");
            } else {
                System.out.println("Зелений");
            }
            System.out.println();
        }

        // 5. Створіть метод compareNumbers(), у тілі якого оголосіть дві int змінні a і b, та ініціалізуйте їх будь-якими значеннями,
        // якими захочете. Якщо a більше або одно b, необхідно вивести в консоль повідомлення “a >= b”, інакше “a < b”;
        public static void compareNumbers() {
            Random random = new Random();
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            System.out.println("compareNumbers(" + a + ", " + b + ")");
            if (a >= b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }
            System.out.println();
        }

        // 6. Написати метод, який приймає на вхід два цілих числа і перевіряє, що їхня сума лежить в межах від 10 до 20 (включно), якщо так – повернути true, інакше – false.
        public static boolean isSumInRange(int num1, int num2) {
            int sum = num1 + num2;
            return sum >= 10 && sum <= 20;
        }

        // 7. Написати метод, якому як параметр передається ціле число, метод повинен надрукувати в консоль, чи додатнє число передали або від’ємне. Примітка: нуль вважаємо позитивним числом.
        public static void printPositiveOrNegative(int number) {
            if (number >= 0) {
                System.out.println("Додатнє число");
            } else {
                System.out.println("Від'ємне число");
            }
            System.out.println();
        }

        // 8. Написати метод, якому як параметр передається ціле число. Метод повинен повернути true, якщо число є негативним, і повернути false якщо позитивне.
        public static boolean isNegative(int number) {
            return number < 0;
        }

        // 9. Написати метод, якому як аргументи передається рядок і число, метод повинен надрукувати в консоль зазначений рядок, вказану кількість разів;
        public static void repeatString(String text, int count) {
            for (int i = 0; i < count; i++) {
                System.out.println(text);
            }
            System.out.println();
        }

        // 10. Написати метод, який визначає, чи є рік високосним, і повертає boolean (високосний – true, не високосний – false). Кожен 4-й рік є високосним, крім кожного 100-го, причому кожен 400-й – високосний.
        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }

