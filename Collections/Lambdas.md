_____________________________________________________________________________________________________________________________________________________________________

1. Use Java Lambdas for use in Collections
_____________________________________________________________________________________________________________________________________________________________________

Java Lambdas are a powerful feature introduced in Java 8 that allow for concise and functional programming. They are particularly useful when working with Collections, as they provide a way to easily perform operations on the elements of a collection.

Here are some examples of how to use Lambdas with Collections in Java:

**forEach() method**:
The forEach() method is used to iterate over each element of a collection and perform an operation on each element. Here's an example of using a Lambda with the forEach() method to print each element of a List:

List<String> names = Arrays.asList("John", "Jane", "Mary");
names.forEach(name -> System.out.println(name));

In this example, the Lambda expression is name -> System.out.println(name), which is used to print each element of the List.

**filter() method**:
The filter() method is used to select elements from a collection that match a given condition. Here's an example of using a Lambda with the filter() method to select all even numbers from a List:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
List<Integer> evenNumbers = numbers.stream()
                                    .filter(number -> number % 2 == 0)
                                    .collect(Collectors.toList());
In this example, the Lambda expression is number -> number % 2 == 0, which is used to check if each element of the List is even.

**map() method**:
The map() method is used to transform each element of a collection using a given function. Here's an example of using a Lambda with the map() method to convert a List of Strings to uppercase:

List<String> names = Arrays.asList("John", "Jane", "Mary");
List<String> upperCaseNames = names.stream()
                                    .map(name -> name.toUpperCase())
                                    .collect(Collectors.toList());
In this example, the Lambda expression is name -> name.toUpperCase(), which is used to convert each element of the List to uppercase.

Overall, Lambdas are a powerful tool when working with Collections in Java, and they can make your code more concise and readable.

**reduce() method**:
The reduce() method is used to combine the elements of a collection into a single value using a given operation. Here's an example of using a Lambda with the reduce() method to find the sum of all elements in a List:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

System.out.println(sum); // output: 15
In this example, the Lambda expression is (a, b) -> a + b, which is used to add each element of the List to the accumulator.

**sorted() method**:
The sorted() method is used to sort the elements of a collection based on a given comparator. Here's an example of using a Lambda with the sorted() method to sort a List of Strings in descending order:

List<String> names = Arrays.asList("John", "Jane", "Mary");
List<String> sortedNames = names.stream()
                                .sorted((a, b) -> b.compareTo(a))
                                .collect(Collectors.toList());

System.out.println(sortedNames); // output: [Mary, John, Jane]
In this example, the Lambda expression is (a, b) -> b.compareTo(a), which is used to sort the elements of the List in descending order.

These are just a few examples of how to use Lambdas with Collections in Java. There are many more methods in the Collections API that can be used with Lambdas, and they can make your code more concise and readable.

