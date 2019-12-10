class Animal
{
  void eat()
{
  System.out.println("Hey I am eating"); 
}

void sleep()
{
System.out.println("Hey I am sleeping");
}
}

class Bird extends Animal
{
 void eat()
{System.out.println("The parrot is eating");}
void sleep()
{System.out.println("The parrot is sleeping");}
void  fly()
{System.out.println("The parrot is flying");}
}
class I1
{
   public static void main(String args[])
{
    Animal a=new Animal();
a.eat();
a.sleep();
Bird b=new Bird();
b.eat();
b.sleep();
b.fly();
}
}
