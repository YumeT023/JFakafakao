package org.example.runtime;

import org.junit.Test;

import static org.example.runtime.Vina.DISO;
import static org.example.runtime.Vina.MARINA;
import static org.example.runtime.Vina.of;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VinaTest {
  @Test
  public void create_vina_from_jbool() {
    assertTrue(of(true).bool());
    assertFalse(of(false).bool());
  }

  @Test
  public void negate_vina() {
    assertFalse(MARINA.not());
    assertTrue(DISO.not());
  }
}
