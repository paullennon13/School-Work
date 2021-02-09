package bag;

public class BagLinkedDriver {
    public static void main(String[] args) {
        LinkedBag <String> words = new LinkedBag<> ();

        words.add("home");
        words.add("sea");
        words.add("home");
        words.add("dog");

        LinkedBag<String> names = new LinkedBag<> ();

        names.add ("sea");
        names.add ("home");
        names.add ("dog");
        names.add ("home");

        System.out.println ("The bags words and names are equal? " + words.equals (names));
        System.out.println ("The bags names and words are equal? " + names.equals (words));


        names.add ("dog");
        words.add ("sea");
        System.out.println ("++++++++++++++++++++++++++++++++");
        System.out.println ("The bags words and names are equal? " + words.equals (names));
        System.out.println ("The bags names and words are equal? " + names.equals (words));

        System.out.print ("How many times \"home\" appears in words? ");
        System.out.println (words.getFrequencyOf ("home"));

        System.out.print ("How many times \"sea\" appears in names? ");
        System.out.println (names.getFrequencyOf ("sea"));


        LinkedBag <String> unionbag = words.union (names);
        Object[] content = unionbag.toArray();


        int len = unionbag.getCurrentSize();

        for (int idx = 0; idx < len; idx++)
            System.out.println(content[idx]);

        System.out.print ("How many times \"sea\" appears in unionbag? ");
        System.out.println (unionbag.getFrequencyOf ("sea"));

        System.out.print ("How many times \"sea\" appears in names? ");
        System.out.println (names.getFrequencyOf ("sea"));
        LinkedBag <String> intersect = names.intersection (words);

        System.out.print ("Is \"dog\" in the intersection? ");
        System.out.println (intersect.contains ("dog") ? "yes" : "no");

        System.out.print ("Is \"lake\" in the intersection? ");
        System.out.println (intersect.contains ("lake") ? "yes" : "no");

        content = intersect.toArray();
        len = intersect.getCurrentSize();
        System.out.println ("=======Intersection========");
        for (int idx = 0; idx < len; idx++)
            System.out.println(content[idx]);

    }
}