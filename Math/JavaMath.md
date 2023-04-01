1. java 8 x power y without function

   //Here's an example of how to calculate x raised to the power of y without using the Math.pow() function in Java 8:
   import java.util.stream.Stream;

    public class PowerExample {
    
        public static void main(String[] args) {
            int base = 2;
            int exponent = 5;
    
            int result = Stream.iterate(base, i -> i * base)
                               .limit(exponent)
                               .reduce(1, (a, b) -> a * b);
    
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }
    }

In the above program, we use the Stream.iterate() method to generate a stream of integers starting with the base value, and then multiplying each element in the stream by the base value to get the next element. We limit the stream to the exponent value to get a stream of exponent number of elements. Finally, we use the reduce() method to multiply all the elements in the stream to get the result.

In this example, we calculate 2 raised to the power of 5, which results in 32.

