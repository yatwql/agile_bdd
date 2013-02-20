package agile.demo.cumcuber;

import gherkin.formatter.model.DataTableRow;

import java.util.List;

import agile.demo.stock.Position;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StockPositionStepdefs {
   
    @Given("^the existing position as below:$")
    public void givenExistingPosition(DataTable positions) throws Throwable {
        
    }

    @When("^there are following trades:$")
    public void calTrades(DataTable trades) throws Throwable {
        System.out.println("cal");
    }

    @Then("^the new position is as below:$")
    public void checkTheFinalPositions(DataTable positions) throws Throwable {
       System.out.println("checkTheFinalPositions");
       List<DataTableRow> list=positions.getGherkinRows();
       
       DataTableRow row=list.get(1);
       
     boolean b=row.toMap().containsKey("000001, HSBC, 67.33, 1500, 2012-08-01, 101000, 80, 120000, 19000, 19%");
       System.err.println(list.get(1).toMap());
       System.err.println(row.toMap().values());
       System.err.println(positions.toString());
       
    }
    
    @Then("^the final position is as below:$")
    public void checkFinal(List<Position> positions) throws Throwable {
    
       
    }

   
}
