package PracticeQuestOFFunctions;

public class zeroesAnd1Pattern {
    public static void zeroAndone(int totalRows,int totalCols){
/* 
        
        1
        01
        101
        0101
        10101

*/
        // outer loop
        for(int i = 1; i<=totalRows; i++){
            // inner loop
            for(int j = 1; j<=i; j++){
                //special cass
                // if i+j == even then Print 1
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }System.out.println();
        }


    }
    public static void main(String[] args) {
        zeroAndone(5,5);
    }
}
