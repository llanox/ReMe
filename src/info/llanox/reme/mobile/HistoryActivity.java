package info.llanox.reme.mobile;


import android.app.Activity;
import android.os.Bundle;

public class HistoryActivity extends Activity {
	
	public static final String TAG = "HistoryActivity";
	
	
	/**
     * Called when the activity is first created. Responsible for initializing the UI.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
     	super.onCreate(savedInstanceState);
		setContentView(R.layout.history);	
    	
    }

}
