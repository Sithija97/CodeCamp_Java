package CoupleMatcher;

public class Matcher {
    public static void MatchMethod() {
        String boyfood = BoyData.BoyInptFood();
        String girlfood = GirlData.GirlInptFood();
        int perce =0;

        //compare-food
        if(boyfood==girlfood){
            System.out.println("food preference is matching\n");
            perce+=50;
        }else {
            System.out.println("food preference is not matching\n");
        }

        String boycountry = BoyData.BoyInptCountry();
        String girlcountry = GirlData.GirlInptCountry();

        //compare-country
        if (boycountry==girlcountry){
            System.out.println("travelling perspective is matching\n");
            perce+=50;
        }else{
            System.out.println("travelling perspective is not matching\n");
        }

        String boyhobby = BoyData.BoyInptHobby();
        String girlhobby = GirlData.GirlInptHobby();

        //compare-hobby
        if (boycountry==girlcountry){
            System.out.println("hobby is matching\n");
            perce+=50;
        }else{
            System.out.println("hobby is not matching\n");
        }

        //overall
        System.out.println("overall "+perce+"%"+" matching\n");
    }
}
