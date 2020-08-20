package hackerrank;

public class UtopianTree {


    public static void main(String[] args) {

        System.out.println(utopianTree(4));
    }

//    0 = 1
//    1 = 2
//    2 = 3
//    3 = 6
//    4 = 7
//    5 = 14
//    6 = 15
//    7 = 17
    static int utopianTree(int n) {

        int height = 1;
        for(int i=1; i<=n; i++) {
            if(i % 2 == 0) {
                height = height + 1;
            } else {
                height = height * 2;
            }
        }

        return height;

    }

}
