**Write applications in Java using Object Oriented Design Principles**

**Example 1: Library Management System**

This application is designed to manage a library's collection of books and provide features such as checking out and returning books, tracking book availability, and managing library members. The main classes in this application are Book, Member, and Library.

**Book Class**
This class represents a book and contains information such as the book's title, author, and ISBN. It also has methods for checking the book's availability and for checking it out or returning it.

public class Book {
    private String title;
    private String author;
    private String isbn;    private boolean checkedOut;
    private Member borrower;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        checkedOut = false;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut(Member borrower) {
        checkedOut = true;
        this.borrower = borrower;
    }

    public void returnBook() {
        checkedOut = false;
        borrower = null;
    }
}

**Member Class**
This class represents a library member and contains information such as the member's name, address, and ID. It also has methods for checking out and returning books.

public class Member {
    private String name;
    private String address;
    private String id;
    private List<Book> booksCheckedOut;

    public Member(String name, String address, String id) {
        this.name = name;
        this.address = address;
        this.id = id;
        booksCheckedOut = new ArrayList<>();
    }

    public void checkOutBook(Book book) {
        book.checkOut(this);
        booksCheckedOut.add(book);
    }

    public void returnBook(Book book) {
        book.returnBook();
        booksCheckedOut.remove(book);
    }
}

**Library Class**
This class represents a library and contains a collection of books and members. It has methods for adding and removing books and members, and for checking out and returning books.

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public void checkOutBook(Member borrower, Book book) {
        if (book.isCheckedOut()) {
            throw new RuntimeException("Book is already checked out");
        } else {
            borrower.checkOutBook(book);
        }
    }

    public void returnBook(Member borrower, Book book) {
        if (!book.isCheckedOut()) {
            throw new RuntimeException("Book is not checked out");
        } else {
            borrower.returnBook(book);
        }
    }
}

**Example 2: Bank Account Management System**

This application is designed to manage a customer's bank account and provide features such as depositing and withdrawing money, checking the account balance, and transferring money between accounts. The main classes in this application are Account, Customer, and Bank.

**Account Class**
This class represents a bank account and contains information such as the account number, account type, and balance. It also has methods for depositing and withdrawing money, checking the account balance, and transferring money to another account.

public class Account {
    private String accountNumber;
    private String accountType;
    private double balance;
    private Customer accountHolder;

public Account(String accountNumber, String accountType, double balance, Customer accountHolder) {
    this.accountNumber = accountNumber;
    this.accountType = accountType;
    this.balance = balance;
    this.accountHolder = accountHolder;
}

public void deposit(double amount) {
    balance += amount;
}

public void withdraw(double amount) {
    if (amount > balance) {
        throw new RuntimeException("Insufficient balance");
    } else {
        balance -= amount;
    }
}

public double getBalance() {
    return balance;
}

public void transfer(Account recipient, double amount) {
    if (amount > balance) {
        throw new RuntimeException("Insufficient balance");
    } else {
        balance -= amount;
        recipient.deposit(amount);
    }
}
}

#### Customer Class

This class represents a bank customer and contains information such as the customer's name, address, and contact details. It also has methods for creating and managing accounts.

public class Customer {
private String name;
private String address;
private String phoneNumber;
private List<Account> accounts;

public Customer(String name, String address, String phoneNumber) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    accounts = new ArrayList<>();
}

public void addAccount(Account account) {
    accounts.add(account);
}

public void removeAccount(Account account) {
    accounts.remove(account);
}
}

#### Bank Class

This class represents a bank and contains a collection of customers and accounts. It has methods for creating and managing accounts, and for transferring money between accounts.

public class Bank {
private List<Customer> customers;
private List<Account> accounts;

public Bank() {
    customers = new ArrayList<>();
    accounts = new ArrayList<>();
}

public void addCustomer(Customer customer) {
    customers.add(customer);
}

public void removeCustomer(Customer customer) {
    customers.remove(customer);
}

public void addAccount(Account account) {
    accounts.add(account);
}

public void removeAccount(Account account) {
    accounts.remove(account);
}

public void transfer(Account sender, Account recipient, double amount) {
    sender.transfer(recipient, amount);
}
}

These are just two examples of Java applications that use Object Oriented Design Principles. By following these principles, you can create code that is easier to understand, maintain, and modify, making it a valuable tool for software development.
