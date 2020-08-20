import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public void startApp() {
        getUserInput();
    }

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integer: ");
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i ++) {
            arr.add(scanner.nextInt());
        }

        System.out.println("Enter the K integer: ");
        int k = scanner.nextInt();
        System.out.println(calculateBruteForce(arr, k));
    }

    public boolean calculateBruteForce(ArrayList<Integer> arr, int k) {
        int counter = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum % k == 0 && sum != 0) {
                    counter++;
                    if(counter == arr.size()/2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
