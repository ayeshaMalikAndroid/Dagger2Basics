# Dagger2Basics
Dependency Injection
Giving an object its instance variables.
Dependency injection is a technique whereby one object supplies the dependencies of another object.
object dependencies  to another object or set of objects.
DI eliminating coupling of code.
Automated Dependency Injection
Reflection Based Solutions(Runtime)
Static Solutions(Compile time)
Annotation Processor is a way to read the compiled files during build time to generate source code files to be used in the project.
Dagger is: A tool for generating code to manage dependencies between different objects.
Factory Method
The Factory Method pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.
It defines a method for creating objects, which subclasses can then override to change the type of objects that will be created.
Builder Design Pattern:Builder pattern aims to “Separate the construction of a complex object from its representation so that the same construction process can create different representations.” It is used to construct a complex object step by step and the final step will return the object. The process of constructing an object should be generic so that it can be used to create different representations of the same object.
Dagger 2:
Dagger is a fully static, compile-time dependency injection framework for Java, Kotlin, and Android.
Dagger 2 uses annotations to define dependencies and how they are injected into objects.
behave as a system for us to create required objects.
inject these objects.
manage the lifetime of the objects.
help us write manageable code.
Concept:
Consumer(consume the objects)
Annotation for Consumer(@Inject)
Producer(produce the objects)
Annotation for Producer(@Module,@Provides,@Binds)
Connector(connect the consumer and producer)
Annotation for Connector(@Component)

Understanding Annotation Processors
#Annotations
Annotations are the class of metadata, that can be associated with class, methods, fields and even other annotations. Annotations in Java are used to provide additional information, so it is an alternative option for XML and Java marker interfaces. These methods can also be accessed during the runtime via reflections.

#Annotation Processors
Annotation processors are the code generators that eliminate the boilerplate code, by creating code for you during the compile time. Since it’s compile time, there is no overhead in the performance.

#Why should I know about Annotation Processors?
Dagger 2 works on Annotation processor. So all the code generation is traceable at the compile time. Hence you have
 no performance overhead and its errors are highly traceable.

In the diagram, we have a class Body  that depends on a class Blood . Just like in real life, Body  will have Blood  as a member inside of its class (Body depends on Blood). In addition, we can inject the blood  into the body  using an injection. Of course, we could create a factory inside Body to create Blood,  but this would create boilerplate code. It is better that we just inject it through a dependency injection framework


Dagger is a frameword for implementing dependency Injection.
Is fully static,compile time dependency injection framework.
Compile time checking is performed if dagger can create the required objects.
Annotation Based.
Required code during DI is generated compile time.
 Dagger check during compilation required objects are created or not 
if objects  created then code will generate otherwise it'll throw exception//error .
                                           Dagger 2
Dagger behaves as a system for us to create required objects.
Inject objects.
manage the lifetime of the objects.(object is singleton or not,or required new object of every activity.)
write manageable code.
                                  Concepts of Dagger
Consumer: need objects to perform task.
@Inject(consumer): 
annotation tells Dagger 2 that the class needs an instance of the Dependency class.
 Dagger 2 will then generate code at compile time to create an instance of the Dependency class and inject it into the  class.
Producer:class create objects that are required (provide objects.)
@Module,@Provide,@Binds(Producer)
Connector:bridge between producer and consumer.
@Component(Connector)

Dagger library contain all the annotation that will generate the code for us.
