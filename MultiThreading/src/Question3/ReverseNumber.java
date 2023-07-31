package Question3;

public class ReverseNumber implements Runnable{
    int maxNum;
    public ReverseNumber(int maxNum) {
        this.maxNum = maxNum;
    }
    @Override
    public void run() {
     for(int i = maxNum;i>=0;i--){
         System.out.print(" "+i);
     }
        System.out.println("");

    }
}
