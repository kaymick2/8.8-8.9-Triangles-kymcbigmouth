public class Triangleops {
  private double sideA;
  private double sideB;
  private double sideC;

  public Triangleops(double sideA, double sideB, double sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  public boolean test(double sideA, double sideB, double sideC) {
    boolean testResult = false;
    if (sideA < sideC && sideB < sideC) {
      if ((sideA + sideB) > sideC) {
        testResult = true;
      }
    } else if (sideB < sideA && sideC < sideA) {
      if ((sideB + sideC) > sideA) {
        testResult = true;
      }
    } else if (sideA < sideB && sideC < sideB) {
      if ((sideA + sideC) > sideB) {
        testResult = true;
      }
    } else {
      testResult = false;
    }
    return testResult;
  }
//triangle type
  public String type(double sideA, double sideB, double sideC) {
    String triangleType = "n/a";
    if ((Math.pow(sideA, 2)) + (Math.pow(sideB, 2)) == (Math.pow(sideC, 2))) {
      triangleType = "Right";
    } else if ((Math.pow(sideA, 2)) + (Math.pow(sideB, 2)) > (Math.pow(sideC, 2))) {
      triangleType = "Acute";
    } else if ((Math.pow(sideA, 2)) + (Math.pow(sideB, 2)) < (Math.pow(sideC, 2))) {
      triangleType = "Obtuse";
    }
    return triangleType;
  }
}