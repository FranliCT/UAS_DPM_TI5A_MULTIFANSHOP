package ac.id.atmaluhur.mhs.MULTIFANSHOP;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Halaman_LupaPassword2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_lupa_password2);
    }

    public void lupa(View view) {
        Intent intent = new Intent(Halaman_LupaPassword2.this, Halaman_LupaPassword1.class);
        startActivity(intent);
    }
}
