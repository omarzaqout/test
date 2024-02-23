package testcrc;

import java.util.Random;

import javax.swing.JOptionPane;

public class sendwitherror {
	  protected void sendwitherror(String data1,String pattern1) {                                         
		    String data ;
		    String pattern ;
		    String encoded ="" ;
		    
		    data = data1;
		    pattern =pattern1;
	
		    //start the encoding process by getting the value from dara text 
		    
		    encoded += data;
		    
		    //add pattern bits to the data  

		    for(int i=0;i<pattern.length()-1;i++){
		            encoded +='0';
		            }
		    
		    char encodedArr[]=encoded.toCharArray();
		    
		    //start the crc process (XOR)
		    
		    for(int i=0;i<=(encoded.length()-pattern.length());){
		            
		            for(int j=0;j<pattern.length();j++){
		                
		                if(encodedArr[i+j]==pattern.charAt(j)){
		                    encodedArr[i+j]='0';
		                }      
		                else encodedArr[i+j]='1';
		            }
		            
		           for(;i<encodedArr.length&&encodedArr[i]!='1';i++){   
		           }
		        }

		    //generate error !
		    Random m=new Random();
		        int r;
		        char []arr3=data.toCharArray();
		        while(true){
		        r=m.nextInt(arr3.length-1);
		        if(r>1)break;
		        }
		        for(int i=0;i<r;i++){
		            if(arr3[m.nextInt(arr3.length-1)]=='0')
		           arr3[m.nextInt(arr3.length-1)] ='1';
		            else   arr3[m.nextInt(arr3.length-1)] ='0';
		        }
		    encoded=new String(encodedArr);
		    System.out.println("encoded data"+data+encoded.substring(encoded.length()-pattern.length()+1));
		    
		    String msg2=new String(arr3)+encoded.substring(encoded.length()-pattern.length()+1);
		        String recieved=new String(arr3);
		        encoded ="";
		        encoded+=msg2;
		        System.out.println("recived Data :"+recieved);
		        char encodedArr2[]=encoded.toCharArray();
		        
		        for(int i=0;i<=(encoded.length()-pattern.length());){
		            
		            for(int j=0;j<pattern.length();j++){
		                
		                if(encodedArr2[i+j]==pattern.charAt(j)){
		                  encodedArr2[i+j]='0';
		                }      
		                else encodedArr2[i+j]='1';
		                }
		            
		           for(;i<encodedArr2.length&&encodedArr2[i]!='1';i++){   
		           }
		            
		        }
		        
		    
		     int count=0;
		        for(int i=0;i<data.length();i++){
		           if(data.charAt(i)!=recieved.charAt(i))count++; 
		        }
		   System.out.println("Error Percantage :");     
		   System.out.println((((double)count/data.length())*100)+"%");
		    

		    } 
}
