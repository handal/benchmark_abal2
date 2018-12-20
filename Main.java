import java.util.*;

class Main {

    public static void main(String[] args) {
        Date mulai = new Date();
        forLoop();
        Date akhir = new Date();
        System.out.println("\nStart at : ");
        System.out.println(mulai.toString());
        System.out.println("\nFinished at : ");
        System.out.println(akhir.toString());
        System.out.println("\nTime taken : ");
        float dtime = akhir.getTime() - mulai.getTime();
        System.out.println(dtime);
    }

    public static void forLoop(){
        for (int i = 0; i < 1000000; i++) {
            double a = 22;
            double b = 7;
            double x = (double) a/b;
            double finx = x /b;
            System.out.println(finx);
        }
    }
}