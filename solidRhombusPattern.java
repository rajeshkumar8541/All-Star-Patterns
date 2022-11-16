package PracticeQuestOFFunctions;

public class solidRhombusPattern{

    public static void rhombus(int n){


        // making this pattern using loops
    //     *****
    //     *****
    //    *****
    //   *****
    //  *****



        // outer loop
        for(int i = 1; i<=n; i++){

            // spaces loop
            
            for(int sp = 1; sp<=n-i; sp++){
                System.out.print(" ");
            }
            
            // stars waala loop
            for(int stars = 1; stars<=n; stars++){
                System.out.print("*");
            }System.out.println();

        }
    }

    public static void main(String[] args) {
        rhombus(5);
    }




}