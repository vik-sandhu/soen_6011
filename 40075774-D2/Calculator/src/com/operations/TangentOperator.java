package com.operations;

public class TangentOperator {

  /**
   * This is the method which calculates the tangent of the angle provided by user.
   *
   * @param x , double
   * @return tan, return a double value
   */

  public static double tangent(double x) {
    double tan = 0.0;
    if (x > 180 || x < -180) {
      if (x > 180) {
        x = x - ((int) x / 180) * 180;
      }
      if (x < -180) {
        x = x - (((int) x / 180)) * 180;
      }
    }

    if (x > 90 || x < -90) {
      if (x > 90) {
        x = -1 * (180 - x);
      }
      if (x < -90) {
        x = -1 * (-180 - x);
      }
    }
    if (x > 45 || x < -45) {
      if (x > 45) {
        tan = 1.0 / tangent(90 - x);
        return tan;
      }
      if (x < -45) {
        tan = 1.0 / tangent(-90 - x);
        return tan;
      }
    }
    if (x > 22.5 && x <= 45 || x < -22.5 && x <= -45) {
      double y = tangent(x / 2);
      tan = 2 * y / (1 - (Math.pow(y, 2)));
      return tan;
    }

    double r = (x * 22 / 7.0) / 180;
    double a = (1 / 3.0) * Math.pow(r, 3.0);
    double b = (2 / 15.0) * Math.pow(r, 5);
    double c = (17 / 315.0) * Math.pow(r, 7);
    tan = r + a + b + c;
    return tan;
  }
}
