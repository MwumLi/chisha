package com.smart.clock;

import com.example.tabswitchdemo.R;
import com.example.tabswitchdemo.TabSwitchActivity;
import com.smart.impl.MyTimeController;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SmartClock extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.smart);

		// ʹ�ú�̨����ȥ���ʱ��ʧ�ܡ������ԭ��

	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		MyTimeController timeConn = new MyTimeController();

		if (timeConn.doesRequest(10, 1)) {
			finish();
		}

	}
}
