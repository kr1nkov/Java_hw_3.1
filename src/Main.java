import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.90;
        int weight = 100;
        double Bmi = service.calculate(height , weight);
        System.out.println(Bmi);
    }
}
