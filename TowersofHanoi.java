import java.util.*;
/**
 * Write a description of class TowersofHanoi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TowersofHanoi
{
    public static void main(String[] args) 
    {
        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();
        solve(discs, "A", "B", "C");
    }

    public static void solve(int n, String start, String auxiliary, String end) 
    {
        if (n == 1) {
            System.out.println(start + " -> " + end);
        } else {
            solve(n - 1, start, end, auxiliary);
            System.out.println(start + " -> " + end);
            solve(n - 1, auxiliary, start, end);
        }
    }
}
