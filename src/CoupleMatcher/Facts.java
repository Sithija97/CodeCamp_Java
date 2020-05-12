package CoupleMatcher;

import java.lang.*;

public class Facts {

    private int userinput;

    public int getUserinput() {
        return userinput;
    }

    public void setUserinput(int userinput) {
        this.userinput = userinput;
    }

    String food[] = {"rice n curry", "milk-rice", "chineese", "italian", "indian"};
    String country[] = {"Sri Lanka", "Maldives", "USA", "UK", "Aussie", "New-zeland"};
    String hobby[] = {"travelling", "drawing","photography","movies", "music"};
    boolean living;

    public void Data() {

        //display foods
        System.out.println("select your favourite food:");
        for (int i = 0; i < food.length; i++) {
            System.out.println(i + 1 + ":" + food[i]);
        }

        //display country
        System.out.println("select your favourite country:");
        for (int i = 0; i < country.length; i++) {
            System.out.println(i + 1 + ":" + country[i]);
        }

        //display hobby
        System.out.println("select your favourite hobby:");
        for (int i = 0; i < hobby.length; i++) {
            System.out.println(i + 1 + ":" + hobby[i]);
        }


    }

    public String SelectionFood() {
        //getting input
        for (int i = 0; i < food.length; i++) {
            if (this.userinput == i) {
                return food[i-1];
            };
        }
        return "not matched";
    }

    public String SelectionCountry() {
        //getting input
        for (int i = 0; i < country.length; i++) {
            if (this.userinput == i) {
                return country[i-1];
            };
        }
        return "not matched";
    }

    public String SelectionHobby() {
        //getting input
        for (int i = 0; i < hobby.length; i++) {
            if (this.userinput == i) {
                return hobby[i-1];
            };
        }
        return "not matched";
    }

    public boolean SelectionLiving() {
        //getting input
        if(userinput==1){
            return true;
        }
        return false;
    }

}
