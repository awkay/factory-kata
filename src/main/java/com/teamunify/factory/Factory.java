package com.teamunify.factory;

import com.teamunify.util.Function0;

public class Factory<T> {
  private final Function0<T> defaultBuilder;
  private Function0<T> filterOverride = null;

  public Factory(Function0<T> builder) {
    this.defaultBuilder = builder;
  }

  public T make() {
    if (filterOverride != null)
      return filterOverride.apply();
    else
      return defaultBuilder.apply();
  }

  public void set(Function0<T> altBuilder) {
    filterOverride = altBuilder;
  }

  public void resetToDefault() {
    filterOverride = null;
  }
}
