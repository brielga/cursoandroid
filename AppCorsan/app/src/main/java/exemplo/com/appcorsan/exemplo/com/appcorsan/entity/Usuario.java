package exemplo.com.appcorsan.exemplo.com.appcorsan.entity;

import java.io.Serializable;

/**
 * Created by sala01 on 09/05/2017.
 */

public class Usuario implements Serializable{
    private String usuario;

    private String password;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
