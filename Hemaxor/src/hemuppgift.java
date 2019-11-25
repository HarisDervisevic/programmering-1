
public class hemuppgift {

	static double g = 9.82;

	static double r = 8.3145;

	static double p_0 = 1013;

	static double c = 299792458;

	public static void main(String[] args) {

		// Svar till fr�gorna

		// Fr�ga 1
		System.out.println(solidvolumeToMass(SolidTable.IRON, 60));

		// Fr�ga 2
		System.out.println(Distance(2.7, 50));

		// Fr�ga 3
		System.out.println(heatfluid(FluidTable.WATER, 4, 22));

		// Fr�ga 4
		System.out.println(pressureunderWater(75));

		// Fr�ga 5
		System.out.println(velocityToHeight(60));

		// Fr�ga 6
		System.out.println(CalculatedEffectForCarMotor(735, 100, 4.8));

		// Fr�ga 7
		System.out.println(bounceCount(1,12));

		// Egen fr�ga
		// Hur mycket �r 100kmh/ i meter per sekund
		System.out.println(velocityExchangeMS(100));
	}

	/**
	 * Den omvandlar gradenheterna fahrenheit till celsius
	 * 
	 * @param fahrenheit stoppar in graderna i fahrenheit
	 * @return Den returnar graderna i celsius
	 */
	public static double fahrenheitTocelsius(double fahrenheit) {
		return (fahrenheit - 32) / 1.8;
	}

	/**
	 * Denna metoden omvandlar gradenheten kelvin till celsius
	 * 
	 * @param kelvin l�gger in graderna i kelvin
	 * @return Den returnar graderna i gradeneheten celsius
	 */
	public static double KelvinToCelsius(double kelvin) {
		return (kelvin - 273.15);
	}

	/**
	 * Denna metoden r�knar ut trycket i en v�tska
	 * 
	 * @param fluid Jag tar in en v�tska som jag vill r�kna ut trycket p�
	 * @param deep  Man v�ljer vilket djup man vill r�kna ut vilket tryck v�tskan
	 *              har
	 * @return Den returnar v�tskan tryck efter det djupet du valt
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {

		double Pressure = fluid.density * g * deep;

		return Pressure;
	}

	/**
	 * Denna metoden r�knar ut v�tsketrycket i vatten
	 * 
	 * @param deep jag tar in djupet
	 * @return den returnar v�tsktrycket i vatten
	 */
	public static double pressureunderWater(double deep) {

		return (FluidTable.WATER.density * g * deep);

	}

	/**
	 * Denna metoden r�knar ut kinetisk energi
	 * 
	 * @param mass     h�r tar jag in massan
	 * @param velocity h�r tas hastigheten in
	 * @return Den returnar den kinetiska energin efter vad massan och hastigheten
	 *         �r
	 */
	public static double kineticEnergy(double mass, double velocity) {
		return (0.5 * mass * Math.pow(velocity, 2));

	}

	/**
	 * Denna metoden r�knar ut den potetniella energin
	 * 
	 * @param mass   h�r tar jag in massan som jag beh�ver f�r utr�kingen
	 * @param height h�r tas h�jden in som ocks� beh�vs i utr�kningen
	 * @return Den returnar den potetniella energi som beror p� vilken massa och
	 *         h�jd du mata in.
	 */
	public static double potentialEnergy(double mass, double height) {
		return (mass * g * height);
	}

	/**
	 * Denna metoden r�knar ut vilken hastighet man kommer upp i under fritt fall
	 * 
	 * @param height Tar in h�jden som �r n�dv�ndig f�r att man ska kunna r�kna ut
	 *               hastigheten
	 * @return den returnar hastigheten efter vilken h�jd du har valt att mata in
	 */
	public static double fallSpeed(double height) {
		return (Math.sqrt(2 * g * height));
	}

	/**
	 * Denna metoden r�knar ut skillnaden mellan tv� tal du skrivit in
	 * 
	 * @param first detta �r det f�rsta talet
	 * @param last  detta �r det andra talet du har valt
	 * @return den returerar skillanden mellan de tv� givna talen
	 */

	public static double delta(double first, double last) {
		return (first - last);
	}

	/**
	 * Denna metoden g�r om v�tskans volym till massa med hj�lp av v�tskans densitet
	 * och volym
	 * 
	 * @param fluid  H�r tar jag in v�tskan jag vill r�kna ut massan p�
	 * @param volume H�r tar jag in v�tskans volym
	 * @return Den returnar v�tskans massa
	 */

	static double fluidvolumeToMass(FluidTable fluid, double volume) {
		return (fluid.density * volume);
	}

	/**
	 * Denna metoden g�r om gasens volym till massa med hj�lp av gasens densitet och
	 * volym
	 * 
	 * @param Gas    H�r tar jag in gasen som jag vill r�kna ut masssa p�
	 * @param volume H�r ska gasens volym s�ttas in
	 * @return Det den returnar �r gasens massa
	 */
	static double gasvolumeToMass(GasTable Gas, double volume) {
		return (Gas.density * volume);
	}

	/**
	 * Denna metoden g�r om en viss materias volym till masssa
	 * 
	 * @param solid  H�r tar jag in materian som jag vill r�kna ut massa p�
	 * @param volume tar in Materians volym
	 * @return Den l�mnar tillbaks materians massa i volym
	 */
	static double solidvolumeToMass(SolidTable solid, double volume) {
		return (solid.density * volume);
	}

	/**
	 * Denna metoden r�knar ut medelhastigheten p� n�got med hj�lp av str�ckan och
	 * tiden
	 * 
	 * @param distance H�r tar jag in str�ckan som n�got har f�rdats
	 * @param time     H�r �r den tiden som det tog att f�rdas den str�ckan
	 * @return den returnar medelhastigheten som n�got har f�rem�l eller m�nniska
	 *         har f�rdats med
	 */

	public static double AverageSpeed(double distance, double time) {
		return (distance / time);
	}

	/**
	 * Denna metoden r�knar ut str�ckan n�n har f�rdats med hj�lp av hens hastighet
	 * och tid
	 * 
	 * @param velocity H�r s�tter man in hastigheten
	 * @param time     H�r s�tter man in tiden
	 * @return Tillbaka f�r man str�ckan som hen har f�rdats
	 */
	public static double Distance(double velocity, double time) {
		return (velocity * time);
	}

	/**
	 * Denna metoden r�knar ut tiden som du f�rdats under en str�cka som du matar in
	 * och hastigheten
	 * 
	 * @param distance h�r s�tter du in str�ckan du f�rdats
	 * @param velocity h�r s�tter du in din hastighete
	 * @return tillbaka f�r du tiden du f�rdats p�
	 */
	static double Time(double distance, double velocity) {
		return (distance / velocity);
	}

	/**
	 * Denna metoden r�knar ut hur mcyket arbete som kr�vs beroende p� vilken kraft
	 * du anv�nde och avst�ndet
	 * 
	 * @param force    H�r s�tter du ut kraften som du applicerar p� f�rem�let
	 * @param distance och h�r s�tter du in avst�ndet som flyttat p� f�rem�let
	 * @return det du f�r tillabaka �r hur mycket arbete du har anv�nd f�r att
	 *         flytta p� f�rem�let
	 */
	static double work(double force, double distance) {
		return (force * distance);
	}

	/**
	 * Denna metoden r�knar ut effekten med hj�lp av arbetet och tiden
	 * 
	 * @param work h�r s�tter du in hur mcyket arbete du p�verkat n�got med
	 * @param time h�r s�ttter du in den tiden det tog
	 * @return tillbaka f� du effekten
	 */
	static double power(double work, double time) {
		return (work / time);
	}

	/**
	 * Denna metoden r�knar ut hur mycket energi det tar att v�rma upp ett visst
	 * materia vid ett visst antal grader
	 * 
	 * @param solid  h�r s�tter du in det materia som du vill g�ra utr�kningen p�
	 * @param mass   h�r s�tter du in materians massa
	 * @param deltaT h�r tar jag in skillnaden i v�rme
	 * @return Tillbaka f�r du hur mycket energi det kr�vs f�r att v�rma upp en viss
	 *         materia
	 */

	static double heatsolid(SolidTable solid, double mass, double deltaT) {
		return (SolidTable.IRON.heatCapacity * mass * deltaT);
	}

	/**
	 * Denna metoden r�knar ut hur mycket energi det tar att v�rma upp en v�tska vid
	 * ett visst antal grader
	 * 
	 * @param fluid  h�r tar jag in v�tska som jag vill g�ra utr�kningen p�
	 * @param mass   h�r tar jag in v�tskans massa
	 * @param deltaT h�r s�tter jag in skillnaden i graderna
	 * @return tillbka f�r jag hur mycket energi det kr�vs f�r att v�rma upp en
	 *         v�tska
	 */
	static double heatfluid(FluidTable fluid, double mass, double deltaT) {
		return (FluidTable.WATER.heatCapacity * mass * deltaT);
	}

	/**
	 * Denna metoden r�knar ut hur mycket energi det tar att v�rma upp en v�tska vid
	 * ett visst antal grader
	 * 
	 * @param gas    h�r tar jag in gasen som jag vill g�ra utr�kningen p�
	 * @param mass   h�r tar jag in gasens massa
	 * @param deltaT h�r s�tter jag in skillnaden i graderna
	 * @return tillbka f�r jag hur mycket energi det kr�vs f�r att v�rma upp en gas
	 */

	static double heatGas(GasTable gas, double mass, double deltaT) {
		return (GasTable.AIR.heatCapacity * mass * deltaT);
	}

	/**
	 * Denna metoden r�knar ut hur h�gt ett f�rem�l kommer upp med en viss hastighet
	 * 
	 * @param velocity h�r tar jag in hastigheten som f�rem�let f�rdas
	 * @return tillbaka f�r jag h�jden som f�rem�let kommer
	 */

	static double velocityToHeight(double velocity) {
		return (Math.pow(Math.sin(1.570796), 2) * Math.pow(velocity, 2)) / (2 * g);
	}

	// Egena metoder

	/**
	 * Denna metoden r�knar ut hur mycket effekt en bilmotor uppn�r beroende p�
	 * massa tid och hastighet
	 * 
	 * @param mass        H�r tar jag in bilens massa
	 * @param maxVelocity h�r skriver man in bilens hatighet som den uppn�t
	 * @param time        H�r �r tiden du uppn�t hastigheten p�
	 * @return Tillbaka f�r du Effekten en bilmotor uppn�t som beror p� tiden
	 */
	public static double CalculatedEffectForCarMotor(double mass, double maxVelocity, double time) {
		double p = mass * maxVelocity * maxVelocity / 2;
		return (p / time);
	}

	public static int bounceCount(double mass, double height) {
		
		int bouncecounter =0;
		double kineticEnergy = mass*g*height;
		
		while(height>=0.5) {
		kineticEnergy = kineticEnergy*0.99;
		
		height=(kineticEnergy/(mass*g));
		
		bouncecounter++;
		
		}
    	return bouncecounter;
    }

	/**
	 * Denna metoden g�r om enheten meter per sekund till kilometer per timme
	 * 
	 * @param ms h�r tar du in hastigheten i meter per sekund
	 * @return tillbaka f�r du hastigheter i kilometer i timmen
	 */
	public static double velocityExchangeKMH(double ms) {
		return (ms * 3.6);
	}

	/**
	 * Denna metoden g�r om enheten kilomter i timmen till meter per sekund
	 * 
	 * @param kmh h�r tar jag in hastigheten i killometer i timmen
	 * @return tillbaka f�r jag hastigheten i enheten meter per sekund
	 */
	public static double velocityExchangeMS(double kmh) {
		return (kmh/3.6);
	}

}
