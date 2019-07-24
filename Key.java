//Andre Barajas 

//this  class will generate ascii keys and provide other functionality.
public class Key 
{
	private long key;
	private String word;
	private double RADIX = 128;
	private int  n  = 5757;
	public Key() {} 
	//the constructor will hash the word input into its respective key.
	
    public Key(String x)
    {
    	word = x;
      int  stringLength = x.length();
       //char array[] = new char[stringLength];
      //using 128 as a radix(total # of , ascii word is converted into key
      long sum = 0;
      int currExp = stringLength-1;
      for(int i= 0; i < stringLength-1; i++)
       {
    	  
    	  int currentcValue = (int)x.charAt(i);
    	  sum +=(long) (Math.pow(RADIX, currExp) * currentcValue);
    	  currExp--;
    	
       }
      sum += (int)x.charAt(stringLength-1);
      key = sum;
      
    }
    
    public  long functionOne()
	{
		return (long) key;
	}
	public  long functionTwo()
	{
		return (long) ( ((key%n)*(key%n) )+1 );
	}
	public  long functionThree()
	{
		return  (long) ((key%n)*(key%n) *(key%n));
	}
    //Setters and getters for key and word
    
	public long getKey() {
		return key;
	}

	public void setKey(long key) {
		this.key = key;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
}