public class Main {

    public static final int SIZE = 5;
            ;
    public static final int WIDTH = (SIZE*4)+2;

    public static void main(String[] args) {
        if (SIZE>0 && SIZE<=150) {
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
        else{
            error();
        }
    }

    public static void noseCone() {
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
    public static void sepLine(){
        System.out.print("+");
        for (int i = 0; i < WIDTH/2-1; i++){
            System.out.print("=*");
        }
        System.out.print("+");
        System.out.println();
    }         //prints the seperation Line

    public static void upPoints(){

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
    public static void downPoints(){
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
    public static void error(){
        if (SIZE < 0){
            System.out.println("***************************************************\n");
            System.out.println("Ut OHhhs, Your rocket must exist in order to launch");
            System.out.println("        Try entering a Size larger than 0\n");
            System.out.println("***************************************************\n");

        }
        else if (SIZE > 150){
            System.out.println("********************************************************\n");
            System.out.println("Ut OHhhs, Your Rocket is too big to fit on the launchpad");
            System.out.println("           Try entering a Size less than 150\n");
            System.out.println("********************************************************\n");
        }
        else {
            System.out.println("********************************************************\n");
            System.out.println("   I have a feeling that you did not enter a Number \n");
            System.out.println("********************************************************\n");
        }
    }           // error handling
}

