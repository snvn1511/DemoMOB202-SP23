package net.sdt.demoadapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {
    ArrayList<ProductDTO> listPro;

    @Override
    public int getCount() {
        return listPro.size(); // trả về số lượng các phần tử có trong arraylist
    }

    @Override
    public Object getItem(int i) {
        return listPro.get(i); // trả về 1 sản phẩm trong arraylist
    }

    @Override
    public long getItemId(int i) {

        return listPro.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View row;
        if (view == null){
            // chưa có convertview thì khởi tạo view mới
            row = View.inflate(viewGroup.getContext(), R.layout.layout_row_product, null);
        }else{
            row = view; // gán bằng convertview
        }
        ///------- làm tiếp việc ánh xạ và gán dữ liệu: Nhưng phải để ở ngoài khối IF ELSE ở trên
        // ánh xạ view
        TextView tv_id = row.findViewById(R.id.tv_id);
        TextView tv_name = row.findViewById(R.id.tv_name);
        TextView tv_price = row.findViewById(R.id.tv_price);

        // lấy thông tin sp
        ProductDTO objPro = listPro.get( i );
        // gán dữ liệu vào view
        tv_id.setText(  objPro.getId() + ""  );
        tv_name.setText( objPro.getName());
        tv_price.setText( objPro.getPrice() +"");
        // trả về row
        return  row;
    }
}
