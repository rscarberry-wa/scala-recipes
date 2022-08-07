package rscarberry.recipes.scalatest

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.collection.mutable

/**
 * The Matchers trait enables the `should` and `should be` syntax
 */
class WithMatchersFlatSpec extends AnyFlatSpec with Matchers {

  "queues" should "operate in first-in-first-out (FIFO) order" in {
    val queue = new mutable.Queue[Int]
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.dequeue() should be (1)
    queue.dequeue() should be (2)
    queue.dequeue() should be (3)
  }

  it should "throw a NoSuchElementException if dequeue is called on an empty queue" in {
    val emptyQueue = mutable.Queue.empty
    a [NoSuchElementException] should be thrownBy {
         emptyQueue.dequeue()
    }
  }
  
}
