package com.Testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestTangentOperator.class, TestBasicOperators.class, TestValidateInput.class})
public class TestSuite {

}
