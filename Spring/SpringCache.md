**Spring's cache annotations with code examples:**

Spring provides several annotations for caching data in your application. These annotations can be used to cache the results of methods in memory or in an external cache such as Redis, Ehcache, or Hazelcast.

**@Cacheable:** This annotation is used to cache the result of a method invocation based on its parameters. If the same method is called with the same parameters, the cached result is returned instead of executing the method again.
Example:

@Cacheable("books")
public Book findBook(String isbn) {
    // method logic to retrieve book with given ISBN
}

In this example, the findBook() method is annotated with @Cacheable("books"), which tells Spring to cache the results of this method in a cache named "books". When the method is called, Spring checks if the result for the given parameters (in this case, the ISBN) is already present in the cache. If it is, the cached result is returned; otherwise, the method is executed and the result is added to the cache.

**@CachePut:** This annotation is used to update the cache with the result of a method invocation. Unlike @Cacheable, @CachePut always executes the method and updates the cache with the new result.

Example:

@CachePut("books")
public Book saveBook(Book book) {
    // method logic to save book
}

In this example, the saveBook() method is annotated with @CachePut("books"), which tells Spring to update the cache named "books" with the result of this method. When the method is called, Spring executes it and updates the cache with the new result (in this case, the saved book).

**@CacheEvict:** This annotation is used to remove entries from the cache. You can specify whether to remove a single entry or all entries in the cache.

Example:

@CacheEvict("books")
public void deleteBook(String isbn) {
    // method logic to delete book with given ISBN
}

In this example, the deleteBook() method is annotated with @CacheEvict("books"), which tells Spring to remove the entry for the given ISBN from the "books" cache. When the method is called, Spring removes the entry from the cache.

**@Caching:** This annotation is used to group multiple caching annotations together, so that they can be applied to a single method.

Example:

@Caching(
    cacheable = {
        @Cacheable("books"),
        @Cacheable("authors")
    },
    put = {
        @CachePut("books"),
        @CachePut("authors")
    }
)

public Book saveBookWithAuthor(Book book, Author author) {
    // method logic to save book and author
}

In this example, the saveBookWithAuthor() method is annotated with @Caching, which groups multiple caching annotations together. The cacheable attribute specifies that the results of this method should be cached in both the "books" and "authors" caches, while the put attribute specifies that the cache entries for both caches should be updated with the new results.

These annotations can be used to improve the performance of your application by caching the results of expensive method invocations. They also provide a convenient way to manage cache entries, by allowing you to add, update, or remove entries with simple method annotations.
