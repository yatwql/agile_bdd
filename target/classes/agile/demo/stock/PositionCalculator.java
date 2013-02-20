package agile.demo.stock;

import java.util.List;

public interface PositionCalculator {
	/**
	 * Calculate the position with the new trade.
	 * @param newTrade
	 */
	public void calPosition(Trade newTrade);
	
	/**
	 * Return the latest position.
	 * @return
	 */
	public List<Position> getLatestPosition();
}
