# Software design patterns in Java
This is a repository with examples and practices for software design patterns, written in Java.
> **Important**: Due to design patterns can be applied in different programming languages and these examples have been written down in code just in order to explain better, they are not especifically optimized to the used language (Java).
## Patterns included
### Creational patterns
- **Sigleton**: Restricts the creation of a single one instance of a class in the whole application. 
- **Factory**: Provides an interface to create instances of a superclass, allowing it to decide which subclass to instantiate.
- **Abstract factory**: Provides a super-factory which creates other factories for related objects.
- **Prototype**: Delegates the cloning process to objects, creating copies of themselves without dependency of its classes.
- **Dependency injection**: Makes a class independent of its dependencies receiving other objects that it depends on.
### Structural patterns
- **Decorator**: Adds behavior to existing and internal objects dynamically, without altering its structure or using inheritance.
- **Facade**: Provides an interface for clients to access libraries, frameworks or group of classes hiding their complexity.
- **Proxy**: Intercepts the communication when an object receives a request in order to add funcionality or control access.
- **Data access object (DAO)**: Separates low level data accessing or operations from high business service to access the persistence mechanism.
### Behavioral patterns
- **Command**: Wraps a request and convert it into an independent object containing all the required data for its execution as a command and passed to the invoker.
- **Memento**: Allows to save and restore previous private states of an object hiding its implementation.
- **Observer**: Provides a subscription mechanism to be notified about any event or state change on an observed object.
- **Strategy**: Defines families or sequence of algorithms and place them into different switchable subclasses in the context dynamically.
### Architectural patterns
- **Model-View-Controller (MVC)**: Separates the program logic into three different interconnected objects for data models, presentation views and controllers.

## Run application
- Run: **docker-compose up**