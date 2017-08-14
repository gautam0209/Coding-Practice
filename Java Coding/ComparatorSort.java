// Write your Checker class here
package hackerrank;

import java.util.*;


class Checker implements Comparator<Player>
{
    public int compare(Player A, Player B)
    {
        if(A.score > B.score)
            return 1;
        else if(B.score > A.score)
            return -1;
        else
        {
            if(A.name.compareTo(B.name)>0)
                return 1;
            else
                return -1;
        }
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}