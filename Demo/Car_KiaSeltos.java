public class Car_KiaSeltos implements Car {

    @Override
    public String BrandName() {
        Brand carBrand = BrandFactory.BrandName(BrandName.Kia);
        return carBrand.getBrandName();
    }

    @Override
    public String Name() {
        return "Seltos";
    }

    @Override
    public float Price() {
        return 32799;
    }
    
}
