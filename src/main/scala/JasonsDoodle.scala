import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DCanvas._
import doodle.backend.StandardInterpreter._
import doodle.core.PathElement._
import doodle.turtle._
import doodle.turtle.Instruction._
import doodle.core.Point._
import doodle.random._
import cats.syntax.cartesian._
import cats.std.list._


object JasonsDoodle extends App {

  val instructions =
    List(forward(10), turn(90.0.degrees),
      forward(10), turn(90.0.degrees),
      forward(10), turn(90.0.degrees),
      forward(10))

  val path = Turtle.draw(instructions)

  path.draw

}


class JasonsDoodle {

}
