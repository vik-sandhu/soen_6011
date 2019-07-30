package com.operations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BasicOperators {

  /**
   * This method defines what happens when add button is pressed..
   *
   * @param text , string
   * @return var1, return string
   */
  public static String add(String text) {

    try {
      if (text.contains("+")) {
        String[] var = text.split("\\+");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 + var2) + "+";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "+";
        }
      }
      if (text.contains("-")) {
        String[] var = text.split("-");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 - var2) + "+";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "+";
        }
      }
      if (text.contains("*")) {
        String[] var = text.split("\\*");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 * var2) + "+";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "+";
        }
      }
      if (text.contains("/")) {
        String[] var = text.split("/");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 / var2) + "+";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "+";
        }
      }
      return text + "+";

    } catch (Exception e) {
      e.printStackTrace();
      return text + "";
    }
  }

  /**
   * This method defines what happens when subtract button is pressed..
   *
   * @param text , string
   * @return var1, return string
   */
  public static String subtract(String text) {

    try {
      if (text.contains("+")) {
        String[] var = text.split("\\+");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 + var2) + "-";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "-";
        }
      }
      if (text.contains("-")) {
        String[] var = text.split("-");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 - var2) + "-";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "-";
        }
      }
      if (text.contains("*")) {
        String[] var = text.split("\\*");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 * var2) + "-";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "-";
        }
      }
      if (text.contains("/")) {
        String[] var = text.split("/");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 / var2) + "-";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "-";
        }
      }
      return text + "-";
    } catch (Exception e) {
      return text + "";
    }
  }
  /**
   * This method defines what happens when multiply button is pressed..
   *
   * @param text , string
   * @return var1, return string
   */

  public static String multiply(String text) {

    try {
      if (text.contains("+")) {
        String[] var = text.split("\\+");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 + var2) + "*";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "*";
        }
      }
      if (text.contains("-")) {
        String[] var = text.split("-");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 - var2) + "*";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "*";
        }
      }
      if (text.contains("*")) {
        String[] var = text.split("\\*");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 * var2) + "*";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "*";
        }
      }
      if (text.contains("/")) {
        String[] var = text.split("/");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 / var2) + "*";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "*";
        }
      }
      return text + "*";
    } catch (Exception e) {
      return text + "";
    }
  }
  /**
   * This method defines what happens when divide button is pressed..
   *
   * @param text , string
   * @return var1, return string
   */

  public static String divide(String text) {

    try {
      if (text.contains("+")) {
        String[] var = text.split("\\+");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 + var2) + "/";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "/";
        }
      }
      if (text.contains("-")) {
        String[] var = text.split("-");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 - var2) + "/";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "/";
        }
      }
      if (text.contains("*")) {
        String[] var = text.split("\\*");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 * var2) + "/";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "/";
        }
      }
      if (text.contains("/")) {
        String[] var = text.split("/");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 / var2) + "/";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "/";
        }
      }
      return text + "/";
    } catch (Exception e) {
      return text + "";
    }
  }
  /**
   * This method defines what happens when equal to button is pressed..
   *
   * @param text , string
   * @return var1, return string
   */

  public static String equal(String text) {
    try {
      if (text.contains("+")) {
        String[] var = text.split("\\+");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 + var2) + "";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "";
        }
      }
      if (text.contains("-")) {
        String[] var = text.split("-");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 - var2) + "";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "";
        }
      }
      if (text.contains("*")) {
        String[] var = text.split("\\*");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 * var2) + "";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "";
        }
      }
      if (text.contains("/")) {
        String[] var = text.split("/");
        if (var.length == 2) {
          double var1 = Double.parseDouble(var[0]);
          double var2 = Double.parseDouble(var[1]);
          return roundOff(var1 / var2) + "";
        } else if (var.length == 1) {
          double var1 = Double.parseDouble(var[0]);
          return var1 + "";
        }
      }
      return text + "";
    } catch (Exception e) {
      return text + "";
    }
  }

  /**
   * This method is used to round off the answer to two digits after decimal.
   *
   * @param tan , double
   * @return answer, return BigDecimal value
   */
  public static BigDecimal roundOff(double tan) {

    BigDecimal answer = BigDecimal.valueOf(tan).setScale(2, RoundingMode.HALF_UP);
    return answer;
  }
}
