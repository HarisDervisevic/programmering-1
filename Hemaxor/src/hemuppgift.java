
public class hemuppgift {
	static double g=9.82;
	public static void main(String[] args) {
		
		System.out.println(fahrenheitTocelsius(50.));
		
		System.out.println(KelvinToCelsius(0.));
		
		System.out.println(fluidPressure(FluidTable.WATER,10));
	}
	
	public static double fahrenheitTocelsius(double fahrenheit) {
		return (fahrenheit-32)/1.8;
	}
	
	public static double KelvinToCelsius(double kelvin) {
		return (kelvin-273.15);
	}
	
	public static double fluidPressure(FluidTable fluid, double deep) {
		
		double Pressure = fluid.density*g*deep;
		
		return Pressure;
	}
	
	
	


	
	
	
	
}
