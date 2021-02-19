
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author jigssharma
 */
public class LibrarySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     
     
     System.out.println("Staff Information: ");
      
     Staff stf1 = new Staff(4778496, "Jigs", "Sharma", "js371", "hola", UserType.Academic_Staff, PermissionType.allow_to_borrow, Status.Active, Position.Librarian, 90000);
     
      System.out.println(stf1.verifyUsernameandPassword("js371", "hola"));
      System.out.println(stf1.verifyUserType(UserType.Academic_Staff));
      System.out.println(stf1.verifyPermissionType(PermissionType.allow_to_edit_book_information));
      System.out.println(stf1.verifyUsername("Jigs"));
       System.out.println(stf1.toString());
      
      
       System.out.println();
       
       System.out.println("Student Information: ");
       
       Student stdnt1 = new Student(3887235, "John", "Smith", "jhn18", "passy", UserType.Librarian, PermissionType.allow_to_edit_book_information, Status.Active, "Information Technology", "Bachelor of Information Technology");
       
       System.out.println(stdnt1.verifyUsernameandPassword("js371", "hola"));
      System.out.println(stdnt1.verifyUserType(UserType.Academic_Staff));
      System.out.println(stdnt1.verifyPermissionType(PermissionType.allow_to_edit_book_information));
      System.out.println(stdnt1.verifyUsername("jhn18"));
       System.out.println(stdnt1.toString());
       
       System.out.println();
       
       System.out.println("User Information: ");
       
       User usr1 = new User(3354832, "Bill", "Gates", "bl98", "gating", UserType.Admin, PermissionType.allow_to_edit_book_information, Status.Active);
       
       System.out.println(usr1.verifyUsernameandPassword("js371", "hola"));
      System.out.println(usr1.verifyUserType(UserType.Academic_Staff));
      System.out.println(usr1.verifyPermissionType(PermissionType.allow_to_edit_book_information));
      System.out.println(usr1.verifyUsername("jhn18"));
       System.out.println(usr1.toString());
       
       
        System.out.println();
       
        System.out.println("Book Information: ");
        
       Book bk1 = new Book(55425, 27, "Java programming fundamentals", "Mark Zuckerburg", "Floor 1, J-G", Type.Educational, BookStatus.Borrowed);
       
       System.out.println(bk1.verifyBookISBNAndCopyNumber(55425, 27));
       System.out.println(bk1.verifyBookISBN(66728));
       System.out.println(bk1.verifyBookStatus(BookStatus.Available));
       System.out.println(bk1.updateBookStatus(BookStatus.Reserved));
       
       System.out.println(bk1.toString());
       
System.out.println("Enter new book information: ");
      
      bk1.editBook();
             
      System.out.println("New book information: ");
       
       System.out.println(bk1.toString());
       
      
       
       
       
       System.out.println();
       System.out.println();
       
       
        ArrayList<User> list = new ArrayList<User>();
      
      list.add(stf1);
      list.add(stdnt1);
      list.add(usr1);
      
      for(int i = 0; i < list.size(); i++)
      {
          System.out.println(list.get(i));
      }
      
    }
    
    
}

enum UserType{Admin, Student, Academic_Staff, Librarian, Admin_Staff};


    
enum PermissionType{allow_to_borrow, allow_to_reserve_only, allow_to_edit_book_information};
    

    
    
    enum Status{Active, Inactive};


enum Position{Admin, Librarian, General_Office_Staff, Manager, Academic_Staff, Teaching_Assistant};
        





 class User
{
    private int id;
    private String fName;
    private String lName;
    private String username;
    private String password;
    private UserType userType;
    private PermissionType permissionType;
    private Status statusType;
    
    
   
    
    
    public User(int id, String fName, String lName, String username, String password, UserType userType, PermissionType permissionType, Status statusType)
    {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.permissionType = permissionType;
        this.statusType = statusType;
 
       
       
        
    }
    
    
    public void setId(int id)
    {
        this.id = id;
       
    }
    
    public void setFirstName(String fName)
    {
        this.fName = fName;
    }
    
    public void setLastName(String lName)
    {
        this.lName = lName;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public void setUserType(UserType userType)
    {
        this.userType = userType;
    }
    
    public void setPermissionType(PermissionType permissionType)
    {
        this.permissionType = permissionType;
    }
    
    public void setStatus(Status statusType)
    {
        this.statusType = statusType;
    }
    
    
    public int getId()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return fName;
    }
    
    public String getLastName()
    {
        return lName;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public UserType getUserType()
    {
        return userType;
    }
    
    public PermissionType getPermissionType()
    {
        return permissionType;
    }
    
    public Status getStatus()
    {
        return statusType;
    }
    
    
    
    
       public boolean verifyUsernameandPassword(String username, String password)
    {
        boolean correctInfo;
        if(username == getUsername() && password == getPassword())
        {
            correctInfo = true;
        }
        else
        {
            correctInfo = false;
        }
        
        return correctInfo;
    }
    
    
    public boolean verifyUserType(UserType userType)
    {
        boolean correctInfo;
        
        if(userType == getUserType())
        {
            correctInfo = true;
        }
        
        else
        {
            correctInfo = false;
        }
        
        return correctInfo;
    }
    
    
    public boolean verifyPermissionType(PermissionType permissionType)
    {
        boolean correctInfo = true;
        
        if(permissionType == getPermissionType())
        {
            correctInfo = true;
        }
        
        else
        {
            correctInfo = false;
        }
        
        return correctInfo;
    }
    
    public boolean verifyUsername(String username)
    {
        boolean correctInfo = true;
        
        if(username == getUsername())
        {
            correctInfo = true;
        }
        
        else
        {
            correctInfo = false;
        }
        
        return correctInfo;
    }
    
    public String toString()
    {
        return "ID: " + getId() + " | " + "First Name: " + getFirstName() + " | " + "Last Name: " + getLastName() + " | " + "Username: " + getUsername() + " | " + "Password: " + getPassword() + " | " + "User Type: " + getUserType() + " | " + "Permission Type: " + getPermissionType() + " | " + "Status Type: " + getStatus();
    }
}









class Staff extends User
{
    private Position position;
    private double salary;
    
    
    
    public Staff(int id, String fName, String lName, String username, String password, UserType userType, PermissionType permissionType, Status statusType, Position position, double salary)
    {
        super(id, fName, lName, username, password, userType, permissionType, statusType);
        this.position = position;
        this.salary = salary;
        
    
        
       if(position == Position.Librarian)  
        {
          
            if(super.getId() < 4000000 || super.getId() > 4999999){
            throw new IllegalArgumentException("ID must start with 4, followed by 6 numbers");
            }   
        }
       
       else if(position != Position.Librarian && super.getId() < 3000000 || super.getId() > 3999999)
    {
        throw new IllegalArgumentException("ID must start with 3, followed by 6 numbers"); 
    }
       
      
      
       
      
  
       
       
     
    }
    
    
    public void setPosition(Position position)
     {
         this.position = position;
     }
    
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    
    public Position getPosition()
    {
        return position;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    
    public boolean verifyUsernameandPassword(String username, String password)
    {
        boolean correctInfo;
        if(username == getUsername() && password == getPassword())
        {
            correctInfo = true;
        }
        else
        {
            correctInfo = false;
        }
        
        return correctInfo;
    }
    
    
    public boolean verifyUserType(UserType userType)
    {
        boolean correctInfo;
        
        if(userType == getUserType())
        {
            correctInfo = true;
        }
        
        else
        {
            correctInfo = false;
        }
        
        return correctInfo;
    }
    
    
    public boolean verifyPermissionType(PermissionType permissionType)
    {
        boolean correctInfo = true;
        
        if(permissionType == getPermissionType())
        {
            correctInfo = true;
        }
        
        else
        {
            correctInfo = false;
        }
        
        return correctInfo;
    }
    
    public boolean verifyUsername(String username)
    {
        boolean correctInfo = true;
        
        if(username == getUsername())
        {
            correctInfo = true;
        }
        
        else
        {
            correctInfo = false;
        }
        
        return correctInfo;
    }
    
    public String toString()
    {
        return "ID: " + getId() + " | " + "First Name: " + getFirstName() + " | " + "Last Name: " + getLastName() + " | " + "Username: " + getUsername() + " | " + "Password: " + getPassword() + " | " + "User Type: " + getUserType() + " | " + "Permission Type: " + getPermissionType() + " | " + "Status Type: " + getStatus() + " | " + "Position: " + position + " | " + "Salary: " + salary;
    }
}









class Student extends User
{
    private String course;
    private String degree;
    
    public Student(int id, String fName, String lName, String username, String password, UserType userType, PermissionType permissionType, Status statusType, String course, String degree)
    {
        super(id, fName, lName, username, password, userType, permissionType, statusType);
        this.course = course;
        this.degree = degree;
        
      
    }
    
    public void setCourse(String course)
    {
        this.course = course;
    }
    
    public void setDegree(String degree)
    {
        this.degree = degree;
    }
    
    
    public String getCourse()
    {
        return course;
    }
    
    public String getDegree()
    {
        return degree;
    }
    
    
    
        public boolean verifyUsernameandPassword(String username, String password)
    {
        boolean correctInfo = true;
        if(username == getUsername() && password == getPassword())
        {
            correctInfo = true;
        }
        else
        {
            correctInfo = false;
        }
        
        return correctInfo;
    }
    
    
    public boolean verifyUserType(UserType userType)
    {
        boolean correctInfo = true;
        
        if(userType == getUserType())
        {
            correctInfo = true;
        }
        
        else
        {
            correctInfo = false;
        }
        
        return correctInfo;
    }
    
    
    public boolean verifyPermissionType(PermissionType permissionType)
    {
        boolean correctInfo = true;
        
        if(permissionType == getPermissionType())
        {
            correctInfo = true;
        }
        
        else
        {
            correctInfo = false;
        }
        
        return correctInfo;
    }
    
    public boolean verifyUsername(String username)
    {
        boolean correctInfo = true;
        
        if(username == getUsername())
        {
            correctInfo = true;
        }
        
        else
        {
            correctInfo = false;
        }
        
        return correctInfo;
    }
    
    
     public String toString()
    {
        return "ID: " + getId() + " | " + "First Name: " + getFirstName() + " | " + "Last Name: " + getLastName() + " | " + "Username: " + getUsername() + " | " + "Password: " + getPassword() + " | " + "User Type: " + getUserType() + " | " + "Permission Type: " + getPermissionType() + " | " + "Status Type: " + getStatus() + " | " + "Course: " + course + " | " + "Degree: " + degree;
    }
} 






enum Type{Horror, SciFi, Romance, Comedy, Educational};
enum BookStatus{Reserved, Borrowed, Available, Unavailable};



class Book
{
    int isbn;
    int bookCopy;
    String title;
    String author;
    String location;
    Type type;
    BookStatus bookStatus;
    
    public Book(int isbn, int bookCopy, String title, String author, String location, Type type, BookStatus bookStatus)
    {
        this.isbn = isbn;
        this.bookCopy = bookCopy;
        this.title = title;
        this.author = author;
        this.location = location;
        this.type = type;
        this.bookStatus = bookStatus;
    }
    
    
    public void setIsbn(int isbn)
    {
        this.isbn = isbn;
    }
    
    public void setBookCopyNumber(int bookCopy)
    {
        this.bookCopy = bookCopy;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    public void setGenre(Type type)
    {
        this.type = type;
    }
    
    public void setBookStatus(BookStatus bookStatus)
    {
        this.bookStatus = bookStatus;
    }
    
    public void setLocation(String location)
    {
        this.location = location;
    }
    
    
    
    public int getIsbn()
    {
        return isbn;
    }
    
    public int getBookCopyNumber()
    {
        return bookCopy;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getLocation()
    {
        return location;
    }
    
    public Type getGenre()
    {
        return type;
    }
    
    public BookStatus getBookStatus()
    {
        return bookStatus;
    }
    
    
    
    public boolean verifyBookISBNAndCopyNumber(int bookIsbn, int bookCopyNumber)
    {
        boolean correctInfo;
        
        if(bookIsbn == isbn && bookCopyNumber == bookCopy)
        {
            correctInfo = true;
        }
        
        else
        {
            correctInfo = false;
        }
        
        return correctInfo;
    }
    
    
    public boolean verifyBookISBN(int bookIsbn)
    {
        boolean correctInfo;
        
        if(bookIsbn == isbn)
        {
            correctInfo = true;
        }
        
        else
        {
            correctInfo = false;
        }
        
        return correctInfo;
    }
    
    
    public boolean verifyBookStatus(BookStatus status)
    {
        boolean correctInfo;
        
        if(status == bookStatus)
        {
            correctInfo = true;
        }
        
        else
        {
            correctInfo = false;
        }
        
        return correctInfo;
    }
    
    
    public BookStatus updateBookStatus(BookStatus status)
    {
        this.bookStatus = status;
        
        return status;
    }
    
    
    
    
    
    
     public void editBook()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter ISBN: ");
        int bookIsbn = sc.nextInt();
        this.isbn = bookIsbn;
        
        System.out.println("Enter Book copy number: ");
        int bookCopyNumber = sc.nextInt();
        this.bookCopy = bookCopyNumber;
        
        sc.nextLine();
        
        System.out.println("Enter title: ");
        String ttl = sc.nextLine();
        this.title = ttl;
        
        System.out.println("Enter author: ");
        String athr = sc.nextLine();
        this.author = athr;
        
        System.out.println("Enter location: ");
        String lctn = sc.nextLine();
        this.location = lctn;
        
        System.out.println("Enter genre: ");
       String genre = sc.nextLine();
        
        if(genre.equals("Horror"))
        {
            this.type = Type.Horror;
        }
        
        else if(genre.equals("Comedy"))
        {
            this.type = Type.Comedy;
        }
        
        else if(genre.equals("Sci-Fi"))
        {
           this. type = Type.SciFi;
        }
        
        else if(genre.equals("Romance"))
        {
            this.type = Type.Romance;
        }
        
        else if(genre.equals("Educational"))
        {
            this.type = Type.Educational;
        }
        
        
        System.out.println("Enter status: ");
       String status = sc.nextLine();
        
        if(status.equals("Reserved"))
        {
            this.bookStatus = BookStatus.Reserved;
        }
        
        else if(status.equals("Borrowed"))
        {
            this.bookStatus = BookStatus.Borrowed;
        }
        
        else if(status.equals("Available"))
        {
            this.bookStatus = BookStatus.Available;
        }
        
        else if(status.equals("Unavailable"))
        {
            this.bookStatus = BookStatus.Unavailable;
        }  
    }
    
    
    public String toString()
    {
        return "ISBN: " + isbn + " | " + "Book copy number: " + bookCopy + " | " + "Title: " + title + " | " + "Author: " + author + " | " + "Location: " + location + " | " + "Genre: " + type + " | " + "Status: " + bookStatus;
    }
    
}