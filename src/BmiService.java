public class BmiService {

    public double calculate(double height, int weight) {
        double result = weight / (height * height);
        return result;
    }
}
