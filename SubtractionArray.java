import java.util.*;
class SubtractionArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i =0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int sub = arr[0];
        for(int i = 1; i < n; i++) {
            sub = sub - arr[i];
        }
        System.out.println(sub);
        
    }
}