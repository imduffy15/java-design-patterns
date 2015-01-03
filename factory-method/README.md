# Factory method

## Ident

Define an interface for creating an object, but let subclasses decide which class to instantiate.
Factory method lets a class defer instantiation to subclasses

## Applicability

Use the factory method pattern when:

 - A class can't anticipate the class of objects it must create.
 - A class wants its subclasses to specify the objects it creates.
 - Classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is delegated.


![Factory pattern diagram](factory-pattern.png)
