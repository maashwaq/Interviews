1. compare vs compareable in tabular form

//Here's a tabular comparison of Comparator and Comparable interfaces in Java:
![image](image_2.png)
The Comparable interface is used to define a natural ordering for a class, such as sorting integers in ascending order or sorting strings in alphabetical order. The compareTo() method is used to compare two objects and return a negative number, zero, or a positive number depending on whether the first object is less than, equal to, or greater than the second object.

The Comparator interface, on the other hand, is used to define a custom ordering for a class, such as sorting employees by name or sorting products by price. The compare() method is used to compare two objects based on the custom ordering and return a negative number, zero, or a positive number depending on whether the first object is less than, equal to, or greater than the second object.

Both interfaces are used to sort collections or arrays of objects. The Collections.sort() and Arrays.sort() methods use the natural ordering defined by the Comparable interface by default, but can also accept a Comparator object for custom ordering. The Stream.sorted() method can also accept a Comparator object for sorting a stream of objects.