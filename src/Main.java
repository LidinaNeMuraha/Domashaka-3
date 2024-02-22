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





    }
}