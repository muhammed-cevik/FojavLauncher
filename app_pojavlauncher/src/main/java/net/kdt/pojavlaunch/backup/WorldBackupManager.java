package net.kdt.pojavlaunch.backup;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.zip.*;

public class WorldBackupManager {
    private static final String TAG = "WorldBackup";

    public static File getBackupDir(Context context) {
        File dir = new File(Environment.getExternalStorageDirectory(), "FojavBackups");
        if (!dir.exists()) dir.mkdirs();
        return dir;
    }

    public static boolean backupWorld(Context context, File worldDir) {
        try {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm", Locale.getDefault()).format(new Date());
            File zipFile = new File(getBackupDir(context), worldDir.getName() + "_" + timestamp + ".zip");
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile));
            zipDirectory(worldDir, worldDir.getName(), zos);
            zos.close();
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Backup error", e);
            return false;
        }
    }

    private static void zipDirectory(File folder, String parent, ZipOutputStream zos) throws IOException {
        File[] files = folder.listFiles();
        if (files == null) return;
        for (File file : files) {
            if (file.isDirectory()) { zipDirectory(file, parent + "/" + file.getName(), zos); continue; }
            zos.putNextEntry(new ZipEntry(parent + "/" + file.getName()));
            FileInputStream fis = new FileInputStream(file);
            byte[] buf = new byte[8192]; int len;
            while ((len = fis.read(buf)) > 0) zos.write(buf, 0, len);
            fis.close(); zos.closeEntry();
        }
    }
}
