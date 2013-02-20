package agile.demo.specs2;
import org.specs2._
import org.specs2.matcher._

import org.junit.runner._
import runner._
 
 @RunWith(classOf[JUnitRunner])
   class StockPositionSpec  extends Specification with DataTables { def is =

 "adding integers should just work in scala"  ! e1   
  def e1 =
   "a"   | "b" | "c" |       
    2    !  2  !  4  |              
    1    !  1  !  2  |> {    
e2(a, b, c) 
}  


     def e2 (a:Int,b:Int,c:Int) = {
       
     }
  


}
