package com.application.sudoku;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class Show extends Activity {
	Sv1Activity q = new Sv1Activity();
	static String s;
	private TableLayout layout;
	//int count=0;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cordi);
       
        
       int z;
   
        for(int m=0;m<81;m++)
        {
        	
        //	for(int n=0;n<9;n++)
        	//{
        		z=2131034113+m;
        		EditText ed = (EditText) findViewById(z);
        		
        		ed.setText(s.valueOf(q.Z[m]));
        		
        //	}
        
        	
        }
    
        
        
    }
    
    
    /*public void onStop()
    {
    	super.onStop();
    	/* for(int i=0;i<81;i++)
    	{
   		  for(int j=0;j<81;j++)
   		 {
   			 T[i][j]=A[i][j];
   		 }
   	 	}
    	 for(int i=0;i<81;i++)
       	 {
       		 //for(int j=0;j<9;j++)
       		// {
       			 q.Z[i]=q.org[i];
       			 q.findRCB(i);
       			 q.setRCB(i, q.Z[i]);
       		 //}
       	 }
    	
    }*/

}


       