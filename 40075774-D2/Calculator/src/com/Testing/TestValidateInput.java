package com.Testing;

import org.junit.Test;

import static com.operations.InputValidation.validateInput;
import static org.junit.Assert.assertEquals;

/**
 * The class <code>TestValidateInput</code> contains tests for the class InputValidation.
 *
 * @author Vikram
 * @version 1.0.0
 */

public class TestValidateInput {

  @Test
  public void test1() {
    boolean value = validateInput("hsdudhuh");
    String val = String.valueOf(value);
    assertEquals("false", val);
  }

  @Test
  public void test2() {
    boolean value = validateInput("270");
    String val = String.valueOf(value);
    assertEquals("false", val);
  }

  @Test
  public void test3() {
    boolean value = validateInput("180");
    String val = String.valueOf(value);
    assertEquals("true", val);
  }
}
