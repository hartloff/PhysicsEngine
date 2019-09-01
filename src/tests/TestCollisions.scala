package tests

import org.scalatest._
import physics.PhysicsVector
import physics.objects.GameObject

class TestCollisions extends FunSuite {

  test("Tests for accurate collision detection between two objects") {

    // Sample test case for objective 1. After you write isCollision, uncomment the assert line.
    // These two objects do collide so isCollision should return true. Add more tests for comprehensive testing.
    val obj1: GameObject = new GameObject(new PhysicsVector(4.0, 3.0, 6.0), new PhysicsVector(3.0, 3.0, 3.0))
    val obj2: GameObject = new GameObject(new PhysicsVector(3.0, 2.0, 5.0), new PhysicsVector(1.5, 1.5, 1.5))

//    assert(PhysicsEngine.isCollision(obj1, obj2), "\n" + obj1 + "\n" + obj2)
  }
}
