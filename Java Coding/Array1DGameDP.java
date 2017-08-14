package hackerrank;

import java.util.*;

public class Array1DGameDP {

    private static int win[];
    private static boolean isWin[];

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.

        win = new int[game.length];
        isWin = new boolean[game.length];

        return canWinIndex(0, leap, game);
    }

    public static boolean canWinIndex(int i, int leap, int[] game)
    {
        int n =game.length;

        if(leap == 0)
        {
            for(int g: game)
            {
                if(g == 1)
                    return false;
            }

            return true;
        }

        else {
        if(win[i]== 0) {
            win[i] = 1;
            if (game[i] != 0)
                return false;
            else if (i + leap >= n || i == n - 1)
                return true;
            else if (i == 0 && game[i + leap] != 0 && game[i + 1] != 0)
                return false;
            else if (i != 0 && game[i - 1] != 0 && game[i + leap] != 0 && game[i + 1] != 0)
                return false;
            else
                return isWin[i] = ((game[i + leap] == 0 ? canWinIndex(i + leap, leap, game) : false) || (game[i + 1] == 0 ? canWinIndex(i + 1, leap, game) : false)
                        || (i - 1 > 0 ? canWinIndex(i - 1, leap, game) : false));
        }
            return isWin[i];

        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

