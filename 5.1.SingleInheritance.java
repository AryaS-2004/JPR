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

class SingleInheritance 
{
    public static void main(String[] args) 
    {
        Dog myDog = new Dog();
        myDog.eat();  
        myDog.bark(); 
    }
}
