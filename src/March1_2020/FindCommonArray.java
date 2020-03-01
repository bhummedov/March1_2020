package March1_2020;

public class FindCommonArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {5, 7, 9, 11, 12,2,13,14};
        numberCommon(a, b);
    }
    public static void numberCommon(int[] a, int[] b){
        int num1 = a.length;
        int num2 = b.length;
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                if (a[i] == b[j]) {
                    System.out.print(+a[i]+",");

                }
            }
        }
    }
}

