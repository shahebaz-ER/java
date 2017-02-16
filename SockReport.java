public class Stock
 {
   public void insertStockDetails()
    {
      System.out.println("1");
    }
   
 }
public class StockPortfolio
{
  public void valueOfEachStock()
   {
     System.out.println("2");
   }
  public void valueOfTotallStock()
   {
    System.out.println("3");
   }
}
public class SockReport
{
  public static void main(String[] args)
    {
      Stock stock1=new Stock();
      StockPortfolio sp=new StockPortfolio();
	stock1.insertStockDetails();
	sp.valueOfEachStock();
	sp.valueOfTotallStock();
    }
}
