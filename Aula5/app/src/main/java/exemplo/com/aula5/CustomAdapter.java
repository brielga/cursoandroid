package exemplo.com.aula5;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by sala01 on 12/05/2017.
 */

public class CustomAdapter extends ArrayAdapter<ListItem>{

    Context context;
    List<ListItem> listItems;

    public CustomAdapter(@NonNull Context context, @NonNull List<ListItem> objects) {
        super(context, R.layout.list_item_card, objects);
        this.context = context;
        this.listItems = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_card, parent, false);

            ViewHolder viewHolder = new ViewHolder();

            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_item_card,parent,false);
            viewHolder.setTitulo((TextView) convertView.findViewById(R.id.titulo));
            viewHolder.setSubtitulo((TextView) convertView.findViewById(R.id.textSubititulo));

        }
        return convertView;
    }

    class ViewHolder{
        TextView titulo,subtitulo,texto;
        ImageView avatar,imgPrincipal;

        public ViewHolder() {
        }

        public ViewHolder(TextView titulo, TextView subtitulo, TextView texto, ImageView avatar, ImageView imgPrincipal) {
            this.titulo = titulo;
            this.subtitulo = subtitulo;
            this.texto = texto;
            this.avatar = avatar;
            this.imgPrincipal = imgPrincipal;
        }

        public TextView getTitulo() {
            return titulo;
        }

        public void setTitulo(TextView titulo) {
            this.titulo = titulo;
        }

        public TextView getSubtitulo() {
            return subtitulo;
        }

        public void setSubtitulo(TextView subtitulo) {
            this.subtitulo = subtitulo;
        }

        public TextView getTexto() {
            return texto;
        }

        public void setTexto(TextView texto) {
            this.texto = texto;
        }

        public ImageView getAvatar() {
            return avatar;
        }

        public void setAvatar(ImageView avatar) {
            this.avatar = avatar;
        }

        public ImageView getImgPrincipal() {
            return imgPrincipal;
        }

        public void setImgPrincipal(ImageView imgPrincipal) {
            this.imgPrincipal = imgPrincipal;
        }
    }

}
