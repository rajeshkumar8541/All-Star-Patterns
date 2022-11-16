package PracticeQuestOFFunctions;

public class invertedRotatedHFPyrmd {
    public static void invRoHFPy(int totalRows,int totalCols){

/*  This is what we will make
        
         *
        **
       ***
      ****
     *****

*/    

        //outer loops
        for(int row = 1; row<=totalRows; row++){
            //spaces kaa loop
            for(int spaces = 1; spaces<=totalRows-row; spaces++){
                System.out.print(" ");
            } 

            // start waala loop
            for(int star = 1; star<=row; star++){
                System.out.print("*");
            }System.out.println();
        }
    }
        public static void main(String[] args) {
            invRoHFPy(5, 5);
        }
}
