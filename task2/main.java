public class Main {
    public static void main(String[] args) {
        Matrix matr = new Matrix(4, 5,1);

        for (int i = 0; i < matr.rows; i++) {
            for (int j = 0; j < matr.cols; j++) {
                System.out.print(matr.at(i, j) + " ");
            }
            System.out.println();
        }

        System.out.println();

        Matrix Tmatr = matr.T();
        for (int i = 0; i < Tmatr.rows; i++) {
            for (int j = 0; j < Tmatr.cols; j++) {
                System.out.print(Tmatr.at(i, j) + " ");
            }
            System.out.println();
        }
    }
}