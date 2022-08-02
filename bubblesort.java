import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int num = in.nextInt();
        int a[] = new int[num];
        System.out.print("Enter elements: ");
        for (int i = 0; i < num; i++) {
            a[i] = in.nextInt();
        }
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    isSorted = false;

                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
