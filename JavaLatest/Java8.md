---------------------------------------------------
Java 8 interview questions related to collections:
---------------------------------------------------
**What are the new features in Java 8 related to collections?**
**Answer: Java 8 introduced several new features related to collections, such as stream API, lambda expressions, and method references. These features allow developers to work with collections in a more concise, efficient, and expressive way.
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

