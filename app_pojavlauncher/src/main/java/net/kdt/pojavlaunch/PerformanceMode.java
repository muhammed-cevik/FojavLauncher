package net.kdt.pojavlaunch;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import androidx.preference.PreferenceManager;

public class PerformanceMode {
    public static final int MODE_BALANCED = 0;
    public static final int MODE_PERFORMANCE = 1;
    public static final int MODE_BATTERY = 2;

    public static void applyMode(Context context, int mode) {
        SharedPreferences.Editor editor = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit();
        switch (mode) {
            case MODE_PERFORMANCE:
                editor.putBoolean("dump_shaders", true);
                editor.putBoolean("bigCoreAffinity", true);
                editor.putBoolean("force_vsync", false);
                editor.putBoolean("vsync_in_zink", false);
                editor.putBoolean("sustainedPerformance", false);
                editor.putInt("resolutionRatio", 75);
                Toast.makeText(context, "Hiz Modu Aktif!", Toast.LENGTH_SHORT).show();
                break;
            case MODE_BATTERY:
                editor.putBoolean("bigCoreAffinity", false);
                editor.putBoolean("force_vsync", true);
                editor.putBoolean("sustainedPerformance", true);
                editor.putInt("resolutionRatio", 60);
                Toast.makeText(context, "Pil Tasarrufu Aktif!", Toast.LENGTH_SHORT).show();
                break;
            default:
                editor.putBoolean("dump_shaders", true);
                editor.putBoolean("bigCoreAffinity", true);
                editor.putBoolean("force_vsync", false);
                editor.putInt("resolutionRatio", 100);
                Toast.makeText(context, "Dengeli Mod Aktif!", Toast.LENGTH_SHORT).show();
                break;
        }
        editor.apply();
    }
}
