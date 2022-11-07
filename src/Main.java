public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double dog = 8;
        var cat = 3.6;
        var papper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);

        dog = dog + 4;
        cat = cat + 4;
        papper = papper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        papper = papper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(papper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        var firstFighter = 78.2;
        var secondFighter = 82.7;
        System.out.println(firstFighter);
        System.out.println(secondFighter);
        var total = secondFighter + firstFighter;
        System.out.println(total);
        var difference = secondFighter - firstFighter;
        System.out.println(difference);
        difference = secondFighter % firstFighter;
        System.out.println(difference);

        var allTime = 640;
        var timeOne = 8;
        var workers = allTime / timeOne;
        System.out.println( "Всего работников в компании - " + workers + " человек");
        workers = workers + 94;
        var newTime = workers * timeOne;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + newTime + " часов работы может быть поделено между сотрудниками");
    }
}