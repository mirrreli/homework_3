import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int num = in.nextInt();
        int a[] = new int[num];
        System.out.print("Enter elements: ");
        for (int i = 0; i < num; i++) {
            a[i] = in.nextInt();
        }
        System.out.print("Enter number to search: ");
        int numToSearch = in.nextInt();
        int low = 0;
        int high = num - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] < numToSearch) {
                low = mid + 1;
            } else if (a[mid] > numToSearch) {
                high = mid - 1;
            } else if (a[mid] == numToSearch) {
                index = mid;
                break;
            }
        }
        System.out.println(index);
    }
}
