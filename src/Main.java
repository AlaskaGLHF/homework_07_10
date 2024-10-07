import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        /*
        //11.4
        int[] people_height = new int[12];
        Random random = new Random();

        for (int i = 0; i < people_height.length; i++) {
            people_height[i] = 163 + random.nextInt(190 - 163 + 1);
        }
        for (int i = 0; i < people_height.length; i++){
            System.out.println(people_height[i]);
        }
        */

        /*
        //11.6
        int[] massive = new int[12];


        for (int i = 0; i < massive.length; i++) {
            massive[i] = i + 1;
        }
        for (int i = 0; i < massive.length; i++){
            System.out.println(massive[i]);
        }

         */

        /*
        //11.13

        //инициализация массива
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите индекс элемента (от 0 до 9): ");
        int index = scanner.nextInt(); //чтение с консоли

        // условие с выводом искомого элемента массива с заданным индексом
        if (index >= 0 && index < numbers.length) {

            System.out.println("Искомый элемент массива с индексом " + index + ": " + numbers[index]);
        } else {

            System.out.println("Индекс вне допустимго диапозона");
        }
        */

        /*
        //11.14
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Элементы массива в обратном порядке:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
         */

        /*
        //11.17
        //инициализация массива
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Исходный массив:");
        PrintArray(numbers);

        int[] DoubledArray= Arrays.copyOf(numbers, numbers.length);
        System.out.println("\nМассив, увеличенный в 2 раза:");
        MultiplyByTwo(DoubledArray);
        PrintArray(DoubledArray);

        System.out.print("\nВведите число A для уменьшения массива: ");
        int A = scanner.nextInt();
        int[] ReducedArray= Arrays.copyOf(numbers, numbers.length);
        System.out.println("Массив, уменьшенный на число A:");
        ReducedByA(ReducedArray, A);
        PrintArray(ReducedArray);

        int[] DividedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("\nМассив, разделенный на первый элемент:");
        DivideByFirstElement(DividedArray);
        PrintArray(DividedArray);

    }

    // Метод для увеличения массива в 2 раза
    public static void MultiplyByTwo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    // Метод для уменьшения всего массива на число A
    public static void ReducedByA(int[] arr, int A) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= A;
        }
    }

    // Метод для деления всего массива на первый элемент
    public static void DivideByFirstElement(int[] arr) {
        int firstElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] /= firstElement;
        }
    }

    // Метод для вывода массива на экран(так просто по прикольней)
    public static void PrintArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        //

        */
    }
    }
