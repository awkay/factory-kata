package com.teamunify.util;

public abstract class Function0<T> {
  public abstract T apply();

  public static <T> Function0<T> functionReturningValue(final T value) {
    return new Function0<T>() {
      @Override
      public T apply() {
        return value;
      }
    };
  }
}
