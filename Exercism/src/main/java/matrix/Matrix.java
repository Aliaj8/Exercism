package matrix;

public class Matrix {
    private int row;
    private int clo;
    private int[][] matrix=new int[row][clo];

    public Matrix(String matrixAsString) {
        String[] arrOfMatrix = matrixAsString.split("\n");
        String[] token = arrOfMatrix[0].split(" ");

        this.row=arrOfMatrix.length;
        this.clo=token.length;
        this.matrix=new int[row][clo];

        for (int j = 0; j < row; j++) {
            String[] r1 = arrOfMatrix[j].split(" ");
            for (int i = 0; i < clo; i++) {
                this.matrix[j][i]=Integer.parseInt(String.valueOf(r1[i]));
            }
        }
    }

    public int[] getRow(int rowNumber) {
        int [] rowarr = new int[clo];
        for (int i = rowNumber-1; i < rowNumber; i++) {
            if (clo >= 0) System.arraycopy(matrix[i], 0, rowarr, 0, clo);
        }
        return rowarr;
    }

    public int[] getColumn(int columnNumber) {
        int [] colarr =new int[row];
        for (int i = 0; i < row; i++) {
            for (int j = columnNumber-1; j < columnNumber; j++) {
                colarr[i]=matrix[i][j];
            }
        }
        return colarr;
    }
}
