package exemplo.com.aula7;

import com.google.firebase.database.FirebaseDatabase;

public class FireData {

    private static FirebaseDatabase mDatabase;

    public FireData(){}

    public static FirebaseDatabase getDatabase() {
        if (mDatabase == null) {
            mDatabase = FirebaseDatabase.getInstance();
            mDatabase.setPersistenceEnabled(true);
        }

        return mDatabase;
    }
}