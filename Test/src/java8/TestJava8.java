package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestJava8 {
    public static void main(String[] args) {
        //Program to find the maximum element in an array using Java 8 streams:
        /*int[] numbers = {10, 5, 8, 15, 20};
        int max=Arrays.stream(numbers).max().orElse(-1);
        System.out.println(max);*/


        //Function to remove duplicates from a list using Java 8 streams:
        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 5, 2, 6);
        numbers.stream().distinct().forEach(System.out::println);*/


        //Program to sort a list of strings in descending order of their lengths using Java 8 streams:
        /*List<String> strings = Arrays.asList("apple", "banana", "carrot", "date", "egg");
        strings.stream().sorted(Comparator.comparingInt(String::length).reversed()).forEach(System.out::println);*/


        //Function to calculate the sum of all even numbers in a list using Java 8 streams:
        //List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        /*int sum=numbers.stream().filter(num->num%2==0).reduce(0,(a,b)->a+b);
        System.out.println(sum);*/
        /*int sum=numbers.stream().filter(num->num%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);*/
        /*int sum = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.summingInt(a -> a));
        System.out.println(sum);
        int sum2 = numbers.stream().filter(num -> num % 2 == 0).reduce(0, Integer::sum);
        System.out.println(sum2);*/

        //Program to convert a list of strings to uppercase using Java 8 streams:
        /*List<String> strings = Arrays.asList("apple", "banana", "carrot", "date", "egg");
        strings.stream().map(s->s.toUpperCase()).forEach(System.out::println);*/


        //Function to filter out all prime numbers from a list using Java 8 streams:
        /*List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(num -> TestJava8.isPrime(num)).forEach(System.out::println);*/


        //Program to count the occurrence of a specific element in a list using Java 8 streams:
        /*List<String> names = Arrays.asList("John", "Jane", "John", "Alex", "Jane");
        String targetName = "John";
        System.out.println(names.stream().filter(n->n.equals(targetName)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
*/

        //Function to find the average of all numbers in a list using Java 8 streams:
        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        OptionalDouble avg=numbers.stream().mapToInt(Integer::intValue).average();
        System.out.println(avg.getAsDouble());*/


        //Program to concatenate all strings from a list into a single string using Java 8 streams:
        /*List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");
        //String con=strings.stream().reduce("",(a,b)->a+b);
        String con = strings.stream().reduce("", String::concat);
        System.out.println(con);*/


        //Function to check if a given list of integers is sorted in ascending order using Java 8 streams:
        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean b=numbers.stream().sorted().collect(Collectors.toList()).equals(numbers);
        System.out.println(b);*/


        /*we have number upto 10 in a array
        we want to find map which contains odd as key and even as value
        using java stream*/
       /* int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Map<Integer, Integer> oddEvenMap = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)  // Filter out odd numbers
                .boxed()
               .collect(Collectors.toMap(n -> n, n -> n + 1));  // Create the map, adding 1 to each odd number
        System.out.println(oddEvenMap);*/

        //{1=ram, 2=shyam, 3=heera, 4=khusi, 5=mahi}
        /*List<Object> inputList = Arrays.asList(1, 2, 3, 4, 5, "ram", "shyam", "heera", "khusi", "mahi");

        Map<Integer, String> outputMap = inputList.stream()
                .filter(element -> element instanceof Integer)
                .map(element -> {
                    int index = (int) element - 1;
                    String str = (String) inputList.get(index + 5);
                    return Map.entry((int)element, str);
                })
                .collect(Collectors.toMap(entry->entry.getKey(), e->e.getValue()));

        System.out.println(outputMap);*/

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> partitions = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partitions);

        List<Integer> evenNumbers = partitions.get(true);
        List<Integer> oddNumbers = partitions.get(false);

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);



    }


    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
