import sorting.InsertionSorter;
import tdd.Employee;

import java.util.*;

/**
 * Created by eduardocucharro on 19/02/17.
 */
public class Main {
    public static void main(String[] args) {

//        double n1 = 16;
//        double n2 = 4;
//        double divisor = gcd(n1, n2);

//        System.out.println(String.format("GCD of %1$.2f and %2$.2f is %3$.2f", n1, n2, divisor));
//
        int[] array = getRandomArray();

        printArray(array);

        //bubbleSort(array);
        //selectionSort(array, 3);
        insertionSort(array);

        printArray(array);

        sortEmployees();

        searchStrings();

        checkPalindrome();

        intToBinary();
    }

    private static void intToBinary() {
        int number = 1041;

        Byte[] bytes = convertToBinary(number);

        int realNumber = convertBinaryToDecimal(bytes);

        System.out.print(realNumber + " in binary is : ");

        for(Byte b : bytes) {
            System.out.print(b);
        }

        System.out.print("and the binary gap is " + binaryGap(bytes));
    }

    private static int convertBinaryToDecimal(Byte[] bytes) {

        int number = 0;

        for(int i = 0; i < bytes.length; i++) {
            number += bytes[i] * Math.pow(2, ((bytes.length - i) - 1));
        }

        return number;
    }

    private static void printArray(int[] array) {

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    private static int[] getRandomArray() {
        Random r = new Random(100);

        int i1 = 10;
        int[] a = new int[i1];

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(i1);
        }

        return a;
    }

    //Euclid algorithm (GCD Greatest Commom Divisor
    //Algoritmo de Euclid máximo divisor comum
    public static double gcd(double n1, double n2) {
        double mod = n1 % n2;

        if (mod == 0) return n2;

        return gcd(n2, mod);
    }

    //Bubble sort O(nˆ2)
    //Ordena asc, com todos com todos passando o maior para a posicao da frente
    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - i; j++) {

                if (j < array.length - 1) {

                    int a = array[j];
                    int b = array[j + 1];

                    if (b < a) {
                        array[j] = b;
                        array[j + 1] = a;
                    }
                }

            }
        }
    }

    //Ordena com base na posicão indicada, ordenando item a item do menor para o maior
    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {

                int next = array[j];

                if (next < array[i]) {
                    int current = array[i];
                    array[i] = next;
                    array[j] = current;
                }
            }
        }
    }

    public static void insertionSort(int[] vector) {
        //baseado na ordenação de cartas (deve iniciar ou começar ordenado)
        //pega um carta e compara com a selecionada
        //se ela for maior que a carta da sua mão, move a carta da mao pra trás
        //se ela não coloca ela no lugar

        //começa no 1 pq comparo ela com a anterior
        for (int i = 1; i < vector.length; i++) {
            int cartaAtual = vector[i];
            int j = i;

            //compara carta anterior com carta atual, se anterior for maior, passa ela pra frente e continua
            while (j > 0 && vector[j - 1] > cartaAtual) {
                vector[j] = vector[j - 1];
                j--;
            }
            vector[j] = cartaAtual;
        }
    }

    public static void sortEmployees() {
        Employee[] employees = new Employee[10];

        Random r = new Random(10);

        for (int i = 0; i < employees.length; i++) {
            Employee ep = new Employee(
                    r.nextInt(100),
                    "Jamba",
                    "Lada",
                    "jamba@lada.com");

            employees[i] = ep;

            System.out.println(ep.toString());
        }

        InsertionSorter sorter = new InsertionSorter();

        sorter.sort(employees);

        System.out.println("======================== Ordered ============================");

        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }

    public static void searchStrings() {
        String[] array = new String[]{"Anaconda", "Great", "Ohdidi", };

        for (String s : array) {
            System.out.println(String.format("%s %s", s, String.valueOf(hasDuplicateChars(s))));
        }
    }

    public static boolean hasDuplicateChars(String s) {
        char[] chars = s.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length; i++) {

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == chars[i]) return true;
            }
        }

        return false;
    }

    //Teacher version - very interesting and efficient
//    public static boolean hasDuplicateChars(String s) {
//        // Standard ASCII (if you want to include extended ASCII, you may use a 256 length array
//        boolean[] charSet = new boolean[128]; // additional memory
//        for (int i=0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (charSet[c]) return true;
//            charSet[c] = true;
//        }
//        return false;
//    }

    public static boolean hasDuplicateCharsASCII(String s) {
        char[] alphabet = new char[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (i + 97);
            System.out.print(alphabet[i] + " ");
        }

        char[] sChars = s.toLowerCase().toCharArray();
        int[] numberChars = new int[sChars.length];

        for(int i = 0; i < sChars.length; i++) {

            for(int j = 0; j < alphabet.length; j++) {

                if(alphabet[j] == sChars[i]) {
                    numberChars[i] = j;
                }
            }
        }

        insertionSort(numberChars);

        for(int i = 0; i < numberChars.length -1; i++) {

            //Search without

            int x = i + 1;

            int[] lessSearched = new int[numberChars.length - x];

            for(int j = 0; j < lessSearched.length; j++) {
                lessSearched[j] = numberChars[j + x];
            }

            int n = binarySearch(numberChars[i], lessSearched);

             if(n >= 0) {
                 return true;
             }
        }

        return false;
    }

    public static int binarySearch(int number, int[] array) {
        //Pego o total de itens e divido pela metade
        //verifico se o item do meio é maior, menor que o item buscado
        //se for menor pego a metade pra trás com base nele
        //se for maior pego a metade maior com base nele
        //se for diferente saio do loop e verifico se encontrei o resultado ou não

        int first = 0;
        int last = array.length;
        int mid = -1;

        while(first < last) {
            mid = (last - first) / 2;

            if(number > array[mid]) {
                first = mid + 1;
            } else if(number < array[mid]) {
                last = mid - 1;
            } else {
                break;
            }
        }

        return number == array[mid] ? number : -1;
    }

    public static void checkPalindrome() {
        String[] words = new String[] {"jambalada", "ovo", "ohdidi", "ama"};

        for(String s : words) {
            System.out.println(String.format("%s %s palindrome", s, isPalindrome(s) ? "is" : "is not"));
        }
    }

    public static boolean isPalindrome(String s) {
        char[] chars = s.toUpperCase().toCharArray();

        int mod = chars.length % 2;

        int half;

        if(mod == 0)
            half = chars.length / 2;
        else
            half = (chars.length / 2) + 1;

        for(int i = 0; i < half; i++) {

            int inverse = chars.length - 1 - i;

            if(!(chars[i] == chars[inverse])) return false;
        }

        return true;
    }

    public static Byte[] convertToBinary(int number) {
        List<Byte> list = new ArrayList();

        int result = number;

        while(result > 0) {
            int remainder = result % 2;
            result = result / 2;

            byte b = Byte.parseByte(String.valueOf(remainder));

            list.add(b);
        }

        Byte[] objects = new Byte[list.size()];
        Byte[] reversed = new Byte[list.size()];

        list.toArray(objects);

        for(int i = objects.length; i > 0; i--) {
            reversed[objects.length - i] = objects[i-1];
        }

        return reversed;
    }

    public static int binaryGap(Byte[] bits) {
        int gap = 0;
        int tempGap = 0;

        for(Byte b : bits) {
            if(b == 1) {
                if(tempGap > gap) {
                    gap = tempGap;
                }

                tempGap = 0;
            } else {
                tempGap += 1;
            }
        }

        return gap;
    }
}
