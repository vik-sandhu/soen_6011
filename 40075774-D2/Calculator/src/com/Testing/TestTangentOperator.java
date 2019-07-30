package com.Testing;

import org.junit.Test;

import static com.operations.TangentOperator.tangent;
import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.junit.Assert.assertEquals;

/**
 * The class <code>TestTangentOperator</code> contains tests for the class Tangent Operator.
 *
 * @author Vikram
 * @version 1.0.0
 */
public class TestTangentOperator {

  @Test
  public void testCase1() {
    double tan = tangent(45.0);
    assertEquals(1.000614681943367, tan, 0);
  }

  @Test
  public void testCase2() {
    double tan = tangent(180.0);
    assertEquals(0, tan, 0);
  }



  @Test
  public void testCase4() {
    double tan = tangent(-110.0);
    assertEquals(2.7462902095329067, tan, 0);
  }

  @Test
  public void testTangent5() {
    double tan = tangent(110.0);
    assertEquals(-2.7462902095329067, tan, 0);
  }
}
