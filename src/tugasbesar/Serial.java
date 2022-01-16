package tugasbesar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serial implements Serializable {
    private String nama_file;

    public Serial(String nama_file) {
        this.nama_file = nama_file;
    }

    public String getNama_file() {
        return this.nama_file;
    }

    public void setNama_file(String nama_file) {
        this.nama_file = nama_file;
    }

    public void writeObject(Object obj) throws IOException {
        ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(this.nama_file));
        writer.writeObject(obj);
        writer.close();
    }

    public Object readObject() throws Exception {
        new Object();
        ObjectInputStream reader = new ObjectInputStream(new FileInputStream(this.nama_file));
        Object obj = reader.readObject();
        return obj;
    }
}
