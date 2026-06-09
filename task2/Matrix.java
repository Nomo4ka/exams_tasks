public class Matrix {
    private double[][] matr;
    public final int rows;
    public final int cols;

    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        matr = new double[rows][cols];
    }

    Matrix(int rows,int cols, int val) {
        this.rows = rows;
        this.cols = cols;

        matr = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matr[i][j] = val + 1.0;
            }
        }
    }

    private Matrix(double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.matr = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.arraycopy(data[i], 0, this.matr[i], 0, cols);
        }
    }

    public double at(int indexi, int indexj) {
        return matr[indexi][indexj];
    }
    
    public void set(int indexi, int indexj, double val) {
        matr[indexi][indexj] = val;
    }
    
    public static Matrix T(Matrix m) {
        double[][] TransposMatr = new double[m.cols][m.rows];
        for (int i = 0; i < m.rows; i++) {
            for (int j = 0; j < m.cols; j++) {
                TransposMatr[j][i] = m.matr[i][j];
            }
        }

        return new Matrix(TransposMatr);
    }
}
