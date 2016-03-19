import java.util.ArrayList;


public class Test {
	 public static void main(String args[]){
		 double n = 0.05;
		 double s = 0.25;
		 double d =0.1;
		 double alpha = 0.3;
		 double z = 2.0;
		 double k =1.0;
		 Solow s1 = new Solow(n,s,d,alpha,z,k);
		 Solow s2 = new Solow(n,s,d,alpha,z,8.0);
		 int t = 160;
		 
		 double steadystate = s1.steadystate(s1);
		 System.out.println(steadystate);
		 ArrayList<Double> p1 =s1.generateseq(s1, t);
		 ArrayList<Double> p2 =s1.generateseq(s2, t);
		 for(int i =0;i<p1.size();i++){
			 System.out.print(p1.get(i)+" ");
		 } 
	     System.out.println();
	     for(int j =0;j<p2.size();j++){
			 System.out.print(p2.get(j)+" ");
		 }
	 }
	
				 
}
