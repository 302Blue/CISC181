package pkgTest;

import java.util.HashSet;
import java.util.concurrent.PriorityBlockingQueue;

public class FinalReview {
	public static void main(String[] args) {
		HashSet a = new HashSet();
		PriorityBlockingQueue q = new PriorityBlockingQueue();
		
		
		
		
	}
	/*
	 * For the Final Coding Section
	 * 
	 * Do the DAL first, then the BLL, then finally the Client
	 */
	
	/*
	 * SQL
	 * 
	 * Table of SQL JOINS
	 * https://www.codeproject.com/KB/database/Visual_SQL_Joins/Visual_SQL_JOINS_orig.jpg
	 * 
	 * Examples:
	 * https://www.codeproject.com/articles/33052/visual-representation-of-sql-joins
	 * 
	 */
	
	/*
	 * Hibernate
	 * 
	 * Java and SQL are two different languages
	 * 
	 * SQL is for large data 
	 * Large data is a collection of data that is to large for regular computers to handle. Think of 
	 * a database for Wal-mart that contains all of its customers. The size of this would easily be
	 * over a million, which is to large to efficiently work on with Java.
	 * 
	 * 
	 * SQL is only for manipulating data
	 * 
	 * Hibernate is the connection between Java and SQL
	 * 
	 * 
	 * TABLE_A
  PK Value
---- ----------
   1 FOX
   2 COP
   3 TAXI
   6 WASHINGTON
   7 DELL
   5 ARIZONA
   4 LINCOLN
  10 LUCENT

TABLE_B
  PK Value
---- ----------
   1 TROT
   2 CAR
   3 CAB
   6 MONUMENT
   7 PC
   8 MICROSOFT
   9 APPLE
  11 SCOTCH
	 * Modifies the stuff inside a Table
	 * Select - Takes a table and returns table entries that match the select request
	 * Select Value From Table_A
	 * Delete - Deletes an element from a Table
	 * Delete From Table_A Where Value=Taxi
	 * Insert - Add an element to a Table
	 * Update - Modify an element to a Table
	 
	 * 
	 * Modifies the Table itself
	 * Create - Create a new Table
	 * Alter - Modify a Table
	 * Drop - Deletes a Table
	 * 
	 * Modifies the people who can access the Table
	 * Grant/Revoke - Gives and removes permissions
	 * 
	 * Primary Key- 
	 * Cannot be Null
	 * Cannot be changed
	 * 
	 * Surrogate Key 
	 * Can be null
	 * Can be changed
	 * 
	 * 
	 * MISC
 * 
 * HashSet - 
 * Class will remove duplicates
 * Items are in no particular order/position
 * Duplicates are ignored, not exception is thrown
 * Has the methods .clone(), .retainAll(), .add(), .addAll()
 *
 * TreeMap -
 * Class will remove duplicates
 * Items are in a particular order <- THIS IS THE DIFFERENCE FROM ABOVE
 * Each entry has a Key and a Value
 * If you try to add a duplicate, the element with the duplicate
 * Key will have its value updated to the new value
 * Items are referenced by KEy
 * 
 * ProrityBlockingQueue -
 * Used when threads need to communicate
 * One thread acts as a producer and the other acts as a 
 * consumer
 * If the queue is full, the producer will wait until there is
 * space
 * 
 * take() - 
 * Method consumes items
 * Will not throw an exception, will wait until there is an 
 * item to consume
 * 
 * .join() - 
 * Will wait for a thread to die 
 * .join(unit of time in milliseconds) -
 * Will wait for the thread to die, or for the alloted time to
 * pass
 * 
 * Controls
 * 
 * Label - 
 * Used to display data
 * Data is not modified by user, modified by code
 * 
 * ToggleGroup - 
 * Control is invisible
 * Used to cluster items
 * Typically used with radio buttons
 * 
 * Hyperlink - 
 * URL is a property of it
 * When it is clicked it sends the uesr to the given URL
 * 
 * RadioButton - 
 * Used to display a list of choices
 * Items are grouped together
 * When one item is selected the other grouped items
 * are deselected
 * Each item is displayed on the screen at once
 * 
 * Tree View - 
 * Used to display Hierarchical data
 * 
 * SQL
 * 
 * DDL - 
 * Create Alter Drop
 * Data Definition Language
 * 
 * where - 
 * Limits rows returned by Query
 * 
 * Foreign Key - 
 * Points to a primary Key
 * Value can be null
 * Does not have to be unique
 * 
 * Two types of RANK()
 * Given the values
 * 10,20,30,40,40,50  - ranked from low to high
 * In one, duplicates are ranked in the order of
 * 1,2,3,4,4,6 (Duplicates given the same number, but next number is skipped
 * In the other duplicates are ranked in the order of
 * 1,2,3,4,5,6 (No distinction between duplicates)
 * 
 * More MISC
 * Port - 
 * Identifies a specific process on the server
 * Is a 16 bit number 
 * Used in TCP and UDP
 * 
 * HashSet stuff
 * s1 and s2
 * s1 is [1,2,5]
 * s2 is [2,3,6]
 * s1.addAll(s2)
 * s1 is [1,2,3,5,6]
 * 
 * Android - 
 * Manifest File - 
 * Contains version number
 * contains permissions granted, requested
 * May contain default intent
 * May contain min, target, max SDK version
 * 
 * When an Activity is launched the following classes
 * are launced:
 * onCreate()
 * onStart()
 * onResume()
 * 
 * /*
	 * Databases are a collection of schemas
	 * schemas are collections of objects
	 * Databases are relatively new
	 * About 20ish years old
	 * ATM was one of the first things were consumers actually used computers
	 * 
	 * Virtual sequtinal access method - data is stored in the form "What you are looking for"  "Where to find it
	 * DB2 - Database 2 - Operating system for Vseq
	 * Mid 80's push for database
	 * SQL - Structured Query Language, Root language
	 * Oracle - PLC - Extension of SQL
	 * Microsoft - TSQL
	 * Database - collection of data
	 * 9 main commands
	 * DDL - Data definition language  (create - creates an object, alter - alters an object,drop - deletes an object, on object types )
	 * DML - Data manipulation language (update - alters record, delete - deletes record, insert - adds, select - reads record) - deals with rows in tables
	 * Merge - extended command in DML, helper method - takes the data from one table and updates existing records and adds the records if it does not exist
	 * DCL - 
	 * 
	 * Syntax for table - create table x, drop table x
	 * Oracle is a collection of schemas
	 * Schemas are a collection of objects
	 * Table - name, attributes, methods 
	 * Where = rows returned
	 * Select  = columns returned
	 * Drawback of a view - can take a long time
	 * Materialize view - similar to a view, but can store a copy of the data (temptable in sql)
	 * Drawback of materialize view - does not work well with constantly changing data
	 * Each row is an instance of the table
	 * Columns are attributes
	 * Packages
	 * Procedures - returns no value
	 * Function - returns one value
	 * Oracle - no access modifiers for procedures and functions
	 * Package - Collection of procedures and functions
	 * package - defines procedures and functions as private or public in package
	 * Sequences - Similar to UUID
	 * Trigger - Can be dangerous - executed every time the requirements are met 
	 * Trigger - enablesEqualsOff - disables the trigger
	 * Synonyms - function pointer
	 * 
	 * April 5
	 * JDC - Java database connectivity
	 * result set - what is returned from a select - 1 to n cols, and 0 - n rows
	 * simple select statements
	 * select * from emp
	 * * - all cols in the order defined in the database
	 * select first_name,last_name,gender from emp
	 * 
	 * limit columns with conditions between select and from
	 * limit rows with conditions after where
	 * 
	 * check constraint
	 * GENDER IN ('M','F')
	 * GENDER = 'M' OR GENDER = 'F'
	 * 
	 * SID - Service Identifier
	 * Service - Application that works in the background 
	 * 
	 * LINQ - Similar to SQL, code is not tested at runtime, but instead errors are caught at compile time
	 * Table cols are class attributes
	 * 
	 * ORM - object relational mapping - maps an object in java to a table in oracle
	 * 
	 * Primary Key - col that uniquely identifies the row. Must be unique and not null.
	 * Null - absence of value
	 * F - Foreign key - must point to a primary key, does not have to be unique
	 * 
	 * on - joining condition 
	 * union - two result sets combined together - must have same number of cols and data types
	 * union all - same as union, but does not add duplicates 
	 * update with correlated sub-query (extra credit for quiz)
	 * 
	 * * Hash - ignore duplicates
	 * HashSet - will not add duplicate items
	 * Hash - ouputed value on a given object (using algorithm)
	 * Hashcode - part of the object package
	 * When sending data across networks, a hash is created, then both message and hash is sent. Once recieved
	 * the hash is recalculated and checked
	 * 
	 * LinkedList - Each node knows where the next node is
	 * Linked lists are positional
	 * .addLast
	 * .addFirst
	 * .add(index,element)
	 * linkedLists are positional
	 * Hash are duplicates (removes duplicates)
	 * 
	 * Queue - 
	 * pop - removes top item from queue
	 * peak - looks at top of queue
	 * push - add item to top of queue
	 * Priority Queue - 
	 * Similar to a queue, but can pass in a comparator to sort queue and can state max size of the queue
	 * 
	 * HashMap - 
	 * .put(key, value)
	 * if identical keys are passed in, the value is overridden with the new value
	 * 
	 * 
	 * ---------------------Thursday  4/14
	 * Queue - 
	 * Blocking queue
	 * Thread 1 and thread 2
	 * Thread 1 is adding to queue
	 * Thread 2 is taking off queue
	 * Both working at their own pace
	 * Default action when queue is full and something is added - Throws an exception
	 * methods - 
	 * insert - 
	 * .add(o) - 
	 * .offer(o) - will return true or false if it was put on the queue
	 * .put(o) - will try to put an object on the queue and will wait forever
	 * .offer(o, timeout, timeunit) - 
	 * 
	 * remove - 
	 * .remove(o)
	 * .poll() - returns false when there is nothing on queue, otherwise will return next object
	 * .take(o) - will try to take on object on queue and will wait forever
	 * examine - 
	 * .element()
	 * .peek() - looks at top object of the queue and will return false when nothing is on queue
	 * 
	 * extends concurrency class - thread safe
	 * 
	 * send messages across threads using the .notify(o)
	 * 
	 * priority queue and priority blocking queue
	 * -order based
	 * 
	 * hibernate - maps java objects to database tables
	 * 4 things needed for hibernate
	 * Pojo class - plain old java object
	 * mapping file
	 * cgf file
	 * DAL file (data access layer)
	 * 
	 * 
	 * 
	 * Queue - Producer expects there to be a consumer, and some way for the product to get to the consumer
	 * Consumer - expects someone to be adding something to the queue
	 * Asyncronization - Producer produces something and does not wait for confirmation that it has been recieved and handled
	 * Android is Asynchronized
	 * Broadcast and receivers - similar to queues
	 * 
	 * Normal web pages - Get and Post 
	 * Get - gets info
	 * Post - sends info
	 * Running a method with out running Get and Post
	 * AJAX - ASychronize Java Script XML
	 * Cross platform
	 * 
	 * 
	 * * Can not instanciate an abstract class
		 * Abstract method have no implementation, only has signature
		 * Classes that inherit abstract methods must implement the method
		 * Interface - 
		 * public interface iRectangle{
		 * 	void setWidth(int newwidth);
		 *  void setHeight(int newheight);
		 * }
		 * implements (keyword) - inherits interfaces
		 * interface - rule set for a class,  forces a class to 
		 * implement the methods in the interface
		 * interfaces - Restricts access to methods and visibility
		 * jar - collection of java resources and classes (java archive)
		 * war- (web archive) for web servers
		 * Maven - Handles builds, dependences and versions. Also does unit testing
		 * Maven also does templates
		 * pom - Project object model
		 * junit - runs code automatically and tests codes
		 * enum - 
		 * Arraylist - extends List and implements iIterable
		 * Arraylist - list of generics
		 * <...> = List of generics
		 * 
	* Penetration test - How secure is your thing against hackers (cybersecurity)
		 * Negative test - testing obscure input values
		 * Load testing - Testing how many users can use the server at the same time
		 * Unit testing - Smallest level of testing - testing each method - only developers can unit test
		 * Unit testing is meant to be evergreen - always works
		 * 5 annotations for unit testing
		 * @Test - Specifies that the method is a unit testing
		 * @Before class - Executes before any @Tests
		 * @Before - Before each @Test
		 * 
		 * @After class - After all @Tests
		 * @After - After each @Test
		 * Unit testing colors
		 * Green - All @Tests worked
		 * Red - Any @Tests had an runtime error
		 * Black - An @Test failed
		 * How to make sure that all of your code is covered
		 * Eclemma - 
		 * Green  - This statement was executed
		 * Red - This did not execute
		 * Yellow - This condition was not met
		 * Java Reflections - 
		 * Allows you to call methods without creating a class
		 * Third enum - Hand Strength 
		 * 4 tie cards - Hand strength, High hand, low hand, kickers,
		 * static - method can be used by all other classes
		 * try/catch - try the code, catch this error. Try to catch runtime errors at runtime, and then handle them
		 * Exception - predefined class, used to debug if exception is thrown. Where it was thrown 
		 * Once the exception is caught, the exception is cancelled 
		 * Once in a branch, cannot go into another catch
		 * 4 keywords for exceptions
		 * try, catch final - executes after try or catch, throw - packages exception, passes it back to caller and reactivates exception
		 * 
		 * * MultiThreading and parallel programming
	 * Java written with threading in mind
	 * OS - handles scarce resources
	 * Threading - 
	 * OSI Model - How programs communicate to another
	 * Data packet - Large data split into small packets
	 * Priority - more swaps into the CPU
	 * Inner Classes - Classes inside a class
	 * thread.join() - wait for thread to stop before continuing code
	 * thread.isAlice() - returns true if the thread is still running
	 * thread.interrupt() - throw an exception and ends the method. Memory is cleared
	 * thread.yield() - allows another thread to take its cpu cycle
	 * To force threads so one thread runs at once, use synchronize
	 * Synchronized - thread safe, allows only one thread to use a method at once, 
	 * Draw back of threads - no upper limit, use a thread pool to limit max number of threads
	 * ER Diagram - SQL class diagram
	 *  * Button - has a lot of events
	 * Observable list - Like an ArrayList, but can have events
	 * MVC - M(some thing) View Controller
	 * 
	 * * XML - Xtensible markup language
		 * Has data and context in one file
		 * Acts as a common language between computers
		 * XSD - Schema definition file - rule set for an XML
		 * XSD - Checks for proper format
		 * XML - usually generated by code, very rarely coded by hand
		 * Serializesation - Takes an object and creates an xml
		 * deSerializesation - takes an xml and creates an object
		 * @XmlRootElement
		 * Each data field that needs to be added to an xml has a
		 * @XmlElement(name="Some String to override name of variable in the xml file")
		 * private dataType someVariable;
		 * XML serialization is not that special on its own, power
		 * comes from being able to take xml file and convert it
		 * to an object
		 * (To connect to an external server you need three things
		 * ABC
		 * A - address
		 * socket - url address + port number
		 * port - 9999 ports, certain traffic goes through certain 
		 * ports 8080 - internet port. 
		 * Firewall - blocks connection to ports
		 * B - Binding - protocol that you are using
		 * C - Contract - Request response 
		 * 
		 * JSON - javascript object notation
		 * Same thing, but does not have an end tag
		 * 
		 * 
		 * 
		 * UUID - universal unique id
		 * randomId() - generates random id that is unique
		 * private UUID HandID;
		 * in the constructor
		 * HandID = UUID.randomUUID();
		 * storing UUID data can take up large amounts of memory
		 * 
		 * 
		 * 
		 * N-tier archetechture - logic layer, client layer, server layer, Data access layer. Also know as project dependency
		 * 
		 * 
		 * 
		 * CSS - Cascading Style Sheets - 
		 * style sheet - file that describes the style of a control
		 * Cascading allows for multiple style sheets
		 * There can be multiple style sheets
		 * Have a master style and additional styles that can override some of the master style
		 * 
	 * 
	 * 
	 * 
	 * Difference between & and && 
	 * & - and expression.  a and b . Both a and b have to be true for the expression to be true
	 * Truth Table
	 * a|b|a&b
	 * T|T|T
	 * T|F|F
	 * F|T|F
	 * F|F|F
	 * && - Shortcut and operator. With regular and expressions it will evaluate both terms first
	 * With a shortcut operator it will only check if b is true if and only if a is true. If a is
	 * true then there is no way that the expression can be true
	 * 
	 * 
	 * Difference between | and ||
	 * | - or operator. a or b. If a or b is true then the expression is true.
	 * a-b-a|b
	 * T-T-T
	 * T-F-T
	 * F-T-T
	 * F-F-F
	 * || - Shortcut or operator. 
	 * 
	 * 
	 * 
	 * 
	 */
	
}
