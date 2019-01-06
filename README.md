An android library to open custom camera and user can add text on display. This library is encouraged to use as little 
memory as possible.

1. It's displaying server date time. 
2. Open camera in SurfaceCamera.
3. Customize click button.
4. Marshmallow code 


Usage

1. Added code in your application.


2.  implement module in application build file.

implementation project(':cameralib')


3. Introduce activity in your appication manifest file .

 <activity android:name="datanapps.cameralib.customcamera.CameraActivity"/>
 
 
 4. Start camera activity from your application.
 
 public class ExampleMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_example);

        findViewById(R.id.example_open_camera).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ExampleMainActivity.this, CameraActivity.class));
            }
        });


    }

}

5. All permission handle by module. No need to handle permisssion. 


