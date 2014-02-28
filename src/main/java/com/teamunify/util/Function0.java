package com.teamunify.util;

public abstract class Function0<T> {
  public abstract T apply();

  public static Function0<Integer> functionReturningValue(final int value) {
    return new Function0<Integer>() {
      @Override
      public Integer apply() {
        return value;
      }
    };
  }
}
