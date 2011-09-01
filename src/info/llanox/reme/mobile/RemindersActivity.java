package info.llanox.reme.mobile;


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class RemindersActivity extends TabActivity {
	
	public static final String TAG = "RemindersActivity";
	public static final String CATEGORY ="category";
	public static final String[] categories ={"Love","Girls","Mom","Team"};
	private List<TabSpec> tabSpecs = new ArrayList<TabSpec>();
	
	
	/**
     * Called when the activity is first created. Responsible for initializing the UI.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
     	super.onCreate(savedInstanceState);
     	setContentView(R.layout.tab);
     	
     	/** TabHost will have Tabs */
     	TabHost tabHost = getTabHost();  
     	ImageButton addButton = new ImageButton(this);
     	addButton.setImageResource(R.drawable.adds);
     	

     	/** TabSpec used to create a new tab.
     	* By using TabSpec only we can able to setContent to the tab.
     	* By using TabSpec setIndicator() we can set name to tab. */
     	
     	int numCategories = categories.length;
     	TabSpec aTabSpec = null;
     	Intent intent =null;
     	
     	for(int i=0; i< numCategories;i++){
     	
     	    intent = new Intent(this,ListRemindersActivity.class);
     	    intent.putExtra(CATEGORY, categories[i]);     	    
     		aTabSpec = tabHost.newTabSpec(""+i);
        	/** TabSpec setIndicator() is used to set name for the tab. */
         	/** TabSpec setContent() is used to set content for a particular tab. */
     		aTabSpec.setIndicator(categories[i]).setContent(intent);  
     		
         	/** Add tabSpec to the TabHost to display. */
     		tabHost.addTab(aTabSpec);
     	}
     	
     	aTabSpec = tabHost.newTabSpec("add");
     	aTabSpec.setIndicator(addButton).setContent(intent);
     	tabHost.addTab(aTabSpec);

     	/** tid1 is firstTabSpec Id. Its used to access outside. */
//     	TabSpec firstTabSpec = tabHost.newTabSpec("1");
//     	TabSpec secondTabSpec = tabHost.newTabSpec("2");
     	
     	Log.i(TAG, "created tabs");

 
//     	firstTabSpec.setIndicator("Love").setContent(new Intent(this,ListRemindersActivity.class));
//     	
//     	secondTabSpec.setIndicator("Childs").setContent(new Intent(this,ListRemindersActivity.class));
//     	

//     	tabHost.addTab(firstTabSpec);
//     	tabHost.addTab(secondTabSpec);
     	
     	Log.i(TAG, "Tabs done!!");
    	
    }
	
	

}

