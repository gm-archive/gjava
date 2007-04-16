package org.gjava.runner.runner;

public class Variable
	{

	public String svalue;

	Variable(String value)
		{
		setValue(value);
		}

	public void setValue(String value)
		{
		if ((value.indexOf("0") == 0) || (value.indexOf("1") == 0) || (value.indexOf("2") == 0)
				|| (value.indexOf("3") == 0) || (value.indexOf("4") == 0) || (value.indexOf("5") == 0)
				|| (value.indexOf("6") == 0) || (value.indexOf("7") == 0) || (value.indexOf("8") == 0)
				|| (value.indexOf("9") == 0) || (value.indexOf("-") == 0) || (value.indexOf(".") == 0))
			svalue = value;
		else
			svalue = "GJ$" + value;
		}
	
	public void plusEquals(String value)
	{
	if ((value.indexOf("0") == 0) || (value.indexOf("1") == 0) || (value.indexOf("2") == 0)
			|| (value.indexOf("3") == 0) || (value.indexOf("4") == 0) || (value.indexOf("5") == 0)
			|| (value.indexOf("6") == 0) || (value.indexOf("7") == 0) || (value.indexOf("8") == 0)
			|| (value.indexOf("9") == 0) || (value.indexOf("-") == 0) || (value.indexOf(".") == 0))
		{
		
		svalue = ""+(Double.parseDouble(svalue)+Double.parseDouble(value));
		}
	else
		svalue = svalue + value;
	}
	
	public void negEquals(String value)
		{
		svalue = ""+ (Double.parseDouble(svalue) - Double.parseDouble(value));
		}
	
	public void multEquals(String value)
		{
		svalue = ""+ (Double.parseDouble(svalue) * Double.parseDouble(value));
		}
	
	public void divEquals(String value)
		{
		svalue = ""+ (Double.parseDouble(svalue) / Double.parseDouble(value));
		}
		
	public double getDouble()
		{
		return Double.parseDouble(svalue);
		}
	
	public String getValue()
		{
		return svalue.replaceAll("GJ$","");
		}

	public boolean isString(String value)
		{
		if (svalue.indexOf("GJ$") == 0)
			return true;
		else
			return false;
		}
	
	public String toString()
		{
		
		return svalue;
		}
	
	
	}
