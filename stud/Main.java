import java.util.*;

class Main
{
	public static void main(String args[])
	{
		
		int  n=0,m1,m2,m3,m4,m5,j;
		String stno,sname,id,pass,i="admin",p="pass";
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter UserName :: ");
		id=sc.nextLine();
		System.out.print("Enter Password :: ");
		pass=sc.nextLine();
		if(id.equals(i) && pass.equals(p))
		{



		Student s=new Student();
		do{
			System.out.println("                                                  ");
			System.out.println("------------------------------------------");
			System.out.println("Student Management system");
			System.out.println("------------------------------------------");
			System.out.println("1.New Student Entry");
			System.out.println("2.View Student Records");
			System.out.println("3.Calculate Student Results");
			System.out.println("4.Exit");
			try{
			System.out.println("Enter your choice::");
			n=Integer.parseInt(sc.nextLine());			
			}
			catch(Exception e){System.exit(0);}

				switch(n){
					case 1:
						s.insert();
						break;
					 case 2:
						
						s.disp1();
						break;

					case 3:
						s.calc();
						s.disp();
						break;
					/*case 4:
						System.out.println("Enter Student ID:::");
						stno=sc.nextLine();
						System.out.println("Enter Student Name:::");
						sname=sc.nextLine();
						System.out.println("Enter Marks [FI]:::");
						m1=Integer.parseInt(sc.nextLine());
						System.out.println("Enter Marks [DT]:::");
						m2=Integer.parseInt(sc.nextLine());
						System.out.println("Enter Marks [JAVA]:::");
						m3=Integer.parseInt(sc.nextLine());
						System.out.println("Enter Marks [OSC]:::");
						m4=Integer.parseInt(sc.nextLine());
						System.out.println("Enter Marks [SADOOA]:::");
						m5=Integer.parseInt(sc.nextLine());
						s.modi(stno,sname,m1,m2,m3,m4,m5);
						s.calc();
						break;
					case 5:
						s.del();
						break;
					*/
					
					}

		}while(n<4);
		
	

	}
	else
	{
		System.out.println("Invalid UserName or Password");
	}
}
}
class Student
{
	int m1[]=new int[20],m2[]=new int[20],m3[]=new int[20],m4[]=new int[20],m5[]=new int[20];
	int tot[]=new int[40],c[]=new int[30],n,j;
	double per[]=new double[40];
	String sname[]=new String[20],b,stno[]=new String[10];
	String grade[]=new String[10];
				Scanner sc=new Scanner(System.in);
	void insert()
	{
		try{
		System.out.println("Enter no of student:::");
		n=Integer.parseInt(sc.nextLine());
		}
			catch(Exception e){System.exit(0);}
		for(j=0;j<n;j++)
		{
		System.out.println("------------------------------------------------");
		System.out.println("	 Enter for Student :: "+(j+1)+"	");	
		System.out.println("-------------------------------------------------");
		System.out.println("Enter Student ID:::");
		stno[j]=sc.nextLine();
		System.out.println("Enter Student Name:::");
		sname[j]=sc.nextLine();
		System.out.println("Enter Marks [FI]:::");
		m1[j]=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Marks [DT]:::");
		m2[j]=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Marks [JAVA]:::");
		m3[j]=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Marks [OSC]:::");
		m4[j]=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Marks [SADOOA]:::");
		m5[j]=Integer.parseInt(sc.nextLine());	
		}
		

	}



	
	void calc()
	{ 
		for(j=0;j<n;j++)
		{
		if(m1[j]<35)
			c[j]=c[j]+1;
		
		if(m2[j]<35)
			c[j]=c[j]+1;
		
		if(m3[j]<35)
			c[j]=c[j]+1;
		
		if(m4[j]<35)
			c[j]=c[j]+1;
		
		if(m5[j]<35)
			c[j]=c[j]+1;
		if(c[j]>=3)
		{
			grade[j]="Fail";
		}
		else if(c[j]>0 &&c[j]<3 )
		{
			 
			tot[j]=m1[j]+m2[j]+m3[j]+m4[j]+m5[j];
			 
			grade[j]="ATKT";
		}
		else
		{
			c[j]=0;per[j]=0.0;
		tot[j]=m1[j]+m2[j]+m3[j]+m4[j]+m5[j];
		
		per[j]=tot[j]/5;
		System.out.println("Result Calculated");
		if(per[j]>=70)
		{
			grade[j]="Distinction";
		}
		if(per[j]>=60 && per[j]<70 )
		{
			grade[j]="First Class";
		}
		if(per[j]>=50 && per[j]<60 )
		{
			grade[j]="Second Class";
		}
		if(per[j]>=40 && per[j]<50 )
		{
			grade[j]="Pass Class";
		}
		if(per[j]<40 )
		{
			grade[j]="Fail";
		}
	     }		
	}
}
	void disp()
	{
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t ***** Student Results *****");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Roll_no\t\t      Name\t\t[FI]\t[DT]\t[JAVA]\t[OSC]\t[SADOOA]\t[Total]\t[Per]\t[Grade]");
		for(j=0;j<n;j++)
		{
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(stno[j]+"\t"+sname[j]+"\t\t  "+ m1[j]+"\t  "+m2[j]+"\t  "+m3[j]+"\t  " +m4[j]+"\t  "+m5[j]+"\t\t  "+tot[j]+"\t " + per[j]+"\t"+grade[j]);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
		}
	}



	void disp1()
	{
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t ***** Student Records*****");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Roll_no\t\t      Name\t\t[FI]\t[DT]\t[JAVA]\t[OSC]\t[SADOOA]");
		for(j=0;j<n;j++)
		{
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println(stno[j]+"\t"+sname[j]+"\t\t  "+ m1[j]+"\t  "+m2[j]+"\t  "+m3[j]+"\t  " +m4[j]+"\t  "+m5[j]);
		System.out.println("-----------------------------------------------------------------------------------------");
		}
	}











	void modi(String a,String b,int c,int d,int e, int f, int g)
	{
			for(j=0;j<n;j++)
			{
			if(a.equals(stno[j]))
			stno[j]=a;sname[j]=b;m1[j]=c;m2[j]=d;m3[j]=e;m4[j]=f;m5[j]=g;tot[j]=0;per[j]=0.0;
			
			}
			tot[j]=m1[j]+m2[j]+m3[j]+m4[j]+m5[j];
		System.out.println("Record Modified");	
	}
	
	void del()
	{
			System.out.println("Enter Student Number::");
			String a=sc.nextLine();
		for(j=0;j<n;j++)
			{
				if(stno[j]==a)
				{
					stno[j]="NULL";sname[j]="NULL";m1[j]='\0';m2[j]='\0';m3[j]='\0';m4[j]='\0';m5[j]='\0';tot[j]='\0';per[j]='\0';grade[j]="NULL";		
				}
			}
		System.out.println("Record deleted");
	}
}
