import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task_3_1_a();
        Task_3_1_b();
        Task_3_1_c();
        Task_3_2();
        Task_3_3();
        Task_3_4();
        Task_3_6();
        Task_3_7();
        Task_3_8();
        Task_3_9();
        Task_3_10();
        Task_3_11();
    }

    private static void Task_3_1_a() {
        System.out.println("Задание 3.1.a");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение начала отрезка (a): ");
        double a = sc.nextDouble();
        System.out.print("Введите значение конца отрезка (b): ");
        double b = sc.nextDouble();
        System.out.print("Введите значение шага (h) для нахождения рещений: ");
        double h = sc.nextDouble();
        double x = 0;
        double f = 0;
        for (x = a; x <= b; x += h) {
            f = x - Math.sin(x);
            System.out.println("Результат рассчета функции при х = " + x + " равен " + f);
        }
    }

    private static void Task_3_1_b() {
        System.out.println();
        System.out.println("Задание 3.1.b");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение начала отрезка (a): ");
        double a = sc.nextDouble();
        System.out.print("Введите значение конца отрезка (b): ");
        double b = sc.nextDouble();
        System.out.print("Введите значение шага (h) для нахождения рещений: ");
        double h = sc.nextDouble();
        double x = 0;
        double f = 0;
        for (x = a; x <= b; x += h) {
            f = Math.sin(x) * Math.sin(x);
            System.out.println("Результат рассчета функции при х = " + x + " равен " + f);
        }
    }

    private static void Task_3_1_c() {
        System.out.println();
        System.out.println("Задание 3.1.c");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение начала отрезка (a): ");
        double a = sc.nextDouble();
        System.out.print("Введите значение конца отрезка (b): ");
        double b = sc.nextDouble();
        System.out.print("Введите значение шага (h) для нахождения рещений: ");
        double h = sc.nextDouble();
        double x = 0;
        double f = 0;
        for (x = a; x <= b; x += h) {
            f = 2 * Math.cos(x) - 1;
            System.out.println("Результат рассчета функции при х = " + x + " равен " + f);
        }
    }

    private static void Task_3_2() {
        System.out.println();
        System.out.println("Задание 3.2");
        int a = 3, b = -5;
        double x = 1;
        double y = 0;
        for (x = 1; x <= 5; x += 0.5) {
            y = a * x * x + b;
            System.out.println("Результат рассчета значения уравнения при х=" + x + ": " + y);
        }
    }

    private static void Task_3_3() {
        System.out.println();
        System.out.println("Задание 3.3");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число для анализа: ");
        int number = scan.nextInt();
        System.out.print("Введите число a для поиска: ");
        int a = scan.nextInt();
        System.out.print("Введите число b для поиска: ");
        int b = scan.nextInt();
        int count_a = 0, count_b = 0;
        for (int i = 0; ; ) {
            if (number % 10 == a & number % 10 > 0) {
                count_a++;
                number = number / 10;
            } else if (number % 10 == b & number % 10 > 0) {
                count_b++;
                number = number / 10;
            } else if (number % 10 > 0) {
                number = number / 10;
            } else
                break;
        }
        if (count_a > count_b)
            System.out.println("\nЦифра " + a + " встречается в данном числе чаще цифры " + b);
        else
            System.out.println("\nЦифра " + a + " встречается в данном числе реже цифры " + b);
    }

    private static void Task_3_4() {
        System.out.println();
        System.out.println("Задание 3.4");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение переменной x: ");
        double x = scan.nextDouble();
        System.out.print("Введите количество повторений n: ");
        int n = scan.nextInt();
        double res = 0;
        double sum = 0;
        double sum_total = 0;
        int fact = 0;
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= n; j++) {
                for (int t = 1; t <= j; t++) {
                    fact *= t;
                }
                res = Math.pow(x, j) / fact;
                sum += res;
            }
            // sum_total += sum;
        }
        System.out.println("Результат вычислений: " + sum);
    }

    private static void Task_3_6() {
        System.out.println();
        System.out.println("Задание 3.6");
        System.out.println("Нахождение корней уравнения из домашнего задания к 3-й лекции, п.6:");
        int x = 0;
        int y = 0;
        int count = 0;
        double k = 0;
        for (x = 1; x <= 30; x++) {
            for (y = x + 1; y <= 30; y++) {
                k = Math.sqrt(x * x + y * y);
                if (k % 1 == 0 & k <= 30) {
                    System.out.println("Значение x: " + x + "; значение y: " + y + "; значение k: " + k);
                    count++;
                } else continue;
            }
        }
        if (count == 0)
            System.out.println("Ответов нет: " + count);
    }

    private static void Task_3_7() {
        System.out.println();
        System.out.println("Задание 3.7");
        System.out.println("Нахождение первых 15 натуральных чисел (больших 100), делящихся нацело на 19:");
        int number = 100;
        int count = 0;
        while (count < 15) {
            if (number % 19 > 0) {
                number++;
            } else {
                ++count;
                System.out.println(count + "-е число: " + number);
                ++number;
            }
        }
    }

    private static void Task_3_8() {
        System.out.println();
        System.out.println("Задание 3.8");
        System.out.println("Нахождение первых 20-и натуральных чисел, делящихся нацело на 13 или 17:");
        int del_13 = 13;
        int del_17 = 17;
        int number = 500;
        int count = 0;
        while (count < 20) {
            if (number % del_13 == 0) {
                count++;
                System.out.println(count + "-е число, которое делится нацело на " + del_13 + " равно: " + number);
                number++;
            } else if (number % del_17 == 0) {
                count++;
                System.out.println(count + "-е число, которое делится нацело на " + del_17 + " равно: " + number);
                number++;
            } else
                number++;
        }
    }

    private static void Task_3_9() {
        System.out.println();
        System.out.println("Задание 3.9");
        int count = 1;
        int sum = 0;
        int progr_number = 2;
        System.out.print("Введите число, с которым будет сравниваться сумма членов прогрессии: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (sum = 2; sum < number; ) {
            progr_number += 2;
            sum += progr_number;
            count++;
        }
        System.out.println("Число слагаемых прогрессии равно: " + count);
        System.out.println("Сумма членов прогресии равна: " + sum);
        System.out.println("Последнее слагаемое: " + progr_number);
    }

    private static void Task_3_10() {
        System.out.println();
        System.out.println("Задание 3.10");
        int progr_number = 1;
        int count = 1;
        int sum = 0;
        System.out.println("Решение примера 10, лекция 3:");
        while (count <= 10) {
            sum += progr_number;
            System.out.println("Слагаемое #" + count + ": " + progr_number);
            count++;
            progr_number += 4;
        }
        System.out.println("Сумма первых 10-и членов прогрессии:" + sum);
    }

    private static void Task_3_11() {
        System.out.println();
        System.out.println("Задание 3.11");
        System.out.println("Выберите фигуру, которую следует вывести на экран:");
        System.out.println("1 - прямоугольник;");
        System.out.println("2 - прямоугольный треугольник;");
        System.out.println("3 - равносторонний треугольник;");
        System.out.println("4 - ромб.");
        System.out.print("\nВаш выбор: ");
        Scanner scan = new Scanner(System.in);
        String code_word = scan.next();

        if (code_word.equals("1")) {
            System.out.println("\nВы выбрали прямоугольник.\n");
            for (int i = 1; i <= 8; ) {
                for (int j = 1; j <= 5; ) {
                    System.out.print("* ");
                    j++;
                }
                System.out.println();
                i++;
            }
        } else if (code_word.equals("2")) {
            System.out.println("\nВы выбрали прямоугольный реугольник.\n");
            for (int i = 1; i <= 5; ) {
                for (int j = 1; j <= i; ) {
                    System.out.print("* ");
                    j++;
                }
                i++;
                System.out.println();
            }
        } else if (code_word.equals("3")) {
            System.out.println("\nВы выбрали равносторонний треугольник.\n");
            for (int i = 0; i <= 5; ) {
                for (int j = 0; j <= 5 + i; ) {
                    for (j = 0; j <= 5 - i; ) {
                        System.out.print(" ");
                        j++;
                    }
                    for (j = 5 - i; j <= 5 + i; ) {
                        System.out.print("*");
                        j++;
                    }
                }
                i++;
                System.out.println();
            }
        } else if (code_word.equals("4"))
        {
            System.out.println("\nВы выбрали ромб.\n");
            for (int i = 0; i <= 5; ) {
                for (int j = 1; j <= 5 + i; ) {
                    for (j = 1; j <= 5 - i; ) {
                        System.out.print(" ");
                        j++;
                    }
                    for (j = 5 - i; j <= 5 + i; ) {
                        System.out.print("*");
                        j++;
                    }
                }
                i++;
                System.out.println();
            }
            for (int i = 0; i < 5; ) {
                for (int j = 0; j <= i; ) {
                    System.out.print(" ");
                    j++;
                }
                for (int j = 1; j < 10 - i * 2; ) {
                    System.out.print("*");
                    j++;
                }
                i++;
                System.out.println();
            }
        }
    }
}