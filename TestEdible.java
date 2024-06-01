public class TestEdible {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Object[] objects = { new Tiger(), new Chicken(), new Apple(), new Orange() };

        for (int i = 0; i < objects.length; i++) {

            if (objects[i] instanceof Edible) {
                System.out.println(((Edible) objects[i]).howToEat());
            }

            if (objects[i] instanceof Animal) {
                System.out.println(((Animal) objects[i]).sound());
            }

        }

    }

}

abstract class Animal {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /** Return animal sounds **/
    public abstract String sound();
}

class Tiger extends Animal {
    @Override
    public String sound() {
        return "Tiger: ROARRRRRR!!";
    }
}

class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Chicken: Fry it!!";
    }

    @Override
    public String sound() {
        return "Chicken: cook-a-doodle-doo!!";
    }
}

abstract class Fruit implements Edible {
    // Data fields, constructors and methods can be defined here
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple: Make Apple cider";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}