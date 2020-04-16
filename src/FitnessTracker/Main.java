package FitnessTracker;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        UserData myobject = new UserData();

        myobject.setDuration(30);
        myobject.setWeight(60);

        float ounces = Calculator.CalFunction(myobject);
        float liters = ounces * 0.0295735f;
        System.out.println("Your Daily Water Intake : "+ String.format("%.2f",ounces)+ " Ounces");
        System.out.println("Your Daily Water Intake : "+ String.format("%.2f",liters)+ " liters");
        System.out.println("---------------------------------------");
    }
}
