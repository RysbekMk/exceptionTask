public class Main {
    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
            throw new RuntimeException();
        }catch (RuntimeException runtimeException){
            System.out.println();
        }
    }
}