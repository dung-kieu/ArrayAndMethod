import java.util.Scanner;

public class AddToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Array :");
        for (int i : arr)
            System.out.print(i +",");
            System.out.println();
            System.out.println("Enter a number");
            int input = sc.nextInt();
            System.out.println("Enter index to add it:");
            int index = sc.nextInt();
            if(index<0 || index > arr.length){
                System.out.println("Invalid index!!");
            }else{
                arr = addToArray(arr,index,input);
                System.out.println("After Array:");
                for (int i : arr)
                    System.out.print(i +" ");
            }
    }

    private static int[] addToArray(int[] arr,int index,int number ){
        int[] tmp = new int[arr.length+1];
        for( int i =0;i<index;i++){
            tmp[i] =arr[i];
        }

        tmp[index] = number;
        for(int i =index+1;i<tmp.length;i++){
            tmp[i] = arr[i-1];
        }
        return tmp;
    }
}
