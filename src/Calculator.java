public class Calculator implements iCalculate {
  public Calculator() {

  }

  @Override
  public Integer sum(int a, int b) {
    return a + b;
  }

  @Override
  public Integer division(int a, int b) {
    
    return a / b;
  }

  @Override
  public Integer multiply(int a, int b) {
    return a * b;
  }

  @Override
  public Integer difference(int a, int b) {
    return a - b;

  }
}
