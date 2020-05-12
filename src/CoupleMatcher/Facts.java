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
    int length = food.length;

    public void Data() {

        System.out.println("length:" + length);

        //display foods
        System.out.println("select your favourite food:");
        for (int i = 0; i < length; i++) {
            System.out.println(i + 1 + ":" + food[i]);
        }


    }

    public String Selection() {
        //getting input
        for (int i = 0; i < length; i++) {
            if (this.userinput == i) {
                return food[i-1];
            };
        }
        return "not matched";
    }

}
