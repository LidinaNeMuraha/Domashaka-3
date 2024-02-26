public class Main {
    public static void main(String[] args) {

        // zadanie 1

        int age = 19;

        if (age <= 18){
            System.out.println("Если возраст человека равен " + age + " то вы несовершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " то вы совершеннолетний");
        }

        // zadanie 2

        int temperatura = 7;

        if (temperatura <= 5) {
            System.out.println("На улице " + temperatura + " градусов. На улице холодно, нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temperatura + " градусов. Сегодня тепло, можно идти без шапки");
        }

        // zadanie 3

        int speed = 65;

        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
        else {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }

        // zadanie 4

        int children = 21;

        if (children >= 2 && children <= 6) {
            System.out.println("Если возраст человека равен " + children + " то ему нужно ходить в детский сад");
        }

        if (children >= 7 && children <= 17) {
            System.out.println("Если возраст человека равен " + children + " то ему нужно ходить в школу");
        }

        if (children >= 18 && children <= 24) {
            System.out.println("Если возраст человека равен " + children + " то ему нужно ходить на работу");
        }
        else if (children == 1) {
            System.out.println("Если возраст человека равен " + children + " то он младенец");
        }

        // zadanie 5

        int rebenok = 4;

        if (rebenok >= 5 && rebenok <=14) {
            System.out.println("Если возраст ребенка равен " + rebenok + " то ему можно кататься на атракционе в сопровождении");
        }
        else if (rebenok > 14) {
            System.out.println("Если возраст ребенка равен " + rebenok + " то ему можно кататься на атракционе без сопровождения взрослого");
        }
        else if (rebenok < 5) {
            System.out.println("Если возраст ребенка равен " + rebenok + " то ему нельзя кататься на атракционе");
        }

        // zadanie 6

        int passasgiri = 101;

        if (passasgiri > 102) {
            System.out.println("Вагон забит полностью");
        }
        else if (passasgiri > 60 && passasgiri < 102) {
            System.out.println("В вагоне есть только стоячие места");
        }
        else if (passasgiri >= 1 && passasgiri <=60) {
            System.out.println("В вагоне есть сидячие места");
        }

        // zadanie 7
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("число" + one + "самое большое");
        }
        else if (two > one && two > three) {
            System.out.println("число" + two + "самое большое");
        }
        else if (three > one && three > two) {
            System.out.println("число " + three + " самое большое");
        }






    }
}