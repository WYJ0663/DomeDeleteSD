package com.example.DomeDeleteSD;

import android.os.Environment;

import java.io.File;

/**
 * Created by WYJ on 2015-08-01.
 */
public class FileUtil {


    public static void deleteAllFile(String folderName) {
        String path = Environment.getExternalStorageDirectory().getAbsolutePath()
                + File.separator + folderName;
        File file = new File(path);
        if (file.exists())
            deleteFile(file);
    }

    public static void deleteFile(File oldPath) {
        if (oldPath.isDirectory()) {
            File[] files = oldPath.listFiles();
            for (File file : files) {
                deleteFile(file);
            }
            oldPath.delete();
        } else {
            oldPath.delete();
        }
    }
}
