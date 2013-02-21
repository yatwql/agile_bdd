package agile.demo.stock;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PositionCalculatorImpl implements PositionCalculator {
	protected static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy-MM-dd");

	
	public void calPosition(Trade newTrade) {

	}

	public List<Position> getLatestPosition() {
		List<Position> latestPositions = new ArrayList<Position>();
		Position pos = new Position();
		pos.setStockID("000001");
		pos.setStockName("HSBC");
		pos.setBuyPrice(new BigDecimal("67.33"));
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
		pos.setEarningRate(new BigDecimal("0.19"));
		latestPositions.add(pos);
		
		pos = new Position();
		pos.setStockID("000002");
		pos.setStockName("HASE");
		pos.setBuyPrice(new BigDecimal("50.83"));
		pos.setQuantity(6000L);
		try {
			pos.setBuyDate(dateFormat.parse("2012-07-01"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		pos.setCapital(new BigDecimal("305000"));
		pos.setCurrPrice(new BigDecimal(60));
		pos.setMarketValue(new BigDecimal(360000));
		pos.setProfit(new BigDecimal(55000));
		pos.setEarningRate(new BigDecimal("0.18"));
		latestPositions.add(pos);
		
		pos = new Position();
		pos.setStockID("000003");
		pos.setStockName("300ETF");
		pos.setBuyPrice(new BigDecimal(2));
		pos.setQuantity(51000L);
		try {
			pos.setBuyDate(dateFormat.parse("2012-01-05"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		pos.setCapital(new BigDecimal(102100));
		pos.setCurrPrice(new BigDecimal("2.5"));
		pos.setMarketValue(new BigDecimal(127500));
		pos.setProfit(new BigDecimal(25400));
		pos.setEarningRate(new BigDecimal("0.25"));
		latestPositions.add(pos);
		
		return latestPositions;

	}
	
	public List<Map<String,String>> getLatestPositionAsMap(){
		
		List<Map<String, String>> latestPositions = new ArrayList<Map<String, String>>();

		Map<String, String> position1 = new HashMap<String, String>();
		position1.put("Stock ID", "000001");
		position1.put("Stock Name", "HSBC");
		position1.put("Buy Price", "67.33");
		position1.put("Quantity", "1500");
		position1.put("Buy Date", "2012-08-01");
		position1.put("Capital", "101000");
		position1.put("Current Price", "80");
		position1.put("Market Value", "120000");
		position1.put("Profit", "19000");
		position1.put("Earning Rate", "19%");

		Map<String, String> position2 = new HashMap<String, String>();
		position2.put("Stock ID", "000002");
		position2.put("Stock Name", "HASE");
		position2.put("Buy Price", "50.83");
		position2.put("Quantity", "6000");
		position2.put("Buy Date", "2012-07-01");
		position2.put("Capital", "305000");
		position2.put("Current Price", "60");
		position2.put("Market Value", "360000");
		position2.put("Profit", "55000");
		position2.put("Earning Rate", "18%");

		Map<String, String> position3 = new HashMap<String, String>();
		position3.put("Stock ID", "000003");
		position3.put("Stock Name", "300ETF");
		position3.put("Buy Price", "2.00");
		position3.put("Quantity", "51000");
		position3.put("Buy Date", "2012-01-05");
		position3.put("Capital", "102100");
		position3.put("Current Price", "2.5");
		position3.put("Market Value", "127500");
		position3.put("Profit", "25400");
		position3.put("Earning Rate", "25%");

		latestPositions.add(position1);
		latestPositions.add(position2);
		latestPositions.add(position3);
		
		return latestPositions;
		
	}

}
