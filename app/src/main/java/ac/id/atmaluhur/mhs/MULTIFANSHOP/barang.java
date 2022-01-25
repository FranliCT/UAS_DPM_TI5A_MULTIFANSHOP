package ac.id.atmaluhur.mhs.MULTIFANSHOP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class barang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang);

    }
    public void pesan1(View view) {
        Intent intent = new Intent(barang.this, keranjang.class);
        startActivity(intent);
    }

    public void back5(View view) {
        Intent intent = new Intent(barang.this, Halaman_Dashboard.class);
        startActivity(intent);
    }
}