public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 9;
        int i = 1;
        //Multiplication Table 
        System.out.println("MULTIPLICATION TABLE OF " + num);
        while(i<= 10){
            System.out.println("" +num + " " + i +" "+ num * i+ " ");
            i++;
        }
    }
}
