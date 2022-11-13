public class advanced3 {
    public static void main(String[] args) {
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblems = false;
        boolean hasTransmissionProblem = false;
        boolean hasWheelProblem = false;

        int Fuel = 1000;
        int Motor = 10000;
        int Electrics = 5000;
        int Transmission = 4000;
        int Wheel = 2000;
        double overallPrice;


        if (hasMotorProblems) {
            overallPrice = Motor;
        }s
        else if (hasElectricsProblem) {
            overallPrice = Electrics;
        }
        else if (hasTransmissionProblem) {
            overallPrice = Transmission;
        }
        else if (hasWheelProblem){
            overallPrice = Wheel;
        }
        else if (hasMotorProblems && hasElectricsProblem) {
            overallPrice = (Motor+Electrics)*0.9;
        }
        else if (hasMotorProblems && hasWheelProblem) {
            overallPrice = (Motor + Wheel) * 0.9;
        }
        else if (hasMotorProblems && hasTransmissionProblem) {
            overallPrice = (Motor + Transmission) * 0.9;
        }
        else if (hasElectricsProblem && hasWheelProblem) {
            overallPrice = (Electrics + Transmission) * 0.9;
        }
        else if (hasTransmissionProblem && hasWheelProblem) {
            overallPrice = (Transmission + Wheel) * 0.9;
        }
        else {
            overallPrice=Fuel;
        }
        System.out.println(overallPrice);
    }
}
