import java.util.Scanner;

public class MinorDiagonalSum {
    static void diagonalSum(int[][] array, int rows, int cols)
    {
        int sum=0;
        int i=0,j=rows-1;
        while(i<rows && j>=0)
        {
            sum=sum+array[i][j];
            i++;
            j--;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int cols=scanner.nextInt();
        int array[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        diagonalSum(array,rows,cols);

    }
}
