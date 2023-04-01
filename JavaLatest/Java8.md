---------------------------------------------------
Java 8 interview questions related to collections:
---------------------------------------------------
**What are the new features in Java 8 related to collections?**
**Answer: Java 8 introduced several new features related to collections, such as stream API, lambda expressions, and method references. These features allow developers to work with collections in a more concise, efficient, and expressive way.

Java 8 introduced several new features and improvements to the language, including:

Lambda expressions: A concise way to represent an anonymous function that can be passed as a parameter to a method.

Stream API: A new way to process collections of data in a functional way, enabling parallelism and efficient processing of large data sets.

Default methods: Allows adding new methods to interfaces without breaking existing implementations.

Method references: A shorthand notation for referring to an existing method by name, allowing for more concise code.

Optional class: A container object that may or may not contain a value, providing a better alternative to using null values.

Functional interfaces: Interfaces with a single abstract method that can be used as lambda expressions.

Date and Time API: A new date and time API that is more comprehensive and easier to use than the legacy java.util.Date and java.util.Calendar classes.

Nashorn JavaScript engine: A new JavaScript engine for running JavaScript code within the JVM.

Type annotations: Allows adding annotations to any type use, including type casts, instanceof checks, and new expressions.

These features have made Java more expressive, functional, and efficient. The introduction of lambda expressions and the stream API has made functional programming more accessible in Java, allowing developers to write more concise and expressive code. The Optional class has helped in writing more robust and null-safe code, while the new date and time API has made it easier to handle date and time related operations. Overall, Java 8 has made significant improvements to the language and has made it more capable of handling modern application development.

**---------------------------------------------------

**What is a stream in Java 8?**
**Answer: A stream is a sequence of elements that can be processed in parallel or sequentially. It is a new feature introduced in Java 8 that allows developers to process collections in a functional way.
**---------------------------------------------------

**What is a lambda expression in Java 8?**
**Answer: A lambda expression is a concise way to represent a method as an object. It is a new feature introduced in Java 8 that allows developers to write more expressive and functional code.
**---------------------------------------------------

**What is a method reference in Java 8?**
**Answer: A method reference is a shorthand syntax for calling a method as a lambda expression. It is a new feature introduced in Java 8 that allows developers to write more concise and readable code.
**---------------------------------------------------

**How can you create a stream in Java 8?**
**Answer: There are several ways to create a stream in Java 8, such as calling the stream() or parallelStream() methods on a collection, using the Stream.of() method, or using the Arrays.stream() method.
**---------------------------------------------------

**How can you filter a stream in Java 8?**
**Answer: You can filter a stream in Java 8 by calling the filter() method and passing a lambda expression that returns a boolean value. The filter() method returns a new stream that contains only the elements that satisfy the filter condition.
**---------------------------------------------------

**How can you map a stream in Java 8?**
**Answer: You can map a stream in Java 8 by calling the map() method and passing a lambda expression that transforms each element of the stream into a new value. The map() method returns a new stream that contains the transformed values.
**---------------------------------------------------
**
How can you reduce a stream in Java 8?**
**Answer: You can reduce a stream in Java 8 by calling the reduce() method and passing a binary operator that combines two elements of the stream into a new value. The reduce() method returns an optional value that contains the result of the reduction operation.
**---------------------------------------------------

**What is the difference between a stream and a collection in Java 8?**
**Answer: A stream is a sequence of elements that can be processed in parallel or sequentially, while a collection is a group of objects stored in a container. Streams are not data structures and do not store elements, while collections do.
**---------------------------------------------------

**How can you convert a stream to a collection in Java 8?**
**Answer: You can convert a stream to a collection in Java 8 by calling the collect() method and passing a collector that accumulates the elements of the stream into a new collection. For example, you can convert a stream to a list by calling collect(Collectors.toList()).
**---------------------------------------------------

