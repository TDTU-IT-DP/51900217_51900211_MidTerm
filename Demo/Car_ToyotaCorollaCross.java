public class Car_ToyotaCorollaCross implements Car {

    @Override
    public String BrandName() {
        Brand carBrand = BrandFactory.BrandName(BrandName.Toyota);
        return carBrand.getBrandName();
    }

    @Override
    public String Name() {
        return "Corolla Cross";
    }

    @Override
    public float Price() {
        return 40448;
    }
    
}
