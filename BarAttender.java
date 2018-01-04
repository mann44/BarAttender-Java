package cs501_hw;
import java.util.Random;

	public class BarAttender {
		private int min; //Work in the range of min to max
	    private int max;

	    BarAttender(int min, int max) {
	        this.min = min;
	        this.max = max;
	    }

	    private int guess(int g, boolean show) {
	        int numberOfGuesses  = 1;
	        int l = min;
	        int r = max;
	        if(show = true){
	        	System.out.print("l:"+l+"\t");
				System.out.print("r:"+r+"\t");

	        while(r >= l){
	            int m = l + ((r - l) / 2);
	            if(m > g){
	                r = m - 1;
	                System.out.print("l="+l+"\t");
					System.out.print("r="+r+"\t");
	                numberOfGuesses++;
	                System.out.println("Step: " + numberOfGuesses + " Your random guess between Left: " + l + " Right: " + r + " Middle : " + m);
	            }else if(m < g){
	                l = m + 1;
	                System.out.print("l="+l+"\t");
					System.out.print("r="+r+"\t");
	                numberOfGuesses++;
	            }else{
	               if(m == g)
	                   return numberOfGuesses++;
	            }
	        }
	        }
	        else
	        	{
	        	while(max >= min){
	       		 	
	       		 	int m = min + ((max - min) / 2);
	                if(m > g){
	                    max = m - 1;
	                    //System.out.println("Max>>"+max);
	                    numberOfGuesses++;
	                }else if(m < g){
	                    min = m + 1;
	                    //System.out.println("min>"+min);
	                    numberOfGuesses++;
	                }else{
	                   if(m == g)
	                       return numberOfGuesses++;
	                }
	            }
	        }
	        return numberOfGuesses;
	    }

	    // Cannot change code below
	    private static void test(int s, int b, int m, boolean useRandom, boolean show) {
	        Random r = new Random();
	        int min = 9999;
	        int max = 0;
	        BarAttender h = new BarAttender(s, b);
	        for (int i = 0; i < m; ++i) {
	            int v = i + s;
	            if (useRandom) {
	                v = RandomInt.getRandomInt(r, s, b); //This gives number between 1 to 1000000-1
	            }
	            int n = h.guess(v, show);
	            if (n > max) {
	                max = n;
	            }
	            if (n < min) {
	                min = n;
	            }
	        }
	        System.out.print("For numbers  between " + s + " to " + b + " ");
	        if (useRandom) {
	            System.out.print("(random numbers)");
	        } else {
	            System.out.print("(not random numbers)");
	        }
	        System.out.println(" the min guess is " + min + " max guess is " + max);
	    }

	    // Cannot change code below
	    private static void testBench() {
	        test(1, 10, 10, false, true);
	        test(1, 1000000, 1000, false, false);
	        test(1, 1000000, 1000, true, false);
	    }
	 // Cannot change code below
	    public static void main(String[] args) {
	        System.out.println("BarAttender.java");
	        testBench();
	        System.out.println("DONE");
	    }
	}


