package exemplo.com.aula6;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView2);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        DownloadImage downloadImage = new DownloadImage(this, progressBar, new DownloadListner() {
            @Override
            public void getImg(Bitmap bitmap) {
                imageView.setImageBitmap(bitmap);
            }
        });

        downloadImage.execute();

    }

    public void dialogDefault3() {
        /*final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.dialog);

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.MATCH_PARENT;


        dialog.show();
        dialog.getWindow().setAttributes(lp);*/
    }

    public void dialogDefault() {
        /*AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.title1);
        builder.setMessage(R.string.msg1)
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // FIRE ZE MISSILES!
                    }
                })
                .setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
        // Create the AlertDialog object and return it
        builder.create().show();*/
    }
}
