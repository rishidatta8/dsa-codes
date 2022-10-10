import java.lang.Math;
class interest{
	double principle;
	double rate;
	double time;
	interest(double p,double r,double t){
		principle=p;
		rate=r;
		time=t;
	}
	double simple_interest(){
		return (principle*rate*time)/100;
	}
	double compound_interest(){
		double rr = Math.pow(1+rate/100,time);
		return (principle*rr)-principle;
	}
}
class prog39{
	public static void main(String args[]){
		if (args.length==3){
			interest ob = new interest(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]));
			System.out.println("Values");
			System.out.println("Principle = "+ob.principle);
			System.out.println("Rate = "+ob.rate);
			System.out.println("Time = "+ob.time);
			System.out.println("Simple Interest = "+ob.simple_interest());
			System.out.println("Compound Interest = "+ob.compound_interest());
		}
		else{
			System.out.println("Enter all three arguments");
		}
	}
}