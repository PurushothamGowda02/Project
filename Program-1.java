public class Calculator{
  private double a;
  private double b;
  private String operation;
  public Calculator(double a, double b, String operation)
  {
    this.a = a;
    this.b = b;
    this.operation = operation;
  }
  public double performoperation() {
    double result 0.0;
    switch(operation){
      case "add";
        result = a + b;
        break;
      case "subtract";
        result = a- b;
        break;
      case "multiply";
        result = a * b;
        break;
      case "divide";
        if(b != 0){
          result = a / b;
        }else{
          System.out.println(" Error cannot divide by zero");
        }
        break;
        default;
          System.out.println("Error invalid operation"):
            }
    return result;
  }
  public static void main?(String[]args){
    double a = 5.0;
    double b = 2.0;
    String operation = "addd";
    Calculator calculator = new Calculator(a, b, operation);
    double result = calculator.performOperation();
    System.out.println("Result: " + result);
  }
}
      

        
