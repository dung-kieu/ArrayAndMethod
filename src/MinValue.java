public class MinValue {
    public static void main(String[] args) {
        int[] arr = {11,2,4,-1,6};
        int index = minValue(arr);
        System.out.println("min :" + arr[index]);
    }

    public  static int minValue(int []a){
        int min =a[0];
        int index = 0;

        for (int i = 1;i<a.length;i++){
            if (a[i]<min){
                min = a[i];
                index = i;
            }
        }
        return index;
    }
}
