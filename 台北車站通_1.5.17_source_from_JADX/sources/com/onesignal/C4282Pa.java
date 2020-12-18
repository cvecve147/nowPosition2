package com.onesignal;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.onesignal.Pa */
class C4282Pa implements ThreadFactory {
    C4282Pa() {
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("OS_PENDING_EXECUTOR_" + thread.getId());
        return thread;
    }
}
