package Question3;

public class FibonacciSeries implements Runnable{
    int maxNum;
    public FibonacciSeries(int maxNum) {
        this.maxNum = maxNum;
    }

    @Override
    public void run() {
        int tOne = 0;
        int tTwo = 1;
        int nextT = tTwo + tOne;
        for(int i=3;i<maxNum;i++){
            System.out.print(nextT);
            tOne = tTwo;
            tTwo = nextT;
            nextT = tOne+tTwo;
        }
        System.out.println("");
    }
}
