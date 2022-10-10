
class rectangle{
	 int a;
	int b;
	rectangle(int x,int y){
		a=x;
		b=y;
	}
	void area(){
		int aa=a*b;
		System.out.println("Area of rectangle = "+aa);
	}
}
class box extends rectangle{
	 int a;
	box(int x,int y,int z){
		super(x,y);
		a=z;
	}
	void area(){
		int ar= 2*((this.a*b)+(this.a*a)+(a*b));
		System.out.println("Dimesions");
		System.out.println("Height = "+ super.a);
		System.out.println("Width = "+b);
		System.out.println("Depth = "+a);
		System.out.println("Area of box = "+ar);
		super.area();
	}
}
class prog42{
	public static void main(String args[]){
		if (args.length==3){
			box b1= new box(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
			b1.area();
		}
		else{
			System.out.println("Enter all three arguments");
		}
	}
}
