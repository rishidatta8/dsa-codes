class box{
	int height;
	int width;
	int depth;
	box(){
		height=0;
		width=0;
		depth=0;
	}
	box(int h,int w,int d){
		height=h;
		width=w;
		depth=d;
	}
	box(box b){
		height=b.height;
		width=b.width;
		depth=b.depth;
	}
	int volume(){
		return height*width*depth;
	}
}
class prog41 {
	public static void main(String args[]) {
		box b1 = new box();
		System.out.println("Through default constructor");
		System.out.println("Height = "+b1.height);
		System.out.println("Width = "+b1.width);
		System.out.println("Depth = "+b1.depth);
		System.out.println("Volume = "+b1.volume());
		box b2 = new box(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
		System.out.println("Through parameterized constructor");
		System.out.println("Height = "+b2.height);
		System.out.println("Width = "+b2.width);
		System.out.println("Depth = "+b2.depth);
		System.out.println("Volume = "+b2.volume());
		box b3 = new box(b2);
		System.out.println("Through copy constructor");
		System.out.println("Height = "+b3.height);
		System.out.println("Width = "+b3.width);
		System.out.println("Depth = "+b3.depth);
		System.out.println("Volume = "+b3.volume());

	}
}