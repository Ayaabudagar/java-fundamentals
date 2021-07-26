package basiclibrary;

import com.google.common.collect.Sets;

import java.util.*;
import java.util.stream.Collectors;



public class Library {

    public static void main(String[] args) {


        for (int i = 0; i < rolls(4).length; i++) {
            System.out.println(rolls(4)[i]);
        }

        int[] array={1,3,4,5,6};
        System.out.println(containsDuplicates(array));

        System.out.println(arraysAvarege(array));

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        lowestAvg(weeklyMonthTemperatures);
    }


    public static void lowestAvg(int[][] arr){
        ArrayList<Double> finalArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            double sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum=sum+arr[i][j];
            }
            finalArr.add(sum/arr[i].length);
        }
//
        System.out.println(Collections.min(finalArr));
    }

    public static float arraysAvarege(int[] array){
        float sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum=sum+array[i];
        }
        return sum/array.length;
    }


}