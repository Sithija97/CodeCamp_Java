package FitnessTracker;

public class Calculator {
    public static float CalFunction(UserData myobject) {
        int duration = myobject.getDuration();
        float weight = myobject.getWeight();
        float Intake = weight*(2f/3f) + (12f/30f)*duration;
        return Intake;
    }
}
