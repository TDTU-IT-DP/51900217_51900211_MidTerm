public class Deco_AutomaticLock extends CarDecorator {

    public Deco_AutomaticLock(Car car) {
        super(car);
    }

    public String Name() {
        return car.BrandName() + " " + car.Name() + " + Automatic Lock";
    }

    public float Price() {
        return 30;
    }

}