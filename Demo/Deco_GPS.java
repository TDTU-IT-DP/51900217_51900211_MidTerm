public class Deco_GPS extends CarDecorator {
    
    public Deco_GPS(Car car) {
        super(car);
    }

    @Override
    public String Name() {
        return "Global Positioning System";
    }

    @Override
    public float Price() {
        return 69;
    }
}
