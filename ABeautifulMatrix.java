import java.util.*;
public class ABeautifulMatrix {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int minMove=0;
        int[][] matrix=new int[5][5];
        for(int i=0; i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
                if(matrix[i][j]==1){
                    int row=i+1;
                    int col=j+1;
                    minMove=Math.abs(row-3)+Math.abs(col-3);
                    System.out.println(minMove);
                    return;
                    
                }
            }
        }
        
       
        sc.close();
    }
}
