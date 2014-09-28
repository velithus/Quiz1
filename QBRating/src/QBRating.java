import java.util.Scanner;

//It's not coming out exactly right but somewhere close, I'm not sure where the issue lies
public class QBRating {
	
	public static double a(int comp, int att) {
		double result = ((comp/att)-.3)*5;
		return Math.max(0, Math.min(result, 2.375));
	}
	
	public static double b(int yds, int att) {
		double result = ((yds/att)-3)*.25;
		return Math.max(0, Math.min(result, 2.375));
	}
	
	public static double c(int td, int att) {
		double result = (td/att)*20;
		return Math.max(0, Math.min(result, 2.375));
	}
	
	public static double d(int intr, int att) {
		double result = 2.375-((intr/att)*25);
		return Math.max(0, Math.min(result, 2.375));
	}
	
	public static double passerRating(double a, double b, double c, double d) {
		double result = ((((a+b)+c)+d)/6)*100;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Number of passing attempts:");
		int att = in.nextInt();
		System.out.println("Number of completions:");
		int comp = in.nextInt();
		System.out.println("Passing yards:");
		int yds = in.nextInt();
		System.out.println("Touchdown passes:");
		int td = in.nextInt();
		System.out.println("Interceptions:");
		int intr = in.nextInt();
		System.out.println("The QB rating is: "+passerRating(a(comp,att), b(yds, att), c(td, att), d(intr, att)));
	}

}
