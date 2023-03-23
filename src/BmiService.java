public class BmiService {
    public float calculate(float weight, float height) {
        float bmi;
        bmi = weight / (height * height);
    return (int) bmi;
    }
}