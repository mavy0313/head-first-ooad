package com.mavy0313.headfirst.ooad.chapter3;

public class BarkRecognizer {

  private DogDoor door;

  public BarkRecognizer(DogDoor door) {
    this.door = door;
  }

  public void recognize(String bark) {
    System.out.println("BarkRecognizer: heard a '" + bark + "'");
    door.open();
  }
}
