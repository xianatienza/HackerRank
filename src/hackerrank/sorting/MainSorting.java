package hackerrank.sorting;

import hackerrank.Helper;

public class MainSorting {

    static int[] dataSet1 = {5,4,9,6,7,1,2,3,11,8,12};
    static int[] dataSet2 = {1,2,3,4,5,6,7,8,9,10,11};

    public static void  main(String[] args)  {

        SortingAlgo sortingAlgo = new BubbleSort();
        sortingAlgo.sort(dataSet1);
        Helper.printArray(dataSet1);


        sortingAlgo.sort(dataSet2);
        Helper.printArray(dataSet2);

    }



}
