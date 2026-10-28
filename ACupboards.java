// import java.util.*;
// public class ACupboards {
//     public static void main(String args[]) {
    //     Scanner sc= new Scanner(System.in);
    //     int n= sc.nextInt();
    //     int [][]cupboard=new int[n][2];
    //     int ans=0;
    //     int leftC=0;
    //     int rightC=0;

    //     for(int i=0 ;i<n;i++){
    //         cupboard[i][0]=sc.nextInt();
    //         cupboard[i][1]=sc.nextInt();

    //         if(left == 1) leftC++;
    //         if(right == 1) rightC++;
    //     }
    //     for(int i=0;i<n;i++){
    //        if( cupboard[i][0]==cupboard[i][1]){
    //        ans=0;
    //     } else {
    //             if( cupboard[i][0]!=1)leftC++;
    //        if(cupboard[i][1]!=0) rightC++;
    //     }
    // }
       
        
       
    //      ans=Math.min(leftC ,rightC);
    //      System.out.println(ans)
    //}

import java.util.*;
public class ACupboards {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int leftOpen = 0, rightOpen = 0;

        for(int i = 0; i < n; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            if(left == 1) leftOpen++;
            if(right == 1) rightOpen++;
        }

        int leftClosed = n - leftOpen;
        int rightClosed = n - rightOpen;

        int ans = Math.min(leftOpen, leftClosed) + Math.min(rightOpen, rightClosed);
        System.out.println(ans);
    }
}
