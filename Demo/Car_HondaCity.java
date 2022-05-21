public class Car_HondaCity implements Car {

    @Override
    public String BrandName() {
        Brand carBrand = BrandFactory.BrandName(BrandName.Honda);
        return carBrand.getBrandName();
    }

    @Override
    public String Name() {
        return "City";
    }

    @Override
    public float Price() {
        return 22860;
    }

}