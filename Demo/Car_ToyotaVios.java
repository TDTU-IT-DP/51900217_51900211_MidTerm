public class Car_ToyotaVios implements Car {

    @Override
    public String BrandName() {
        Brand carBrand = BrandFactory.BrandName(BrandName.Toyota);
        return carBrand.getBrandName();
    }

    @Override
    public String Name() {
        return "Vios";
    }

    @Override
    public float Price() {
        return 27224;
    }
    
}
