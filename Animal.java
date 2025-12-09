class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  

        Dog myDog = new Dog();
        myDog.makeSound();     
    }
}