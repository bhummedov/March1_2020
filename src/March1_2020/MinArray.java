package March1_2020;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {-4, 2, 3, 4, -7, 6, 7, 8, -6, 10};
        minValue(arr);
    }

    public static void minValue(int[] arr) {
        int x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (x > arr[i]) {
                    x = arr[i];
                }
            }
        }

            System.out.println("The biggest number in this array is :"+x+".");
        }
    }


