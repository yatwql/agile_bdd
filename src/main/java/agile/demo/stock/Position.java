package agile.demo.stock;

import java.math.BigDecimal;
import java.util.Date;

public class Position {
	private String stockID = null;
	private String stockName = null;
	private BigDecimal buyPrice = null;
	private long quantity = 0;
	private Date buyDate = null;
	private BigDecimal capital = null;
	private BigDecimal currentPrice = null;
	private BigDecimal marketValue = null;
	private BigDecimal profit = null;
	private BigDecimal earningRate = null;

	public String getStockID() {
		return stockID;
	}

	public void setStockID(String stockId) {
		this.stockID = stockId;
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
		return currentPrice;
	}

	public void setCurrPrice(BigDecimal currPrice) {
		this.currentPrice = currPrice;
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
			long quantity, Date buyDate, BigDecimal capital,
			BigDecimal currPrice, BigDecimal marketValue, BigDecimal profit,
			BigDecimal earningRate) {

	}

	public Position() {
		super();
	}

	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}

		if (o == null || !(o instanceof Position)) {
			return false;
		}

		Position pn = (Position) o;

		boolean result = pn.stockID.equals(this.stockID)
				&& pn.stockName.equals(this.stockName)
				&& pn.buyDate.equals(this.buyDate)
				&& pn.buyPrice.equals(this.buyPrice)
				&& pn.capital.equals(this.capital);

		if (result) {

			result = result && pn.currentPrice.equals(this.currentPrice)
					&& pn.earningRate.equals(this.earningRate);
		}

		if (result) {
			result = result && pn.marketValue.equals(this.marketValue)
					&& pn.profit.equals(this.profit)
					&& pn.quantity == this.quantity;
		}

		return result;

	}
	
	
}
