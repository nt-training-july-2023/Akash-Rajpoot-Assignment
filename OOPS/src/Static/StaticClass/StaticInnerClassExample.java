package Static.StaticClass;

class StaticInnerClassExample{
    int data=30;
    static class Inner{
//        void msg(){System.out.println("data is "+data);}
        void msg(){
            System.out.println("data is ");
        }
    }
    public static void main(String args[]){
        StaticInnerClassExample.Inner obj=new StaticInnerClassExample.Inner();
        obj.msg();
    }
}
//gives error D:\Training\OOPS\src\Static\StaticInnerClassExample.java:6:50
//java: non-static variable data cannot be referenced from a static conte