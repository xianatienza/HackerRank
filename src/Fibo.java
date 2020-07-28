public class Fibo {

    public static void main(String[] args) {



       for(int i=1; i<10; i++) {
           System.out.print(" "+fibo(i));
       }
    }

    public static int fibo(int n) {
        int value = 1;
        if(n == 1 || n == 2) {
            //System.out.print(1+" ");
            return value;
        }


        value = fibo(n-2) + fibo(n-1);
        return value;
    }

    public static String fiboIter(int n) {
        StringBuilder sb = new StringBuilder("");
        int prev = 1;
        int curr = 1;
        for(int i=1;i<=n;i++) {
            if(i == 1 || i == 2) {
                sb = sb.append(" 1");
                continue;
            }

            int sum = prev + curr;


            sb.append(" "+sum);
            prev = curr;
            curr = sum;

        }
        return sb.toString();
    }

}
