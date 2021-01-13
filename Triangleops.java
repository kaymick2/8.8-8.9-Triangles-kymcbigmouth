public class Triangleops {
  private double sideA;
  private double sideB;
  private double sideC;

  public Triangleops(double sideA, double sideB, double sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  public boolean test (double sideA, double sideB, double sideC){
    boolean testResult=false;
    if(sideA<sideC&&sideB<sideC){
      if((sideA+sideB)>sideC){
        testResult=true;
      }
    }else if (sideB<sideA&&sideC<sideA){
      if((sideB+sideC)>sideA){
        testResult=true;
      }
    }else if (sideA<sideB&&sideC<sideB){
      if((sideA+sideC)>sideB){
        testResult=true;
      }
    }else{
      testResult=false;
    }
return testResult;
  }
  // create output method, possibly void
  // output should contain if statement to test testResult value
  // if true, pass back to main
}