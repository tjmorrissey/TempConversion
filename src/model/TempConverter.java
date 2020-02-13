package model;

public class TempConverter {

	private double userTemp;
	private double celsius;
	private double fahrenheit;
	
	//will hold the output String for the results page
	private String output;
	
	public TempConverter() {
		super();
	}
	
	public TempConverter(double userTemp) {
		super();
		this.userTemp = userTemp;
		
		setCelsius(userTemp);
		setFahrenheit(userTemp);
	}

	public double getUserTemp() {
		return userTemp;
	}

	public void setUserTemp(double userTemp) {
		this.userTemp = userTemp;
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		
		celsius = (userTemp - 32.0) / 1.8;
		
		this.celsius = celsius;
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		
		fahrenheit = (userTemp * 1.8) + 32;
		
		this.fahrenheit = fahrenheit;
	}
	
	//will return the string created in the getResults
	public String getOutput() {
		return output;
	}
	
	//depending on which button is selected will create a string to later be used in output
	//will allow for only 1 results page to be used, instead of 1 for each choice
	public void getResult(String convertTo) {
		if(convertTo.equals("Fahrenheit")) {
			output = userTemp + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.";
		}
		else {
			output = userTemp + " degrees Fahrenheit is " + celsius + " degrees Celsius.";
		}
	}
	
	
	
}
