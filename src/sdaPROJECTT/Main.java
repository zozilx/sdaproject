package sdaPROJECTT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    private static final String file = null;



	public static void main(String[] args)  {
        /*System.out.println("Hello World!");*/
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to my application \n this app are developed by 'Abdulaziz Alshehri' ");
        System.out.println("**************************************");
        try {
        	optionsSelection();
        	} catch (FileNotFoundException e) {
        	// TODO Auto-generated catch block
        	e.printStackTrace();
        	}
        	
    }
    
    private static void optionsSelection() throws FileNotFoundException {
    	
    	String[] arrr = {"for review files prees [1]", 
    			"for more options prees [2]",
    			};
        
        int[] arr1 = {1,2};
        int  sslen = arr1.length;
        for(int i=0; i<sslen;i++){
            System.out.println(arrr[i]);
        }    
    Scanner sa = new Scanner(System.in);
  
    int option = sa.nextInt();

	   for(int g=1;g<=sslen;g++){
         if(option==g){
        
        switch (option) {
        case 1:
        	
        	 String[] ExistFiles;

            
             File l = new File("D:/sdaPROJECTT");

            
             ExistFiles = l.list();

          
             for (String pathname : ExistFiles) {
         
                 System.out.println(pathname);
             }
             optionsSelection();
     
        break;
        	
       	case 2:	
        		
        		
        		
        		        String[] arr = {"for add files prees [1]",
        		                "for delete files prees [2]",
        		                "for sort files press [3]",
        		                "for close the application prees [4]",
        		                "to back press [5]"
        		        };
        		        int[] arr2 = {1,2,3,4};
        		        int  slen = arr2.length;
        		        for(int f=0; f<slen;f++){
        		            System.out.println(arr[f]);
        		            
        		        }
        		       
        		        Scanner ss = new Scanner (System.in);
        		        
        		       
        		        
        		        
        		     
        		        System.out.println("\nEnter your choice:\t");
        		        Scanner sc = new Scanner(System.in);
        		        int  options =  sc.nextInt();
        		      
        		        
        		
        		
        		
        		   for(int j=1;j<=slen;j++){
        	            if(options==j){
        	                switch (options){
        	                
        	                   //method to add and create file.
        	                
        	                    case 1:
        	                    	 System.out.println("Enter the file name to add: \n");
        	                    	 String name = ss.nextLine();
        	                       
        	                    	 File files = new File(name + ".txt");
        	                    	 
        	                     	boolean result;  
        	                     	try   
        	                     	{  
        	                     	result = files.createNewFile();
        	                     	
        	                     	if(result)     
        	                     	{  
        	                         
        	                     	System.out.println("file created and added to array "+files.getCanonicalPath()); 
        	                     	
        	                     	}  
        	                     	else  
        	                     	{  
        	                     	System.out.println("File already exist at location: "+files.getCanonicalPath());  
        	                     	}  
        	                     	}   
        	                     	catch (IOException e)   
        	                     	{  
        	                     	e.printStackTrace();   
        	                     	}
        	                     

        	                        optionsSelection();
        	                        

        	                        break;
        	                        
        	                   //method for delete specific file.
        	                        
        	                    case 2:
        	                    	System.out.println("Enter the name and type of the file");                 	
                                   
                                    String na = ss.nextLine();
        	                        File file = new File("D:\\sdaPROJECTT\\" + na);
        	                          
        	                        if(file.delete())
        	                        {
        	                            System.out.println("File deleted successfully");
        	                        }
        	                        else
        	                        {
        	                            System.out.println("Failed to delete the file");
        	                        }
        	                    	
        	                    	   optionsSelection();
        	                    	break;
        	                    	
        	                    	//method to find or search for specific file.
        	                    	
        	                    case 3:
        	                    	
        	                    	   File directory = new File("D:/sdaPROJECTT");
        	                    	   
        	                          
        	                           String[] A = directory.list();
        	                           int flag = 0;
        	                           if (A == null) {
        	                               System.out.println("Empty directory.");
        	                           }
        	                           else {
        	                     
        	                               // Linear search in the array
        	                        	   System.out.println("Enter the name and type of the file");
        	                        	  
        	                        	   String gh = ss.nextLine();
        	                               for (int i = 0; i < A.length; i++) {
        	                                   String filename = A[i];
        	                                   if (filename.equalsIgnoreCase(gh)) {
        	                                       System.out.println(filename + " found");
        	                                       flag = 1;
        	                                   }
        	                               }
        	                           }
        	                     
        	                           if (flag == 0) {
        	                               System.out.println("File Not Found");
        	                           
        	                       
        	                           }
        	                    	   optionsSelection();
        	                    	break;
        	                    	
        	                    	
        	                    	
        	                    	
        	                    	// and this method to close the application.
        	                        
        	                    
        	                        
        	                    case 4:
        	                        closeApp();
        	                        
        	                     
        	                        break;
        	                
        	                    
        	                             	
        	                    default:
        	                        System.out.println("*****invalid choice*****");
        	                        break;
        	                }
        	        
        	            }
        	        
        	         
        	    }
        	   
        	break;	
        	
        	     	
        	                    default:
        	                        System.out.println("*****invalid choice*****");
        	                        break;
        	
             
        	} 
        
        	
        	}
         
      
	   }
	   
    }
        
    
        
        
     


    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
}

