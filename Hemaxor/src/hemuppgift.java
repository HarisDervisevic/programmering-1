
public class hemuppgift {
	static double g=9.82;
	public static void main(String[] args) {
		
		System.out.println(fahrenheitTocelsius(50.));
		
		System.out.println(KelvinToCelsius(0.));
		
		System.out.println(fluidPressure(FluidTable.WATER,10));
		
		System.out.println(pressureunderWater(10));
		
		System.out.println(kineticEnergy(2,2));
		
		System.out.println(potentialEnergy(2,5));
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
	
	public static double pressureunderWater(double deep) {
		
		return(FluidTable.WATER.density*9.82*deep);
		
	}
	
	public static double kineticEnergy(double mass, double velocity) {
		return(0.5*mass*Math.pow(velocity, 2));
		
     }
	
	public static double potentialEnergy(double mass, double height) {
	   
		return(mass*9.82*height);
	
	}
}
