package com.example.testanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button b1, b2;
	TextView tv1, tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv1 = (TextView) findViewById(R.id.tv1);
		tv2 = (TextView) findViewById(R.id.tv2);
		b1 = (Button) findViewById(R.id.b1);
		b2 = (Button) findViewById(R.id.b2);
		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startAnimation();
			}
		});
		b2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				restore();
			}
		});
	}

	protected void restore() {
		TranslateAnimation animation = new TranslateAnimation(0, 0,
				tv1.getHeight(), 0);
		animation.setDuration(400);
		animation.setFillAfter(true);
		// tv2.bringToFront();
		tv2.startAnimation(animation);
		
	}

	protected void startAnimation() {

		TranslateAnimation animation = new TranslateAnimation(0, 0, 0,
				tv1.getHeight());
		animation.setDuration(400);
		animation.setFillAfter(true);
		// tv2.bringToFront();
		tv2.startAnimation(animation);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
