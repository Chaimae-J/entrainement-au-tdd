package io.github.gabbloquet.tddtraining.RomanNumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

  RomanNumerals romanNumerals = new RomanNumerals();

  @Test
  void should_convert_to_I() {
    assertEquals("I", romanNumerals.toRoman(1));
    assertEquals("II", romanNumerals.toRoman(2));
    assertEquals("III", romanNumerals.toRoman(3));
  }

  @Test
  void should_convert_to_V() {
    assertEquals("IV", romanNumerals.toRoman(4));
    assertEquals("V", romanNumerals.toRoman(5));
    assertEquals("VII", romanNumerals.toRoman(7));
  }

  @Test
  void should_convert_to_X() {
    assertEquals("IX", romanNumerals.toRoman(9));
    assertEquals("X", romanNumerals.toRoman(10));
    assertEquals("XII", romanNumerals.toRoman(12));
    assertEquals("XVII", romanNumerals.toRoman(17));
    assertEquals("XXX", romanNumerals.toRoman(30));
  }

  @Test
  void should_convert_to_L() {
    assertEquals("XL", romanNumerals.toRoman(40));
    assertEquals("L", romanNumerals.toRoman(50));
    assertEquals("LXI", romanNumerals.toRoman(61));
    assertEquals("LXXX", romanNumerals.toRoman(80));
  }

  @Test
  void should_convert_to_C() {
    assertEquals("XC", romanNumerals.toRoman(90));
    assertEquals("C", romanNumerals.toRoman(100));
    assertEquals("CC", romanNumerals.toRoman(200));
  }

  @Test
  void should_convert_to_D() {
    assertEquals("CD", romanNumerals.toRoman(400));
    assertEquals("D", romanNumerals.toRoman(500));
    assertEquals("DCC", romanNumerals.toRoman(700));
  }

  @Test
  void should_convert_to_M() {
    assertEquals("CM", romanNumerals.toRoman(900));
    assertEquals("M", romanNumerals.toRoman(1000));
    assertEquals("MM", romanNumerals.toRoman(2000));
  }

  @Test
  void should_convert_to_complexe_numbers() {
    assertEquals("DCCCXLVII", romanNumerals.toRoman(847));
    assertEquals("MLIII", romanNumerals.toRoman(1053));
    assertEquals("MDCCLXXVI", romanNumerals.toRoman(1776));
    assertEquals("MMXVIII", romanNumerals.toRoman(2018));
  }
}
