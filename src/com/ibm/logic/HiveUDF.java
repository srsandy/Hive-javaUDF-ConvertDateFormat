package com.ibm.logic;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;
public class HiveUDF extends UDF {

	
public String evaluate(String dt,String pattern) throws Exception
{

		Date Currentdateformate=null;
		String expecteddate="";
		switch(pattern)
		{
		case "yyMMdd":
			Currentdateformate=new SimpleDateFormat("yyMMdd").parse(dt);
			break;
		case "yyyy/MM/dd":
			Currentdateformate=new SimpleDateFormat("yyyy/MM/dd").parse(dt);
			break;
		case "MMddyy":
			Currentdateformate=new SimpleDateFormat("MMddyy").parse(dt);
			break;
		case "MMddyyyy":
			Currentdateformate=new SimpleDateFormat("MMddyyyy").parse(dt);
			break;
			
		case "ddMMyy":
			Currentdateformate=new SimpleDateFormat("ddMMyy").parse(dt);
			break;
		case "ddMMyyyy":
			Currentdateformate=new SimpleDateFormat("ddMMyyyy").parse(dt);
			break;
		case "yyyyddd":
			Currentdateformate=new SimpleDateFormat("yyyyddd").parse(dt);
			break;	
			
		default:
			throw new Exception("unsupported date format");
		}
expecteddate=new SimpleDateFormat("yyyy-MM-dd").format(Currentdateformate);
return expecteddate;
}


}

