package virtualKeyForRepo;
import java.io.IOException;
import java.util.Scanner;

import exception.ExceptionHandling;
import files.RetriveAddDeleteSearch;

public class MainMethod {
	public static void main(String[] args) {
		
		Scanner ob = new Scanner(System.in);
		String a = null;
		String b = null;
		
		RetriveAddDeleteSearch bl=new RetriveAddDeleteSearch();
		
		System.out.println("          //////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("         ///                               Welcome  To                                      ///");
		System.out.println("        ///                                                                                ///");
		System.out.println("       ///                           Virtual Key For Repositories                         ///");
		System.out.println("      ///                               Lockers Pvt. Ltd                                 ///");                   
		System.out.println("     ///                                 Developer Name:                                ///");         
		System.out.println("    ///                                  JYOTI RANI GOUDA                              ///");                
		System.out.println("   //////////////////////////////////////////////////////////////////////////////////////");
		do {
			System.out.println(" ****************************************************************************************");
			System.out.println();
			System.out.println("PLEASE CHOOSE FROM FOLLOWING OPTIONS                                         ");
			System.out.println();
			System.out.println("Type: 1 - To view all the files in Ascending Order");
			System.out.println();
			System.out.println("Type: 2 - To view More Options");
			System.out.println();
			System.out.println("type: 3 - To Exit ");
			System.out.println();
				
			a = ob.nextLine();
			
			switch (a) {
			case "1":
					bl.retrieveFiles();
					System.out.println();
					
					break;
			case "2":
				do {
					System.out.println();
					System.out.println("                                                                          ");
					System.out.println(" Choose from the following options ");
					
					System.out.println("********************************************************");
					System.out.println();
					System.out.println(" Type: 1 Add a File               ");
					System.out.println(" Type: 2 Delete a File        ");
					System.out.println(" Type: 3 Search a File       ");
					System.out.println(" Type: 4 Returning to the Main Menu                     \n");
					System.out.println(" Please choose options Between 1 to 4 ");

						b = ob.nextLine();

					switch(b) {
					case "1":
						System.out.println(" Please write a name to Create file ");
						String addfile = ob.nextLine();
						try {
							bl.addFile(addfile);
						} catch (IOException e) {
							System.out.println(e.getMessage());
						}
						continue;
					
					case "2":
						System.out.println(" Please write the File name to Delete                            ");
						String deletefile = ob.nextLine();
						try {
							bl.deleteFile(deletefile);
						} catch (ExceptionHandling e) {
							System.out.println(e.getMessage());;
						}
						continue;
					case "3":
						System.out.println(" Please write the File Name to Search ");
						String searchfile = ob.nextLine();
						 bl.searchFile(searchfile);
						 continue;

					
					case "4":System.out.println(" Returning to Main Menu - \n");
							break;

					default:System.out.println(" Incorect Option ....!!! Choose within 1 to 4  ");
							continue;
					}
					break;
				}while(b != "4");
				break;
			
			case "3":
				System.out.println("\n  Thanks  For visiting  Our site...... \n");
				System.exit(0);

			default:System.out.println(" Incorrect Option....!!! Choose within 1 to 3  ");
				System.out.println();
			break;
			}
		} while (a != "3");

	}

}


