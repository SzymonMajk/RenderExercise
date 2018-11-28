package kis.agh.edu.pl.renderexerise;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private List<DataSource.Trip> mDataset;
    private MainActivity mainActivity;

    public static class MainViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public FrameLayout layout;

        public MainViewHolder(View v) {
            super(v);
            mTextView = v.findViewById(R.id.tv_recycler_view);
            layout = (FrameLayout) v;
        }
    }

    public MainAdapter(List<DataSource.Trip> myDataset, MainActivity mainActivity) {
            mDataset = myDataset;
            this.mainActivity = mainActivity;
    }

    @Override
    public MainAdapter.MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_text_view, parent, false);
        return new MainViewHolder(v);

    }

    @Override
    public void onBindViewHolder(MainAdapter.MainViewHolder holder, final int position) {
        holder.mTextView.setText(mDataset.get(position).shortDescription());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainActivity, DetailActivity.class);
                intent.putExtra("start", mDataset.get(position).getStart());
                intent.putExtra("end", mDataset.get(position).getEnd());
                intent.putExtra("dur", mDataset.get(position).getDuration());
                intent.putExtra("method", mDataset.get(position).getPayMethod());
                intent.putExtra("baggage",mDataset.get(position).hasBaggage());
                intent.putExtra("dog",mDataset.get(position).hasDog());
                intent.putExtra("air",mDataset.get(position).isNeedFreshAir());
                intent.putExtra("active",mDataset.get(position).isActive());
                intent.putExtra("position",mDataset.get(position).getPosition());

                mainActivity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}