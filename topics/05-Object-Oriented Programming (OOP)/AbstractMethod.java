     abstract class Animal {
        abstract void sound(); 
    }
    
    class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }
    }
    
    public class AbstractMethod {
        public static void main(String[] args) {
            Animal DogSound = new Dog();  
            DogSound.sound();             
        }
    }
    
    

