package corp.cemsa.nexaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import corp.cemsa.nexaapp.Menu.MenuMainActivity;

public class LoginMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);
    }

    public void Login(View view) {
        Intent intent = new Intent(this, MenuMainActivity.class);
        startActivity(intent);
    }
}
