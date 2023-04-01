1. Write a program to search for a character in a given HashMap and return its corresponding value using Java 8 streams.

    HashMap<Character, String> map = new HashMap<>();
    map.put('a', "Apple");
    map.put('b', "Ball");
    map.put('c', "Cat");
    map.put('d', "Dog");
    map.put('e', "Elephant");
    
    char searchChar = 'c';
    String result = map.entrySet().stream()
                    .filter(entry -> entry.getKey() == searchChar)
                    .map(Map.Entry::getValue)
                    .findFirst()
                    .orElse(null);
    
    if(result != null) {
        System.out.println("Value for " + searchChar + " is " + result);
    } else {
        System.out.println(searchChar + " not found in the HashMap.");
    }

In the above program, we have created a HashMap containing some characters and their corresponding values. We have then used the entrySet() method to get a set of all the entries in the HashMap. We have used the stream() method to convert this set into a stream, which allows us to use the various stream operations available in Java 8.

We have then used the filter() operation to filter out the entry corresponding to the search character. The map() operation is then used to extract the value from the entry. Finally, the findFirst() operation is used to get the first element of the resulting stream, which is the value for the search character. If the search character is not found, the orElse() method returns null.
    
2. dsd