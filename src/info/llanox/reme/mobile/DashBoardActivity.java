package info.llanox.reme.mobile;


import info.llanox.reme.mobile.util.ActivitiesFlowUtil;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;

/**
 * DashBoard activity where you can see all application functions.
 * 
 * 
 * @author llanox
 * */
public class DashBoardActivity extends Activity {

	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);
       
	
		ActivitiesFlowUtil.addNavigationRule(R.id.btnRemainders,this,RemindersActivity.class);
		
		ActivitiesFlowUtil.addNavigationRule(R.id.btnSchedule,this,ScheduleActivity.class);
		
		ActivitiesFlowUtil.addNavigationRule(R.id.btnHistory, this,HistoryActivity.class);
		
		ActivitiesFlowUtil.addNavigationRule(R.id.btnContacts, this, ContactsActivity.class);
		
		ActivitiesFlowUtil.addNavigationRule(R.id.btnSetting, this, SettingActivity.class);
		
		
		

	}
	
	
}
