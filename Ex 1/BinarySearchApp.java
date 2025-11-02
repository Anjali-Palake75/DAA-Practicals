//Dictionary Word

import java.util.Arrays;
public class BinarySearchApp 
{
    public static void main(String[] args) 
    {
        String[] words = {"Apple", "Ball", "Cat", "Dog", "Elephant"};
        Arrays.sort(words); // ensure sorted
        String key = "Cat";

        int low = 0, high = words.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int cmp = key.compareTo(words[mid]);

            if (cmp == 0) 
            {
                System.out.println(key + " found at index " + mid);
                return;
            } 
            else if (cmp > 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println(key + " not found!");
    }
}