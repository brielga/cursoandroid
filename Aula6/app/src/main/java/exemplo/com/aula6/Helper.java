package exemplo.com.aula6;

import android.content.Context;
import android.content.res.Resources;

/**
 * Created by sala01 on 15/05/2017.
 */

public class Helper {

    private static String photo = "photo_"; //identificadores de imagens do projeto

    public static int getPeripheralsLeftIconResourceId(Resources resources, String drawableName, Context context){
       return resources.getIdentifier(photo +drawableName.toLowerCase(), "drawable", context.getPackageName());
    }
}
