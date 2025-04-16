// Multilevel Inheritance Example: Puppy inherits from Dog, which inherits from Animal
class Animal 
{
    void eat() 
    {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal 
{
    void bark() 
    {
        System.out.println("The dog barks.");
    }
}

class Puppy extends Dog 
{
    void play() 
    {
        System.out.println("The puppy plays.");
    }
}

class MultilevelInheritance 
{
    public static void main(String[] args) 
    {
        Puppy myPuppy = new Puppy();
        myPuppy.eat();  
        myPuppy.bark(); 
        myPuppy.play(); 
    }
}
