package com.application.sudoku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableLayout;

public class Menu extends Activity {
	Sv1Activity q = new Sv1Activity();
	static String s;
	private TableLayout layout;
	//int count=0;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
       
   
    
      
        Button btn1 = (Button) findViewById(R.id.menu2);
        btn1.setOnClickListener(new OnClickListener() {

            
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });
        
        
        }
    public void begin(View v) {

        
        
    	Intent intent = new Intent(this,Sv1Activity.class);
        
		startActivity(intent);
    }
   /* public void onStop()
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
       		// for(int j=0;j<9;j++)
       		// {
       			 q.Z[i]=0;
       			 q.org[i]=0;
       		// }
       	 }
    	
    }*/

}


       