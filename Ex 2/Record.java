import java.util.Arrays;
class Record 
{
    String name;
    int age;
    Record(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    public String toString() 
    {
        return name + " (" + age + ")";
    }
}
public class QuickSortRecords 
{
    public static void quickSort(Record[] arr, int low, int high) 
    {
        if (low < high)
         {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static int partition(Record[] arr, int low, int high) 
    {
        Record pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) 
        {
            if (arr[j].age < pivot.age) 
            {
                i++;
                Record temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        Record temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }
    public static void main(String[] args) {
        Record[] records = {
            new Record("Alice", 25),
            new Record("Bob", 20),
            new Record("Charlie", 22)
        };
        quickSort(records, 0, records.length - 1);
        System.out.println("Sorted Records by Age: " + Arrays.toString(records));
    }
}
