package agile.demo.specs2;
import org.specs2._
import org.specs2.matcher._

import org.junit.runner._
import runner._
 
 @RunWith(classOf[JUnitRunner])
   class TableSpec  extends Specification with DataTables { def is =

 "adding integers should just work in scala"  ! e1   
  def e1 =
   "a"   | "b" | "c" |                                   // the header of the table, with `|` separated
    2    !  2  !  4  |                                   // an example row       
    1    !  1  !  2  |> {                                // the > operator to "execute" the table       (a, b, c) =>  a + b must_== c                        // the expectation to check on each row
(a, b, c) =>  a + b must_== c                        // the expectation to check on each row   
}  





}
