package com.application.sudoku;



import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Sv1Activity extends Activity {
	
	static String str;
	//static int[][] A = new int[9][9];
	
	// static int[] T = new int[9];
	//int count=0;
	static int Z[] = new int[81];
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ma);
        for(int i=0;i<81;i++)
      	 {
      		// for(int j=0;j<9;j++)
      		// {
      			 Z[i]=0;
      			 org[i]=0;
      		// }
      	 }
   //  for(int l=0;l<81;l++)
    //  {
    	  //for(int m=0;m<9;m++)
    	 // {
    //		  T[l]=0;
    	 // }
   //   }
     B = new block[9];
 	for(int o=0;o<9;o++)
 	{
 		B[o] = new block();
 	}
 	
 	Row = new arr[81];
 	C = new arr[81];
 	for(int o=0;o<81;o++)
 	{
 		Row[o] = new arr();
 		C[o] = new arr();
 	}
       for(int i=0;i<81;i++)
       {
    	   findRCB(i);
    	   setRCB(i,0);
       }
    }
   
   public void onRestart()
   {
	   super.onRestart();
	   for(int i=0;i<81;i++)
     	 {
     		 //for(int j=0;j<9;j++)
     		// {
     			 Z[i]=org[i];
     			 findRCB(i);
     			 setRCB(i, Z[i]);
     		 //}
     	 }
   }
    public void display(View v)
    {	
    	 for(int i=0;i<81;i++)
	     {
	             org[i]=Z[i];
	     }
    	 	if(solve())
    	 	{	Intent intent = new Intent(this,Show.class);
        
    	 			startActivity(intent);
    	 	}
    	 	else
    	 		Toast.makeText(Sv1Activity.this, " SORRY, This puzzle has no solution. ", Toast.LENGTH_LONG).show();
    }
   
    
   public void call(View v)
   {	
	   for(int l=0;l<81;l++)
	      {
	    	 // for(int m=0;m<9;m++)
	    	 // {
	    		  Z[l]=0;
	    		  findRCB(l);
	    		  setRCB(l,Z[l]);
	    	  //}
	      }
	   setContentView(R.layout.ma);
   }
   
    public void callme1(View v)
    {
    	final NumberSelectDialog numberSelectDialog ;
    	final View z=v;
    	
    	final int eId = v.getId();
    	//Toast.makeText(Sv1Activity.this, s.valueOf(eId), Toast.LENGTH_SHORT).show();
    	numberSelectDialog = new NumberSelectDialog(this);
        //setting OnDismissListener
        numberSelectDialog.setOnDismissListener(new OnDismissListener() {

            public void onDismiss(DialogInterface dialInterface) {
            	
            	int i;
            	boolean ch;
                i = (int) numberSelectDialog.getSelectedValue();
                findRCB(eId-2131034113);
                
                ch=checkRCB(i);
               if(ch==true&&i!=0)
                Toast.makeText(Sv1Activity.this, "Trying to Be Smart ???", Toast.LENGTH_SHORT).show();
             //   if(checkRCB(i))
             //   	Toast.makeText(Sv1Activity.this, "Hero MAT Ban", Toast.LENGTH_SHORT).show();
             //   else
            //    {
              //  j=(eId-2131034113)/9;
            //    k=(eId-2131034113)%9;
                else
               {
                	setRCB(eId-2131034113,i);
                	org[eId-2131034113]=i;
                //	T[eId-2131034113]=i;
                	EditText edit = ((EditText)z);
                
                	if(str.valueOf(i).matches("0"))
                		edit.setText("");
                	else
                		edit.setText(str.valueOf(i));
                }
                
                	
               }
	
        });
        //show the dialog
        numberSelectDialog.show();
  
    }
    
    static String s;

   
    public class block
    {
    	
    	public int[][] bl= new int[3][3];
    }
    
    	public class arr
    	{
    	       public int cl[]= new int[9];
    	      
    	}
    	public arr Row[];
    	public arr C[];
    	public block B[];
    
    	
    	static int org[] = new int [81];
    	/*void initialize()
    	{
    	     int k;
    	     int n=0,m=0,i,p,l,j;
    	     int r,c;
    	    
    	   
    	     Z[2]=2;
    	     Z[3]=9;
    	     Z[6]=5;
    	     Z[7]=1;
    	     Z[8]=4;
    	    // Z[12]=5;
    	     Z[15]=6;
    	     Z[16]=9;
    	     Z[20]=3;
    	     Z[22]=1;
    	     Z[23]=4;
    	     Z[28]=6;
    	     Z[29]=1;
    	     Z[32]=2;
    	     Z[33]=9;
    	     Z[35]=5;
    	     Z[36]=9;
    	     Z[39]=3;
    	     Z[40]=7;
    	     Z[41]=6;
    	     Z[44]=2;
    	     Z[45]=2;
    	     Z[47]=8;
    	     Z[48]=1;
    	     Z[51]=3;
    	     Z[52]=4;
    	     Z[57]=8;
    	     Z[58]=6;
    	     Z[60]=4;
    	     Z[64]=5;
    	     Z[65]=6;
    	    // Z[66]=7;
    	     Z[72]=1;
    	     Z[73]=3;
    	     Z[74]=4;
    	     Z[77]=5;
    	     Z[78]=7;
    	      */
    	     
    	    /*
    	     for(i=0;i<9;i++)
    	     {   k=0;            
    	         for(j=9*i;j<=((i+1)*9-1);j++)
    	         {
    	             
    	             Row[i].cl[k]=Z[j];
    	            // C[i].cl[k]=Z[j];
    	             k++;
    	             
    	         }
    	     }
    	     for(i=0;i<9;i++)
    	     {              
    	         for(k=0,j=i;k<9;k++,j+=9)
    	         {
    	             
    	            // R[i].cl[k]=Z[j];
    	             C[i].cl[k]=Z[j];
    	             
    	         }
    	     }
    	   
    	      
    		   for(k=0;k<9;k++)
    	 	  {
    	 		  if(k<=2)
    	 		  n=0;
    	 		  if(k<=5&&k>=3)
    	 		  n=3;
    	 		  if(k<=8&&k>=6)
    	 		  n=6;
    	 		  if(k==0||k==3||k==6)
    	 		  m=0;
    	 		  if(k==1||k==4||k==7)
    	 		  m=3;
    	 		  if(k==2||k==5||k==8)
    	 		  m=6;

    	 		  for(i=n,p=0;i<=(n+2);i++,p++)
    	 		  {

    	 			for(j=m,l=0;j<=(m+2);j++,l++)
    	 			{

    	 			  B[k].bl[p][l]=Z[i*9+j];

    	 			}
    	 		  }
    	 	  }  
    	 	  
    	} 	
    	*/
    	
    	public boolean solve()
    	{	
    		
    		
    	    

    	  int k=0;
    	 for(k=0;k<81;k++){
    	        check(k,1);
    	       /*check(1,1);
    	         check(2,1);
    	        check(3,1);
    	         check(4,1);
    	         check(5,1);
    	         check(6,1);
    	         check(7,1);
    	         check(8,1);
    	         check(9,1);
    	        check(10,1);
    	        check(11,1);
    	        check(12,1);
    	        check(13,1);
    	       check(14,1);*/
    	     //   cc++;
    	}
    	// solve1();
    	  for(k=0;k<81;k++)
    	  {
    		  if(Z[k]==0)
    			  return false;
    	  }
    	   return true;   
    	}

    	
    	public int r,c,b;
    	boolean checkRCB(int value)
    	{
    		//*********** Checking if already present in row , column , or block ***************  
    		  int t,flag1=0,flag=0,m,n;
           for(t=0;t<9;t++)
           {
                 if(Row[r].cl[t]==value||C[c].cl[t]==value)
                 {
                    flag1=1;
                    break;
                 }
           }
           if(flag1==1)
           {
                     
                      return true;
           }
           for(m=0;m<3;m++)
           {
              for(n=0;n<3;n++)
              {
                  if(B[b].bl[m][n]==value)
                  {
                      flag=1;
                      break;
                  }   
              }
                 if(flag==1)
                 break;
           } 
                  
           if(flag==1)
           {
                     
                      return true;
           }
           
           return false;
           // ******************************************************************************
    	}
    	public void findRCB(int index)
    	{
    		if(index>=0){
    		int w=0,v=0;
    		if(index==0)
            {
                    r=0;
                    c=0;
            }
            else
            {
                 r=(index/9);
                 c=(index%9);
                
            }
             // Calculate Block Number
             
             if(r>=0&&r<=2)                                                                
    		  w=0;                                                                         
    		  if(r>=3&&r<=5)                                                              
    		  w=1;                                                                       
    		  if(r>=6&&r<=8)                                                            
    		  w=2;                                                                     
    		  if(c>=0&&c<=2)                                                          
    		  v=0;                                                                   
    		  if(c>=3&&c<=5)                                                        
    		  v=1;                                                                 
    		  if(c>=6&&c<=8)                                                      
    		  v=2;                                                               
    		  b=(w*3+v);    
    	}}
    	public void setRCB(int index,int value)
    	{	if(index>=0){
    		   Z[index]=value;
	             
	             Row[r].cl[index-9*r]=value;
	             C[c].cl[r]=value;
	            int m=0,n=0,a=0,bb;
	             
	             
	             // Calculate index within Block
	             
	             if(b<=2)
	             a=(0+b*3);
	             if(b>=3&&b<=5)
	             a=(27+(b-3)*3);
	             if(b>=6&&b<=8)
	             a=(54+(b-6)*3);
	             int flag2=0;
	             for(m=0;m<3;m++,a+=9)
	             {
	                
	                 for(bb=a,n=0;n<3;bb++,n++)
	                 {       
	                     
	                     if(index==bb)
	                     {
	                        flag2=1;
	                        break;
	                     }
	                    
	                    
	                 }
	                 if(flag2==1)
	                     break;
	                    
	                     
	                     
	             }
	             
	             B[b].bl[m][n]=value;
    	}}
    	void check(int i,int val)
    	{
    	     if(i<0||i>80)
    	     return;
    	     else if(org[i]!=0)
    	    	 return;
    	     int j=val;
    	     findRCB(i);  
    	     while(checkRCB(j)&&j<=9)
    	     {
    	    	 j++;
    	     }
    	    	 
    	       /*  for(j=val;j<=9;j++)
    	         {
    	            flag=0;flag1=0;
    	            if(i==0)
    	            {
    	                    r=0;
    	                    c=0;
    	            }
    	            else
    	            {
    	                 r=(i/9);
    	                 c=(i%9);
    	                
    	            }
    	             // Calculate Block Number
    	             
    	             if(r>=0&&r<=2)                                                                
    	    		  w=0;                                                                         
    	    		  if(r>=3&&r<=5)                                                              
    	    		  w=1;                                                                       
    	    		  if(r>=6&&r<=8)                                                            
    	    		  w=2;                                                                     
    	    		  if(c>=0&&c<=2)                                                          
    	    		  v=0;                                                                   
    	    		  if(c>=3&&c<=5)                                                        
    	    		  v=1;                                                                 
    	    		  if(c>=6&&c<=8)                                                      
    	    		  v=2;                                                               
    	    		  b=(w*3+v);     
    	                
    	    		//*********** Checking if already present in row , column , or block ***************  
    	    		  
    	             for(t=0;t<9;t++)
    	             {
    	                   if(Row[r].cl[t]==j||C[c].cl[t]==j)
    	                   {
    	                      flag1=1;
    	                      break;
    	                   }
    	             }
    	             if(flag1==1)
    	             {
    	                       
    	                        continue;
    	             }
    	             for(m=0;m<3;m++)
    	             {
    	                for(n=0;n<3;n++)
    	                {
    	                    if(B[b].bl[m][n]==j)
    	                    {
    	                        flag=1;
    	                        break;
    	                    }   
    	                }
    	                   if(flag==1)
    	                   break;
    	             } 
    	                    
    	             if(flag==1)
    	             {
    	                       
    	                        continue;
    	             }*/
    	           // ******************************************************************************
    	         if(j<=9){    
    	            setRCB(i,j);
    	            return;
    	         }
    	      
    	      
    	      int temp;
    	      int  cons=1;
    	      int temp1,fla=0;
    	      //**************************************************************************************
    	      if(j>9)
    	      {     
    	             for(temp=(i-1);temp>=0;temp--)
    	             {
    	            	 if(temp>=0){
    	                  if(org[temp]==0)
    	                  {
    	                                
    	                  break;}}
    	             }      
    	              if(temp>=0)
    	              cons = (Z[temp]+1);
    	             
    	              findRCB(temp);
    	             // r=(temp/9);
    	           //   c=(temp%9);
    	            /*  if(r>=0&&r<=2)                                                                
    	    		  w=0;                                                                         
    	    		  if(r>=3&&r<=5)                                                              
    	    		  w=1;                                                                       
    	    		  if(r>=6&&r<=8)                                                            
    	    		  w=2;                                                                     
    	    		  if(c>=0&&c<=2)                                                          
    	    		  v=0;                                                                   
    	    		  if(c>=3&&c<=5)                                                        
    	    		  v=1;                                                                 
    	    		  if(c>=6&&c<=8)                                                      
    	    		  v=2;                                                               
    	    		  b=(w*3+v);*/     
    	              //*************************************************************************************
    	             setRCB(temp,0);
    	              
    	            //***************************************************************************************
    	              check(temp,cons);
    	              
    	              for(temp1=(temp+1);temp1<=80;temp1++)
    	             {
    	                  if(temp1<=80){
    	            	  if(org[temp1]==0)
    	                  {
    	                     fla=1;            
    	                  break;}
    	             }  }    
    	              if(fla==1)
    	              check(temp1,1);
    	      }
    	     
    	                    
    	                 
    	}          
    	                
/*
    	 public class blocks
    	    {
    	    	
    	    	public int[][] B= new int[3][3];
    	    }
    	    
    	    public class array
    	    {
    	    	public int[] C = new int[9];
    	    	public array()
    	    	{	
    	    		
    	    		for(int i=0;i<9;i++)
    	    		{
    	    		  C[i]=i+1;
    	    		}
    	    	}
    	    	
    	    }
    	   
    	    public void cellsort(array P[],blocks S[])
    	    {	
    	    	int mega,i,j,z,p,v=0,w=0,t,r,count,k,u,pos=0;
    	    	for(mega=0;mega<80;mega++)                                                            
    	    	{                                                                                                     
    	    	for(i=0;i<9;i++)                                                                                     
    	    	{                                                                                                   
    	    	 for(j=0;j<9;j++)                                                                                  
    	    	 {                                                                                                
    	    	  if(A[i][j]==0)                                                                                 
    	    	  {                                                                                             
    	    		z=i*9+j;                                                                                    
    	    		r=0;                                                                                       
    	    		count=0;                                                                                  
    	    		while(r<9)                                                                               
    	    		{                                                                                       
    	    		 k=0;                                                                                  
    	    		while(k<9)                                                                            
    	    		{  
    	    		  //Check in row                                                                                  
    	    		  if(P[z].C[r]==A[i][k])                                                            
    	    		  P[z].C[r]=0;                                                                     
    	    		  //Check in Column
    	    		  if(P[z].C[r]==A[k][j])                                                          
    	    		  P[z].C[r]=0;                                                                   
    	    		  //Check in Block
    	    		  if(i>=0&&i<=2)                                                                
    	    		  w=0;                                                                         
    	    		  if(i>=3&&i<=5)                                                              
    	    		  w=1;                                                                       
    	    		  if(i>=6&&i<=8)                                                            
    	    		  w=2;                                                                     
    	    		  if(j>=0&&j<=2)                                                          
    	    		  v=0;                                                                   
    	    		  if(j>=3&&j<=5)                                                        
    	    		  v=1;                                                                 
    	    		  if(j>=6&&j<=8)                                                      
    	    		  v=2;                                                               
    	    		  p=w*3+v;                                                          
    	    		  for(t=0;t<3;t++)                                                 
    	    		  {                                                               
    	    			 for(u=0;u<3;u++)                                             
    	    			 {                                                           
    	    				if(S[p].B[t][u]==P[z].C[r])                              
    	    				P[z].C[r]=0;                                            
    	    			 }                                                        
    	    		  }                                                         
    	    		  k++;                                                     
    	    		}                                                         
    	    		r++;                                                     
    	    		}                                                       
    	    													

    	    								 
    	    		for(t=0;t<9;t++)                                      
    	    		{                                                    
    	    		 if(P[z].C[t]!=0)                                   
    	    		 { count++;                                        
    	    			pos=t;                                         
    	    		 }                                               
    	    		}                                               
    	    		if(count==1)                                   
    	    		{                                             
    	    			A[i][j]=(byte) P[z].C[pos];                      
    	    			P[z].C[pos]=0;                           
    	    		}                                          
    	    	  }                                          
    	    	 }                                          
    	    	}                                          
    	    	}                                         
    	    }
    	   public void makeitzero(array P[])
    	    {
    	    	int i,j,k,z;
    	    	for(i=0;i<9;i++)                       
    	    	{                                                        
    	    	  for(j=0;j<9;j++)                                      
    	    	  {                                                    
    	    		 z=i*9+j;                                          
    	    		  if(A[i][j]!=0)                                  
    	    		  {                                              
    	    			 for(k=0;k<9;k++)                            
    	    			 {                                          
    	    				 P[z].C[k]=0;                           
    	    			 }                                        
    	    		  }                                         
    	    	  }                                           
    	    	}                                            
    	    }
    	   public void assignblocks(blocks S[])
    	   { 
    		    int k,n=0,m=0,i,p,l,j;
    		   for(k=0;k<9;k++)
    	 	  {
    	 		  if(k<=2)
    	 		  n=0;
    	 		  if(k<=5&&k>=3)
    	 		  n=3;
    	 		  if(k<=8&&k>=6)
    	 		  n=6;
    	 		  if(k==0||k==3||k==6)
    	 		  m=0;
    	 		  if(k==1||k==4||k==7)
    	 		  m=3;
    	 		  if(k==2||k==5||k==8)
    	 		  m=6;

    	 		  for(i=n,p=0;i<=(n+2);i++,p++)
    	 		  {

    	 			for(j=m,l=0;j<=(m+2);j++,l++)
    	 			{

    	 			  S[k].B[p][l]=A[i][j];

    	 			}
    	 		  }
    	 	  }
    	   }
    	    public void solve1()
    	    {
    	    	int k=0,z=0;
    	    	int p,m=0,n=0,i,j,l;
    	    	blocks[] S = new blocks[9];
    	    	for(int o=0;o<9;o++)
    	    	{
    	    		S[o] = new blocks();
    	    	}
    	    	
    	    	array[] P = new array[81];
    	    	for(int o=0;o<81;o++)
    	    	{
    	    		P[o] = new array();
    	    	}
    	    	makeitzero(P);
    	    	//Filling in Blocks
    	    	  for(k=0;k<9;k++)
    	    	  {
    	    		  if(k<=2)
    	    		  n=0;
    	    		  if(k<=5&&k>=3)
    	    		  n=3;
    	    		  if(k<=8&&k>=6)
    	    		  n=6;
    	    		  if(k==0||k==3||k==6)
    	    		  m=0;
    	    		  if(k==1||k==4||k==7)
    	    		  m=3;
    	    		  if(k==2||k==5||k==8)
    	    		  m=6;

    	    		  for(i=n,p=0;i<=(n+2);i++,p++)
    	    		  {

    	    			for(j=m,l=0;j<=(m+2);j++,l++)
    	    			{

    	    			  S[k].B[p][l]=A[i][j];

    	    			}
    	    		  }
    	    	  }


    	    	  
    	    	int r=0,v,w,mega,count,t,u,pos;
    	    	for(int smega=0;smega<30;smega++)
    	    	{
    	    	//while(ch)
    	    	//{		
    	    		assignblocks(S);
    	    		cellsort(P,S);
    	    		assignblocks(S);
    	    		makeitzero(P);
    	    	//Cellwise
    	    	for(i=0;i<9;i++)
    	    	{
    	    	  for(t=1;t<=9;t++)
    	    	  {
    	    		 count=0;
    	    		 for(j=0;j<9;j++)
    	    		 {
    	    			z=i*9+j;


    	    				if(P[z].C[t-1]==t)
    	    				{
    	    					 n=j;
    	    					 count++;
    	    				}

    	    		 }
    	    		 if(count==1)
    	    		 {
    	    			A[i][n]=(byte) t;
    	    		 }
    	    	  }
    	    	}

    	    	makeitzero(P);

    	    	assignblocks(S);

    	    	cellsort(P,S);
    	    	assignblocks(S);

    	    	 for(j=0;j<9;j++)
    	    	{
    	    	  for(t=1;t<=9;t++)
    	    	  {
    	    		 count=0;
    	    		 for(i=0;i<9;i++)
    	    		 {
    	    			z=i*9+j;


    	    				if(P[z].C[t-1]==t)
    	    				{
    	    					 n=i;
    	    					 count++;
    	    				}

    	    		 }
    	    		 if(count==1)
    	    		 {
    	    			A[n][j]=(byte) t;
    	    		 }
    	    	  }
    	    	}

    	    	 makeitzero(P);

    	    	 assignblocks(S);
    	    	cellsort(P,S);
    	    	makeitzero(P);
    	    	assignblocks(S);


    	    	//Update Blocks
    	    	/*for(k=0;k<9;k++)
    	    	  {
    	    		  if(k<=2)
    	    		  n=0;
    	    		  if(k<=5&&k>=3)
    	    		  n=3;
    	    		  if(k<=8&&k>=6)
    	    		  n=6;
    	    		  if(k==0||k==3||k==6)
    	    		  m=0;
    	    		  if(k==1||k==4||k==7)
    	    		  m=3;
    	    		  if(k==2||k==5||k==8)
    	    		  m=6;

    	    		  for(i=n,p=0;i<=(n+2);i++,p++)
    	    		  {

    	    			for(j=m,l=0;j<=(m+2);j++,l++)
    	    			{

    	    			  S[k].B[p][l]=A[i][j];

    	    			}
    	    		  }
    	    	  }

    	



    	    	for(k=0;k<9;k++)
    	    	{

    	    	  for(t=1;t<=9;t++)
    	    	  {
    	    		  count=0;
    	    		  for(i=0;i<3;i++)
    	    		  {
    	    			 for(j=0;j<3;j++)
    	    			 {


    	    				  if(k<=2)
    	    				  z=i*9+k*3+j;
    	    				  if(k>=3&&k<=5)
    	    				  z=i*9+(k-3)*3+j+27;
    	    				  if(k>=6&&k<=8)
    	    				  z=i*9+(k-6)*3+j+54;

    	    				  if(S[k].B[i][j]==0)
    	    				  {
    	    							if(P[z].C[t-1]==t)
    	    							{
    	    								m=i;
    	    								n=j;
    	    								count++;
    	    							}
    	    				  }
    	    			 }
    	    		  }

    	    		  if(count==1)
    	    		  S[k].B[m][n]=t;
    	    	  }
    	    	}

    	    	makeitzero(P);
    	    	assignblocks(S);
    	    	cellsort(P,S);
    	    	makeitzero(P);
    	    	assignblocks(S);
    	    	//Update Array
    	    	for(k=0;k<9;k++)
    	    	  {
    	    		  if(k<=2)
    	    		  n=0;
    	    		  if(k<=5&&k>=3)
    	    		  n=3;
    	    		  if(k<=8&&k>=6)
    	    		  n=6;
    	    		  if(k==0||k==3||k==6)
    	    		  m=0;
    	    		  if(k==1||k==4||k==7)
    	    		  m=3;
    	    		  if(k==2||k==5||k==8)
    	    		  m=6;

    	    		  for(i=n,p=0;i<=(n+2);i++,p++)
    	    		  {

    	    			for(j=m,l=0;j<=(m+2);j++,l++)
    	    			{

    	    			  A[i][j]=(byte) S[k].B[p][l];

    	    			}
    	    		  }
    	    	  }
    	    	
    	    	

    	    	}
    	    	/*int f=0;
    	    	for(int row=0;row<9;row++)
    	    	{
    	    		for(int col=0;col<9;col++)
    	    		{
    	    			if(A[row][col]==0)
    	    				f++;
    	    		}
    	    	}
    	    	if(f!=0)
    	    		return false;
    	    	else
    	    		return true;
    	    	
    		
    	    }*/
    	    
    	    
    	
    
}
    

