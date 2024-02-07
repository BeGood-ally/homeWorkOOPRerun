package org.example;

public class Main {
    public static void main(String[] args) {
        //Набираем команду
        Human human1 = new Human(1000, 50, "Serg");
        Human human2 = new Human(1500, 45, "Basya");
        Human human3 = new Human(2000, 60, "Shaya");
        Cat cat1 = new Cat(3000, 70, "Myrzik");
        Cat cat2 = new Cat(7000, 80, "Keshya");
        Cat cat3 = new Cat(5000, 75, "Barsik");
        Robot robot1 = new Robot(2500, 50, "R2D2");
        Robot robot2 = new Robot(3400, 20, "cybear");
        Robot robot3 = new Robot(1300, 100, "bronx");
        //Создаем полосу препятствий
        Wall wall1 = new Wall("wall1", 0, 40);
        Treadmill treadmill1 = new Treadmill("treadmill1", 1700, 0);
        Wall wall2 = new Wall("wall2", 0,70);
        //Устраиваем соревнования
        Competitors.Race();
        }
    }


