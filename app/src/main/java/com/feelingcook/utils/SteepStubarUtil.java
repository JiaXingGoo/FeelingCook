package com.feelingcook.utils;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Build.VERSION;
import android.view.Window;
import android.view.WindowManager;

public class SteepStubarUtil {
	private SystemBarTintManager tintManager;
	
	public void setSteep(Activity act){
        if(VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT){
        	setTranslucentStatus(act,true);
       }
        tintManager = new SystemBarTintManager(act);  
        tintManager.setStatusBarTintEnabled(true);  
        tintManager.setStatusBarTintColor(Color.parseColor("#569FEB"));
	}
	
    private void setTranslucentStatus(Activity act,boolean on) {    
        Window win = act.getWindow();    
        WindowManager.LayoutParams winParams = win.getAttributes();    
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;    
        if (on) {    
            winParams.flags |= bits;    
        } else {    
            winParams.flags &= ~bits;    
        }    
        win.setAttributes(winParams);    
    }
}
