# Coding Assignment
This is a repository for coding assignment of 2359Media


## Question 1

A) Test successful and failure cases for the use-case

B) Converted Animal class into interface and declared walk method as default so that Bird and other animals can extend by other classes. As multiple inheritance is not supported in java. Best way is to use Inheritance until it is not really important to make it a class.

## Question 2

A) Override the sing method for Duck

B) Override the canSwim and canFly mehtod defined in Bird class and convert Bird to abstract as every type of Bird can have comination values for canSwim and canFly

C) Override the sing method for Chicken

D) Override canSwim and canFly methods for Chicken class

## Question 3

A) Override the sing method for Rooster

B) Rooster is a sub-class of a Chicken therefore it can be inherited

C) We can model Rooster and Chicken as Composition with HAS-A relationship as it will avoid extending the class and we will have an opportunity to extend it with any other class when needed

## Question 4

A,B,C) To make this less complex we can have a overloaded mehtod for sing which takes a habitat as input and replies with the cooresponding response after comparing the habitat

D) We can have multiple implementations and decide the implementation to be called by strategy design pattern. The benifit of that will be in case we add more type of parrots we just need to add their implementation, which will allow us to add the code and no existing code will be modified. All other implementations will remain same. Just the strategy method deciding which implementation to call will be modified


## Question B

### Part-1

A, B) Moved sing and walk method from Animal class to Bird as this functionality is specifc to Birds

C) Override swim method to return a true value for Fish

### Part-2

A,B,C,D) Made special classes for Shark and Clownfish which will override and describe their own size, colour and behaviour of what they do

### Part-3

A) We can do composition for Dolphin to be a fish

B) There can be multiple ways to do it. Abstract classes or default methods can be used to avoid duplicate code
 