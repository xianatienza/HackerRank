import java.util.*;


public class LeapGame {

    //leap 5
    //0 0 0 1 1 1 0 0 1 1 0 1 0 1 1 0

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean canWin = false;


        return canWinRecur(0, leap, game);
    }


    //6 3
    //0 0 1 1 1 0
    public static boolean canWinRecur(int i, int leap, int[] game) {

        //Win condition
        if ((i + leap) > game.length-1) {
            return true;
        }


        //leap
        if (game[i + leap] == 0) {
            return canWinRecur(i+leap, leap, game);
        }

        //jump 1
        if(i+1 < game.length -1 && game[i + 1] == 0) {
            return canWinRecur(i+1, leap, game);
        }

        if(i > 1 && game[i - 1] == 0) {
            return canWinRecur(i-1, leap, game);
        }


        return false;
    }
    public static void main(String[] args) {
        System.out.println(canWin(1, new int[]{0,1,0}));
    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int q = scan.nextInt();
//        while (q-- > 0) {
//            int n = scan.nextInt();
//            int leap = scan.nextInt();
//
//            int[] game = new int[n];
//            for (int i = 0; i < n; i++) {
//                game[i] = scan.nextInt();
//            }
//
//            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
//        }
//        scan.close();
//    }
}
