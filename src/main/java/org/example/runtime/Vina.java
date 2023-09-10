package org.example.runtime;

public enum Vina {
  MARINA(1),
  DISO(0);

  private final int val;

  Vina(int val) {
    this.val = val;
  }

  public static Vina of(boolean val) {
    return val ? MARINA : DISO;
  }

  public static Vina of(int val) {
    return switch (val) {
      case 0 -> DISO;
      case 1 -> MARINA;
      default -> throw new IllegalArgumentException("Unexpected boolean int_val " + val);
    };
  }

  public boolean bool() {
    return this.val == MARINA.val;
  }

  public int val() {
    return this.val;
  }

  public boolean not() {
    return !this.bool();
  }
}
