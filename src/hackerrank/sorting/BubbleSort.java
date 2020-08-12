package hackerrank.sorting;

// 6 4 3 1 8 6 9
public class BubbleSort implements SortingAlgo {

    @Override
    public void sort(int[] dataSet) {
        int runCount =0;
        boolean swapped = true;
        for(int i=0; i<dataSet.length-1; i++ ) {
            if(swapped) {
                swapped = false;
                for(int j=0; j<dataSet.length-1; j++) {
                    runCount++;
                    if(dataSet[j] > dataSet[j+1]) {
                        swap(dataSet, j, j+1);
                        swapped = true;
                    }
                }
            }
        }
        System.out.println("Run count: "+runCount);
    }

    private void swap(int[] dataSet, int x, int y) {
        int temp = dataSet[x];
        dataSet[x] = y;
        dataSet[y] = temp;
    }


}
