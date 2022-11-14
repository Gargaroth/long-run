public class advanced3 {
    public static void main(String[] args) {

        /* блин, вижу что задача решается просто, но вот решать я ее стал не правильно и не пойму с помощью чего ее надо решать,
        скорее всего цикл, но не уверен, буду рад подсказке какую конструкцию использовать и переделаю, уверен моих знаний достаточно для ее решения  */

        boolean hasFuel = true;
        boolean hasElectricsProblem = true;
        boolean hasMotorProblems = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelProblem = true;

        int Fuel = 1000;
        int Motor = 10000;
        int Electrics = 5000;
        int Transmission = 4000;
        int Wheel = 2000;
        double overallPrice;


        if (hasMotorProblems) {
            overallPrice = Motor;
            if (hasMotorProblems && hasElectricsProblem) {
                overallPrice = (Motor + Electrics) * 0.9;
            } else if (hasMotorProblems && hasWheelProblem) {
                overallPrice = (Motor + Wheel) * 0.9;
            } else if (hasMotorProblems && hasTransmissionProblem) {
                overallPrice = (Motor + Transmission) * 0.9;
            }
            if (hasTransmissionProblem && (hasMotorProblems || hasElectricsProblem)) {
                overallPrice = overallPrice * 0.8;
            }
        } else if (hasElectricsProblem) {
            overallPrice = Electrics;

            if (hasElectricsProblem && hasWheelProblem) {
                overallPrice = (Electrics + Wheel) * 0.9;
            } else if (hasElectricsProblem && hasTransmissionProblem) {
                overallPrice = (Electrics + Transmission) * 0.9;
            }
            if (hasTransmissionProblem && (hasMotorProblems || hasElectricsProblem)) {
                overallPrice = overallPrice * 0.8;
            }
        } else if (hasTransmissionProblem) {
            overallPrice = Transmission;
            if (hasTransmissionProblem && hasElectricsProblem) {
                overallPrice = (Transmission + Electrics) * 0.9;
            } else if (hasTransmissionProblem && hasWheelProblem) {
                overallPrice = (Transmission + Wheel) * 0.9;
            }
            if (hasTransmissionProblem && (hasMotorProblems || hasElectricsProblem)) {
                overallPrice = overallPrice * 0.8;
            }

        } else if (hasWheelProblem) {
            overallPrice = Wheel;
        } else {
            overallPrice = Fuel;
        }
        System.out.println(overallPrice);
    }}
// блин, вижу что легкая задача, но вот решать я ее стал не правильно и не пойму с помощью чего ее надо решать,