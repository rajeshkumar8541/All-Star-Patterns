package PracticeQuestOFFunctions;

public class floyddsTriangle {
    public static void fldTr(int totalRows,int totalCols){
        int count = 1;
        for(int outer = 1; outer<=totalRows; outer++){
            for(int inner = 1; inner<=outer; inner++){
                System.out.print(count++ +" ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        fldTr(5,5);
    }
}
