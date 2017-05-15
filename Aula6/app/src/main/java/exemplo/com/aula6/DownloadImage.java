package exemplo.com.aula6;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.io.InputStream;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by sala01 on 15/05/2017.
 */

public class DownloadImage extends AsyncTask<String, Integer, Bitmap>{

    private Context context;
    private Dialog dialog;
    private DownloadListner listener;
    private ProgressBar progressBar;

    public DownloadImage(Context context,ProgressBar progressBar, DownloadListner listener ) {
        this.context = context;
        this.listener = listener;
        this.progressBar = progressBar;
    }

    @Override
    protected void onPreExecute(){
        super.onPreExecute();

        progressBar.setIndeterminate(true);

        /*dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(false);

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.MATCH_PARENT;


        dialog.show();
        dialog.getWindow().setAttributes(lp);*/
    }

    @Override
    protected Bitmap doInBackground(String... params) {
        OkHttpClient client =  new OkHttpClient();

        Request request = new Request.Builder().url("http://i.imgur.com/yCeT8lv.jpg").build();

        Response response = null;

        try{
            response = client.newCall(request).execute();
        }catch (Exception e){
            e.printStackTrace();
        }

        if(response != null){
            InputStream is = response.body().byteStream();

            return BitmapFactory.decodeStream(is);
        }

        return null;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap){
        progressBar.setVisibility(View.GONE);
        if(bitmap != null){
           listener.getImg(bitmap);
        }

        //dialog.dismiss();
    }

}
