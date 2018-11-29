package kis.agh.edu.pl.renderexerise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //TODO (9) Add field for RecyclerView, Adapter and Layout Manager

    private DataSource source = new DataSource();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO (10) Get Recycler View, connect it with LinearLayoutManager and set your Adapter
        //  While creating your adapter use source.getData(), to generate fake Trip elements


        //TODO (12) Get Toolbar and set it to activity
    }

    //TODO (14) Override onCreateOptionsMenu, to inflate already created menu items

    //TODO (15) Override onOptionsItemSelected and create adapter with new data for Recycler View
    //when refresh button were clicked

}
