package agile.demo.stock;

import java.math.BigDecimal;
import java.util.Date;

public class Position {
	private String stockId = null;
	private String stockName = null;
	private BigDecimal buyPrice = null;
	private long quantity = 0;
	private Date buyDate = null;
	private BigDecimal capital = null;
	private BigDecimal currPrice = null;
	private BigDecimal marketValue = null;
	private BigDecimal profit = null;
	private BigDecimal earningRate = null;

	public String getStockID() {
		return stockId;
	}

	public void setStockID(String stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public BigDecimal getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public Date getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	public BigDecimal getCapital() {
		return capital;
	}

	public void setCapital(BigDecimal capital) {
		this.capital = capital;
	}

	public BigDecimal getCurrPrice() {
		return currPrice;
	}

	public void setCurrPrice(BigDecimal currPrice) {
		this.currPrice = currPrice;
	}

	public BigDecimal getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(BigDecimal marketValue) {
		this.marketValue = marketValue;
	}

	public BigDecimal getProfit() {
		return profit;
	}

	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}

	public BigDecimal getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(BigDecimal earningRate) {
		this.earningRate = earningRate;
	}

	public Position(String stockId, String stockName, BigDecimal buyPrice,
			long quantity, Date buyDate, BigDecimal capital, BigDecimal currPrice,
			BigDecimal marketValue, BigDecimal profit, BigDecimal earningRate) {
		
	}

	public Position() {
		super();
	}
	
	

}
