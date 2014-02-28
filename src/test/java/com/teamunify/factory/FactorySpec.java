package com.teamunify.factory;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.teamunify.util.Function0;

public class FactorySpec {
  private static final int defaultValueFromBuilder = 42;
  private static final int alternateValue = 13;
  private static Function0<Integer> builder = Function0.functionReturningValue(defaultValueFromBuilder);
  private static Function0<Integer> altBuilder = Function0.functionReturningValue(alternateValue);

  private Factory<Integer> factory;

  @Before
  public void setup() {
    factory = new Factory<Integer>(builder);
  }

  @Test
  public void uses_a_function_to_make_the_product() {
    assertEquals(defaultValueFromBuilder, factory.make().intValue());
  }

  @Test
  public void allows_user_to_override_the_builder() {
    factory.set(altBuilder);

    assertEquals(alternateValue, factory.make().intValue());
  }

  @Test
  public void can_be_reset_from_override_to_use_the_original_default_builder() {
    factory.set(altBuilder);
    factory.resetToDefault();

    assertEquals(defaultValueFromBuilder, factory.make().intValue());
  }
}
