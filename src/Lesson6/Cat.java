package Lesson6;

class Cat extends Animal {

    public static int countCat = 0;

    Cat(String name, float maxJump, float maxRun, float maxSwim) {
        super("Кот", name, maxJump, maxRun, maxSwim);
        ++countCat;
    }

    @Override
    protected int swim(float distance) {
        return Animal.SWIM_NONE;
    }

}