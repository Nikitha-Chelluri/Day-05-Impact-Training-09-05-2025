import java.util.*;
class EvenArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i =0; i < n; i++) {
            arr[i] = s.nextInt();
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}