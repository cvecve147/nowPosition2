package p299tw.navin.navinmap.map;

import android.os.Handler;
import android.os.Message;
import p267i.p268a.p269a.C6684c;
import p267i.p274b.p277b.p278a.p279a.C6705b;

/* renamed from: tw.navin.navinmap.map.q */
class C7138q extends Handler {

    /* renamed from: a */
    final /* synthetic */ C7143u f19706a;

    C7138q(C7143u uVar) {
        this.f19706a = uVar;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == C6684c.refresh_token_success) {
            this.f19706a.m26887d((String) message.obj);
        } else if (i == C6684c.refresh_token_failed) {
            this.f19706a.m26871a((C6705b.C6706a) message.obj);
        } else if (i != C6684c.request_map_success) {
            if (i != C6684c.request_map_failed) {
                if (i != C6684c.request_beacon_success) {
                    if (i != C6684c.request_beacon_failed) {
                        if (i != C6684c.request_node_success) {
                            if (i != C6684c.request_node_failed) {
                                if (i != C6684c.request_node_link_success) {
                                    if (i != C6684c.request_node_link_failed) {
                                        if (i != C6684c.request_store_success) {
                                            if (i != C6684c.request_store_failed && (i == C6684c.request_facility_success || i != C6684c.request_facility_failed)) {
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f19706a.m26877b((C6705b.C6706a) message.obj);
        }
    }
}
