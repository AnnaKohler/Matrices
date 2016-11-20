/**
 * Created by Anna on 20.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        double[][] arr={
                {1, 2, 4},
                {2, 0, 3}
        };
        double[][] arr2={
                {2, 5},
                {1, 3},
                {1, 1}
        };
        Matrix m1=new Matrix(arr);
        Matrix m2=new Matrix(arr2);
        Matrix m3=m1.mult(m2);
        /*for(double[] d: m3.arr){
            for(double dd:d){
                System.out.println(dd+" ");
            }
            System.out.println();
        } */

        System.out.println(m1.mult(m2).toString());
        System.out.println(m1.toString());
    }
}
