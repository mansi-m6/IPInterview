package IPInterviewQuestion;
import java.util.Scanner;

class MemoryGameHelper {
	public static void countMethod(int[] numbers, int query) {
        int count = 0;
        // Counts occur if the query number is present in the array
        for (int num : numbers) {
            if (num == query) {
                count++;
            }
        }
        // Check number how many times present or not in array list 
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("NOT PRESENT");
        }
    }

	public class Game {
		public static void main(String[] args) {
    	
			System.out.println("Enter number of player : ");
			Scanner sc = new Scanner(System.in);

			// N is declared for size of array
			int N = sc.nextInt();
        
			int[] numbers = new int[N];
        
			//store the element in to array
			for (int i = 0; i < N; i++) {
        	
				numbers[i] = sc.nextInt();
			}
        
			// Q variable is declared for how meany query we perform
			int Q = sc.nextInt();
			for (int q = 0; q < Q; q++)
			{
				int query = sc.nextInt();
				// Call method 
				countMethod(numbers, query);
			}
		}
	}
}