import java.util.Scanner;

/**
 * Coded as a part of a summer contest hosted by Virginia Tech's programming team.
 * Problem link:  https://pcs.spruett.me/contests/3/problems/C
 *
 * @author Alyssa Herbst
 * 7/31/16
 */
public class AnnoyingNeighbor
{

    public static void main(String[] args)
    {
        Scanner sc =new  Scanner(System.in);
        int N = sc.nextInt();
        int[] expected = new int[N];
        int[] beats = new int[N];
        int total = sc.nextInt();
        for(int i = 1; i < N; i++) {
            int newBeat = sc.nextInt() - expected[i];
            total -= newBeat;
            beats[i] = newBeat;
            for (int j = i; j < N; j += i) {
                expected[j] += newBeat;
            }
        }
        if(total < 0){
            System.out.print("bad beats");
        }
        else{
            for (int i = 1; i < N; i++)
            {
                if(beats[i] != 0) {
                    System.out.println("1/" + i + " " + beats[i]);
                }
            }
        }
    }
}
