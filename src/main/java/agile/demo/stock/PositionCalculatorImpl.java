package agile.demo.stock;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PositionCalculatorImpl implements PositionCalculator {
	protected static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy-MM-dd");

	
	public void calPosition(Trade newTrade) {

	}

	public List<Position> getLatestPosition() {
		List<Position> latestPositions = new ArrayList<Position>();
		Position pos = new Position();
		pos.setStockId("000001");
		pos.setStockName("HSBC");
		pos.setBuyPrice(new BigDecimal(67.33));
		pos.setQuantity(1500L);
		try {
			pos.setBuyDate(dateFormat.parse("2012-08-01"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		pos.setCapital(new BigDecimal(101000));
		pos.setCurrPrice(new BigDecimal(80));
		pos.setMarketValue(new BigDecimal(120000));
		pos.setProfit(new BigDecimal(19000));
		pos.setEarningRate(new BigDecimal(0.19));
		latestPositions.add(pos);
		
		pos = new Position();
		pos.setStockId("000002");
		pos.setStockName("HASE");
		pos.setBuyPrice(new BigDecimal(50.83));
		pos.setQuantity(6000L);
		try {
			pos.setBuyDate(dateFormat.parse("2012-07-01"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		pos.setCapital(new BigDecimal(305000));
		pos.setCurrPrice(new BigDecimal(60));
		pos.setMarketValue(new BigDecimal(360000));
		pos.setProfit(new BigDecimal(55000));
		pos.setEarningRate(new BigDecimal(0.18));
		latestPositions.add(pos);
		
		pos = new Position();
		pos.setStockId("000003");
		pos.setStockName("300ETF");
		pos.setBuyPrice(new BigDecimal(2));
		pos.setQuantity(51000L);
		try {
			pos.setBuyDate(dateFormat.parse("2012-01-05"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		pos.setCapital(new BigDecimal(102100));
		pos.setCurrPrice(new BigDecimal(2.5));
		pos.setMarketValue(new BigDecimal(127500));
		pos.setProfit(new BigDecimal(25400));
		pos.setEarningRate(new BigDecimal(0.25));
		latestPositions.add(pos);
		
		return latestPositions;

	}

}
