
package interface3;


public class userCar {
    private Car mobil;

    public userCar(Car car) {
        this.mobil = car;
    }
    
    public void turnOn(){
        this.mobil.startEngine();
    }
    public void turnOff(){
        this.mobil.stopEngine();
    }
    public void up(){
        this.mobil.speedUp();
    }
    public void down(){
        this.mobil.speedDown();
    }
            
}
