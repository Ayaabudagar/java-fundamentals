package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class App {

    public static String pluralize(String name,int number){
        String result;
        if(number==0 || number > 1  ){
            result= name+"s";
        }else {
            result = name;
        }
        return result;
    }
    public static void flipNHeads(int n){

        int flips = 0;
        int headsNumber = 0;
        while (headsNumber != n){
            flips++;
            Random random = new Random();
            double randomNumber = random.nextDouble();
            if (randomNumber  >= 0.5){
                System.out.println("heads");
                headsNumber = headsNumber + 1;
            }else {
                System.out.println("tails ");
                headsNumber = 0;

            }

        }
        System.out.println("It took " + flips + " flips to flip " + headsNumber + " heads in a row .");
    }
    public static void clock(){
        while (true){

            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
// or, if you're feeling fancy
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            while (second== LocalDateTime.now().getSecond()){

                continue;
            }
            System.out.println(time);
        }

    }



    public static void main(String[] args){

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(1);

                clock();

}
}




