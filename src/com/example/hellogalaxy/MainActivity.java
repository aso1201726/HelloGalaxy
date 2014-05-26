package com.example.hellogalaxy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements
View.OnClickListener
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){
			case R.id.btnOK://もしもボタンが押されたら
			//エディットテクストの中身を取り出す
			//FirstName
			EditText etv = (EditText)findViewById(R.id.edtFirst);
				String inputMsg = etv.getText().toString();
			//FamilyName
			EditText etv2 =(EditText)findViewById(R.id.edtFamily);
				String inputMsg2 = etv2.getText().toString();

			//２つを組み合わせて文字を設定
			TextView tv =(TextView)findViewById(R.id.txvMsg);
			tv.setText("こんちわ～" + inputMsg + inputMsg2 + "さん");

			case R.id.btnNO:
			TextView tv2 = (TextView)findViewById(R.id.txvMsg);
			tv2.setText("キャンセルしました");
		}
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();

		//ボタンをID名で探して、ボタン変数を作る
		Button btnOK = (Button)findViewById(R.id.btnOK);

		//ボタン変数にリスナーを登録する
		btnOK.setOnClickListener(this);

		//キャンセルボタンを押した場合
		Button btnNO = (Button)findViewById(R.id.btnNO);

		btnNO.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
