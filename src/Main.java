

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        int Age = 16;
        if (Age < 18) {
            System.out.println("Тебе необходимо немного подождать");
        }
        int childAge = 8;
        if (childAge >= 7) {
            System.out.println("Ребенок может ходить в школу");
        }
        int personAge = 18;
        if (personAge >= 18) {
            System.out.println("Человек окончил школу и может пойти в университет");
        }
        int manAge = 22;
        if (manAge >= 24) {
            System.out.println("Человек окончил университет теперь может пойти работать");
        }
        if (manAge <= 24) {
            System.out.println(" Тебе необходимо закончить образование");
        }
        int man = 86;
        int seatsInTheCar = 102;
        int seating = 60;
        int standing = seatsInTheCar - seating;
        int seatingFree = seating - man;
        int standingFree = standing - (man - seating);
        if (man >= 102) {
            System.out.println("Вагон занят, мест нет");
        }
        ;
        if (man < 60) {
            System.out.println("Сидячих мест в вагоне свободно в количестве" + seatingFree);
        }
        if (man >= 60) {
            System.out.println("Стоячих мест свободно в количестве" + standingFree);
        }

        int ManAge = 17;
        if (ManAge >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else
            System.out.println("Тебе необходимо немного подождать");

        int Person = 6;
        if (Person >= 7) {
            System.out.println("Ты можешь ходить в школу");
        } else
            System.out.println("В школу ходить пока рано");

        int BoyAge = 16;
        if (BoyAge >= 18){
            System.out.println("Ты можешь поступить в университет");
        } else {
            System.out.println("Ты должен окончить школу");}
        int girl = 25;
        if (girl >= 24){
            System.out.println("Ты можешь пойти работать");
        } else
            System.out.println("Тебе необходимо закончить университет");

        int people = 90;
        int seatsInTheVagon = 102;
        int seatingPlace = 60;
        int totalFree =seatsInTheVagon-people;
        int standingPlace = seatsInTheVagon - seatingPlace;
        int seatingPlaceFree = seatingPlace- people;
        if (seatingPlaceFree <= 0){
            System.out.println("Свободных сидячих мест 0");
        }
        int standingPlaceFree = standingPlace -(people-seatingPlace);
        if (people >=102){
            System.out.println("Мест в вагоне нет");
        }else
            System.out.println("Мест свободных в количестве" + totalFree + "стоячих"+ standingPlaceFree);
        int AgeMan = 5;
        if (AgeMan >=2 && AgeMan<=6){
            System.out.println("Человек должен ходить в детский сад в возрасте"+AgeMan);
        }else
            System.out.println("Человек уже взрослый, он не должен ходить в детский сад");
        int AgeGirl = 17;
        if (AgeGirl>=7 && AgeGirl<=18){
            System.out.println("Человек ходит в школу в возрасте" + AgeGirl );
        }else
            System.out.println("Человек не ходит в школу ");

        int human = 24;
        if(human>18 && human<24 && human >=24 ){
            System.out.println("Человеку нужно ходить в университет");
        } else
            System.out.println("Человеку уже" + human + "ему пора ходить на работу" );
        int baby = 3;
        if (baby < 5){
            System.out.println("Ребенок не может кататься на аттракционе");}
        int Baby = 10;

        if (Baby >5 && Baby<14){
            System.out.println("Может кататься только в присутствии взрослого");
        }else
            System.out.println("Может кататься самостоятельно");
        int Baby1 = 15;
        if (Baby1 ==14 && Baby1 >14){
            System.out.println("Ребонок может кататься в сопровождении взрослого");
        }else
            System.out.println("Ребенок может кататься самостоятельно");

        int one = 1;
        int two = 2;
        int free = 3;
        if(free>one||free>two){
            System.out.println("Самое большое число" + free);
        } else if (two>free||two>one){
            System.out.println("Самое большое число" + two);
        }else if (one >two || one>free)
            System.out.println("Самое большое число" + one);

    }}
