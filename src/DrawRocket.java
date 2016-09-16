// Program Draws a Rocket with Special Characters
// If the Value of constant SIZE is changed So does the size of the Rocket
//Created by Aaron Renfroe Fall 2016
public class DrawRocket {

    private static final int SIZE = 3;

    private static final int WIDTH = (SIZE*4)+2;

    public static void main(String[] args) {

            noseCone();
            sepLine();
            upPoints();
            downPoints();
            sepLine();
            downPoints();
            upPoints();
            sepLine();
            noseCone();

    }

    private static void noseCone() {
        int numberOfSpaces = (WIDTH-4)/2;

        for (int i = 0; i < numberOfSpaces; i++) { //height

            for(int j = 1;j<= numberOfSpaces-i; j++){ //spaces
                System.out.print(" ");
            }

            for(int k = 0;k<=i; k++){ // forward slashes
                System.out.print("/");
            }

            System.out.print("**"); // stars in the middle

            for(int k = 0;k<=i; k++){ // back slashes
                System.out.print("\\");
            }
            for(int j = 1;j<=numberOfSpaces-i; j++){ //spaces
                System.out.print(" ");
            }
            System.out.println("");

        }
    }       //prints nose cone and nozzel
    private static void sepLine(){

        System.out.print("+");

        for (int i = 0; i < WIDTH/2-1; i++){

            System.out.print("=*");
        }

        System.out.print("+");

        System.out.println();

    }         //prints the seperation Line

    private static void upPoints(){

        for (int i = 1; i <=SIZE; i++){
            System.out.print("|");

            for (int j = 1; j <= SIZE-i; j++){ // left periods
                System.out.print(".");
            }
            for (int k = 1; k <=i; k++){
                System.out.print("/\\");
            }
            for (int j = 1; j <= 2*SIZE-(2*i); j++){ // middle periods
                System.out.print(".");
            }

            for (int k = 1; k <=i; k++){
                System.out.print("/\\");
            }

            for (int j = 1; j <= SIZE-i; j++){ // right periods
                System.out.print(".");
            }
            System.out.print("|\n");

        }

    }        //prints ../\..section
    private static void downPoints(){
        for (int i = 1; i <=SIZE; i++){
            System.out.print("|");

            for (int j = 0; j <i-1; j++){ // outside periods
                System.out.print(".");
            }
            for (int k = SIZE-(i-1); k >=1 ; k--){
                System.out.print("\\/");
            }
            for (int j = 0; j <i-1; j++){ // middle periods
                System.out.print("..");
            }

            for (int k = SIZE-(i-1); k >=1 ; k--){
                System.out.print("\\/");
            }

            for (int j = 0; j <i-1; j++){ // outside periods
                System.out.print(".");
            }
            System.out.print("|\n");

        }
    }      //prints ..\/.. section

}

