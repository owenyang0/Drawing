package com.cshk.drawing.models;

import org.junit.Assert;
import org.junit.Test;

public class FillsTest {

  @Test
  public void shouldReturnCorrectFillStrings () {
    Assert.assertEquals("x", new Fill("x").toString());
    Assert.assertEquals("o", new Fill("o").toString());
    Assert.assertEquals(" ", new Fill(" ").toString());
  }
}