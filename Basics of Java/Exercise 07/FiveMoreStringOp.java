public class FiveMoreStringOp {
    public static void main(String[] args) {
        String str = "  Welcome To NucleusTeq ";

        // trim method
        System.out.println(str.trim());
        //Split
        String words[] = str.split(" ");
        for(String st : words){
            System.out.println(st);
        }
        //Substring 
        String demo2 = str.substring(5,9);
        System.out.println(demo2);

        //String toLowerCase
        String demo3 = str.toLowerCase();
        System.out.println(demo3);

        //isEmpty()
        System.out.println(str.isEmpty());
    }
}
