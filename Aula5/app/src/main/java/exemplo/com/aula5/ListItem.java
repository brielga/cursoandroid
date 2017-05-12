package exemplo.com.aula5;

/**
 * Created by sala01 on 12/05/2017.
 */

public class ListItem {

    int avatarID, imgID;
    String name,local,likes;

    public ListItem(int avatarID, int imgID, String name, String local, String likes) {
        this.avatarID = avatarID;
        this.imgID = imgID;
        this.name = name;
        this.local = local;
        this.likes = likes;
    }
}
