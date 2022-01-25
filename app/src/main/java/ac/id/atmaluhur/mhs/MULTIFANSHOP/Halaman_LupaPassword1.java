package ac.id.atmaluhur.mhs.MULTIFANSHOP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Halaman_LupaPassword1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupapassword1);
    }

    public void kirim(View view) {
        Intent intent = new Intent(Halaman_LupaPassword1.this, Halaman_LupaPassword2.class);
        startActivity(intent);
    }

    public void back3(View view) {
        Intent intent = new Intent(Halaman_LupaPassword1.this, Halaman_Login.class);
        startActivity(intent);
    }
}