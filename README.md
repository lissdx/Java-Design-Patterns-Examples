Resources:  
[http://sourcemaking.com/design_patterns](http://sourcemaking.com/design_patterns)  
Book: Head First Design Pattern

## Java Design Patterns Examples

### The Observer Pattern 
Defines a one-to-many dependency between objects so that when one  
object changes state, all its dependents are notified  
and updated automaticaly.

### The Decorator Pattern 
Attaches additional responsibilities to an  
object dynamically. Decorators provide a flexible alternative to  
subclassing for extending functionality.  

### Abstract Factory Design Pattern
* Provide an interface for creating families of related or dependent objects  
without specifying their concrete classes.
* A hierarchy that encapsulates: many possible "platforms", and  
the construction of a suite of "products".
* The new operator considered harmful.

### Factory Method Design Pattern
* Define an interface for creating an object, but let subclasses  
decide which class to instantiate. Factory Method lets a class defer  
instantiation to subclasses.
* Defining a "virtual" constructor.
* The new operator considered harmful.

### Singleton Design Pattern
* Ensure a class has only one instance,  
and provide a global point of access to it.
* Encapsulated "just-in-time initialization"  
or "initialization on first use".

### Command Design Pattern
* Encapsulate a request as an object, thereby letting you  
parameterize clients with different requests, queue or log  
requests, and support undoable operations.
* Promote "invocation of a method on an object" to full object status
* An object-oriented callback

### Adapter Design Pattern
* Convert the interface of a class into another interface clients expect.  
Adapter lets classes work together that couldn't otherwise because of  
incompatible interfaces.
* Wrap an existing class with a new interface.
* Impedance match an old component to a new system

![alt tag](https://cloud.githubusercontent.com/assets/3389608/7001263/f200b2fa-dc3d-11e4-90c7-aa48483c7b1a.png)
