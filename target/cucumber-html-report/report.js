$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("agile/demo/cumcuber/StockPosition.feature");
formatter.feature({
  "id": "stock-position-calculation",
  "description": "",
  "name": "Stock Position Calculation",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "stock-position-calculation;as-an-investor,i-need-to-summarize-my-stock-position-with-the-new-trades.for-having-a-clear-view-on-my-stock-position-and-investment-p/l.",
  "description": "",
  "name": "As an investor,I need to summarize my stock position with the new trades.For having a clear view on my stock position and investment P/L.",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "the existing position as below:",
  "keyword": "Given ",
  "line": 5,
  "rows": [
    {
      "cells": [
        "Stock ID",
        "Stock Name",
        "Buy Price",
        "Quantity",
        "Buy Date",
        "Capital",
        "Current Price",
        "Market Value",
        "Profit",
        "Earning Rate"
      ],
      "line": 6
    },
    {
      "cells": [
        "000001",
        "HSBC",
        "70",
        "1000",
        "2012-08-01",
        "70000",
        "80",
        "80000",
        "10000",
        "14%"
      ],
      "line": 7
    },
    {
      "cells": [
        "000002",
        "HASE",
        "50",
        "5000",
        "2012-07-01",
        "250000",
        "60",
        "300000",
        "50000",
        "20%"
      ],
      "line": 8
    },
    {
      "cells": [
        "000003",
        "300ETF",
        "2",
        "5000",
        "2012-01-05",
        "100000",
        "2.5",
        "125000",
        "25000",
        "25%"
      ],
      "line": 9
    }
  ]
});
formatter.step({
  "name": "there are following trades:",
  "keyword": "When ",
  "line": 11,
  "rows": [
    {
      "cells": [
        "Stock ID",
        "Stock Name",
        "Price",
        "Quantity",
        "Date",
        "Amount",
        "Buy Or Sell"
      ],
      "line": 13
    },
    {
      "cells": [
        "000001",
        "HSBC",
        "65",
        "1000",
        "2012-10-01",
        "65000",
        "",
        "BUY"
      ],
      "line": 14
    },
    {
      "cells": [
        "000001",
        "HSBC",
        "68",
        "500",
        "2012-11-12",
        "34000",
        "SELL"
      ],
      "line": 15
    },
    {
      "cells": [
        "000002",
        "HASE",
        "55",
        "1000",
        "2012-11-12",
        "55000",
        "SELL"
      ],
      "line": 16
    },
    {
      "cells": [
        "000002",
        "HASE",
        "55",
        "2000",
        "2012-12-12",
        "110000",
        "BUY"
      ],
      "line": 17
    },
    {
      "cells": [
        "000003",
        "300ETF",
        "2.1",
        "1000",
        "2012-12-12",
        "2100",
        "BUY"
      ],
      "line": 18
    }
  ]
});
formatter.step({
  "name": "the new position is as below:",
  "keyword": "Then ",
  "line": 20,
  "rows": [
    {
      "cells": [
        "Stock ID",
        "Stock Name",
        "Buy Price",
        "Quantity",
        "Buy Date",
        "Capital",
        "Current Price",
        "Market Value",
        "Profit",
        "Earning Rate"
      ],
      "line": 21
    },
    {
      "cells": [
        "000001",
        "HSBC",
        "67.33",
        "1500",
        "2012-08-01",
        "101000",
        "80",
        "120000",
        "19000",
        "19%"
      ],
      "line": 22
    },
    {
      "cells": [
        "000002",
        "HASE",
        "50.83",
        "6000",
        "2012-07-01",
        "305000",
        "60",
        "360000",
        "55000",
        "18%"
      ],
      "line": 23
    },
    {
      "cells": [
        "000003",
        "300ETF",
        "2.00",
        "51000",
        "2012-01-05",
        "102100",
        "2.5",
        "127500",
        "25400",
        "25%"
      ],
      "line": 24
    }
  ]
});
formatter.step({
  "name": "the final position is as below:",
  "keyword": "Then ",
  "line": 27,
  "rows": [
    {
      "cells": [
        "Stock Id",
        "Stock Name",
        "Buy Price",
        "Quantity",
        "Buy Date",
        "Capital",
        "Current Price",
        "Market Value",
        "Profit",
        "Earning Rate"
      ],
      "line": 28
    },
    {
      "cells": [
        "000001",
        "HSBC",
        "67.33",
        "1500",
        "2012-08-01",
        "101000",
        "80",
        "120000",
        "19000",
        "19%"
      ],
      "line": 29
    },
    {
      "cells": [
        "000002",
        "HASE",
        "50.83",
        "6000",
        "2012-07-01",
        "305000",
        "60",
        "360000",
        "55000",
        "18%"
      ],
      "line": 30
    },
    {
      "cells": [
        "000003",
        "300ETF",
        "2.00",
        "51000",
        "2012-01-05",
        "102100",
        "2.5",
        "127500",
        "25400",
        "25%"
      ],
      "line": 31
    }
  ]
});
formatter.match({
  "location": "StockPositionStepdefs.givenExistingPosition(DataTable)"
});
formatter.result({
  "duration": 139433000,
  "status": "passed"
});
formatter.match({
  "location": "StockPositionStepdefs.calTrades(DataTable)"
});
formatter.result({
  "duration": 182000,
  "status": "passed"
});
formatter.match({
  "location": "StockPositionStepdefs.checkTheFinalPositions(DataTable)"
});
formatter.result({
  "duration": 7766000,
  "status": "passed"
});
formatter.match({
  "location": "StockPositionStepdefs.checkFinal(Position\u003e)"
});
formatter.result({
  "duration": 12394000,
  "status": "failed",
  "error_message": "cucumber.runtime.CucumberException: Can\u0027t assign null value to one of the primitive fields in java.util.Date. Please use boxed types.\n\tat cucumber.runtime.table.TableConverter.toListOfComplexType(TableConverter.java:107)\n\tat cucumber.runtime.table.TableConverter.convert(TableConverter.java:72)\n\tat cucumber.api.DataTable.convert(DataTable.java:77)\n\tat cucumber.runtime.StepDefinitionMatch.tableArgument(StepDefinitionMatch.java:101)\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:81)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:38)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:268)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:45)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:40)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:36)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:83)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:77)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:82)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:50)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:467)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:683)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:390)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:197)\n"
});
formatter.uri("agile/demo/cumcuber/helloworld.feature");
formatter.feature({
  "id": "hello-world",
  "description": "",
  "name": "Hello World",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "hello-world;say-hello",
  "description": "",
  "name": "Say hello",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I have a hello app with \"Howdy\"",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I ask it to say hi",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "it should answer with \"Howdy World\"",
  "keyword": "Then ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "Howdy",
      "offset": 25
    }
  ],
  "location": "HelloStepdefs.I_have_a_hello_app_with(String)"
});
formatter.result({
  "duration": 103000,
  "status": "passed"
});
formatter.match({
  "location": "HelloStepdefs.I_ask_it_to_say_hi()"
});
formatter.result({
  "duration": 32000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Howdy World",
      "offset": 23
    }
  ],
  "location": "HelloStepdefs.it_should_answer_with(String)"
});
formatter.result({
  "duration": 1198000,
  "status": "passed"
});
formatter.scenario({
  "id": "hello-world;print-my-shopping-list",
  "description": "The list should be printed in alphabetical order of the item names",
  "name": "Print my shopping list",
  "keyword": "Scenario",
  "line": 8,
  "type": "scenario"
});
formatter.step({
  "name": "a shopping list:",
  "keyword": "Given ",
  "line": 11,
  "rows": [
    {
      "cells": [
        "name",
        "count"
      ],
      "line": 12
    },
    {
      "cells": [
        "Milk",
        "2"
      ],
      "line": 13
    },
    {
      "cells": [
        "Cocoa",
        "1"
      ],
      "line": 14
    },
    {
      "cells": [
        "Soap",
        "5"
      ],
      "line": 15
    }
  ]
});
formatter.step({
  "name": "I print that list",
  "keyword": "When ",
  "line": 16
});
formatter.step({
  "name": "it should look like:",
  "keyword": "Then ",
  "line": 17,
  "doc_string": {
    "value": "1 Cocoa\n2 Milk\n5 Soap\n",
    "line": 18,
    "content_type": ""
  }
});
formatter.match({
  "location": "ShoppingStepdefs.a_shopping_list(ShoppingStepdefs$ShoppingItem\u003e)"
});
formatter.result({
  "duration": 1741000,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStepdefs.I_print_that_list()"
});
formatter.result({
  "duration": 276000,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingStepdefs.it_should_look_like(String)"
});
formatter.result({
  "duration": 26000,
  "status": "passed"
});
formatter.scenario({
  "id": "hello-world;transformation",
  "description": "",
  "name": "Transformation",
  "keyword": "Scenario",
  "line": 25,
  "type": "scenario"
});
formatter.step({
  "name": "today is \"Dec 6, 2012\"",
  "keyword": "Given ",
  "line": 26
});
formatter.step({
  "name": "I did laundry 2 days ago",
  "keyword": "And ",
  "line": 27
});
formatter.step({
  "name": "my laundry day must have been \"Dec 4, 2012\"",
  "keyword": "Then ",
  "line": 28
});
formatter.match({
  "arguments": [
    {
      "val": "Dec 6, 2012",
      "offset": 10
    }
  ],
  "location": "TimeStepdefs.today_is(Calendar)"
});
formatter.result({
  "duration": 1752000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2 days ago",
      "offset": 14
    }
  ],
  "location": "TimeStepdefs.I_did_laundry_time_ago(Calendar)"
});
formatter.result({
  "duration": 32607000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dec 4, 2012",
      "offset": 31
    }
  ],
  "location": "TimeStepdefs.my_laundry_day_must_have_been(Calendar)"
});
formatter.result({
  "duration": 201000,
  "status": "passed"
});
});