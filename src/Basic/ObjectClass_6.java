package Basic;

public class ObjectClass_6 {

    public static void main(String[] args) {

        int num1=10;
        int num2=20;

        b cal = new b();

        int result= cal.add(num1,num2);

        System.out.println(result);

    }

}

class b
{
    int a;
    public int add(int n1, int n2)
    {
        int r=n1+n2;
        return r;

    }
}


/*
#1
Java is Object- Oriented Programming:-
In the real world, everything is an object like a pen, mouse, glass, etc.
Every object has two things:
An object knows something ( It has some properties)
An object does something( It has a behaviour)
Every object has a property and behaviour. It can also have multiple properties as well as multiple behaviours.
To create an object, first, we need to create a class.
Class act as a blueprint that contains the designing of an object.

#2
JVM creates objects in Java.
JVM creates an object but it requires a blueprint.
 */