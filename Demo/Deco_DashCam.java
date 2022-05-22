public class Deco_DashCam extends CarDecorator {

    public Deco_DashCam(Car car) {
        super(car);
    }

    @Override
    public String Name() {
        return "Dash Camera";
    }

    @Override
    public float Price() {
        return 164;
    }
}
