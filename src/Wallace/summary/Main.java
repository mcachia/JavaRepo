package Wallace.summary;

/**
 * Created by mcachia on 04/02/2016.
 */
public class Main {

    public static void main(String[] args) {
        /*
        // 8 primitive types: BaSIL FooD CoB
        // byte, short, int, long = numbers with different max/min they can hold
        // float/double = eg 3.142. DO NOT USE as much as possible
        // char = character eg 'a', '1', '!',  (note the single quote)
        // boolean = true/false

        // variable declaration: <type> <variableName>
        // eg:  String s;
        //      int i;
        //      int a,b,c;
        // with optional assignment:
        //  int i = 0; // creates a variable named i and set it to 0

        // Arrays:
        // <type>[<size>] <variable>;
            int[5] ai;   // creates an array of type i of size 5
        // first element starts from 0

        // Accessing an array:
            ai[0] = 1;   // set 1 to the first element
            ai[4] = 99; // set 99 to the last element as declared above. Range is 0 to (n-1) where n is the size

        // Declaring an array and initializing it immediately:
            int[] ai = {1, 5, 11, 99};    // create an array of size 4 with ai[0] = 1, ai[1] = 5, ai[2] = 11, ai[3] = 99

        // multi-dimensional arrays:
            int[2][4] ai;  // create an array that is 2x4 big.
            ai[1][2] = 12;

        // i++; == increment i by 1
        // i--; == decrement i by 1
        // i*=2; == multiply i by 2

        // boolean comparisons:
        < less than
        > greater than
        == equals to
        != not equals to
        <= less than or equal
        >= greater than or equal

        // boolean operators:
        && = and
        || = or
        !   = not

        eg (i != 2) && (j > 3)

        Loops: 3 types:

        For loop:   for ( <variable initialization> ; <condition> ; <action> ){ }
                    // eg:  for (int i=0; i < 5; i++)


        while..loop:   while(<boolean condition>){ .. do something ... }
                        // eg : while (i < 3) { .... }

        do..while:  do{  ... whatever ... } while ( <boolean condition> );

        // conditions:
        // if..else
        // switch(<var>){ case A: ...; default: ... ; }

        // -------------
        // Visibility
        ////

        public = everyone can access
        protected = subclasses/this package can access
        private = only this class can access

        eg : private int i;  <<<<--- i is only accessible "visible" from the class you are in


        // Methods
        // -------

        <visibility> <return Type> <method name> ( <arguments> ) {
            ... do something
            return value;
        }

        eg
        public int sum (int a, int b){
            return a+b;
        }


        // returning no value from the method - use void:
        public void sayHello(){
            System.out.println("Hello");
        }

        // overloaded methods: same method name, different method signature but return type must not change.
         // eg int sum(int a, int b);
               int sum(int a, int b, int c);   <--- overloaded "sum" method. Same method name ("sum"), but different number or type of parameters


        // Strings
        // -------

        String is ____NOT____ a primitive type in java. String is like most other classes but tends to be used a lot
         so there is some special support from java.

        String s = "hello";

        String methods are all IMMUTABLE, that is, they never change. Anything you do on a string will return a new
        string. Eg:

        s.toUppercase() will not change s, instead you have to do for eg:  s = s.toUpperCase();



        // Classes
        class <nameOfClass> {

        }

        eg class Vehicle { }

        // Extending a class:
        class <nameOfClass> extends <nameofPARENTclass> { }

        // Every class inherits from a parent class, at the very top there's Object.class as the root which is
         // inherited implicitly :
         class Foo { }

         is the same as writing:

         class Foo extends Object { }

        // Eg of extends:
        class Car extends Vehicle { }

        // You can keep extending but you cannot ever have more than 1 parent.
        // This is NOT valid:   class Car extends Vehicle, Transport { }

        // A class is a TEMPLATE like a cookie-cutter or a building blueprint. By itself it does nothing.
        // From this blueprint, you can create any number of INSTANCES that are all of the same form (like in cookie-cutter)
        // but are all distinct. You create a new instance by the use of the keyword "new"

        Car markCar = new Car();   // go create a new instance of type Car. Save it's location in memory to a variable named markCar
        Car wallaceCar = new Car(); // go create a new instance of type Car. Save it's location in memory to a variable named wallaceCar

        // Remember: A class is a TYPE. Each time you create a new class, you're creating a new type.
        // A class can have it's own variables (we call them "fields" usually) and it's own methods.

        class Car {
           String colour;                   // <-- fields

           void changeTheRadioChannel(){    // <-- any methods
           }
        }


        so in the example above:
        markCar.changeTheRadioChannel();  // will invoke the method "changeTheRadioChannel" on the instance *pointed to* by
                                          // the instance markCar. wallaceCar instance is completely unaffected.

        MemoryView (simplified view! it's more efficient than this in practice):
        -------------------------------------------------------------------------------------
       |  Car                         s |  SomeThingElse |   Car                           s |
       |     changeTheRadioChannel()    |                |     changeTheRadioChannel()       |
        --------------------------------------------------------------------------------------
                   ^                                                         ^
                   |                                                         |
                   |                                                         |
                   |                                                         |
        markCar ---                                             wallaceCar --



        so new Car() allocates some chunk of memory with enough space to hold the Car type and returns
        where in memory it created it, this is then stored in the variable you give it ("markCar", "wallaceCar", etc)


        Constructors:

        When you call "new Car()" what that means is:
        * Allocate some space in memory, enough to hold Car type
        * Invoke the no-arg constructor of Car  (because we said: Car()
        * return the reference to it

        A class always has at least one constructor, the default one which looks like this:

        class Car {

            public Car() {  }     // <-- if you don't include a constructor, this is added for you

        }


        If you add your own constructor, it will no longer add a default one:

        class Car {

            public Car(int i){
            }
       }

       You can have any number of overloaded constructors, just like in methods:

       class Car {
           public Car(int i){ }          // #1
           public Car(int a, int b) { }  // #2
           public Car(){ }              // #3
       }

       you invoke constructors at the time you call "new" to create an instance. So in the example above:

       new Car(42);   // invokes the constructor @ #1
       new Car(10, 20);   // invokes the constructor @ #2
       new Car();   // invokes the constructor @ #3



       // "this" keyword

       When you are in a class, "this" refers to "this instance". So if you are in markCar and in some method you have:

       class Car{

          public Car whoAmi(){
              return this;   // returns the current instance it was invoked in i.e returns a reference to myself
          }
       }

        if you call markCar.whoAmi() it will return "markCar" reference if you called it from markCar and wallaceCar if you
        called it from wallaceCar. This is useful for the following scenario:

        Consider:

        class Car {

            String s;       #1

            void foo(String s){
                    s = s;    // <-- you're referring to which "s"? The one marked @ #1 or the argument to this method?
            }

            void bar(String s){
                this.s = s;  // <-- "this." means the instance I'm in i.e. my current memory location
                            // so here you're saying: this.s ==> the field s as defined in the class
                            // this.s = s;   is saying: go take s which is my argument, set it to my instance's "s" field
            }

       }


       // this = my current instance
       // super = my parent's instance i.e. superclass

       class Vehicle {
           void foo() {
                System.out.println("Goodbye");
           }
       }

       class Car extends Vehicle{
           void bar(){
               foo();  // this is like saying: this.foo() so will print hello
               super.foo(); // this is calling the foo method of the super class so will print "Goodbye"
           }

           @Override        // this annotation only checks that you're really overriding a method and didn't do some typo
                            // it doesn't really mean: do the override, but rather it means, make sure I am overriding
           void foo(){      // this method has the same method signature of the parent class so this OVERRIDES
                            // Vehicle's foo() method
                System.out.println("Hello");
           }
       }


        // public, protected, private: these apply here too:

        public class Foo{   // this class is accessible from everywhere
            private String something;  // this field can only be touched in this class
        }


        // Getters, setters
        There's nothing in java which says you have to do them, but it's a common PATTERN (there are lots of patterns).
        In general you lock all fields by marking them as private and only grant access to them via
         accessor methods -- getters and setters. Example:


         public class Foo{
            private String something;  // this field can only be touched in this class

            public String getSomething(){
                 return this.something;
            }

            public void setSomething(String something){
                 this.something = something;
            }
        }

        // Interfaces
         An interface is a CONTRACT. It says: anyone saying they agree to this contract is bound by its rules.
         A class agrees to be bound by using the keyword: "implements"

         class Foo implements SomeInterface{ }

         unlike "extends" a class can implement any number of interfaces:
         class Foo implements SomeInterface, SomeOtherInterface, YetAnotherInterface { }

         An interface (mostly) just declares the methods that are available:

         interface SomeInterface{
             void doSomething();
         }

         so:
          class Foo implements SomeInterface{  // promised to obey the SomeInterface contract

             void doSomething(){   // this has to be somewhere in this class because of this promise
                  ....
               }
          }


          // Abstract classes: An abstract class is an INCOMPLETE class, meaning, it doesn't have the full details
          // Therefore: You cannot instantiate ("new AbstractFoo()") it but otherwise
          * You can extend it
          * You can implement interfaces
          * It's just like a normal class

           Abstract classes are declared by using the keyword: "abstract"

           abstract class AbstractFoo {   // convention: Name your classes AbstractXXX

           }

           You can also declare abstract methods, which means subclasses have to provide an implementation. Abstract
           methods are like saying: hey I'll be providing you with a method that looks like this but the actual
           implementation you'll get later in some subclass

           abstract class AbstractFoo {   // convention: Name your classes AbstractXXX

                 abstract void someMethod();  // note: no body ("{...}")
           }


           class ConcreteClass extends AbstractFoo{

               void someMethod(){
                   // must implement it because declared in parent class
               }
          }

           You can also combine everything together:

            abstract class AbstractFoo implements SomeOtherInterface{ }

            class Foo extends AbstractFoo implements SomeInterface{
                    // this class has to implement SomeInterface and someOtherInterface
            }

            at the end of the day, the JVM has to have a concrete class where all the methods in your interfaces
            have been implemented.


            // Inner classes
             Not very used but this means having a class inside a class:

             class Vehicle {
                class Wheel{
                }
             }

             so you can do new Vehicle().Wheel()

            // Anonymous classes
            Used a lot. This just like a normal class except it has no name, hence anonymous. We use this for
            short-lived classes usually. Eg press a button, something happens. You'd have to create a class
            per button which is messy so instead we don't bother and create anon classes for brevity. All the
            usual class rules apply.

            class Foo{

            new Runnable(){
                ... methods implementing runnable interface here ..
                This creates an anonymous class. On disk you will find it as Foo$1.class
             }

            }

               so the above could have been written as:

               class SomeThing implements Runnable {
                    ... methods implementing runnable interface here ..
               }

               class Foo {
               ....
                 SomeThing something = new SomeThing();
                  new Runnable(something);
               ...
               }


               From Java 8 onwards, this anon class can also be written in an even shorter manner (more later)

               // Typecasting
               This means: "force a type". Let's say you have:

               Vehicle markVehicle = new Car();

               this means: go create a car instance as before, but when you keep the reference, keep it in a Vehicle type.
               Why does this work? Because a car is a vehicle so this is legal.



               :
                -------------------------------------------------------------------------------------
               |  Car                         s |  SomeThingElse |   Car                           s |
               |     changeTheRadioChannel()    |                |     changeTheRadioChannel()       |
                --------------------------------------------------------------------------------------
                           ^                                                         ^
                           |                                                         |
                           |                                                         |
                           |                                                         |
     Vehicle markVehicle ---                                             wallaceCar --


                but now if you call markCar it only knows that it's a Vehicle. You could have said:
                Object markVehicle = new Car();

                so how do we tell the compiler to start treating markVehicle as the type we want? Like this:

                ((Car)markVehicle).changeTheRadioChannel();  // treat markVehicle as as Car type

                // with great power comes great responsibility:
                // This is valid, but blows up at RUNTIME:

                ((Horse)markVehicle).changeTheRadioChannel();  // type cast exception

                you can test for safety like this:

                if (markVehicle instanceof Car) {  // is markVehicle pointing to an instance that is of type Car?
//                   ... now we can typecast safely
                        ((Car)markVehicle).changeTheRadioChannel();  // treat markVehicle as as Car type
                }

                This is very powerful to do something like this:

                public void doSomething(Vehicle v){
                    // now this method can work on Car, Truck, Bus, ... anything that extends Vehicle
                }


                // ---- end of classes

                // Exceptions
                Exceptions are used to interrupt the flow of code:
                 // doLine1();
                 // doLine2WhichBlowsUpWithAnException();
                 // doLine3();

                 in line2, if we do for eg: int i = 1 / 0; it will throw an exception (ArithmeticDivideByZeroException)
                 so line 3 doesn't get done.

                 Type of exceptions:
                 ===================

                 The 2 types are checked and unchecked

                 Unchecked = You are not forced to handle them eg OutOfMemoryException
                 Checked = You are forced to handle them eg FileNotFoundException

                 Handling an exception
                 =====================

                 You can :
                 * catch the exception
                 * throw it out

                 Catching exception:

                 try{
                     .. do something
                     ... If it blows up...
                     } catch (Exception e){  // e is the variable containing the exception that was raised
                        ....it comes here if it blows up and e will reflect what went wrong
                     }

                 // you can have levels of exception, most specific first:
                 try{
                    } catch (FooException e){
                        // if fooException is thrown, come here
                    } catch (Exception e1){
                        // for anything else, come here
                    }

                // You can also create your own exceptions:
                class FooException extends Exception{
                }

                // or with parameters if you want just like a normal class:
                class FooException extends Exception{

                   private String message;

                   public FooException(String message){
                    this.message = message;
                   }
                }


                // Throwing (raising) an exception:
                throw new FooException();
                throw new FooException("Oh no!!");

                // Finally blocks
                try{
                    // do something

                } finally {
                    // this bit always executes
                }

                // You can combine exceptions + finally
                try{
                  ...
                  } catch (Exception e){

                  } finally {

                  }

                sometimes it can get messy if you're not careful:

                try{
                        // something that fails
                   } catch (Exception e){
                   } finally{

                       try{
                          doSomethingThatMightAlsoFailHere();
                          } catch (Exception e){
                          }
                   }

                 Instead of catching exceptions you can also throw them out of the method:

                    void foo() throws SomeException{
                    }

                 so if you're calling foo() you have to, again, either catch it, or throw it out.





                // Collections library
                You can create your own classes, but there are lots of ready-made classes. Some useful ones are:
                java.util.collection

                 mostly: Set, List, Map

                 Set<String> set = new HashSet<>();





































         */



    }
}
