package com.Testing;

import org.junit.Test;

import static com.operations.BasicOperators.*;
import static org.junit.Assert.assertEquals;

/**
 * The class <code>TestCountry</code> contains tests for the class BasicOperators.
 *
 * @author Vikram
 * @version 1.0.0
 */

public class TestBasicOperators {

  @Test
  public void testCaseAdd() {

    String value = add("90+30");
    assertEquals("120.00+", value);
  }

  @Test
  public void testCaseSubtract() {

    String value = subtract("90-30");
    assertEquals("60.00-", value);
  }

  @Test
  public void testCaseMultiply() {

    String value = multiply("90*30");
    assertEquals("2700.00*", value);
  }

  @Test
  public void testCaseDivide() {

    String value = divide("90/30");
    assertEquals("3.00/", value);
  }

  @Test
  public void testCaseEqual() {

    String value = equal("90/30*10+30-20");
    System.out.println(value);
    assertEquals("90/30*10+30-20", value);
  }
}
