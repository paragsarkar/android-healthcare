package healthcare.android;

import android.app.Application;

import com.instabug.library.Instabug;
import com.instabug.library.invocation.InstabugInvocationEvent;

import healthcare.android.constants.AppConstants;

public class HealthcareApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        new Instabug.Builder(this, AppConstants.INSTABUGKEY)
                .setInvocationEvents(InstabugInvocationEvent.SHAKE, InstabugInvocationEvent.SCREENSHOT)
                .build();
    }
}
