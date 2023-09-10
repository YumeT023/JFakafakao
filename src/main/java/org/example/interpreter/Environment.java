package org.example.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Environment {
  // For now, symbolTable only stores identifier (name, value)
  // but soon, it might be able to store func/procedure too
  private final Map<String, Integer> symbol;

  public Environment() {
    symbol = new HashMap<>();
  }

  public Integer getSymbol(String name) {
    // TODO: Throw Exception when attempting to get non-existent symbol on _strict_mode_
    return symbol.getOrDefault(name, 0);
  }

  public Integer registerSymbol(String name, Integer val) {
    // TODO: Throw Exception when attempting to redeclare existent ident instead of overwriting
    return symbol.put(name, val);
  }

  public void free() {
    this.symbol.clear();
  }
}
