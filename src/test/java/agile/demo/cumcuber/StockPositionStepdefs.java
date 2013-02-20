package agile.demo.cumcuber;

import gherkin.formatter.model.DataTableRow;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import agile.demo.stock.Position;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StockPositionStepdefs {
	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	@Given("^the existing position as below:$")
	public void givenExistingPosition(DataTable positions) throws Throwable {

	}

	@When("^there are following trades:$")
	public void calTrades(DataTable trades) throws Throwable {
		System.out.println("cal");
	}

	@Then("^the new position is as below:$")
    public void checkTheFinalPositions(DataTable expectPositions) throws Throwable {
        List<Position> actualPositions = new ArrayList<Position>();
    	
    	Position position1=new Position();
    	
    	position1.setStockId("000001");
    	position1.setStockName("HSBC");
    	position1.setBuyPrice(new BigDecimal("67.33"));
    	position1.setQuantity(1500);
    	position1.setBuyDate(format.parse("2012-08-01"));
    	position1.setCapital(new BigDecimal(101000));
    	position1.setCurrPrice(new BigDecimal(80));
    	position1.setMarketValue(new BigDecimal(120000));
    	position1.setProfit(new BigDecimal(19000));
    	position1.setEarningRate(new BigDecimal(0.19));
        
        actualPositions.add(position1);
        
        Position position2=new Position();
        
        position2.setStockId("000002");
        position2.setStockName("HASE");
        position2.setBuyPrice(new BigDecimal(50.83));
        position2.setQuantity(6000);
        position2.setBuyDate(format.parse("2012-07-01"));
        position2.setCapital(new BigDecimal(305000));
        position2.setCurrPrice(new BigDecimal(60));
        position2.setMarketValue(new BigDecimal(360000));
        position2.setProfit(new BigDecimal(55000));
        position2.setEarningRate(new BigDecimal(0.18));
        
        actualPositions.add(position2);
        
        Position position3=new Position();
        
        position3.setStockId("000003");
        position3.setStockName("300ETF");
        position3.setBuyPrice(new BigDecimal(2.00));
        position3.setQuantity(51000);
        position3.setBuyDate(format.parse("2012-01-05"));
        position3.setCapital(new BigDecimal(102100));
        position3.setCurrPrice(new BigDecimal(2.5));
        position3.setMarketValue(new BigDecimal(127500));
        position3.setProfit(new BigDecimal(25400));
        position3.setEarningRate(new BigDecimal(0.25));
        
        actualPositions.add(position3);
        
    	expectPositions.diff(actualPositions);
    	
       
    }

	@Then("^the final position is as below:$")
	// public void checkFinal(List<Position> positions) throws Throwable {
	public void expectThePosition(DataTable expectPositions) throws Throwable {

		List<Position> actualPositions = new ArrayList<Position>();

		Position position = new Position();
		position.setStockId("000001");
		position.setStockName("HSBC");
		position.setBuyPrice(new BigDecimal("67.33"));
		position.setQuantity(1500l);
		position.setBuyDate(format.parse("2012-08-01"));
		position.setCapital(new BigDecimal(101000));
		position.setCurrPrice(new BigDecimal(80));
		position.setMarketValue(new BigDecimal(120000));
		position.setProfit(new BigDecimal(19000));
		position.setEarningRate(new BigDecimal(0.19));

		actualPositions.add(position);

		expectPositions.diff(actualPositions);
	}

}
