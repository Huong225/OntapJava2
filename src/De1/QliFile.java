/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 *
 * @author Huong
 */
public class QliFile {
    public static Object readObject(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Object object = ois.readObject();
            return object;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeObject(String path, Object obj) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            try (ObjectOutput oos = new ObjectOutputStream(fos)) {
                oos.writeObject(obj);
                oos.close();
            }
        } catch (IOException e) {
        }

    }
}
