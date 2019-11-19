
public class hemuppgift {
	
	static double g=9.82;
	
	static double r=8.3145;
	
	static double p_0=1013;
	
	static double c = 299792458;
	
	public static void main(String[] args) {
		
		
		System.out.println(Distance(2.7,50) );
	}
	
	/**
	 * Den omvandlar gradenheterna fahrenheit till celsius
	 * @param fahrenheit stoppar in graderna i fahrenheit
	 * @return Den returnar graderna i celsius
	 */
	public static double fahrenheitTocelsius(double fahrenheit) {
		return (fahrenheit-32)/1.8;
	}
	
	/**
	 * Denna metoden omvandlar gradenheten kelvin till celsius
	 * @param kelvin lägger in graderna i kelvin
	 * @return Den returnar graderna i gradeneheten celsius
	 */
	public static double KelvinToCelsius(double kelvin) {
		return (kelvin-273.15);
	}
	
	/**
	 * Denna metoden räknar ut trycket i en vätska
	 * @param fluid Jag tar in en vätska som jag vill räkna ut trycket på
	 * @param deep Man väljer vilket djup man vill räkna ut vilket tryck vätskan har
	 * @return Den returnar vätskan tryck efter det djupet du valt
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		
		double Pressure = fluid.density*g*deep;
		
		return Pressure;
	}
	
	/**
	 * Denna metoden räknar ut vätsketrycket i vatten 
	 * @param deep jag tar in djupet
	 * @return den returnar vätsktrycket i vatten
	 */
	public static double pressureunderWater(double deep) {
		
		return(FluidTable.WATER.density*g*deep);
		
	}
	
	/**
	 * Denna metoden räknar ut kinetisk energi
	 * @param mass här tar jag in massan
	 * @param velocity här tas hastigheten in
	 * @return Den returnar den kinetiska energin efter vad massan och hastigheten är
	 */
	public static double kineticEnergy(double mass, double velocity) {
		return(0.5*mass*Math.pow(velocity, 2));
		
     }
	
	
	/**
	 * Denna metoden räknar ut den potetniella energin
	 * @param mass här tar jag in massan som jag behöver för uträkingen
	 * @param height här tas höjden in som också behövs i uträkningen
	 * @return Den returnar den potetniella energi som beror på vilken massa och höjd du mata in.
	 */
	public static double potentialEnergy(double mass, double height) {
		return(mass*g*height);
	}
	
	/**
	 * Denna metoden räknar ut vilken hastighet man kommer upp i under fritt fall
	 * @param height Tar in höjden som är nödvändig för att man ska kunna räkna ut hastigheten
	 * @return den returnar hastigheten efter vilken höjd du har valt att mata in
	 */
	public static double fallSpeed(double height) {
		return(Math.sqrt(2*g *height));
	}
	
	/**
	 * Denna metoden räknar ut skillnaden mellan två tal du skrivit in 
	 * @param first detta är det första talet
	 * @param last detta är det andra talet du har valt
	 * @return den returerar skillanden mellan de två givna talen
	 */
	
	public static double delta(double first, double last) {
		return(first-last);
	}
	
	/**
	 * Denna metoden gör om vätskans volym till massa med hjälp av vätskans densitet och volym
	 * @param fluid Här tar jag in vätskan jag vill räkna ut massan på
	 * @param volume Här tar jag in vätskans volym
	 * @return Den returnar vätskans massa
	 */
	
	static double fluidvolumeToMass(FluidTable fluid, double volume) {
		return (fluid.density*volume);
	}
	
	/**
	 * Denna metoden gör om gasens volym till massa med hjälp av gasens densitet och volym
	 * @param Gas Här tar jag in gasen som jag vill räkna ut masssa på
	 * @param volume Här ska gasens volym sättas in 
	 * @return Det den returnar är gasens massa
	 */
	static double gasvolumeToMass(GasTable Gas, double volume) {
		return (Gas.density*volume);
	}
	
	/**
	 * Denna metoden gör om en viss materias volym till masssa
	 * @param solid Här tar jag in materian som jag vill räkna ut massa på
	 * @param volume tar in Materians volym 
	 * @return Den lämnar tillbaks materians massa i volym
	 */
	static double solidvolumeToMass(SolidTable solid, double volume) {
		return(solid.density*volume);
	}
	
	/**
	 * Denna metoden räknar ut medelhastigheten på något med hjälp av sträckan och tiden
	 * @param distance Här tar jag in sträckan som något har färdats
	 * @param time Här är den tiden som det tog att färdas den sträckan
	 * @return den returnar medelhastigheten som något har föremål eller människa har färdats med
	 */
	
	public static double AverageSpeed(double distance, double time) {
		return (distance/time);
	}
	
	/**
	 * Denna metoden räknar ut sträckan nån har färdats med hjälp av hens hastighet och tid
	 * @param velocity Här sätter man in hastigheten
	 * @param time Här sätter man in tiden 
	 * @return Tillbaka får man sträckan som hen har färdats
	 */
	public static double Distance(double velocity, double time) {
		return(velocity*time);
	}
	
	/**
	 * Denna metoden räknar ut tiden som du färdats under en sträcka som du matar in och hastigheten
	 * @param distance här sätter du in sträckan du färdats
	 * @param velocity här sätter du in din hastighete
	 * @return tillbaka får du tiden du färdats på
	 */ 
	static double Time(double distance, double velocity) {
		return(distance/velocity);
	}
	
	/**
	 * Denna metoden räknar ut hur mcyket arbete som krävs beroende på vilken kraft du använde och avståndet
	 * @param force Här sätter du ut kraften som du applicerar på föremålet
	 * @param distance och här sätter du in avståndet som flyttat på föremålet
	 * @return det du får tillabaka är hur mycket arbete du har använd för att flytta på föremålet
	 */
	static double work(double force, double distance) {
		return(force*distance);
	}
	
	/**
	 * Denna metoden räknar ut effekten  med hjälp av arbetet och tiden
	 * @param work här sätter du in hur mcyket arbete du påverkat något med
	 * @param time här sättter du in den tiden det tog 
	 * @return tillbaka få du effekten
	 */
	static double power(double work, double time) {
		return(work/time);
	}
	/**
	 * Denna metoden räknar ut hur mycket energi det tar att värma upp ett visst materia vid ett visst antal grader 
	 * @param solid här sätter du in det materia som du vill göra uträkningen på
	 * @param mass här sätter du in materians massa
	 * @param deltaT här tar jag in skillnaden i värme 
	 * @return Tillbaka får du hur mycket energi det krävs för att värma upp  en viss materia
	 */
	
	static double heatsolid(SolidTable solid, double mass, double deltaT) {
		return (SolidTable.IRON.heatCapacity * mass * deltaT);
	}
	
	/**
	 * Denna metoden räknar ut hur mycket energi det tar att värma upp en vätska vid ett visst antal grader
	 * @param fluid här tar jag in vätska som jag vill göra uträkningen på
	 * @param mass här tar jag in vätskans massa
	 * @param deltaT här sätter jag in skillnaden i graderna
	 * @return tillbka får jag hur mycket energi det krävs för att värma upp en vätska
	 */
	static double heatfluid(FluidTable fluid, double mass, double deltaT) {
		return(FluidTable.WATER.heatCapacity * mass * deltaT);
	}
	
	/**
	 * Denna metoden räknar ut hur mycket energi det tar att värma upp en vätska vid ett visst antal grader
	 * @param gas här tar jag in gasen som jag vill göra uträkningen på
	 * @param mass här tar jag in gasens massa
	 * @param deltaT här sätter jag in skillnaden i graderna
	 * @return tillbka får jag hur mycket energi det krävs för att värma upp en gas
	 */
		
	static double heatGas(GasTable gas, double mass, double deltaT) {
		return(GasTable.AIR.heatCapacity * mass * deltaT);
		}
	/**
	 * Denna metoden räknar ut hur högt ett föremål kommer upp med en viss hastighet
	 * @param velocity här tar jag in hastigheten som föremålet färdas
	 * @return tillbaka får jag höjden som föremålet kommer 
	 */
	
	static double velocityToHeight(double velocity) {
	return (Math.pow(Math.sin(1.570796), 2) * Math.pow(velocity, 2)) / (2 * g);
	}
	}
	
	
	
	
	
	
	

