package agile.demo.cumcuber;

import java.util.List;
import java.util.Map;

import agile.demo.stock.Position;
import agile.demo.stock.PositionCalculator;
import agile.demo.stock.PositionCalculatorImpl;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StockPositionStepdefs {
	
	private PositionCalculator calculator=new PositionCalculatorImpl();

	@Given("^the existing position as below:$")
	public void givenExistingPosition(DataTable positions) throws Throwable {

	}

	@When("^there are following trades:$")
	public void calTrades(DataTable trades) throws Throwable {
		System.out.println("cal");
	}

	@Then("^the new position is as below:$")
	public void expectThePositionWithMap(DataTable expectPositions)
			throws Throwable {
		List<Map<String, String>> actualPositions = calculator.getLatestPositionAsMap();

		expectPositions.diff(actualPositions);
	

	}

	@Then("^the final position is as below:$")
	public void expectThePosition(DataTable expectPositions) throws Throwable {

		List<Position> actualPositions = calculator.getLatestPosition();

		
		expectPositions.diff(actualPositions);
	}

}
