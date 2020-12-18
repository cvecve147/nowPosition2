package com.onesignal;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

abstract class JobIntentService extends Service {

    /* renamed from: a */
    static final Object f12634a = new Object();

    /* renamed from: b */
    static final HashMap<ComponentNameWithWakeful, WorkEnqueuer> f12635b = new HashMap<>();

    /* renamed from: c */
    CompatJobEngine f12636c;

    /* renamed from: d */
    WorkEnqueuer f12637d;

    /* renamed from: e */
    CommandProcessor f12638e;

    /* renamed from: f */
    boolean f12639f = false;

    /* renamed from: g */
    boolean f12640g = false;

    /* renamed from: h */
    boolean f12641h = false;

    /* renamed from: i */
    final ArrayList<CompatWorkItem> f12642i = new ArrayList<>();

    final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        CommandProcessor() {
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                GenericWorkItem a = JobIntentService.this.mo12323a();
                if (a == null) {
                    return null;
                }
                JobIntentService.this.mo12324a(a.getIntent());
                a.complete();
            }
        }

        /* access modifiers changed from: protected */
        public void onCancelled(Void voidR) {
            JobIntentService.this.mo12328d();
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Void voidR) {
            JobIntentService.this.mo12328d();
        }
    }

    interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final Context mContext;
        private final PowerManager.WakeLock mLaunchWakeLock;
        boolean mLaunchingService;
        private final PowerManager.WakeLock mRunWakeLock;
        boolean mServiceProcessing;

        CompatWorkEnqueuer(Context context, ComponentName componentName) {
            super(componentName);
            this.mContext = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            this.mLaunchWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.mLaunchWakeLock.setReferenceCounted(false);
            this.mRunWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.mRunWakeLock.setReferenceCounted(false);
        }

        /* access modifiers changed from: package-private */
        public void enqueueWork(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.mComponentName);
            if (this.mContext.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.mLaunchingService) {
                        this.mLaunchingService = true;
                        if (!this.mServiceProcessing) {
                            this.mLaunchWakeLock.acquire(60000);
                        }
                    }
                }
            }
        }

        public void serviceProcessingFinished() {
            synchronized (this) {
                if (this.mServiceProcessing) {
                    if (this.mLaunchingService) {
                        this.mLaunchWakeLock.acquire(60000);
                    }
                    this.mServiceProcessing = false;
                    this.mRunWakeLock.release();
                }
            }
        }

        public void serviceProcessingStarted() {
            synchronized (this) {
                if (!this.mServiceProcessing) {
                    this.mServiceProcessing = true;
                    this.mRunWakeLock.acquire(600000);
                    this.mLaunchWakeLock.release();
                }
            }
        }

        public void serviceStartReceived() {
            synchronized (this) {
                this.mLaunchingService = false;
            }
        }
    }

    final class CompatWorkItem implements GenericWorkItem {
        final Intent mIntent;
        final int mStartId;

        CompatWorkItem(Intent intent, int i) {
            this.mIntent = intent;
            this.mStartId = i;
        }

        public void complete() {
            JobIntentService.this.stopSelf(this.mStartId);
        }

        public Intent getIntent() {
            return this.mIntent;
        }
    }

    private static class ComponentNameWithWakeful {
        private ComponentName componentName;
        private boolean useWakefulService;

        ComponentNameWithWakeful(ComponentName componentName2, boolean z) {
            this.componentName = componentName2;
            this.useWakefulService = z;
        }
    }

    interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        static final boolean DEBUG = false;
        static final String TAG = "JobServiceEngineImpl";
        final Object mLock = new Object();
        JobParameters mParams;
        final JobIntentService mService;

        final class WrapperWorkItem implements GenericWorkItem {
            final JobWorkItem mJobWork;

            WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.mJobWork = jobWorkItem;
            }

            public void complete() {
                String str;
                String str2;
                synchronized (JobServiceEngineImpl.this.mLock) {
                    if (JobServiceEngineImpl.this.mParams != null) {
                        try {
                            JobServiceEngineImpl.this.mParams.completeWork(this.mJobWork);
                        } catch (SecurityException e) {
                            e = e;
                            str = JobServiceEngineImpl.TAG;
                            str2 = "SecurityException: Failed to run mParams.completeWork(mJobWork)!";
                        } catch (IllegalArgumentException e2) {
                            e = e2;
                            str = JobServiceEngineImpl.TAG;
                            str2 = "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!";
                        }
                    }
                }
                Log.e(str, str2, e);
            }

            public Intent getIntent() {
                return this.mJobWork.getIntent();
            }
        }

        JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.mService = jobIntentService;
        }

        public IBinder compatGetBinder() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0011, code lost:
            if (r1 == null) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r1.getIntent().setExtrasClassLoader(r5.mService.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
            return new com.onesignal.JobIntentService.JobServiceEngineImpl.WrapperWorkItem(r5, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.onesignal.JobIntentService.GenericWorkItem dequeueWork() {
            /*
                r5 = this;
                java.lang.Object r0 = r5.mLock
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r5.mParams     // Catch:{ all -> 0x0031 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0031 }
                return r2
            L_0x000a:
                android.app.job.JobParameters r1 = r5.mParams     // Catch:{ SecurityException -> 0x0027 }
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ SecurityException -> 0x0027 }
                monitor-exit(r0)     // Catch:{ all -> 0x0031 }
                if (r1 == 0) goto L_0x0026
                android.content.Intent r0 = r1.getIntent()
                com.onesignal.JobIntentService r2 = r5.mService
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                com.onesignal.JobIntentService$JobServiceEngineImpl$WrapperWorkItem r0 = new com.onesignal.JobIntentService$JobServiceEngineImpl$WrapperWorkItem
                r0.<init>(r1)
                return r0
            L_0x0026:
                return r2
            L_0x0027:
                r1 = move-exception
                java.lang.String r3 = "JobServiceEngineImpl"
                java.lang.String r4 = "Failed to run mParams.dequeueWork()!"
                android.util.Log.e(r3, r4, r1)     // Catch:{ all -> 0x0031 }
                monitor-exit(r0)     // Catch:{ all -> 0x0031 }
                return r2
            L_0x0031:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0031 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.JobIntentService.JobServiceEngineImpl.dequeueWork():com.onesignal.JobIntentService$GenericWorkItem");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.mParams = jobParameters;
            this.mService.mo12325a(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b = this.mService.mo12326b();
            synchronized (this.mLock) {
                this.mParams = null;
            }
            return b;
        }
    }

    static final class JobWorkEnqueuer extends WorkEnqueuer {
        private final JobInfo mJobInfo;
        private final JobScheduler mJobScheduler;

        JobWorkEnqueuer(Context context, ComponentName componentName, int i) {
            super(componentName);
            ensureJobId(i);
            this.mJobInfo = new JobInfo.Builder(i, this.mComponentName).setOverrideDeadline(0).build();
            this.mJobScheduler = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* access modifiers changed from: package-private */
        public void enqueueWork(Intent intent) {
            this.mJobScheduler.enqueue(this.mJobInfo, new JobWorkItem(intent));
        }
    }

    static abstract class WorkEnqueuer {
        final ComponentName mComponentName;
        boolean mHasJobId;
        int mJobId;

        WorkEnqueuer(ComponentName componentName) {
            this.mComponentName = componentName;
        }

        /* access modifiers changed from: package-private */
        public abstract void enqueueWork(Intent intent);

        /* access modifiers changed from: package-private */
        public void ensureJobId(int i) {
            if (!this.mHasJobId) {
                this.mHasJobId = true;
                this.mJobId = i;
            } else if (this.mJobId != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.mJobId);
            }
        }

        public void serviceProcessingFinished() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceStartReceived() {
        }
    }

    /* renamed from: a */
    static WorkEnqueuer m16910a(Context context, ComponentName componentName, boolean z, int i, boolean z2) {
        WorkEnqueuer workEnqueuer;
        ComponentNameWithWakeful componentNameWithWakeful = new ComponentNameWithWakeful(componentName, z2);
        WorkEnqueuer workEnqueuer2 = f12635b.get(componentNameWithWakeful);
        if (workEnqueuer2 != null) {
            return workEnqueuer2;
        }
        if (Build.VERSION.SDK_INT < 26 || z2) {
            workEnqueuer = new CompatWorkEnqueuer(context, componentName);
        } else if (z) {
            workEnqueuer = new JobWorkEnqueuer(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        WorkEnqueuer workEnqueuer3 = workEnqueuer;
        f12635b.put(componentNameWithWakeful, workEnqueuer3);
        return workEnqueuer3;
    }

    /* renamed from: a */
    public static void m16911a(Context context, ComponentName componentName, int i, Intent intent, boolean z) {
        if (intent != null) {
            synchronized (f12634a) {
                WorkEnqueuer a = m16910a(context, componentName, true, i, z);
                a.ensureJobId(i);
                try {
                    a.enqueueWork(intent);
                } catch (IllegalStateException e) {
                    if (z) {
                        m16910a(context, componentName, true, i, false).enqueueWork(intent);
                    } else {
                        throw e;
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public GenericWorkItem mo12323a() {
        GenericWorkItem dequeueWork;
        CompatJobEngine compatJobEngine = this.f12636c;
        if (compatJobEngine != null && (dequeueWork = compatJobEngine.dequeueWork()) != null) {
            return dequeueWork;
        }
        synchronized (this.f12642i) {
            if (this.f12642i.size() <= 0) {
                return null;
            }
            GenericWorkItem remove = this.f12642i.remove(0);
            return remove;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12324a(Intent intent);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12325a(boolean z) {
        if (this.f12638e == null) {
            this.f12638e = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.f12637d;
            if (workEnqueuer != null && z) {
                workEnqueuer.serviceProcessingStarted();
            }
            this.f12638e.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo12326b() {
        CommandProcessor commandProcessor = this.f12638e;
        if (commandProcessor != null) {
            commandProcessor.cancel(this.f12639f);
        }
        this.f12640g = true;
        return mo12327c();
    }

    /* renamed from: c */
    public boolean mo12327c() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo12328d() {
        ArrayList<CompatWorkItem> arrayList = this.f12642i;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f12638e = null;
                if (this.f12642i != null && this.f12642i.size() > 0) {
                    mo12325a(false);
                } else if (!this.f12641h) {
                    this.f12637d.serviceProcessingFinished();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        CompatJobEngine compatJobEngine = this.f12636c;
        if (compatJobEngine != null) {
            return compatJobEngine.compatGetBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f12636c = new JobServiceEngineImpl(this);
            this.f12637d = null;
        }
        this.f12637d = m16910a((Context) this, new ComponentName(this, getClass()), false, 0, true);
    }

    public void onDestroy() {
        super.onDestroy();
        mo12326b();
        synchronized (this.f12642i) {
            this.f12641h = true;
            this.f12637d.serviceProcessingFinished();
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f12637d.serviceStartReceived();
        synchronized (this.f12642i) {
            ArrayList<CompatWorkItem> arrayList = this.f12642i;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i2));
            mo12325a(true);
        }
        return 3;
    }
}
