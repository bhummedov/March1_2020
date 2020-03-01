package March1_2020;

public class ArrayWithMethod {
    public static void main(String[] args) {
        numberRandom(1000);
    }

    public static void numberRandom(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1000 + (int) (Math.random() * 4000);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
