/**
 * Assignment22.java
 */
package session2Assignment_2_2;
/**
 * This program will display below output with the help of CONTROL STRUCTURES, LOOPING STRUCTURES AND TYPECASTING FROM INTEGER TO CHARACTER.
 *   a
 *  aba 
 * abcba
 *  aba 
 *   a 
 *   
 *   AUTHOR : CHHAYA YADAV
 */
public class Assignment22{
	
//Main method invocation declaration
	
public static void main(String[] args){

//variable declaration
	
	int alpha = 97 ;

	int beta = 97;

	int i , j , x , m , y , p;
	
//START: Outer loop to print first 3 lines
	for (i=0;i<3;i++){
		
	          alpha = 97;
	          
	          for(j=2;j>=0;j--) {
	               if (j==i){
	                  System.out.print((char)alpha); }   //type casting of integer alpha into char to print alphabet
	               else if(j>i){
	                   System.out.print(" ");}
	               else{
	            	   alpha++ ;
	                   System.out.print((char)alpha); }
	            }         
	           for (m=1;m<=i;m++){
	                if(m==i){
		               System.out.print((char)beta); }
	                else{
	                  beta ++;
	                  System.out.print((char)beta);
	                  beta --;}                   
	            }          
	            System.out.println();
	}
//END: Outer loop to print first 3 lines

//START: outer loop to print last 2 lines
	for(x=1;x<3;x++){

	        beta = 97 ;
	        
	        for(y=0;y<3;y++){
	        	if(y==x){
	                System.out.print((char)beta);}
	            else if(y>x){
	                beta++;
	                System.out.print((char)beta);}
	            else{
	                System.out.print(" ");}
	       }

	       for (p=2;p>x;p--){
	            if(p==x){
	                System.out.print((char)beta); }
	            else {
	                beta --;
	                System.out.print((char)beta);}
	        }
	System.out.println();
	}
//END: outer loop to print last 2 lines	

}


}