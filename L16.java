import java.util.*;
public class L16 {
//    TOPIC :- TARGET SUM
//    Q1. Find the total number of pairs in the array whose sum is equal to the given value x.
//    static int findPair(int[] arr,int x){
//        int count = 0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j< arr.length;j++){
//                if(arr[i]+arr[j]==x){
//                    count ++;
//                }
//            }
//        }return count;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size :-");
//        int n = sc.nextInt();
//        System.out.print("Enter the value of x :-");
//        int x = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter elements of array :-");
//        for(int i=0;i<arr.length;i++){
//            arr[i]= sc.nextInt();
//        }
//        System.out.println("The no of required pairs = "+findPair(arr,x));
//    }
//    Q2. count the number of triplets whose sum is equal to given target value.
//    static int countTriplets(int[] arr,int target){
//        int count = 0;
//        int n = arr.length;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                for(int k=j+1;k<n;k++){
//                    if(arr[i]+arr[j]+arr[k]==target){
//                        count++;
//                    }
//                }
//            }
//        }
//        return count;
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of array :-");
//        int n = sc.nextInt();
//        System.out.print("Enter the value of x :-");
//        int x = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter elements of array :-");
//        for(int i=0;i<arr.length;i++){
//            arr[i]= sc.nextInt();
//        }
//        System.out.println("The total no of required triplets are :-"+countTriplets(arr,x));
//    }
//    TOPIC :- ARRAY MANIPULATION
//   Q3. Find the unique number in a given array where all the elements are
//   being repeated twice with one value being unique (i.e, Print the value which comes only once). (Note :-array have only +ve elements)
//    static int findUnique(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    arr[i]= -1;
//                    arr[j]= -1;
//                }
//            }
//        }
//        int unique = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>0){
//                unique = arr[i];
//            }
//        }return unique;
//    }

//    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter the size of array :-");
//            int n = sc.nextInt();
////            System.out.print("Enter the value of x :-");
////            int x = sc.nextInt();
//            int[] arr = new int[n];
//            System.out.println("Enter elements of array :-");
//            for(int i=0;i<arr.length;i++){
//                arr[i]= sc.nextInt();
//            }
//            System.out.println("The unique element is :-"+findUnique(arr));
//    }
//   Q4. Find the second largest element in a given array.
//    static int findMax(int[] arr) {
//        int mx = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > mx) {
//                mx = arr[i];
//            }
//        }return mx;
//    }
//    static int findSecondMax(int[] arr){
//        int mx = findMax(arr);
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==mx){
//                arr[i] = Integer.MIN_VALUE;
//            }
//        }int secondMax = findMax(arr);
//        return secondMax;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of array :-");
//        int n = sc.nextInt();
////            System.out.print("Enter the value of x :-");
////            int x = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter elements of array :-");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("The second maximum element is :-" + findSecondMax(arr));
//    }
//    Q5. Given an array 'a' consisting of integers. Return the first value that
//    is repeatng in this array. If no value is being repeated, return -1.
    static int findrepeating(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                    // this method stop whole method ,
                    // here break only stop the iteration .
                    // So, return is used in place of break
                }
            }
        }return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :-");
        int n = sc.nextInt();
//            System.out.print("Enter the value of x :-");
//            int x = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array :-");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The first repeating element is :-" + findrepeating(arr));
    }

}
