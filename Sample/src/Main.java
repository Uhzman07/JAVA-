public class Main {
    public static void main(String [] args){

        int setNumber = 20;

        for (int i =1; i<=setNumber; i++){
            if((i % 5) == (i % 7)){
                System.out.println("The values are :" + i );
            }
        }
    }
}
