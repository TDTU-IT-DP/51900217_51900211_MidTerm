public class Deco_InsulationFilm extends CarDecorator {

    public Deco_InsulationFilm(Car car) {
        super(car);
    }

    @Override
    public String Name() {
        return "Insulation Film";
    }

    @Override
    public float Price() {
        return 302;
    }

}
