package info.llanox.reme.mobile.util;

import java.util.HashMap;


import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class ActivitiesFlowUtil {
	
	/*
	 * Add a navigation rule, adding a click listener to a view. It allow us 
	 * leave @from activity and start  @to Activity.
	 * 
	 * 
	 **/	
	public static void addNavigationRule(int idView, final Activity from,final Class to){
		
				
		View view = from.findViewById(idView);		
		view.setOnClickListener(new OnClickListener() {
		     
			@Override
		      public void onClick(View v) {			
				
				Intent intent = new Intent();
				intent.setClass(from, to);
				
				from.startActivity(intent);
		    	  
		      }
		  });
		
		
		
		
	}
	
	


}
