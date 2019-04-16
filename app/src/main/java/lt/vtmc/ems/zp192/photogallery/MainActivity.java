package lt.vtmc.ems.zp192.photogallery;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static ImageView imgView;
    private static Button next;
    //private static Button previous;

    private int current_image_index;
    int[] images = {R.drawable.hot1, R.drawable.hot2, R.drawable.hot3, R.drawable.hot4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClick();
    }

    public void buttonClick() {
        imgView = (ImageView)findViewById(R.id.imageView2);
        next = (Button)findViewById(R.id.button);
        //previous = (Button)findViewById(R.id.button2);
        next.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index++;
                        current_image_index = current_image_index % images.length;
                        imgView.setImageResource(images[current_image_index]);
                    }
                }
        );
    }
}
