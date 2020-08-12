package hackerrank;

public class SubsetArray {

    public static void main(String[] args) {

        findSubArray(new int[] {1, 2, 3, 7, 5}, 12); //In first test case, sum of elements from 1st position to 3rd position is 12
//
        findSubArray(new int[] {1, 12, 3, 7, 5}, 12);

        findSubArray(new int[] {15, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 15);

        findSubArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 30);
//
        findSubArray(new int[] {1, 2, 3, 4, 5, 1000, 7, 8, 9, 10}, 2000);
    }
    //
    //F
    //L
    //1,2,3,7,5 , k = 2
    //
    //fIndex = 1
    //lIndex = 3
    //currSum = 12
    //

    private static void findSubArray(int[] ints, int k) {
        int fIndex = 0;
        int lIndex = fIndex;
        int sum = ints[fIndex];

        while(lIndex<ints.length-1){

            if(sum == k) {
                System.out.println(fIndex +","+lIndex);
                return;
            }

            if(sum < k) {
                lIndex++;
                sum = sum + ints[lIndex];
            }


            if(sum > k) {
                sum = sum - ints[fIndex];
                fIndex++;
            }
        }
        System.out.println("-1,-1");


    }

    private static void findSubArray2(int[] ints, int k) {

        int fIndex = 0;
        int lIndex = 0;
        int sum = 0;

        for(int i=0;i<ints.length;i++) {
            sum = 0;
            fIndex = i;
            for(int j=fIndex;j<ints.length;j++) {
                sum = sum + ints[j];
                lIndex = j;

                //found
                if(sum == k) {
                    System.out.println(fIndex+","+lIndex);
                    return;
                }

                if(sum > k) {
                    break;
                }
            }
        }
        System.out.println("-1,-1");
    }


}
