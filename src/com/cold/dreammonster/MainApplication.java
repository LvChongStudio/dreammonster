package com.cold.dreammonster;

import com.cold.dreammonster.constinfo.ScreenInfo;

import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.WindowManager;

/**
 * 
* <p>Title: MainApplication</p>
* <p>Description: </p>
* <p>Company: CMRI 2016</p> 
* @author HX
* @date 2016��5��4�� ����10:32:50
 */
public class MainApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
		//��ȡ�豸��Ļ��ߣ�������ScreenInfo��
		Point outsize=new Point();
		wm.getDefaultDisplay().getSize(outsize);
		ScreenInfo.width =outsize.x;
		ScreenInfo.height = outsize.y;
		Log.v("test", "screeninfo:"+outsize.x+","+outsize.y);
	}
}
