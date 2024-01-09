//so we create an adapter class
public class StockMarketDataParserAdaptor implements CSVParser {

	private StockMarketDataParser stockMarket;
	
	public StockMarketDataParserAdaptor(StockMarketDataParser stockMarket) {
		this.stockMarket = stockMarket;
	}
	
	@Override
	public void parseCSV() {
		stockMarket.parseFromCSV();
	}
}