package info.llanox.reme.mobile;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class DashBoardActivity extends Activity implements OnClickListener{

	private ImageButton btnReminders;
	private ImageButton btnSchedule;
	private ImageButton btnHistory;
	private ImageButton btnContacts;
	private ImageButton btnSetting;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);
       
		btnReminders = (ImageButton) findViewById(R.id.btnRemainders);	
		btnReminders.setOnClickListener(this);
		
		btnSchedule = (ImageButton) findViewById(R.id.btnSchedule);
		btnSchedule.setOnClickListener(this);
		
		btnHistory = (ImageButton) findViewById(R.id.btnHistory);
		btnHistory.setOnClickListener(this);
		
		btnContacts = (ImageButton) findViewById(R.id.btnContacts);
		btnContacts.setOnClickListener(this);
		
		btnSetting = (ImageButton) findViewById(R.id.btnSetting);
		btnSetting.setOnClickListener(this);
		
		
		
		
		

	}
	@Override
	public void onClick(View v) {
		
		Class to=null;
		
	
		switch(v.getId()){

		  case R.id.btnRemainders:
			    to = RemindersActivity.class;
		       break;

		  case R.id.btnSchedule:
			   to= ScheduleActivity.class;	
		       break;
		       
		  case R.id.btnHistory:
				to= HistoryActivity.class;	
		       break;
		       
		  case R.id.btnContacts:
				to= ContactsActivity.class;
		       break;
		       
		  case R.id.btnSetting:
				to= SettingActivity.class;	
		       break;
		       
		  }

		
				
		Intent intent = new Intent();
		intent.setClass(this, to);
		
		startActivity(intent);
		
	}
	
}
