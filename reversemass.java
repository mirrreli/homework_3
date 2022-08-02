import java.util.Scanner;

public class reversemass {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int num = in.nextInt();
        int a[] = new int[num];
        System.out.print("Enter elements: ");
        for (int i = num; i > 0; i--) {
            a[i-1] = in.nextInt();
        }
        System.out.print("Reverse mass: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}
