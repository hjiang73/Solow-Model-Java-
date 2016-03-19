import java.util.ArrayList;



public class Solow {
	
private double n;
private double s;
private double d;
private double alpha;
private double z;
private double k;

/*
 * 
  Implements the Solow growth model with update rule
  math::
  k_{t+1} = \frac{s z k^{\alpha}_t}{1 + n}  + k_t \frac{1 + d}{1 + n}
 */
	
	public Solow(double n, double s,
			double d, double alpha, double z,double k){
	
		this.n = n;
		this.s =s;
		this.d =d;
		this.alpha =alpha;
		this.z=z;
		this.k=k;
		
	}
	//"Evaluate the h function"
	public double hfunction(Solow solow){
	    double temp = 
	    		solow.s*solow.z*Math.pow(solow.k,solow.alpha) + solow.k * (1 - solow.d);
	    return temp / (1 + solow.n);
			
	}
	
	//"Update the current state (i.e., the capital stock)."
	public void update(){
		this.k = this.hfunction(this);
	}
	
	public double steadystate(Solow solow){
	     return Math.pow(((solow.s * solow.z) / (solow.n + solow.d)),
	    		 (1 / (1 - solow.alpha)));
		
	}
	
	public ArrayList<Double> generateseq(Solow solow, int t){
		ArrayList<Double> path = new ArrayList<Double>();
		for(int i = 0; i<t;i++){
			path.add(solow.k);
			solow.update();
		}
		return path;
		
	}
	

	
	

}
