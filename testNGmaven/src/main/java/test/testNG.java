package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import vn.DungVipPro.testNGmaven.VatCalculator;

public class testNG {
  @Test
  public void f() {
	  VatCalculator calc = new VatCalculator();
	  double expected = 10;
	  Assert.assertEquals(calc.getVatCalculator(100), expected);
	  Assert.assertNotEquals(calc.getVatCalculator(120), expected);
  }
}
