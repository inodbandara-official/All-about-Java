public class HalfTriangles{ 
public static void main(String args[]){   
//i for rows and j for columns. row denotes the number of rows you want to print  
int i, j, row=6;

System.out.print("In here, we will print the Right triangle.");
//outer loop for rows  
for(i=0; i<row; i++)  
{   
  //inner loop for columns  
  for(j=0; j<=i; j++)   
  {   
    //prints stars   
    System.out.print("* ");   
  }   
//throws the cursor in a new line after printing each line  
System.out.println();
}

System.out.print("In here, we will print the Left triangle.");
//outer loop for rows 
for (i=0; i<row; i++)   
{  
  //inner loop work for space      
  for (j=2*(row-i); j>=0; j--)         
  {  
    //prints space between two stars      
    System.out.print(" ");   
  }   
  //inner loop for columns  
  for (j=0; j<=i; j++ )   
  {   
    //prints star      
    System.out.print("* ");   
  }   
//throws the cursor in a new line after printing each line  
System.out.println();   
}  
}   
}
