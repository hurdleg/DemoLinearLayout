package hurdleg.demo.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Demo Android's LinearLayout.
 *
 * LinearLayout arranges other views either horizontally in a single row or vertically in a
 * single column.
 *
 * LinearLayout is a specialized ViewGroup. That is, class LinearLayout extends from class ViewGroup.
 *
 *  API Documentation:
 *      https://developer.android.com/reference/android/widget/LinearLayout.html
 *
 * @author Gerald.Hurdle@AlgonquinCollege.com
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
