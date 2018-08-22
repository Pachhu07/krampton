package com.aximo.krampton.Activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.aximo.krampton.Activity.Adapter.MainModuleAdapter;
import com.aximo.krampton.Activity.Model.MainModuleModel;
import com.aximo.krampton.Activity.Util.ExpandableHeightGridView;
import com.aximo.krampton.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class KTDashboardActivity extends AppCompatActivity {
    MainModuleAdapter mainModuleAdapter;
    MainModuleModel mainModuleModel;
    ArrayList<MainModuleModel> mainModuleModel_all;
    ExpandableHeightGridView dash_board_module_grid;
    ArrayList<String> counter;
    View header_layout;
    CircleImageView KT_profile_picture;
    TextView KT_profile_id_name;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    ImageView dash_home;
    TextView profile_pics;
    String[] name = {"New Task List", "Pending Task List", "Completed task List"};
    String[] count = {"10", "15", "18"};
    int[] image = {R.mipmap.vbo_down_line_icon, R.mipmap.vbo_down_line_icon, R.mipmap.vbo_down_line_icon};
    ArrayList<MainModuleModel> modal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_ktdashboard);
        getSupportActionBar().hide();

        mainModuleModel_all = new ArrayList<>();
        modal = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            MainModuleModel mo = new MainModuleModel();
            mo.setModule_counter(count[i]);
            mo.setModule_image(image[i]);
            mo.setModule_title(name[i]);
            modal.add(mo);
        }

        KT_profile_picture = findViewById(R.id.KT_profile_image);
        KT_profile_id_name = findViewById(R.id.KT_profile_id_name);
        dash_board_module_grid = findViewById(R.id.dash_board_module_layout);

        dash_board_module_grid.setExpanded(true);
        dash_board_module_grid.setFocusable(false);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        mDrawerList = findViewById(R.id.left_drawer);
        dash_home = findViewById(R.id.dash_board_home_btn);
        header_layout = getLayoutInflater().inflate(R.layout.navigation_logo_header, null);
        profile_pics = header_layout.findViewById(R.id.KT_home_profile_image);

        MainModuleAdapter mainModuleAdapter = new MainModuleAdapter(this, modal);
        dash_board_module_grid.setAdapter(mainModuleAdapter);

        dash_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.openDrawer(Gravity.LEFT);
                Log.e("DashHome", "Clicked");
            }
        });


    }

}
