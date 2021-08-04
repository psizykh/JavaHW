package Lesson6;

class Dog extends Animal {

    public static int countDog = 0;
    private static final String thisTypeAnimal = "Пес";

    Dog(String name, float maxJump, float maxRun, float maxSwim) {
        super(thisTypeAnimal, name, maxJump, maxRun, maxSwim);
        ++countDog;
    }



}

