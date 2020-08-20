package hackerrank.problems;

public class BiggestHourGlass {

    public int biggestHourGlass(int[][] matrix) {

        int maxArea = 0;
        int currArea = 0;
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                currArea = getHourGlassArea(matrix, i,j);
                if(currArea > maxArea) {
                    maxArea = currArea;
                }
            }
        }

        return maxArea;
    }

    public int getHourGlassArea(int[][] matrix, int x, int y) {

        if(x > 2 || y > 2) {
            return 0;
        }

        int area = matrix[x][y]   + matrix[x+1][y]   + matrix[x+2][y] +
                                    matrix[x+1][y+1] +
                   matrix[x][y+2] + matrix[x+1][y+2]   + matrix[x+2][y+2];

        return area;
    }
}
