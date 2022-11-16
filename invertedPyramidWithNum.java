package PracticeQuestOFFunctions;

public class invertedPyramidWithNum {

    public static void invPyWiNum(int totalRows,int totalCols){
/* 

        12345
        1234
        123
        12
        1

*/

        

        for(int outer = 1; outer<=totalRows; outer++){
            // inner loop
            
            for(int inner = 1; inner<=totalCols; inner++){
                System.out.print(inner);
            }
            totalCols--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invPyWiNum(5,5);

    }
}
