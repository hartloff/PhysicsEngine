package physics.objects


/**
  * Stores constants representing the different faces of a rectangular cuboid and in the physics engine. A seventh
  * face is defined to indicate the inside of an object.
  *
  * These constants will be used to communicate with which face an object is colliding allowing games to behave
  * differently based on the colliding face. For example, a game may want a player to land on a platform when
  * colliding with it's top, but move through the platform when colliding with the bottom, sides, or if the player
  * is already colliding with the platform (internal)
  *
  * Positive indicates that the object is moving in the positive direction along that axis. For example, a
  * positiveX collision means the dynamic object is moving in the positive X direction and hit the static object
  * on the face that facing in the negative X direction.
  */
object Face {
  val bottom = 0 // == positiveZ
  val top = 1 // == negativeZ
  val positiveX = 2
  val negativeX = 3
  val positiveY = 4
  val negativeY = 5
  val internal = 6
}
