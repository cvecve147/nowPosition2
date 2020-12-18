package p287me.tatarka.support.internal.job;

import p287me.tatarka.support.internal.job.JobSchedulerService;
import p287me.tatarka.support.internal.receivers.C6803c;
import p287me.tatarka.support.job.C6807a;

/* renamed from: me.tatarka.support.internal.job.b */
class C6795b extends C6807a.C6808a {

    /* renamed from: a */
    final /* synthetic */ JobSchedulerService f18868a;

    /* renamed from: b */
    final /* synthetic */ C6803c f18869b;

    /* renamed from: c */
    final /* synthetic */ JobSchedulerService.C6793a f18870c;

    C6795b(JobSchedulerService.C6793a aVar, JobSchedulerService jobSchedulerService, C6803c cVar) {
        this.f18870c = aVar;
        this.f18868a = jobSchedulerService;
        this.f18869b = cVar;
    }

    /* renamed from: a */
    public void mo17371a(int i, boolean z) {
        if (!z) {
            JobSchedulerService.C6793a aVar = this.f18870c;
            JobSchedulerService.this.m25743a(i, aVar);
            JobSchedulerService.this.m25758c();
        }
    }

    /* renamed from: b */
    public void mo17372b(int i, boolean z) {
        JobSchedulerService.C6793a aVar = this.f18870c;
        JobSchedulerService.this.m25743a(i, aVar);
        if (this.f18870c.f18864d && (z || this.f18869b.mo17401c().mo17431l())) {
            JobSchedulerService.this.m25750a(this.f18869b, z);
        }
        JobSchedulerService.this.m25758c();
    }

    /* renamed from: c */
    public void mo17373c(int i, boolean z) {
        JobSchedulerService.C6793a aVar = this.f18870c;
        JobSchedulerService.this.m25743a(i, aVar);
        if (this.f18870c.f18864d && (z || this.f18869b.mo17401c().mo17431l())) {
            JobSchedulerService.this.m25750a(this.f18869b, z);
        }
        JobSchedulerService.this.m25758c();
    }
}
