package FitnessTracker;

public class Main {

    public static void main(String[] args) {

        UserData myObject = new UserData();
        myObject.setDuration(30);
        myObject.setWeight(60);

        int a = myObject.getDuration();
        float b = myObject.getWeight();
        System.out.println("Your Weight: "+b + "\nActive Duration: "+a);

        float y = CalculatorMetric.CalFunction();
        System.out.println("Daily Water Intake: "+y);
    }
}
