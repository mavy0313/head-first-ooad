package com.mavy0313.headfirst.ooad.chapter5;

public class Guitar extends Instrument{
  private String serialNumber;
  private double price;
  GuitarSpec spec;

  public Guitar(String serialNumber, double price, GuitarSpec spec) {
    super(serialNumber, price, spec);
  }
}
