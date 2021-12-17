package com.mavy0313.headfirst.ooad.chapter2;

public class DogDoorSimulator {
  public static void main(String[] args) {
    DogDoor door = new DogDoor();
    Remote remote = new Remote(door);

    System.out.println("Fido barks to go outside...");
    remote.pressButton();

    System.out.println("\nFido has gone outside...");

    System.out.println("\nFido's all done...");

    try {
      Thread.currentThread().sleep(10000);
    } catch (InterruptedException e) {

    }

    System.out.println("\n...but he stuck outside");
    System.out.println("\nFido starts barking");
    System.out.println("\n...so Gina grabs remote control.");
    remote.pressButton();


    System.out.println("\nFido's back inside...");
  }
}
