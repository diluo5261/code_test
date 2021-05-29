package 接口;

class Food implements  Cloneable {
    private String food = "meat";

    @Override
    public String toString() {
        return "Food{" +
                "food='" + food + '\'' +
                '}';
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


class Animal implements Cloneable{
    String name;
    int age;
    Food food;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        food = new Food();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", food=" + food.toString() +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Animal ret = (Animal) super.clone();
        ret.food = (Food) this.food.clone();
        return ret;


    }
}

public class MyCloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal dog = new Animal("dog",23);
        Animal cat = new Animal("cat",56);
//        Animal a1 = dog.clone(); //此时无法实现clone功能

        Animal a2 = (Animal) dog.clone();
        System.out.println(a2);
        System.out.println(dog);
        System.out.println("*******************");
        dog.food.setFood("gouliang");
        System.out.println(a2);
        System.out.println(dog);


    }
}
