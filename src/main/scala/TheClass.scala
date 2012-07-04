package com.gerdriesselmann.sbttest

import actors.Actor

object TheClass extends Actor {
  start();

  def act() {
    loop {
      react {
        case _ => println("Catch")
      }
    }
  }

  def test = true
}
