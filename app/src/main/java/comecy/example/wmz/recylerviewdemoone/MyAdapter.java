package comecy.example.wmz.recylerviewdemoone;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by acer2 on 2017/7/25.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private final ArrayList<String> mDatas;

    public MyAdapter(ArrayList<String> datas) {
        this.mDatas=datas;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = View.inflate(parent.getContext(), android.R.layout.test_list_item, null);

        return new MyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
       holder.mTextView.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas==null?0:mDatas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;


        public MyViewHolder(View itemView) {
            super(itemView);
            mTextView = ((TextView) itemView.findViewById(android.R.id.text1));
        }

    }
}
