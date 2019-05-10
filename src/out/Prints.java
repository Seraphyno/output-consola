package out;

public class Prints {
  
  public static void main(String[] args) {
    float floatVar = 1.6553453453453F;
    double doubleVar = 1.6553453453453;
    int intVar = 1;
    String stringVar = "text";
  
    System.out.printf("The value of the float variable is %f,\n " +
            "the double: %14.13f, while the value of the integer variable is %d, \n" +
            "and the string is %s", floatVar, doubleVar, intVar, stringVar);
    
    System.out.println("Prints with a new line at the end");
  
    System.out.print("Prints the text");
  }
}
