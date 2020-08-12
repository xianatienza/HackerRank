package hackerrank;

public class AreaCount {


    /**
     * 1 1 1 0 0 0 0 0 0 0 0 0
     * 1 0 0 0 0 0 0 0 0 0 0 0
     * 0 0 1 1 0 0 0 0 0 0 0 0
     * 0 0 1 1 1 0 1 1 0 0 0 0
     * 0 0 0 0 0 0 0 0 0 0 0 0
     * 0 0 0 0 0 0 0 0 0 0 0 0
     * 0 1 0 0 1 1 0 1 1 0 0 0
     * 0 1 0 0 0 1 1 1 0 0 0 0
     * 0 1 0 0 0 0 0 0 0 0 0 0
     * 0 1 0 0 0 0 1 1 1 0 0 0
     * 0 0 0 0 0 0 0 1 1 1 0 0
     * 0 0 0 0 0 0 0 0 0 0 0 0
     *
     */

    public static void main(String[] args) {

        int[][] matrix = {
                {1,1,1,0,0,0,0,0,0,0,0,0},
                {1,1,1,0,0,0,0,0,0,0,0,0},
                {0,0,1,1,0,0,0,0,0,0,0,0},
                {0,0,1,1,1,0,1,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,1,1,0,0,0},
                {0,1,0,0,0,1,1,1,0,0,0,0},
                {0,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,1,1,0,0,0,1,1,0,0},
                {0,0,0,0,1,1,1,1,1,1,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0}
        };

        System.out.println(getMaxArea(matrix, 12,12));

    }


    public static int getMaxArea(int[][] matrix, int r, int c) {

        int maxArea = 0;
        int area = 0;
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                area = getArea(matrix,r,c,i,j);
                if(area > maxArea) {
                    maxArea = area;
                }
            }
        }

        return maxArea;
    }

    public static int getArea(int[][] matrix, int r, int c, int x, int y) {

        if(x >= c || y >=r || x < 0 || y < 0) {
            return 0;
        }

        if(matrix[x][y] == 0) {
            return 0;
        }

        //right
        if(matrix[x][y] == 1) {
            matrix[x][y] = -1;
            return 1+ getArea(matrix, r,c, x-1,y) + getArea(matrix, r,c, x,y-1) + getArea(matrix, r,c, x+1,y) + getArea(matrix, r,c, x,y+1);
        }

        return 0;
    }

}
