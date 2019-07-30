package com.operations;

public class InputValidation {

  /**
   * This method is used to validate the input provided by user.
   *
   * @param angle , String
   * @return true, returns Boolean value.
   */

  public static boolean validateInput(String angle) {

    try {

      double x = Double.parseDouble(angle);

      if (x != 0 && x % 90 == 0.0 && x % 180 != 0.0) {
        return false;

      } else {
        return true;
      }
    } catch (Exception ex) {
      return false;
    }
  }
}
