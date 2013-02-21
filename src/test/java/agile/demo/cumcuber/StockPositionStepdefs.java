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
	public void expectThePositionWithMap(DataTable expectPositions)
			throws Throwable {
		List<Map<String, String>> actualPositions = calculator
				.getLatestPositionAsMap();

		expectPositions.diff(actualPositions);

	}

	@Then("^the final position is as below:$")
	public void expectThePosition(DataTable expectTable) throws Throwable {

		List<Position> actualPositions = calculator.getLatestPosition();

		DataTable actualTable = DataTable.create(actualPositions, "yyyy-MM-dd");

		TableConverter tableConverter = actualTable.getTableConverter();
		List<Position> expectPositions = tableConverter.convert(
				new TypeReference<List<Position>>() {
				}.getType(), expectTable);

		if (actualPositions.size() > 0) {

			for (Position p : expectPositions) {
				for (Position pn : actualPositions) {
					if (p.equals(pn)) {

						actualPositions.remove(pn);
						expectPositions.remove(p);
					}
				}
			}

			if (expectPositions.size() > 0 || actualPositions.size() > 0) {
				throw new TableDiffException(expectTable);
			}
		}

	}

}
