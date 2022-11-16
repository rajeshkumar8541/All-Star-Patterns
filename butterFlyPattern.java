package PracticeQuestOFFunctions;

public class butterFlyPattern {
    public static void butterfly(int totalRows){
/* 
        // this is what we are going to make
        
        *        *
        **      **
        ***    ***
        ****  ****
        **********
        **********
        ****  ****
        ***    ***
        **      **
        *        * 
        
 */       

        // outer loop
        for(int i = 1; i<=totalRows; i++){
             int j = 1;
            // stars half part
            for(; j<=i; j++){
                System.out.print("*");
            }
            // for spaces
            for(int k = j; k<=2*totalRows-i; k++){
                System.out.print(" ");
            }
            // for remaining stars
            for(int rem = 1; rem<=i; rem++ ){
                System.out.print("*");
            }System.out.println();
        }
        // reversing the outer loop values for getting mirror of upper
        // as logic is same as above so we dont have to change the inner loop ka logic
        for(int i = totalRows; i>=1;i--){
             int j = 1;
            // stars half part
            for(; j<=i; j++){
                System.out.print("*");
            }
            // for spaces
            for(int k = j; k<=2*totalRows-i; k++){
                System.out.print(" ");
            }
            // for remaining stars
            for(int rem = 1; rem<=i; rem++ ){
                System.out.print("*");
            }System.out.println();
        }

    }


    public static void main(String[] args) {
        butterfly(5);
    }
}
