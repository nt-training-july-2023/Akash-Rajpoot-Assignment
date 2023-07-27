package Multiple_Inheritance;

public class Language extends FrontEnd implements BackEnd{
    String language = "Java";
    @Override
    public void connectServer() {
        System.out.println(language + " can be used as backend language.");
    }
    public static void main(String[] args) {

        // create object of Language class
        Language java = new Language();

        java.connectServer();

        // call the inherited method of Frontend class
        java.responsive(java.language);
    }
}
