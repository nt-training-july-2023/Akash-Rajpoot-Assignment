import java.util.Scanner;

public class GetCharPosi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int position  = sc.nextInt();
        String str = "Hello world";
        System.out.println(str.charAt(position));
    }
}
