package basiclibrary;

import java.util.*;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args){

        System.out.println( roll(5));
        int[] array = {1,2,3,4,6,1,8};
        System.out.println( containsDuplicates(array));
        System.out.println(  averagesCalculating(array));

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        nestedArray(weeklyMonthTemperatures);


    }
    public static ArrayList roll(int n){
        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        int min = 1;
        int max = 6;
        for (int i = 0; i < n; i++) {
            int random = (int) (Math.random()* (max - min)) + 1;
            resultArray.add(random);
        }
        return resultArray;
    }

    public static boolean containsDuplicates(int[] duplicateArr) {

        for (int i = 0; i < duplicateArr.length; i++) {
            for (int j = 0; j < duplicateArr.length; j++) {
                if (i != j) {
                    if (duplicateArr[i] == duplicateArr[j]) {

                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static double averagesCalculating(int[] array){
        int sum = 0;
        double averag = 0;
        for (int j : array) {
            sum += j;
        }
        averag = (double)sum / array.length;
        return averag;
    }
    public static int[] nestedArray (int[][] array ){
        int [] newArray= array[0];
        for (int i = 0; i <array.length ; i++) {
            if(averagesCalculating(array[i])<averagesCalculating (array[i])){
                newArray=array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}




