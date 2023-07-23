class AssignmentOperator {
  public static void main(String[] args) {
    
    // create variables
    int a = 10;
    int var = 0;

    // assign value using =
    var = a;
    System.out.println("var using =: " + var);

    // assign value using =+
    var += a;
    System.out.println("var using +=: " + var);

    // assign value using =*
    var *= a;
    System.out.println("var using *=: " + var);
  }
}