public class Class1 {

	    private int code;
	    private int grade;
	    private int credit;
	    protected static int count = 0;

	    public Class1() {}

	    public void setCode(int code)
	    {
	        this.code = code;
	    }

	    public int getCode()
	    {
	        return code;
	    }
	    public void setGrade(int grade)
	    {
	        this.grade = grade;
	    }

	    public int getGrade()
	    {
	        return grade;
	    }

	    public void setCredit(int credit )
	    {
	        this.credit = credit;
	    }

	    public int getCredit()
	    {
	        return credit;
	    }
	//    public String getFormattedPrice()
	 //   {
	  //      NumberFormat currency = 
	  //          NumberFormat.getCurrencyInstance();
	  //      return currency.format(price);
	    //}

	    @Override
	    public String toString()
	    {
	        return "Code:        " + code + "\n" +
	               "Grade: " + grade + "\n" +
	               "Credit:       " + credit + 
	               "\n";
	    }

	    public static int getCount()
	    {
	        return count;
	    }
	}