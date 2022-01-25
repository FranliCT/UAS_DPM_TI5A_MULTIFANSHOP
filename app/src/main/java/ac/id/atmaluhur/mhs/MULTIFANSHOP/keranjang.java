package ac.id.atmaluhur.mhs.MULTIFANSHOP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class keranjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keranjang);
    }
    public void back1(View view) {
        Intent intent = new Intent(keranjang.this, barang.class);
        startActivity(intent);
    }
}