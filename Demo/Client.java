public class Client {
    
    public static void main(String[] args) {
        Car car = new Car_HondaCity();
        CarDecorator autoLock = new Deco_AutomaticLock(car);
        CarDecorator dashCam = new Deco_DashCam(car);
        CarDecorator rearViewCam = new Deco_RearViewCam(car);
        if (car.BrandName().equals(null)) {
            System.out.println("This brand is not supported.");
        } else {
            float total = car.Price() + dashCam.Price() + rearViewCam.Price() + autoLock.Price();
            System.out.println("Total Price of " + car.BrandName() + " " + car.Name() + " with accessories (" + autoLock.Name() + " + " + dashCam.Name() + " + " + rearViewCam.Name() + "): " + total + "$");
        }
    }
    
}
