public class parte1{
    public static void main(String[] args){
        int[] arr1 = {14,12,30,40};
        int[] arr2 = {4,14,00,30};
        String test = somaDatas(arr1, arr2);
        System.out.println(test);
    }

    public static String somaDatas(int date1[], int date2[]){
        int size = date1.length;
        int day = 0;
        int hour = 0;
        int min = 0;
        int sec = 0;
        String returnString = "";

        for(int i = 0; i < size; i++){
            if(i == 0){
                day = date1[i] + date2[i];
            }
            if(i == 1){
                hour = date1[i] + date2[i];
            }
            if(i == 2){
                min = date1[i] + date2[i];
            }
            if(i == 3){
                sec = date1[i] + date2[i];
            }
        }

        if(sec >= 60){
            sec -= 60;
            min += 1;
        }
        if(min >= 60){
            min -= 60;
            hour += 1;
        }
        if(hour >= 24){
            hour -= 24;
            day += 1;
        }

        returnString = Integer.toString(day) + "D " + Integer.toString(hour) + "H " + Integer.toString(min) + "M " + Integer.toString(sec) + "S ";

        return returnString;
    }
}