package org.example;

public class BooleanUtil {
  public static final int TRUE = 1;
  public static final int FALSE = 0;

  public static int asInteger(boolean value) {
    return value ? TRUE : FALSE;
  }

  public static boolean asBool(int value) {
    return value == TRUE;
  }
}
