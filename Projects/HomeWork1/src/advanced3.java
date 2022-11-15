public class advanced3 {
    public static void main(String[] args) {
        

        boolean hasFuel = false;
        boolean hasElectricsProblem = true;
        boolean hasMotorProblems = true;
        boolean hasTransmissionProblem = true;
        boolean hasWheelProblem = true;

        int Fuel = 1000;
        int Motor = 10000;
        int Electrics = 5000;
        int Transmission = 4000;
        int Wheel = 2000;
        double overallPrice;

        if (hasElectricsProblem && hasWheelProblem && hasMotorProblems && hasTransmissionProblem){
            overallPrice = ((Electrics + Wheel + Motor + Transmission) * 0.9) * 0.8;
            System.out.println("К оплате" + " " +overallPrice + ", " + "за консультацию денег не берем");
        }

        else if (hasMotorProblems) {
            overallPrice = Motor;

            if (hasTransmissionProblem && hasMotorProblems && hasElectricsProblem) {
                overallPrice = ((Motor + Electrics + Transmission) * 0.9) * 0.8;

            } else if (hasMotorProblems && hasElectricsProblem) {
                overallPrice = (Motor + Electrics) * 0.9;

            } else if (hasMotorProblems && hasWheelProblem) {
                overallPrice = (Motor + Wheel) * 0.9;

            } else if (hasMotorProblems && hasTransmissionProblem) {
                overallPrice = ((Motor + Transmission) * 0.9) * 0.8;

            }
            System.out.println("К оплате" + " " +overallPrice + ", " + "за консультацию денег не берем");

        } else if (hasElectricsProblem) {
            overallPrice = Electrics;

            if (hasElectricsProblem && hasTransmissionProblem && hasWheelProblem) {
                overallPrice = ((Electrics + Transmission + Wheel) * 0.9) * 0.8;

            } else if (hasElectricsProblem && hasWheelProblem) {
                overallPrice = (Electrics + Wheel) * 0.9;

            } else if (hasElectricsProblem && hasTransmissionProblem) {
                overallPrice = ((Electrics + Transmission) * 0.9) * 0.8;

            }
            System.out.println("К оплате" + " " +overallPrice + ", " + "за консультацию денег не берем");

        } else if (hasTransmissionProblem) {
            overallPrice = Transmission;

            if (hasTransmissionProblem && hasWheelProblem) {
                overallPrice = (Transmission + Wheel) * 0.9;

            }
            System.out.println("К оплате" + " " +overallPrice + ", " + "за консультацию денег не берем");

        } else if (hasWheelProblem) {
            overallPrice = Wheel;
            System.out.println("К оплате" + " " +overallPrice + ", " + "за консультацию денег не берем");

        } else if (hasFuel){
            System.out.println("Ваша машина машина в идеальном состоянии, такого не может быть!");

        } else {
            overallPrice=Fuel;
            System.out.println("К оплате" + " " +overallPrice + " " + "за консультацию");
        }
            }}
