package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class TestUtils {
  public final static String FACTORIAL_TEMPLATE = "factorial_test.template.lita";
  public final static String SQUARE_TEMPLATE = "square_test.template.lita";
  public final static String CTX_PLACEHOLDER = "\\{%s\\}";
  private final static String TEMPLATE = "src/main/resources/template/%s";

  public static String read(String filename) throws IOException {
    return Files.readString(path(filename));
  }

  private static Path path(String filename) {
    return Path.of(TEMPLATE.formatted(filename));
  }

  private static String toTemplateVar(String key) {
    return String.format(CTX_PLACEHOLDER, key);
  }

  public static String injectCtx(String template, Map<String, Integer> ctx) {
    for (var e : ctx.entrySet()) {
      var name = toTemplateVar(e.getKey());
      template = template.replaceAll(name, String.valueOf(e.getValue()));
    }
    return template;
  }
}
