import java.util.ArrayList;
import java.util.List;

public class SessionWithJames {


    public static void main(String args[]) {

        KDataStructure2 kd = new KDataStructure2(2);
        //KDataStructure kd = new KDataStructure(0);
//        kd.add(0);
        kd.add(2);
        kd.add(5);
        kd.add(8);
//        kd.add(1);
//        kd.add(1);
//        kd.add(1);
//        kd.add(2);
//        kd.add(2);
        System.out.println(kd.getProduct());

    }

    //case 0; empy
    //case 1: k > size


    //2,5,2,3,5,1,4,
    //K = 3
    //x    [1][5][2][3][5]


    //prevProd = 60
    //currProd = 30

    //addIndex = 3
    //[2][5][2]
    //[1][10][20]
    //1,4,2,3,2

    //

    static class KDataStructure2 {

        int addIndex;
        int[] intList;
        int lastKToSum;

        public KDataStructure2(int k) {
            this.lastKToSum = k;
            intList = new int[k];

        }

        //divide when removing
        //handle zero by zero counter
        public void add(int x) {
            if(lastKToSum == 0) {
                return;
            }
            intList[addIndex % lastKToSum] = x;
            addIndex++;

        }

        public int getProduct() {
            int product = 1;
            int start = 0;

            if(lastKToSum == 0) {
                return -1;
            }

            if(addIndex == 0) {
                return -1;
            }

            for(int i=0; i<addIndex && i<lastKToSum; i++) {
                product = product * intList[i];
            }

            return product;
        }
    }


    static class KDataStructure {

        List<Integer> intList;
        int lastKToSum;

        public KDataStructure(int k) {
            this.lastKToSum = k;
            intList = new ArrayList<Integer>(k);
        }

        public void add(int x) {
            intList.add(x);
        }

        public void addWithConstraint(int x) {
            intList.add(x);
        }

        public int getProduct() {
            int product = 1;
            int start = 0;

            if( lastKToSum == 0) {
                return -1;
            }

            if(intList.isEmpty()) {
                return -1;
            }

            if(intList.size() > lastKToSum) {
                start = intList.size() - lastKToSum;
            }

            for(int i=start; i<intList.size(); i++) {
                product = product * intList.get(i);
            }

            return product;
        }
    }
}

/**
 KDataStructure kds = new KDataStructure(3);

 kds.add(1);
 kds.add(2);
 kds.add(3);
 System.out.println(kds.getProduct()); // returns 6
 kds.add(4);
 kds.add(5);
 System.out.println(kds.getProduct()); // returns 60
 kds.add(6);
 kds.add(7);
 System.out.println(kds.getProduct()); // returns 210
 kds.add(8);
 kds.add(9);
 System.out.println(kds.getProduct()); // returns 504
 **/