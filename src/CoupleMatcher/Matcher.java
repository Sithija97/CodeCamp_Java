package CoupleMatcher;

public class Matcher {
    public static void MatchMethod() {
        String boyfood = BoyData.BoyInptFood();
        String girlfood = GirlData.GirlInptFood();

        //compare-food
        if(boyfood==girlfood){
            System.out.println("food preference is matching\n");
        }else {
            System.out.println("food preference is not matching\n");
        }

        String boycountry = BoyData.BoyInptCountry();
        String girlcountry = GirlData.GirlInptCountry();

        //compare-food
        if (boycountry==girlcountry){
            System.out.println("travelling perspective is matching\n");
        }else{
            System.out.println("travelling perspective is not matching\n");
        }
    }
}
