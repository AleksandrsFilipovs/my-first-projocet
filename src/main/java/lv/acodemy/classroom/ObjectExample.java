package lv.acodemy.classroom;

public class ObjectExample {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        System.out.println(barsik.getAge());
        System.out.println(barsik);

        barsik.setAge(5);
        System.out.println(barsik.getAge());

        barsik.speak();
        barsik.feed();
        // create getters and setters for: weight;
        //for all others fields create getter method;
        barsik.setWeight(3.4);
        System.out.println(barsik.getWeight());
        System.out.println(barsik);

        //create Constructor with name, color, breed, gender, hasFur - done
        // Create cat with all these field passed into constructor
        // print your cat


        // My cat's name is: %s, My cat is %d years old. printf;
        Cat marusya = new Cat("Marusya", "black", "sfinks", "famela", true);
        marusya.setWeight(2.2);
        marusya.setAge(1);
        System.out.println(marusya);

        System.out.printf("My cat's name is: %s, My cat is %d years old.", marusya.getName(), marusya.getAge());
        marusya.walk();
        marusya.walk();
        marusya.walk();
        marusya.walk();
        marusya.walk();
        marusya.walk();
        System.out.println(marusya.getCurrentEnergy());

        //Update method feed, so we can feed our cat;
        // Every feed method call increase energy for 1;
        marusya.feed();
        marusya.feed();
        marusya.feed();
        marusya.feed();
        marusya.feed();
        marusya.feed();

    }
}
