package agile.demo.stock;

import java.math.BigDecimal;
import java.util.Date;

public class Trade {
	private String stockId = null;
	private String stockName = null;
	private BigDecimal buyPrice = null;
	private long quantity = 0;
	private Date buyDate = null;
	private BigDecimal amount = null;

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
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

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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
	
	public Trade(String stockId, String stockName, BigDecimal buyPrice,
			long quantity, Date buyDate, BigDecimal amount) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.buyPrice = buyPrice;
		this.quantity = quantity;
		this.buyDate = buyDate;
		this.amount = amount;
	}

}
