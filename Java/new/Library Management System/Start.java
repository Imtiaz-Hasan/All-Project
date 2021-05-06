import classes.*;
import interfaces.*;
import java.lang.*;
import java.util.*;
import java.io.*;

public class Start
{
	public static void main(String args[])throws IOException
	{
		
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		BookShop b= new BookShop();
		
		System.out.println("            Library Management System        ");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("Choose one option\n");
			System.out.println("1.User Management");
			System.out.println("2.Library Management");
			System.out.println("3.Library Book Management");
			System.out.println("4.Book Amount ");
			System.out.println("5.Exit\n");
			System.out.print("Choose: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				
					
					System.out.println("You have selected User Management");
					
					System.out.println("Choose one option\n");
					System.out.println("1.Insert New User");
					System.out.println("2.Removed User");
					System.out.println("3.Show All Users");
					System.out.println("4.Search an User");
					System.out.println("5.Back\n");
					
					System.out.print("Choose: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						     
							System.out.println("Insert New User");
							
							System.out.print("Enter User ID: ");
							int userId1 = sc.nextInt();
							
							System.out.print("Enter User Name: ");
							String name1 =bfr.readLine();
							
							
							User e1 = new User();
							e1.setUserId(userId1);
							e1.setName(name1);
							
								
							b.insertUser(e1);
						
							break;
							
							
						case 2:
						
							System.out.println("Remove User");
							
							System.out.print("Enter User ID: ");
							int userId3 = sc.nextInt();
							
							User e3 = b.getUser(userId3);
							
							if(e3 != null)
							{
								b.removeUser(e3);
							}
							
							break;
							
						case 3:
						
							System.out.println("Show All User");
							b.showAllUsers();
							break;
							
						case 4:
						
							System.out.println("Search User");
							
							System.out.print("Enter User ID: ");
							int userId2 = sc.nextInt();
							
							User e2 = b.getUser(userId2);
							
							if(e2 !=null)
							{
								System.out.println();
								System.out.println("User ID: "+e2.getUserId());
								System.out.println("User Name: "+e2.getName());
								System.out.println();
							}
							
							break;
							
						case 5:
						
							System.out.println("        Back");
							break;
							
						default:
						
							System.out.println("Invalid Option");
							break;
					}
					
					break;
					
				case 2:
				
					System.out.println("You have selected Library Management");
					
					System.out.println("Choose one option\n");
					System.out.println("1. Insert New Library");
					System.out.println("2. Remove Library");
					System.out.println("3. Show All Libraries");
					System.out.println("4. Search Library");
					System.out.println("5. Back\n");
					
					System.out.print("Choose: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						   
						    System.out.println("Insert New Library");
								
							System.out.print("Enter Library Address: ");
							String address1 = bfr.readLine();
							System.out.print("Enter Library Name: ");
							String name1 = bfr.readLine();
						
								
							Library s1 = new Library();
							s1.setAddress(address1);
							s1.setName(name1);
							
							b.insertLibrary(s1);
							break;
							
						case 2:
						   
							System.out.println("Remove Library");
							System.out.print("Enter Library Address: ");
							String address3 = bfr.readLine();
									
							Library s3 = b.getLibrary(address3);
									
							if(s3!= null)
							{
								b.removeLibrary(s3);
							}
							
						break;
						
					    case 3:
						
							System.out.println("Show All Library");
							b.showAllLibraries();
							break;
							
						case 4:
						   
								System.out.println("Search Library");
								
								System.out.print("Enter Library Address: ");
								String address2 =bfr.readLine();
								
								Library s2 = b.getLibrary(address2);
								
								if(s2 !=null)
								{
									System.out.println();
									System.out.println("Library address: "+s2.getAddress());
									System.out.println("Library Name: "+s2.getName());

									System.out.println();
								}
						
						   
						break;
						   
						case 5:
						
							System.out.println("        Back   ");
							break;
						default:
						
							System.out.println("Invalid Option");
							break;
					}
							
					break;
					
				case 3:
				
					System.out.println("You have Selected Library Book Management");
					
					System.out.println("Choose one Option:\n");
					System.out.println("1.Insert New Book");
					System.out.println("2.Remove Book");
					System.out.println("3.Show All Book");
					System.out.println("4.Search a Book");
					System.out.println("5.Back\n");
					
					System.out.print("Choose: ");
					int option3 = sc.nextInt();	
					
					switch(option3)
					{
						case 1:
						   
								System.out.println("Insert New Book");
								
								Book p=null;
								
								System.out.println("What do you want to Insert?\n");
							    System.out.println("1.Story Book");
							    System.out.println("2.Comic Book");
							    System.out.println("3.Back");
							
							    System.out.print("Choose: ");
							    int type = sc.nextInt();
								
								if(type == 1)
								{
								StoryBook lp=new StoryBook();
								
								System.out.print("Enter Book ID: ");
								String bookid1 = bfr.readLine();
								System.out.print("Enter Book Name: ");
								String bookname1 = bfr.readLine();
								System.out.print("Enter Book Price: ");
								double price1=sc.nextDouble();
								System.out.print("Enter History book: ");
								String historyBook1=bfr.readLine();
								System.out.print("Enter Book Accessible Amount: ");
								int accessibleAmount1=sc.nextInt();
								
								
								lp.setBookId(bookid1);
								lp.setBookName(bookname1);
								lp.setPrice(price1);
								lp.setHistoryBook(historyBook1);
								lp.setAccessibleAmount(accessibleAmount1);
								
								p = lp;
								
							    }
							else if(type == 2)
							   {
							     ComicBook ip=new ComicBook();
								
								System.out.print("Enter Book BookID: ");
								String bookid2 = bfr.readLine();
								System.out.print("Enter Book Name: ");
								String bookname2 = bfr.readLine();
								System.out.print("Enter Book Price: ");
								double price2=sc.nextDouble();
								System.out.print("Enter Book Manga: ");
								String manga2=bfr.readLine();
								System.out.print("Enter Book Accessible Amount: ");
								int accessibleAmount2=sc.nextInt();
								
								ip.setBookId(bookid2);
								ip.setBookName(bookname2);
								ip.setPrice(price2);
								ip.setManga(manga2);
								ip.setAccessibleAmount(accessibleAmount2);
								
								p = ip;
								
							}
							else if(type == 3)
							{
								System.out.println("             Back");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							if(p!=null)
							{
								System.out.print("Enter Library BookID: ");
								String bookid4=bfr.readLine();
								b.getLibrary(bookid4).insertBook(p);
							}
							break;
							
							
						case 2:
						   
									System.out.println("Remove Book");
									
									System.out.print("Enter Library BookID: ");
									String address5 = bfr.readLine();
									System.out.print("Enter Book BookID: ");
									String bookid3=bfr.readLine();
									
									b.getLibrary(address5).removeBook(b.getLibrary(address5).getBook(bookid3));
							 
						   
						break;
						
					    case 3: 
						
							System.out.println("Show All Product of a Library");
							
							System.out.print("Enter Library Address: ");
							String address6 =bfr.readLine();
							
							b.getLibrary(address6).showAllBooks();
							
							break;
							
						case 4:
						   
							    System.out.println("Search a Book in a Library\n");
							
							    System.out.print("Enter Library Address: ");
								String address7 = bfr.readLine();
								System.out.print("Enter Book BookID: ");
								String bookid4=bfr.readLine();
							
							    Book p1 = b.getLibrary(address7).getBook(bookid4);
							
							    if(p1 != null)
							   {
							     	p1.showInfo();
							   }
							break;
							
						case 5:
						
							System.out.println("             Back");
							break;
						default:
						
							System.out.println("Invalid Option");
							break;
					}
				
                case 4:
				
					System.out.println("You have selected Book Amount:");
					
					System.out.println("Choose one Option:\n");
					System.out.println("1.Add Book");
					System.out.println("2.Sell Book");
					System.out.println("3.Show History");
					System.out.println("4.Back\n");
					
					System.out.print("Your Option: ");
					int option4 = sc.nextInt();	
                    
                    switch(option4)
                    {
						case 1:
							System.out.println("Add Book");
						    System.out.print("Enter Library Address: ");
							String address8 = bfr.readLine();
							System.out.print("Enter Book BookID: ");
							String bookid5=bfr.readLine();
							System.out.print("Enter the Amount of Book: ");
							int amount1=sc.nextInt();
							
							b.getLibrary(address8).getBook(bookid5).addAmount(amount1);
							break;
							
						case 2:
							System.out.println("Sell Book");
						    System.out.print("Enter Library Address: ");
							String address9 = bfr.readLine();
							System.out.print("Enter BookId: ");
							String bookid6=bfr.readLine();
							System.out.print("Enter the Amount of Book: ");
							int amount3=sc.nextInt();
							
							b.getLibrary(address9).getBook(bookid6).sellAmount(amount3);
							break;
						case 3:
						
							System.out.println("      Back");
							break;
							
						default:
						
							System.out.println("Invalid Option");
							break;
					}					
				
				default:
				
				System.out.println("Invalid Choice");
				break;
			    }
}
}
}


     
