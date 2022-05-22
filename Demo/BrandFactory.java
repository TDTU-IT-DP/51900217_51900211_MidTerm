public class BrandFactory {

    private BrandFactory() {
    }
    
    public static final Brand BrandName(BrandName carBrandName) {
        switch (carBrandName) {
            case Honda:
                return new Brand_Honda();
            case Kia:
                return new Brand_Kia();
            case Toyota:
                return new Brand_Toyota();
            default:
                return null;
            }
    }

}