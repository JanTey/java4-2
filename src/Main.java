public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 98.5F;
        float height = 1.83F;
//        System.out.println(service.calculate(weight, height));
        int yourBmi = (int) service.calculate(weight, height);
        System.out.println("При весе (weight): " + weight + " и росте (height): " + height);
        System.out.println("индекс массы тела (body mass index) будет равен: " + yourBmi);
    }
}
