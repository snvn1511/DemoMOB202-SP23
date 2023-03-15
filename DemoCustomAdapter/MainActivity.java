package net.sdt.demoadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spin01;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin01 = findViewById(R.id.spin01);
        /*
        //------- Dùng adapter đơn giản cho Spinner ==-=---------
        //b1; Tạo dữ liệu nguồn
        String [] dulieu = { "Xanh","Đỏ","Tím","Vàng"};
        //B2: Tạo adapter
        // new ArrayAdapter<String>(context, layout_1_phần_tử, mảng_dữ liệu_nguồn)
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                                        android.R.layout.simple_spinner_item, dulieu);

        //B3: Gán dropdown cho adapter
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //B4. Gán adapter cho Spinner
        spin01.setAdapter(adapter);
        // lấy dữ liệu spinner đã chọn:
        Button btnSpin = findViewById(R.id.btnSpin);
        btnSpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String chuoi_chon = (String) spin01.getSelectedItem();
                Toast.makeText(MainActivity.this, "Bạn đã chọn: " + chuoi_chon,
                        Toast.LENGTH_SHORT).show();
            }
        });
      */

        ListView lv = findViewById(R.id.lv_pro);
        ArrayList<ProductDTO> listPro = new ArrayList<ProductDTO>();


        listPro.add( new ProductDTO( 1,"Điện thoại", 333033  ) );
        listPro.add( new ProductDTO( 2, "Máy tính", 1111111));

        ProductAdapter adapter = new ProductAdapter(listPro);
        lv.setAdapter( adapter );

    }
}
