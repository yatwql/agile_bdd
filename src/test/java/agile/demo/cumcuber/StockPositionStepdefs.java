package agile.demo.cumcuber;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import agile.demo.stock.Position;
import agile.demo.stock.PositionCalculator;
import agile.demo.stock.PositionCalculatorImpl;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.table.TableConverter;
import cucumber.runtime.table.TableDiffException;
import cucumber.runtime.table.TypeReference;

public class StockPositionStepdefs {

	private PositionCalculator calculator = new PositionCalculatorImpl();

	@Given("^the existing position as below:$")
	public void givenExistingPosition(DataTable positions) throws Throwable {

	}

	@When("^there are following trades:$")
	public void calTrades(DataTable trades) throws Throwable {

	}
	
	@Then("^the new position is as below:$")
	public void expectThePositionWithMap(DataTable expectTable)
			throws Throwable {
		List<Map<String, String>> actualPositions = calculator
		.getLatestPositionAsMap();

		expectTable.diff(actualPositions);


	}

	@Then("^the new position is as below by order:$")
	public void expectThePositionByOrder(DataTable expectTable)
			throws Throwable {
		//List<Map<String, String>> actualPositions = calculator
			//	.getLatestPositionAsMap();

		//expectTable.diff(actualPositions);
		//DataTable actualTable = DataTable.create(calculator.getLatestPosition(), "yyyy-MM-dd");
		
		//expectPositions.diff(actualTable.diffableRows());
		
		List<Position> actualPositions = calculator.getLatestPosition();

		DataTable actualTable = DataTable.create(actualPositions, "yyyy-MM-dd");

		TableConverter tableConverter = actualTable.getTableConverter();
		List<Position> expectPositions = tableConverter.convert(
				new TypeReference<List<Position>>() {
				}.getType(), expectTable);
		for (Position p : expectPositions) {
			p.setEarningRate(p.getEarningRate().divide(
					new BigDecimal("100")));
		}
		
		//expectTable.cells(1);
		
		DataTable.create(expectPositions,"yyyy-MM-dd").diff(actualTable);

	}

	@Then("^the new position is as below in any order:$")
	public void expectThePositionInAnyOrder(DataTable expectTable) throws Throwable {

		List<Position> actualPositions = calculator.getLatestPosition();

		DataTable actualTable = DataTable.create(actualPositions, "yyyy-MM-dd");

		TableConverter tableConverter = actualTable.getTableConverter();
		List<Position> expectPositions = tableConverter.convert(
				new TypeReference<List<Position>>() {
				}.getType(), expectTable);


		if (actualPositions.size() > 0) {
			int count = expectPositions.size();

			for (Position p : expectPositions) {
				p.setEarningRate(p.getEarningRate().divide(
						new BigDecimal("100")));
				System.out.println(p);
				boolean found = false;
				int index = -1;

				for (Position pn : actualPositions) {
					System.out.println(pn);
					index++;
					found = p.equals(pn);
					if (found) {
						break;
					}

				}

				if (found) {
					actualPositions.remove(index);
					count--;
				}
			}

			if (actualPositions.size() > 0 || count > 0) {
				throw new TableDiffException(expectTable);
			}
		}

	}

}
