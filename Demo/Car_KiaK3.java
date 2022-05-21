public class Car_KiaK3 implements Car {

    @Override
    public String BrandName() {
        Brand carBrand = BrandFactory.BrandName(BrandName.Kia);
        return carBrand.getBrandName();
    }

    @Override
    public String Name() {
        return "K3";
    }

    @Override
    public float Price() {
        return 33015;
    }
    
}
