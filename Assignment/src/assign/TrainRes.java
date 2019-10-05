package assign;

	import java.io.DataInputStream;
	import java.io.DataOutputStream;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.TreeSet;

	public class TrainRes {
		
		public static void main(String[] args) throws IOException {
			
			if(args.length!=2)
			{
				System.out.println("Please submit source Data file and Destination file");
				System.exit(0);
			}
			
			File empDataFilePath = new File(args[0]);
			File empReportFilePath = new File(args[1]);
			
			if(!empDataFilePath.exists())
			{
				System.out.println(args[0]+" Invalid data file path");
				System.exit(0);
			}
			
			FileInputStream fis  =null;		
			DataInputStream dis = null;
			
			FileOutputStream fos = null;
			DataOutputStream dos = null;
			
			try
			{
				
				fis = new FileInputStream(empDataFilePath);			
				dis = new DataInputStream(fis);			
				
				ArrayList<String> empRecordsList = new ArrayList<String>();
				TreeSet<String> deptNames = new TreeSet<String> ();
				
				String record = dis.readLine();
				
				while(record!=null && !record.isEmpty())
				{
					empRecordsList.add(record);
					String[] fields = record.split(":");
					
					deptNames.add(fields[4]);
					
					record = dis.readLine();						
				}
				
				dis.close();
				fis.close();
				
				fos = new FileOutputStream(empReportFilePath);
				dos = new DataOutputStream(fos);
				
				System.out.println("============================================================================\n");
				dos.writeBytes("============================================================================\n");
				
				System.out.println("Dept Name    Total Count  Male Count  Female Count   Max Salary  Min Salary  Avg Salary  CTC \n");
				dos.writeBytes("Dept Name    Total Count  Male Count  Female Count   Max Salary  Min Salary  Avg Salary  CTC \n");
				
				System.out.println("============================================================================\n");
				dos.writeBytes("============================================================================\n");
				
				int totalEmpCount = 0;
				int totalMaleCount=0;
				int totalFemaleCount=0;
				double costToCompany=0.0;
				
				
				Iterator<String> deptNamesIterator = deptNames.iterator();
				
				while(deptNamesIterator.hasNext())
				{
					String deptName = deptNamesIterator.next();
					
					Iterator<String> empRecordsListIterator = empRecordsList.iterator();
					
					int deptEmpCount = 0;
					int deptMaleCount=0;
					int deptFemaleCount=0;
					
					double ctcDept=0.0;
					
					String empRecord=empRecordsListIterator.next();
					
					String[] fields = empRecord.split(":");
					
					double deptMaxSalary=Double.parseDouble(fields[2]);
					double deptMinSalary=Double.parseDouble(fields[2]);
					
					if(fields[4].equals(deptName))
					{
						deptEmpCount++;
						
						if(fields[3].equals("male"))
						{
							deptMaleCount++;
						}
						else
						{
							deptFemaleCount++;
						}
						
						double nextEmpSalary = Double.parseDouble(fields[2]);
						
						if(nextEmpSalary>deptMaxSalary)
						{
							deptMaxSalary=nextEmpSalary;
						}
						
						if(nextEmpSalary<deptMinSalary)
						{
							deptMinSalary=nextEmpSalary;
						}
						
						ctcDept = ctcDept + nextEmpSalary;
						
					}	
					
					while(empRecordsListIterator.hasNext())
					{				
						
						 empRecord = empRecordsListIterator.next();
						
						 fields = empRecord.split(":");
						
						if(fields[4].equals(deptName))
						{
							deptEmpCount++;
							
							if(fields[3].equals("male"))
							{
								deptMaleCount++;
							}
							else
							{
								deptFemaleCount++;
							}
							
							double nextEmpSalary = Double.parseDouble(fields[2]);
							
							if(nextEmpSalary>deptMaxSalary)
							{
								deptMaxSalary=nextEmpSalary;
							}
							
							if(nextEmpSalary<deptMinSalary)
							{
								deptMinSalary=nextEmpSalary;
							}
							
							ctcDept = ctcDept + nextEmpSalary;
							
						}					
					}
					
					double deptAvgSalary = ctcDept/deptEmpCount;	
					
					
					
					String result = deptName+"\t"+deptEmpCount+"\t"+deptMaleCount+"\t"+deptFemaleCount+"\t"+deptMaxSalary+"\t"+deptMinSalary+"\t"+Math.round(deptAvgSalary*100.0)/100.0+"\t"+ctcDept;
					
					dos.writeBytes(result+"\n");	
					System.out.println(result);
					
					totalEmpCount = totalEmpCount+deptEmpCount;
					
					totalMaleCount = totalMaleCount + deptMaleCount;
					
					totalFemaleCount = totalFemaleCount + deptFemaleCount;
					
					costToCompany = costToCompany + ctcDept;			
					
				}
				
				System.out.println("============================================================================");
				dos.writeBytes("============================================================================\n");
				
				System.out.println("\t\t Total count of employees : "+totalEmpCount);
				dos.writeBytes("\t\t Total count of employees : "+totalEmpCount+"\n");
				
				System.out.println("\t\t Total Male Count : "+totalMaleCount);
				dos.writeBytes("\t\t Total Male Count : "+totalMaleCount+"\n");
				
				System.out.println("\t\t Total Female count: "+totalFemaleCount);
				dos.writeBytes("\t\t Total Female count: "+totalFemaleCount+"\n");
				
				System.out.println("\t\t Total CTC   : "+costToCompany);
				dos.writeBytes("\t\t Total CTC   : "+costToCompany+"\n");
				
				System.out.println("============================================================================\n");
				dos.writeBytes("============================================================================\n");
				
				dos.close();
				fos.close();
				System.out.println("Successfully Geneareted");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				if(dis!=null)
				{
					dis.close();
				}
				
				if(fis!=null)
				{
					fis.close();
				}
				
				if(dos!=null)
				{
					dos.close();
				}
				if(fos!=null)
				{
					fos.close();
				}
			}	
		}

	}

