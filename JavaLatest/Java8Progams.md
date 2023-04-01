0. Call the strings letter start with A in Java 8 program
    
    List<String> stringList = Arrays.asList("Apple", "Banana", "Apricot", "Orange", "Avocado");
    List<String> filteredList = stringList.stream()
        .filter(s -> s.startsWith("A"))
        .collect(Collectors.toList());
    
    System.out.println("Strings starting with A: " + filteredList);

   This code creates a list of strings, filters out the ones that don't start with the letter "A" using a lambda expression, and collects the filtered strings into a new list. Finally, the program prints the filtered list of strings.
    
1. Write a program to calculate the sum of all even numbers in a list using Java 8 streams.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int sum = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .mapToInt(Integer::intValue)
                    .sum();
    System.out.println(sum);
    
2. Write a program to sort a list of strings in ascending order using Java 8 streams.
    List<String> names = Arrays.asList("John", "Jane", "Adam", "Mary", "Bob");
    List<String> sortedNames = names.stream()
                                    .sorted()
                                    .collect(Collectors.toList());
    System.out.println(sortedNames);

3. Write a program to find the maximum element in a list of integers using Java 8 streams.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Optional<Integer> max = numbers.stream()
                                    .max(Integer::compare);
    if (max.isPresent()) {
        System.out.println(max.get());
    }

4. Write a program to remove duplicates from a list of strings using Java 8 streams.
    List<String> names = Arrays.asList("John", "Jane", "Adam", "Mary", "John", "Bob");
    List<String> distinctNames = names.stream()
                                        .distinct()
                                        .collect(Collectors.toList());
    System.out.println(distinctNames);
    

5. Write a program to find the average of a list of doubles using Java 8 streams.
    List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
    Optional<Double> average = numbers.stream()
                                    .mapToDouble(Double::doubleValue)
                                    .average();
    if (average.isPresent()) {
        System.out.println(average.getAsDouble());
    }

6. Write a program to convert a list of strings to uppercase using Java 8 streams.
    List<String> names = Arrays.asList("John", "Jane", "Adam", "Mary", "Bob");
    List<String> upperCaseNames = names.stream()
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());
    System.out.println(upperCaseNames);

7. Write a program to check if a list of strings contains a specific string using Java 8 streams.
    List<String> names = Arrays.asList("John", "Jane", "Adam", "Mary", "Bob");
    boolean containsName = names.stream()
                                .anyMatch("John"::equals);
    System.out.println(containsName);

8. Write a program to concatenate a list of strings using Java 8 streams.
    List<String> names = Arrays.asList("John", "Jane", "Adam", "Mary", "Bob");
    String concatenatedNames = names.stream()
                                    .reduce("", String::concat);
    System.out.println(concatenatedNames);

9. Write a program to find the length of the longest string in a list of strings using Java 8 streams.
    List<String> names = Arrays.asList("John", "Jane", "Adam", "Mary", "Bob");
    OptionalInt maxLength = names.stream()
                                    .mapToInt(String::length)
                                    .max();
    if (maxLength.isPresent()) {
        System.out.println(maxLength.getAsInt());
    }

10. Write a program to convert a list of integers to a comma-separated string using Java 8 streams.

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    String commaSeparated = numbers.stream()
                                    .map(Object::toString)
                                    .collect(Collectors.joining(","));
    System.out.println(commaSeparated);

12. Write  a program to count elements in stream using Java 8 streams.

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    long counter = numbers.stream()
        .map(Object::toString)
        .collect(Collectors.counting());
    System.out.println(counter);

13. Write a program to find the sum of all numbers in a list of strings using Java 8 streams.

    List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
    int sum = numbers.stream()
                    .mapToInt(Integer::parseInt)
                    .sum();
    System.out.println(sum);

14. Write a program to filter a list of strings based on their length using Java 8 streams.

    List<String> names = Arrays.asList("John", "Jane", "Adam", "Mary", "Bob");
    List<String> filteredNames = names.stream()
                                        .filter(n -> n.length() > 3)
                                        .collect(Collectors.toList());
    System.out.println(filteredNames);

15. Write a program to find the number of elements in a list of strings using Java 8 streams.

    List<String> names = Arrays.asList("John", "Jane", "Adam", "Mary", "Bob");
    long count = names.stream()
                        .count();
    System.out.println(count);

16. Write a program to convert a list of integers to a list of strings using Java 8 streams.

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    List<String> stringNumbers = numbers.stream()
                                        .map(Object::toString)
                                        .collect(Collectors.toList());
    System.out.println(stringNumbers);

17. Write a program to remove all null values from a list of strings using Java 8 streams.

    List<String> names = Arrays.asList("John", "Jane", null, "Mary", "Bob", null);
    List<String> filteredNames = names.stream()
                                        .filter(Objects::nonNull)
                                        .collect(Collectors.toList());
    System.out.println(filteredNames);

18. Write a program to find the maximum value in a list of integers using Java 8 streams.

    List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 4);
    Optional<Integer> max = numbers.stream()
                                    .max(Integer::compareTo);
    System.out.println(max.get());

19. Write a program to find the minimum value in a list of integers using Java 8 streams.

    List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 4);
    Optional<Integer> min = numbers.stream()
                                    .min(Integer::compareTo);
    System.out.println(min.get());

20. Write a program to sort a list of strings in ascending order using Java 8 streams.

    List<String> names = Arrays.asList("John", "Jane", "Adam", "Mary", "Bob");
    List<String> sortedNames = names.stream()
                                    .sorted()
                                    .collect(Collectors.toList());
    System.out.println(sortedNames);

21. Write a program to sort a list of strings in descending order using Java 8 streams.

    List<String> names = Arrays.asList("John", "Jane", "Adam", "Mary", "Bob");
    List<String> sortedNames = names.stream()
                                    .sorted(Comparator.reverseOrder())
                                    .collect(Collectors.toList());
    System.out.println(sortedNames);

22. Write a program to find the average value of a list of integers using Java 8 streams.

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    Optional<Double> average = numbers.stream()
                                    .mapToInt(Integer::intValue)
                                    .average();
    System.out.println(average.getAsDouble());

23. 
