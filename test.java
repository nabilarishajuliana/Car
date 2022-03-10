
package interface3;

import java.util.Scanner;
public class test {

    static Scanner masukkan=new Scanner (System.in);
    
    public static void cetak (userCar nama){
        while(true){
            System.out.println("======== INTERFACE ========");
            System.out.println("[1] Menyalakan Mesin");
            System.out.println("[2] Mematikan Mesin");
            System.out.println("[3] Menambah Kecepatan");
            System.out.println("[4] Mengurangi Kecepatan");
            System.out.println("[0] Keluar");
            System.out.print("pilih >");
           int no=masukkan.nextInt();
            
            //avanza
            switch (no){
                case 1:
                    nama.turnOn();
                    break;
                case 2:
                    nama.turnOff();
                    break;
                case 3:
                    nama.up();
                    break;
                case 4:
                    nama.down();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default :
                System.out.println("salah input!!!!");
    
            }
        } 
    }
    
   
    public static void main(String[] args) {
        int no,mobil;
       
        //objek mobil
        Car avanzaG =new avanza();
        Car tesla=new tesla();
        Car esemka=new esemka();
        Car lambo=new lamborghini(); 
        
        
        //objek user
        userCar lala = new userCar(avanzaG);
        userCar lili = new userCar(tesla);
        userCar lulu = new userCar(esemka);
        userCar mimi = new userCar(lambo);
        
        
        System.out.println("======== MOBIL ========");
        System.out.println("[1] AVANZA");
        System.out.println("[2] TESLA");
        System.out.println("[3] ESEMKA");
        System.out.println("[4] LAMBORGHINI");
        System.out.print("pilih >");
        mobil=masukkan.nextInt();
        
        if (mobil==1){
 
cetak(lala);

        }
        else if (mobil==2){
                  
cetak(lili);
        }
        else if(mobil==3){

cetak(lulu);
        }
        else if (mobil==4){

cetak(mimi);
        }
        else{
            System.out.println("salah input!!!");
            System.exit(0);
        }
        
        
        
//        while(true){
//            System.out.println("======== INTERFACE ========");
//            System.out.println("[1] Menyalakan Mesin");
//            System.out.println("[2] Mematikan Mesin");
//            System.out.println("[3] Menambah Kecepatan");
//            System.out.println("[4] Mengurangi Kecepatan");
//            System.out.println("[0] Keluar");
//            System.out.print("pilih >");
//            no=masukkan.nextInt();
            
            //avanza
//            switch (no){
//                case 1:
//                    lala.turnOn();
//                    break;
//                case 2:
//                    lala.turnOff();
//                    break;
//                case 3:
//                    lala.up();
//                    break;
//                case 4:
//                    lala.down();
//                    break;
//                case 0:
//                    System.exit(0);
//                    break;
//                default :
//                System.out.println("salah input!!!!");
//    
//            }
//        }
    
            
            //tesla
//            switch (no){
//                case 1:
//                    lili.turnOn();
//                    break;
//                case 2:
//                    lili.turnOff();
//                    break;
//                case 3:
//                    lili.up();
//                    break;
//                case 4:
//                    lili.down();
//                    break;
//                case 0:
//                    System.exit(0);
//                    break;
//                default :
//                System.out.println("salah input!!!!");
//    
//            }
            
            //esemka
//            switch (no){
//                case 1:
//                    lulu.turnOn();
//                    break;
//                case 2:
//                    lulu.turnOff();
//                    break;
//                case 3:
//                    lulu.up();
//                    break;
//                case 4:
//                    lulu.down();
//                    break;
//                case 0:
//                    System.exit(0);
//                    break;
//                default :
//                System.out.println("salah input!!!!");
//    
//            }
            
            //lamborghini
//            switch (no){
//                case 1:
//                    mimi.turnOn();
//                    break;
//                case 2:
//                    mimi.turnOff();
//                    break;
//                case 3:
//                    mimi.up();
//                    break;
//                case 4:
//                    mimi.down();
//                    break;
//                case 0:
//                    System.exit(0);
//                    break;
//                default :
//                System.out.println("salah input!!!!");
//    
//            }
            
            
        }
        
    }

    

