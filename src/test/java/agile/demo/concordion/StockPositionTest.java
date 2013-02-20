package agile.demo.concordion;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.concordion.integration.junit3.ConcordionTestCase;

import agile.demo.stock.Position;
import agile.demo.stock.PositionCalculator;
import agile.demo.stock.PositionCalculatorImpl;

public class StockPositionTest extends ConcordionTestCase {
	private static DecimalFormat priceFormat = new DecimalFormat("0.00");
	private static DecimalFormat rateFormat = new DecimalFormat("0%");
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	public void initPosition(String stockId, String stockName, String buyPrice,
			String quantity, String buyDate, String capital, String currPrice,
			String marketValue, String profit, String earningRate) {

	}

	public void calPosition(String stockId, String stockName, String price,
			String quantity, String date, String amount, String buyOrSell) {

	}
	
	public List<Position> getLatestPosition() {
		PositionCalculator pc = new PositionCalculatorImpl();
		return pc.getLatestPosition();
	}
	
	public String convertBuyPrice(Position pos) {
		return priceFormat.format(pos.getBuyPrice());
	}
	
	public String convertEarningRate(Position pos) {
		return rateFormat.format(pos.getEarningRate());
	}
	
	public String convertDate(Position pos) {
		return dateFormat.format(pos.getBuyDate());
	}
	
}
