import java.util.*;
class SameArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first Array1 size: ");
        int n1 = s.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter first Array1 Values: ");
        int Sum1 = 0;
        int Sum2 = 0;
        for(int i =0; i < n1; i++) {
            arr1[i] = s.nextInt();
            Sum1 += arr1[i];
        }
        System.out.println("Enter first Array2 size: ");
        int n2 = s.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter first Array2 Values: ");
        for(int i =0; i < n2; i++) {
            arr2[i] = s.nextInt();
            Sum2 += arr2[i];
        }
        if (Sum1 == Sum2) {
            System.out.println("Same Array");
        }
        else {
            System.out.println("Not Same Array");
        }

    }
}