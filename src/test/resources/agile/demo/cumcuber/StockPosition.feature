Feature: Stock Position Calculation
@StockSpec

  Scenario: Summarize stock position with the new trades, by order
  As an investor,I need to summarize my stock position with the new trades.For having a clear view on my stock position and investment P/L. 
  
    Given the existing position as below:
    | Stock ID | Stock Name | Buy Price | Quantity | Buy Date | Capital | Current Price | Market Value | Profit | Earning Rate |
    |000001    |HSBC        |70         | 1000     |2012-08-01| 70000   |80             |80000         |10000   |14%         | 
    |000002    |HASE        |50         | 5000     |2012-07-01| 250000  |60             |300000        |50000   |20%         |
    |000003    |300ETF      |2          | 5000     |2012-01-05| 100000  |2.5            |125000        |25000   |25%         |        

    When there are following trades: 
    
    |Stock ID |Stock Name |Price |Quantity |Date |Amount |Buy Or Sell | 
    |000001 | HSBC |65 |1000 |2012-10-01 |65000 |BUY| 
    |000001 |HSBC |68 |500 |2012-11-12 |34000 |SELL |
    |000002 |HASE |55 |1000 |2012-11-12 |55000 |SELL |
    |000002 |HASE |55 |2000 |2012-12-12 |110000 |BUY |
    |000003 |300ETF |2.1 |1000 |2012-12-12 |2100 |BUY |

     Then the new position is as below by order: 
     |Stock ID |Stock Name |Buy Price |Quantity |Buy Date |Capital |Current Price |Market Value |Profit |Earning Rate |
     |000001   |HSBC       |67.33     |1500     |2012-08-01 |101000 |80           |120000        |19000 |19%| 
     |000002   |HASE       |50.83     |6000     |2012-07-01 |305000 |60           |360000        |55000 |18%| 
     |000003   |300ETF     |2.00      |51000    |2012-01-05 |102100 |2.5          |127500        |25400 |25%| 
     
   Scenario: Summarize stock position with the new trades, in any order
  As an investor,I need to summarize my stock position with the new trades.For having a clear view on my stock position and investment P/L. 
  
    Given the existing position as below:
    | Stock ID | Stock Name | Buy Price | Quantity | Buy Date | Capital | Current Price | Market Value | Profit | Earning Rate |
    |000001    |HSBC        |70         | 1000     |2012-08-01| 70000   |80             |80000         |10000   |14%         | 
    |000002    |HASE        |50         | 5000     |2012-07-01| 250000  |60             |300000        |50000   |20%         |
    |000003    |300ETF      |2          | 5000     |2012-01-05| 100000  |2.5            |125000        |25000   |25%         |        

    When there are following trades: 
    
    |Stock ID |Stock Name |Price |Quantity |Date |Amount |Buy Or Sell | 
    |000001 | HSBC |65 |1000 |2012-10-01 |65000 |BUY| 
    |000001 |HSBC |68 |500 |2012-11-12 |34000 |SELL |
    |000002 |HASE |55 |1000 |2012-11-12 |55000 |SELL |
    |000002 |HASE |55 |2000 |2012-12-12 |110000 |BUY |
    |000003 |300ETF |2.1 |1000 |2012-12-12 |2100 |BUY |

     Then the new position is as below in any order: 
     |Stock ID |Stock Name |Buy Price |Quantity |Buy Date |Capital |Current Price |Market Value |Profit |Earning Rate |
      |000003   |300ETF     |2.00      |51000    |2012-01-05 |102100 |2.5          |127500        |25400 |25%|   
     |000001   |HSBC       |67.33     |1500     |2012-08-01 |101000 |80           |120000        |19000 |19%| 
     |000002   |HASE       |50.83     |6000     |2012-07-01 |305000 |60           |360000        |55000 |18%| 
     
     
   Scenario: Summarize stock position with the new trades, with map
  As an investor,I need to summarize my stock position with the new trades.For having a clear view on my stock position and investment P/L. 
  
    Given the existing position as below:
    | Stock ID | Stock Name | Buy Price | Quantity | Buy Date | Capital | Current Price | Market Value | Profit | Earning Rate |
    |000001    |HSBC        |70         | 1000     |2012-08-01| 70000   |80             |80000         |10000   |14%         | 
    |000002    |HASE        |50         | 5000     |2012-07-01| 250000  |60             |300000        |50000   |20%         |
    |000003    |300ETF      |2          | 5000     |2012-01-05| 100000  |2.5            |125000        |25000   |25%         |        

    When there are following trades: 
    
    |Stock ID |Stock Name |Price |Quantity |Date |Amount |Buy Or Sell | 
    |000001 | HSBC |65 |1000 |2012-10-01 |65000 |BUY| 
    |000001 |HSBC |68 |500 |2012-11-12 |34000 |SELL |
    |000002 |HASE |55 |1000 |2012-11-12 |55000 |SELL |
    |000002 |HASE |55 |2000 |2012-12-12 |110000 |BUY |
    |000003 |300ETF |2.1 |1000 |2012-12-12 |2100 |BUY |

     Then the new position is as below: 
     |Stock ID |Stock Name |Buy Price |Quantity |Buy Date |Capital |Current Price |Market Value |Profit |Earning Rate |
     |000001   |HSBC       |67.33     |1500     |2012-08-01 |101000 |80           |120000        |19000 |19%| 
     |000002   |HASE       |50.83     |6000     |2012-07-01 |305000 |60           |360000        |55000 |18%| 
     |000003   |300ETF     |2.00      |51000    |2012-01-05 |102100 |2.5          |127500        |25400 |25%|    
     
     