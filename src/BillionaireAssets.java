import java.util.Scanner;

public class BillionaireAssets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        boolean isValid = false;

        do {
            System.out.print("Enter size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Invalid input. Maximum size is 20!");
            } else {
                isValid = true;
            }
        } while (!isValid);

        double[] assetArray = new double[size];
        for (int index = 0; index < assetArray.length; index++) {
            System.out.printf("Enter asset value of billionaire %d (in billion): ", index + 1);
            assetArray[index] = scanner.nextDouble();
        }

        System.out.println();
        for (int index = 0; index < assetArray.length; index++) {
            System.out.printf("Asset of billionaire %d is %.2f \n", index + 1, assetArray[index]);
        }

        System.out.println();
        System.out.println("Find asset with the most value!");
        double max = 0;
        for (int index = 0; index < assetArray.length; index++) {
            if (assetArray[index] > max) {
                max = assetArray[index];
            }
        }
        System.out.printf("The result is: %.2f", max);
    }
}
