package Lesson6;

public class HW6Sizykh {

    public static void main(String[] args) {

        String tempWinEvent = " pass";
        String tempLossEvent = " fail";
        String eventName;
        String eventResult;

        Cat cat1 = new Cat("Simba", 2, 200, 1);
        Cat cat2 = new Cat("Peter", 5, 400, 2);
        Dog dog1 = new Dog("Guf", 0.5f, 500, 10);
        Dog dog2 = new Dog("Balto", 1.5f, 350, 5);

        Animal[] animals = {cat1, cat2, dog1, dog2};

        float jumpLength = 5.7f;
        float runLength = 290;
        float swimLength = 9;

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName() + " может ";

            eventName = "прыгнуть на " + animals[i].getMaxJump() + " м. Пытается прыгнуть на ";
            eventResult = (animals[i].jump(jumpLength)) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, jumpLength, eventResult);


            eventName = "пробежать на " + animals[i].getMaxRun() + " м. Пытается пробежать на ";
            eventResult = animals[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = animals[i].swim(swimLength);
            eventName = "проплыть на " + animals[i].getMaxSwim() + " м. Попытка проплыть на ";
            eventResult = (swimResult == Animal.SWIM_OK) ? tempWinEvent : tempLossEvent;

            if (swimResult == Animal.SWIM_NONE)
                eventResult = " это не получилось, т.к. не умеет плавать";
            result(nameString, eventName, swimLength, eventResult);
        }

        System.out.println("All animals = " + Animal.countAnimal + " > cat count = " + Cat.countCat + " > dog count = " + Dog.countDog);
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " м и" + resultEvent);

    }
}
