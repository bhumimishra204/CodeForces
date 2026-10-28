import java.util.*;
public class ALightsOut {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int[][] grid= new int[3][3];
        
         for(int i=0;i<3;i++){
            for(int j=0 ;j<3;j++){
                grid[i][j]=sc.nextInt();
            }
         }
         for(int i=0;i<3;i++){
            for(int j=0 ;j<3;j++){
                 int count=0;
                count+=grid[i][j];

                if (j>=0 && j<2){ //right
                    count=count+grid[i][j+1];
                }

                if(j>0) count+=grid[i][j-1]; //left

                if(i>0) count+=grid[i-1][j] ;//top

                if(i>=0 && i<2) count+=grid[i+1][j] ; //bottom


             if(count%2==0) System.out.print("1");
              else System.out.print("0");
              
            }
            System.out.println();
         }
         
    }
}
