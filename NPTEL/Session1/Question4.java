package Session1;

import java.util.Scanner;
public class Question4 {

    static int findnext(int arr[], int target) {
        int flag = 0, index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                flag = 1;
                index = i;
                break;
            }
        }
        if (flag == 1)
            return index;
        else
            return -1;
    }

    public static void main(String args[]) {

        int arr[] = {5, 8, 9, 23, 45, 67, 89};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (findnext(arr, n) != -1)
            System.out.println(arr[findnext(arr, n)]);
        else
            System.out.println(findnext(arr, n));
    }
}
