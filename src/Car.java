public class Car implements AutoCloseable {
    @Override
    public void close(){
        System.out.println("Машина жабылып жатат!");
    }

    public void drive() {
        System.out.println("Машина журуп жатат!");
    }
}
