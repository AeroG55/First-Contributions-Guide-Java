public class Arrays {
    public static void main(String[] args) {
//        int[] marks = {100, 57, 87, 29, 17};
//        marks [0] = 100;
//        marks [1] = 200;
//        marks [2] = 300;
//        marks [3] = 400;
//        marks [4] = 500;
//        System.out.println(marks[4]);
//        System.out.println(marks.length);
//        for (int i = 4;i>=0;i--){
//            System.out.println(marks[i]);
//        for (int element: marks){
//            System.out.println(element);
//
//
//         Multi dimentional array
//
//        int [][] flats = new int[2][3];
//        flats[0][0] = 101;
//        flats[0][1] = 101;
//        flats[0][2] = 101;
//        flats[1][0] = 201;
//        flats[1][1] = 202;
//        flats[1][2] = 203;
//        for (int i = 4;i>=0;i--){
//            boolean[] marks = new boolean[0];
//            System.out.println(marks[i]);
//        }
//
//        // QUESTION 1
//
//        float[] numbers = {12.1F, 12.2F, 12.3F, 12.4F};
//        float sum = 0;
//        for (float element:numbers){
//            sum = sum + element;
//        }
//        System.out.println("addition"+sum);
//
//        //QUESTION 2
//
//
//        float[] guns = {12.1F, 12.2F, 12.3F, 12.4F};
//        float num = 12.1F;
//        boolean isInArray = false;
//        for (float element : guns) {
//            if (num == element) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray) {
//            System.out.println("Number is in the array");
//        } else {
//            System.out.println("Number is not in array");
//        }


        // QUESTION 3

//        int[] nums = {12, 12, 12, 12};
//        int add = 0;
//        for (float element:numbers){
//            nums = new  boolean isSorted = true;
//            int [] arr = {1, 12, 3, 4, 5, 34, 67};
//            for(int i=0;i<arr.length-1;i++){
//                if(arr[i] > arr[i+1]){
//                    isSorted = false;
//                    break;
//                }
//            }
//            if(isSorted){
//                System.out.println("The Array is sorted");
//            }
//            else{
//                System.out.println("The Array is not sorted");
//            }

//            // QUESTION 4
//
//
//            boolean isSorted = true;
//            int [] arr = {1, 12, 3, 4, 5, 34, 67};
//            for(int i=0;i<arr.length-1;i++){
//                if(arr[i] > arr[i+1]){
//                    isSorted = false;
//                    break;
//                }
//            }
//            if(isSorted){
//                System.out.println("The Array is sorted");
//            }
//            else{
//                System.out.println("The Array is not sorted");
//            }
//            boolean isSorted = true;
//            int [] arr = {1, 12, 3, 4, 5, 34, 67};
//            for(int i=0;i<arr.length-1;i++){
//                if(arr[i] > arr[i+1]){
//                    isSorted = false;
//                    break;
//                }
//            }
//            if(isSorted){
//                System.out.println("The Array is sorted");
//            }
//            else{
//                System.out.println("The Array is not sorted");
//            }
//            {(int) (add + element)};
//        }
//        System.out.println("Average is:"+nums/nums.length);
//
//
//
//


        // QUESTION 4

        boolean isSorted = true;
        int [] arr = {4, 5, 78, 24, 66};
       for (int i = 0; i<arr.length-1 ;i++){
           if(arr[i] > arr[i+1]) {
               isSorted = false;
               break;
           }
       }
           if (isSorted){
               System.out.println("ARRAY IS SORTED");
           }
           else {
               System.out.println("ARRAY IS NOT SORTED");
           }
       }
    }

