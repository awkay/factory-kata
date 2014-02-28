package com.teamunify.util;

import static org.junit.Assert.*;
import org.junit.Test;

public class Function0Spec {

  @Test
  public void has_a_static_utility_method_for_creating_constant_value_functions() {
    Function0<Integer> function = Function0.functionReturningValue(23);
    assertNotNull(function);
    assertEquals(23, function.apply().intValue());
  }
}
