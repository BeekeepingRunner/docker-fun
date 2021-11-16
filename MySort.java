import java.util.Scanner;

public class MySort {
    
    public static void main(String args[]) {
      
      System.out.println("Podaj ile liczb chcesz wprowadzic: ");
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      
      int[] numbers = new int[n];
      
      for (int i = 0; i < n; ++i) {
      
        System.out.println("Liczba " + (i + 1) + ": ");
        numbers[i] = s.nextInt();
      }
      
      bubbleSort(numbers);
      
      System.out.println("\nPosortowane liczby:");
      for (int num : numbers) {
          System.out.println(num);
      }
    }
    
    private static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
