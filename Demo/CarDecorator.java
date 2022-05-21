public abstract class CarDecorator implements Car {
    
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public String BrandName() {
        return car.BrandName();
    }

    public String Name() {
        return car.Name();
    }

    public float Price() {
        return car.Price();
    }

}