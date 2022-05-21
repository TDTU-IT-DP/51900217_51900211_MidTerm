public class Car_HondaCRV implements Car {

    @Override
    public String BrandName() {
        Brand carBrand = BrandFactory.BrandName(BrandName.Honda);
        return carBrand.getBrandName();
    }

    @Override
    public String Name() {
        return "CR-V";
    }

    @Override
    public float Price() {
        return 43127;
    }
    
}
