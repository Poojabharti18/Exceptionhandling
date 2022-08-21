package exceptionhandling;

public class Student {
	   private int sId;
	    private String sName;
	    private int m1,m2,m3,m4,m5;
	    public Student()
	    {
	        
	    }
	    public Student(int sId, String sName, int m1, int m2, int m3, int m4, int m5) {
	        super();
	        this.sId = sId;
	        this.sName = sName;
	        this.m1 = m1;
	        this.m2 = m2;
	        this.m3 = m3;
	        this.m4 = m4;
	        this.m5 = m5;
	    }
		public int getsId() {
			return sId;
		}
		public void setsId(int sId) {
			this.sId = sId;
		}
		public String getsName() {
			return sName;
		}
		public void setsName(String sName) {
			this.sName = sName;
		}
		public int getM1() {
			return m1;
		}
		public void setM1(int m1) {
			this.m1 = m1;
		}
		public int getM2() {
			return m2;
		}
		public void setM2(int m2) {
			this.m2 = m2;
		}
		public int getM3() {
			return m3;
		}
		public void setM3(int m3) {
			this.m3 = m3;
		}
		public int getM4() {
			return m4;
		}
		public void setM4(int m4) {
			this.m4 = m4;
		}
		public int getM5() {
			return m5;
		}
		public void setM5(int m5) {
			this.m5 = m5;
		}
		 public double getPercentage()
		    {
		        return (m1+m2+m3+m4+m5)*100/500.0;
		    }
		    @Override
		    public String toString() {
		        return "Student [sId=" + sId + ", sName=" + sName + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4
		                + ", m5=" + m5 + "]"+getPercentage();
		    }
		    

		}

