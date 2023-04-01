import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    System.out.println("Java Interview Questions and Answers!");

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    String commaSeparated = numbers.stream()
        .map(Object::toString)
        .collect(Collectors.joining(","));
    System.out.println(commaSeparated);

    long counter = numbers.stream()
        .map(Object::toString)
        .collect(Collectors.counting());
    System.out.println(counter);

  }
}