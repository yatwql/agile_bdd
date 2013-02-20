package agile.demo.stock;

import java.util.List;
import java.util.Map;

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
	
	public List<Map<String,String>> getLatestPositionAsMap();
}
