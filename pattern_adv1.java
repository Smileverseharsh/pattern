public class pattern_adv1 {
    public static void main(String[] args) {
        int n=4;
        //upper part
        for (int i=1;i<=n;i++){
            //ineer loop-> for *
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //inner loop -> for space
            for (int s=1;s<=(n-i);s++){
                System.out.print("  ");
            }
             //inner loop -> for space
            for (int s=1;s<=n-i;s++){
                System.out.print("  ");
            }
             //ineer loop-> for *
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower Part
        for (int i=1;i<=n;i++){
            //ineer loop-> for *
            for (int j=1;j<=(n-i+1);j++){
                System.out.print("* ");
            }
            //inner loop -> for space
            for (int s=1;s<=i-1;s++){
                System.out.print("  ");
            }
             //inner loop -> for space
            for (int s=1;s<=(i-1);s++){
                System.out.print("  ");
            }
             //ineer loop-> for *
            for (int j=1;j<=(n-i+1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
