/**
 * Created by Anna on 14.11.16.
 */
public class Matrix {
    int n;
    int m;
    double arr[][];
    Matrix(){
        this.n=1;
        this.m=1;
        this.arr=new double [n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                arr[i][j] = 0;
            }
        }
    }
    Matrix(int n){
        this.n=n;
        this.m=n;
        this.arr=new double [n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                arr[i][j] = 0;
            }
        }
    }
    Matrix(int m, int n){
        this.n=n;
        this.m=m;
        this.arr=new double [n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                arr[i][j] = 0; //
            }
        }
    }
    Matrix(double[][] arrInp){
        this.arr=new double[arrInp.length][arrInp[0].length];
        for(int i=0; i<arrInp.length; i++){
            for(int j=0; j<arrInp[0].length; j++) {
                this.arr[i][j]=arrInp[i][j];
            }
        }
    }
    public String toString(){
        String res="Matrix={\n";
        for(double[] d:this.arr){
            for(double dd:d){
                //res+=("%.2",d);
            }
            res+="\n";
        }
        return res+"}";
    }
    Matrix mult(Matrix m1){
        int sum=0;
        Matrix m2=new Matrix(this.n, m1.m);
        for(int i=0; i<m2.n; i++){
            for(int j=0; j<m2.m; j++){     //Итерация по итоговой матрице
                sum=0;
                for(int k=0; k<this.m; k++){
                    sum+=this.arr[i][k]*m1.arr[k][j];
                }
                m2.arr[i][j]=sum;
            }
        }
        return m2;
    }

}

