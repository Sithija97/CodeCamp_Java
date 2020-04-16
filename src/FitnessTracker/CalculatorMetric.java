package FitnessTracker;

public class CalculatorMetric {
    //LogicFunction
    public static float CalFunction() {

        UserData DataObject = new UserData();
        float UserWeight = DataObject.getWeight();
        int UserDuration = DataObject.getDuration();


//        float Intake = ((UserWeight)*(2/3)) + ((12/30)*UserDuration);
//        double output = Intake;
        float Intake = UserWeight * (2 / 3);
        return Intake;

    }
}
