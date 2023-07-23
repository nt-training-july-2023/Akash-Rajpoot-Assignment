public class PyramidPattern {
    public static void main(String[] args) {
        // PYRAMID PATTERN WITH NESTED LOOPS
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
