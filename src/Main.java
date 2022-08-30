public class Main {
    public static void main(String[] args) {
        homeWork1Task1();
        homeWork1Task2();
        homeWork1Task3();

        homeWork2Task1();
        homeWork2Task2();
        homeWork2Task3();

        homeWork3Task1();
        homeWork3Task2();
        homeWork3Task3();


    }

    private static void homeWork3Task3() {
        int one = 20;
        int two = 14;
        int three = -2;
        if(one > two && one > three) {
            System.out.println("Число " + one + " больше чем " + two + " и больше чем " + three);
        } else if(two > one && two > three) {
            System.out.println("Число " + two + " больше чем " + one + " и больше чем " + three);
        } else if(three > one && three > two) {
            System.out.println("Число " + three + " больше чем " + one + " и больше чем " + two);
        }


    }

    private static void homeWork3Task2() {
        int age = 16;
        if(age < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");}
        else if(age >= 5 && age <= 14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого. Без взрослого кататься нельзя");}
        else if(age >14) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");}

        }


    private static void homeWork3Task1() {
        int age = 1;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человек равен " + age + " лет (года), то ему нужно ходить в детский сад");
        } else if (age <= 1) {
            System.out.println("Если человеку " + age + " год, то ему не нужно ходить в детский сад");
        } else if(age >= 7 && age <= 18){
            System.out.println("Если возраст человек равен " + age + " лет (года), то ему нужно ходить в школу");
        } else if(age > 18 && age <= 24) {
            System.out.println("Если возраст человек равен " + age + " лет (года), то ему нужно ходить в университет");
        } else if(age > 24) {
            System.out.println("Если возраст человек равен " + age + " лет (года), то ему нужно ходить на работу");
        }
    }


    private static void homeWork2Task3() {
        int passengersInWagonNow = 60;
        int wagonCapacityGeneral = 102;
        int wagonCapacitySeating = 60;
        int wagonCapacityStanding = 42;
        if (passengersInWagonNow > wagonCapacityGeneral) {
            System.out.println("Вагон полностью забит, мест больше нет");
        } else if(passengersInWagonNow > wagonCapacitySeating){
            System.out.println("Сидячих мест в вагоне больше нет, осталось " + (wagonCapacityGeneral-passengersInWagonNow) + " стоячих мест(а)");
        } else if (passengersInWagonNow <= wagonCapacitySeating) {
            System.out.println("Осталось " + (wagonCapacitySeating - passengersInWagonNow) + " свободных сидячих мест в вагоне и еще "
                    + (wagonCapacitySeating - passengersInWagonNow + wagonCapacityStanding) + " стоячих мест");
        }
    }

    private static void homeWork2Task2() {
        int age = 22;
        if (age >= 7 && age < 18) {
            System.out.println("Если ребенку " + age + " лет, то он ходит в школу");
        } else if(age >= 18 && age < 24){
            System.out.println("Если человеку " + age + " лет (года), то он уже окончил школу и может отправляться в университет");
        } else if (age > 24){
            System.out.println("Если человеку " + age + " лет (года), то он окончил универститет и ему пора искать первую работу");}
    }


    private static void homeWork2Task1() {
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершенолетием!");
        } else {
            System.out.println("Возраст совершенолетия еще не наступил и нужно еще подождать");
        }
    }


    private static void homeWork1Task3() {
        int passengersInWagonNow = 61;
        int wagonCapacityGeneral = 102;
        int wagonCapacitySeating = 60;
        int wagonCapacityStanding = 42;
        if (passengersInWagonNow > wagonCapacityGeneral) {
            System.out.println("Вагон полностью забит, мест больше нет");
        }

        if (passengersInWagonNow > wagonCapacitySeating && passengersInWagonNow <= wagonCapacityGeneral) {
            System.out.println("Сидячих мест в вагоне больше нет");
        }

        if (passengersInWagonNow <= wagonCapacitySeating) {
            System.out.println("В вагоне осталось " + (wagonCapacitySeating - passengersInWagonNow) + " сидячих мест, оставшиеся " +
                    (wagonCapacityGeneral - wagonCapacitySeating) + " места стоячие");
        }

        if (passengersInWagonNow <= wagonCapacityGeneral && passengersInWagonNow > wagonCapacitySeating) {
            System.out.println("Осталось " + (wagonCapacityGeneral - passengersInWagonNow) + " свободных стоячих мест");
        }
    }


    private static void homeWork1Task2() {
        int age = 8;
        if (age >= 7) {
            System.out.println("Ребенок ходит в школу");}

        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");}

        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");}
    }

    private static void homeWork1Task1() {
        int age = 20;
        if (age >= 18) {
            System.out.println("Поздравляем с совершенолетием!");}

        if (age < 18) {
            System.out.println("Возраст совершенолетия еще не наступил и нужно еще подождать");}
    }
}


