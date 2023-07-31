package Question3;

public class SumOfNumber implements Runnable{
    int maxNum;
    public SumOfNumber(int maxNum) {
        this.maxNum = maxNum;
    }


    @Override
    public void run() {
        int totalSum = 0;
        for(int i = 0;i<maxNum;i++){
             totalSum += i;
        }
        System.out.println("Total Sum is " + totalSum);
    }
}
