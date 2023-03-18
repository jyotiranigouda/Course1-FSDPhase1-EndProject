package files;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import exception.ExceptionHandling;

public class RetriveAddDeleteSearch {
	

		public void retrieveFiles() {

			 String[] pname;

			 	String path = System.getProperty("user.dir");
			 	
		        File var = new File(path+ "\\Root\\");
		        System.out.println("\n  Retriving the Files ************\n");
		        if(var.isDirectory()) {
		        	
		        	if(var.list().length>0) {
			        pname = var.list();
			        Arrays.sort(pname);
			        for (String pathname : pname) {
			            System.out.println(pathname);
			         }
			        }
				  else { 
					  System.out.println("\n  No Files Found in the Root Directory . Please Add Files ******* "); 
				  }

		        }
		        else {

		        	var.mkdir();

		        }
		}

		public  void addFile(String name) throws IOException {

			String file = name;
			file= file + ".txt";
			String path = System.getProperty("user.dir");
			File var = new File(path+ "\\Root\\" + file);


				if (!var.exists()) {

				var.createNewFile();
				System.out.println(" File is Created With the Name ----- " + file);
				}
				else {
					System.out.println(" File is Already Exist");
				}

		}

		public void deleteFile(String name) throws ExceptionHandling {

			String file = name;
			file= file + ".txt";
			String path = System.getProperty("user.dir");
			File var = new File(path+ "\\Root\\"+file);
			if(!var.exists()) {
				throw new ExceptionHandling(" *** File is Not Found  ");
			}
			else {
			if(file.equals(var.getName())) {
				var.delete();
				System.out.println(" File Deleted = " + file);
			}else {
				System.out.println("  File Does Not Match ");
			}
			}
		}

		public void searchFile(String name) {

			String file = name;
			int i;
			file= file + ".txt";
			String path = System.getProperty("user.dir");
			File var = new File(path+ "\\Root\\");

			String[] list = var.list();

			if(list==null) {
		         System.out.println("  Directory Does Not Exist  "); 
		      } else { 
		          for ( i=0;i<list.length;i++)
		          {
		              if (file.equals(list[i]))
		              {
		                  System.out.println("The File "+ name + " is Available ******************");
		                  break;
		              }

		          }
		          if(i==list.length) {

		        	  System.out.println(" The File is Not Available ************ ");
		          }

		}

		
	}

}
