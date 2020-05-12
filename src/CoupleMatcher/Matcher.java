package CoupleMatcher;

public class Matcher {
    public static void MatchMethod() {
        String boy = BoyData.BoyInpt();
        String girl = GirlData.GirlInpt();

        //compare-food
        if(boy==girl) System.out.println("food preference is matching\n");
    }
}
