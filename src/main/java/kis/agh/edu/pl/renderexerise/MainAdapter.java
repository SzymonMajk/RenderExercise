package kis.agh.edu.pl.renderexerise;

import java.util.List;

//TODO (3) MainAdapter should extend RecyclerView.Adapter, with proper ViewHolder type
public class MainAdapter {

    private List<DataSource.Trip> mDataset;
    private MainActivity mainActivity;

    //TODO (5) Add static class MainViewHolder extending RecyclerView.ViewHolder, with
    //TextView and FrameLayout, FrameLayout as view should be added as constructor parameter

    //TODO (4) In construtor get List<DataSource.Trip> and MainActivity and pass them to private fields

    //TODO (6) Override onCreateViewHolder, and use LayoutInflater to inflate main_text_view layout

    //TODO (7) Use my onBidnViewHolder, just uncomment, make sure your code well integrate with this fantastic piece of mastepiece!

    /*
    @Override
    public void onBindViewHolder(MainAdapter.MainViewHolder holder, final int position) {
        holder.mTextView.setText(mDataset.get(position).shortDescription());
        //TODO (16) I forgot name of the listener, could you fill it properly?
        holder.layout.setIDoNotWhichListener(new View.Which???Listener() {
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
    }*/

    //TODO (8) Override getItemCount() and simply retur size of dataset

}