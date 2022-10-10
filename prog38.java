class eligibilty{
    int maths;
    int physics;
    int chemistry;
    eligibilty(int m,int p,int c){
        maths=m;
        physics=p;
        chemistry=c;
    }
    int check_total(){
        int total =maths+physics+chemistry;
        int mp =maths+physics;
        if (maths>=60 && physics>=50 && chemistry>=40){
            if (total>=200 || mp>=150){
                return 1;
            }
            else {
                return 0;
            }
        }
        else{
            return 0;
        }
    }
}
class prog38{
    public static void main(String args[]) {
        eligibilty ob = new eligibilty(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        int num = ob.check_total();
        if (num == 1) {
            System.out.println("Candidate is eligible for the admission");
        } else {
            System.out.println("Candidate is not eligible for the admission");
        }
    }
}
