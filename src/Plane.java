import java.util.concurrent.TimeUnit;
public class Plane {

    public static int getRandomDiceNumber()
    {
        return (int) (Math.random() * 6);
    }



    public static void Type() {

    }

    public static void Chassis() {

    }
    public static void Max_Speed() {

    }
    public static void Flight_Altitude() {

    }
    public static void Flight_Range() {

    }

    public static void Maneuverability(){

    }

    public static void Load_Capacity(){

    }

    public static void main(String[] args) {
        String type;
        String chassis;
        int max_speed=1000;
        int fa= 2000;
        int fr;
        String maneuvr;
        int cap;
        speedup();
        Takeoff(max_speed,fa);
        flyin();
        landing();
        posdka();

    }
    public static void  speedup(){
        System.out.println("самолет разгоняется");
        for (int i=0; i<120;i++){
            System.out.print("км/час");
            System.out.println(i);

            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
        System.out.println("самолет оторвался от земли");
    }

    public static void Takeoff(int max_speed, int fa){

        System.out.println("взлет");
        System.out.printf("Cамолет набирает высоту(speed, altitude)");
        for (int i = 120; i<=max_speed; i=i+2){
            System.out.print(i);
            System.out.print(":");
            System.out.println(i*2);

            try {
                TimeUnit.MILLISECONDS.sleep(25);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("самолет набрал нужную скорость и выосту");

    }
    public static void flyin(){
        System.out.println("прияного полета!");
        for (int i =0;i<=15;i++){
            int x = getRandomDiceNumber();
            System.out.printf("темепература за бортом:"+x +"t");
            System.out.println();


//            System.out.println(x);
//            System.out.print("t");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }

    public static void landing(){
        System.out.println("псадка");
        System.out.printf("Cамолет сбрасывает высоту(speed, altitude)");
        for (int i = 1000; i>120; i=i-2){
            System.out.print(i);
            System.out.print(":");
            System.out.println(i/2);

            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("самолет коснулся земли");

    }
    public static void posdka(){
        System.out.println("самолет cбрасывает скорость");
        for (int i=120; i>0;i--){
            System.out.print("км/час");
            System.out.println(i);

            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
        System.out.println("самолет успешно сел!!!");
        System.out.println("Гамарджоба!!");


    }



}