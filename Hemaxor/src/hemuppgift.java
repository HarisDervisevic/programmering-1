
public class hemuppgift {
	
	static double g=9.82;
	
	static double r=8.3145;
	
	static double p_0=1013;
	
	static double c = 299792458;
	
	public static void main(String[] args) {
		
		System.out.println(fahrenheitTocelsius(50.));
		
		System.out.println(KelvinToCelsius(0.));
		
		System.out.println(fluidPressure(FluidTable.WATER,10));
		
		System.out.println(pressureunderWater(10));
		
		System.out.println(kineticEnergy(2,2));
		
		System.out.println(potentialEnergy(2,5));
		
		System.out.println(fallSpeed(2.5));
		
		System.out.println(delta(1,10));
		
		System.out.println(fluidvolumeToMass(FluidTable.WATER,1));
		
		System.out.println(gasvolumeToMass(GasTable.AIR,1));
		
		System.out.println(AverageSpeed(10,5));
		
		System.out.println(Distance(10,5));
		
		System.out.println(Time(10,2));
		
		System.out.println(work(50,10));
		
		System.out.println(power(1000,2));
		
		System.out.println(heat(SolidTable.IRON,1,2));
		
		System.out.println(heat(FluidTable.WATER,1,10));
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
		
		return(FluidTable.WATER.density*g*deep);
		
	}
	
	public static double kineticEnergy(double mass, double velocity) {
		return(0.5*mass*Math.pow(velocity, 2));
		
     }
	
	public static double potentialEnergy(double mass, double height) {
		return(mass*g*height);
	}
	
	public static double fallSpeed(double height) {
		return(Math.sqrt(2*g *height));
	}
	
	public static double delta(double first, double last) {
		return(first-last);
	}
	
	static double fluidvolumeToMass(FluidTable fluid, double volume) {
		return (fluid.density*volume);
	}
	
	static double gasvolumeToMass(GasTable Gas, double volume) {
		return (Gas.density*volume);
	}
	
	public static double AverageSpeed(double distance, double time) {
		return (distance/time);
	}
	
	public static double Distance(double velocity, double time) {
		return(velocity*time);
	}
	
	static double Time(double distance, double velocity) {
		return(distance/velocity);
	}
	
	static double work(double force, double distance) {
		return(force*distance);
	}
	
	static double power(double work, double time) {
		return(work/time);
	}
	
	static double heat(SolidTable solid, double mass, double deltaT) {
		return (SolidTable.IRON.heatCapacity * mass * deltaT);
		
	}
	
	
	}
	
	
	
	
	
	

