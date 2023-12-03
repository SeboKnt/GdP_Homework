package Woche5;
import java.util.Scanner;

public class TemperatureMeasurements {

    public static String[] runInput(){
        Scanner userinput = new Scanner(System.in);
        System.out.println("Bitte eingeben weil VS Code und nicht intelli");

        String[] tempz = userinput.nextLine().split(" ");  
        return tempz;
    }

    public static float average(float[] dd){
        float sum = 0;
        for (int i = 0; i < dd.length; i++){
            sum = sum + dd[i];
        }
        return sum / dd.length;
    }
/*  SCHAU DA NOCHMAL DRÜBER
    public static float fetchClosestDay(float[] ff, float avg){
        for (int i = 0; i < ff.length; i++){
            float dd = 0;
            if (ff[i] == avg){
                return ff[i];
            }
        }
    }
 */


    public static void main(String[] args){
        String[] data = runInput();

        if (data.length < 3){
            System.out.println("Fehler: Flascher User Input. EXITING");
            System.exit(0);
        }

        final String month = data[0];
        final float[] days = new float[data.length / 2];
        final float[] temps = new float[data.length / 2 + 1];

        for (int i = 1; i < data.length; i += 2){
            days[i / 2] = Float.parseFloat(data[i]);
        }

        for (int i = 2; i < data.length; i += 2){
            temps[i / 2] = Float.parseFloat(data[i]);
        }

        System.out.println("Monat: " + month);
        for (int i = 0; i < days.length; i++){
            System.out.println( days[i] + " " + data[0] + ":" + temps[i] + " degrees");
        }

        System.out.println("Durchschnittstemperatur: " + average(temps));
        //System.out.println("Closest to the average temperature of" + data[0] + ": " + fetchClosestDay(temps));
    }
}