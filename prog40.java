import java.lang.Math;
class numbers{
    int num1;
    int num2;
    numbers(int n1,int n2){
        num1=n1;
        num2=n2;
    }
}
class numbers2 extends numbers{
    numbers2(int n,int nn){
        super(n,nn);
    }
    int sum(){
        return num1+num2;
    }
    int product(){
        return num1*num2;
    }
    int square1(){
        return (int)Math.sqrt(num1);
    }
    int square2(){
        return (int)Math.sqrt(num2);
    }
    int cube1(){
        return num1*num1*num1;
    }
    int cube2(){
        return num2*num2*num2;
    }
}
public class prog40 {
    public static void main(String args[]){
        numbers2 ob= new numbers2(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        System.out.println("Sum of two numbers: "+ob.sum());
        System.out.println("Product of two numbers: "+ob.product());
        System.out.println("Square root of number "+ob.num1+": "+ob.square1());
        System.out.println("Square root of number "+ob.num2+": "+ob.square2());
        System.out.println("Cube of number "+ob.num1+": "+ob.cube1());
        System.out.println("Cube of number "+ob.num2+": "+ob.cube2());
    }
}
