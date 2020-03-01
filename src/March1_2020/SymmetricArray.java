package March1_2020;

public class SymmetricArray {
    public static void main(String[] args) {
        int[]symmetric={1,2,3,3,2,1};
        isSymmetric(symmetric);
    }
    public static void isSymmetric( int[] arr){
        int index= arr.length-1;
        int counter=0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] != arr[index]) {
                counter++;
            }
            index--;
        }
        if(counter==0){
                System.out.println("Symmetric");
            }
        else
            {
                System.out.println("Not Symmetric");
            }
        }
    }


