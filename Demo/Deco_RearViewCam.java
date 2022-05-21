public class Deco_RearViewCam extends CarDecorator {

    public Deco_RearViewCam(Car car) {
        super(car);
    }

    @Override
    public String Name() {
        return car.BrandName() + " " + car.Name() + " + Rear View Camera";
    }

    @Override
    public float Price() {
        return 17;
    }
}