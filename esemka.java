
package interface3;

/**
 *
 * @author asus
 */
public class esemka implements Car {
   private boolean status;
    private int speed;
    
    esemka(){
        this.speed=60;
    }
    
    
    @Override
    public void startEngine() {
      this.status=true;
      System.out.println("Menyalakan Mesin MOBIL");
      System.out.println("WELCOME ESEMKA USER :)");
    }

    @Override
    public void stopEngine() {
 this.status=false;
        System.out.println("Mematikan Mesin MOBIL");
    }

    @Override
    public void speedUp() {
  if (status){
            if (this.speed==max_speed){
                System.out.println("KECEPATAN SUDAH MAXIMAL");
            }
            else{
                this.speed+=20;
                System.out.println("KECEPATAN SEKARANG="+this.speed+"km/jam");
            }
        }
        else{
            System.out.println("BELUM MENYALAKAN MESIN");
        }
    }

    @Override
    public void speedDown() {
 if (status){
             if (this.speed==min_speed){
                System.out.println("KECEPATAN 0");
            }
            else{
                this.speed-=20;
                System.out.println("KECEPATAN SEKARANG="+this.speed+"km/jam");
            }
 }
   else {
            System.out.println("BELUM MENYALAKAN MESIN");
        }
 }
    

  
    int getspeed(){
        return this.speed;
    }
}
