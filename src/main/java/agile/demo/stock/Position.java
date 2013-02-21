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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buyDate == null) ? 0 : buyDate.hashCode());
		result = prime * result
				+ ((buyPrice == null) ? 0 : buyPrice.hashCode());
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result
				+ ((currentPrice == null) ? 0 : currentPrice.hashCode());
		result = prime * result
				+ ((earningRate == null) ? 0 : earningRate.hashCode());
		result = prime * result
				+ ((marketValue == null) ? 0 : marketValue.hashCode());
		result = prime * result + ((profit == null) ? 0 : profit.hashCode());
		result = prime * result + (int) (quantity ^ (quantity >>> 32));
		result = prime * result + ((stockID == null) ? 0 : stockID.hashCode());
		result = prime * result
				+ ((stockName == null) ? 0 : stockName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (buyDate == null) {
			if (other.buyDate != null)
				return false;
		} else if (!buyDate.equals(other.buyDate))
			return false;
		if (buyPrice == null) {
			if (other.buyPrice != null)
				return false;
		} else if (buyPrice.compareTo(other.buyPrice) != 0)
			return false;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (capital.compareTo(other.capital) != 0)
			return false;
		if (currentPrice == null) {
			if (other.currentPrice != null)
				return false;

		} else if (currentPrice.compareTo(other.currentPrice) != 0)
			return false;
		if (earningRate == null) {
			if (other.earningRate != null)
				return false;

		} else if (earningRate.compareTo(other.earningRate) != 0)
			return false;
		if (marketValue == null) {
			if (other.marketValue != null)
				return false;

		} else if (marketValue.compareTo(other.marketValue) != 0)
			return false;
		if (profit == null) {
			if (other.profit != null)
				return false;

		} else if (profit.compareTo(other.profit) != 0)
			return false;
		if (quantity != other.quantity)
			return false;
		if (stockID == null) {
			if (other.stockID != null)
				return false;
		} else if (!stockID.equals(other.stockID))
			return false;
		if (stockName == null) {
			if (other.stockName != null)
				return false;
		} else if (!stockName.equals(other.stockName))
			return false;
		return true;

	}

	@Override
	public String toString() {
		return "Position [stockID=" + stockID + ", stockName=" + stockName
				+ ", buyPrice=" + buyPrice + ", quantity=" + quantity
				+ ", buyDate=" + buyDate + ", capital=" + capital
				+ ", currentPrice=" + currentPrice + ", marketValue="
				+ marketValue + ", profit=" + profit + ", earningRate="
				+ earningRate + "]";
	}

}
