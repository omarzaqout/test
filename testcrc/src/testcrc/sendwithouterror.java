package testcrc;

import javax.swing.JOptionPane;

public class sendwithouterror {

	
    public void withouterror(String data1,String ptr ) {                                         

    String data=data1 ;
    String pattern=ptr ;
    String encoded ="" ;
      
    //start the encoding process by getting the value from dara  
    
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
    
    encoded=new String(encodedArr);
    System.out.println("encoded data :"+data+encoded.substring(encoded.length()-pattern.length()+1));
    System.out.println("recived Data :"+data);
    System.out.println("Error Percantage : 0.0%");
    
    } 
}
