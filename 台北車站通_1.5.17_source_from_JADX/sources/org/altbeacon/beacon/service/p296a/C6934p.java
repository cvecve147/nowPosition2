package org.altbeacon.beacon.service.p296a;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/* renamed from: org.altbeacon.beacon.service.a.p */
public class C6934p {

    /* renamed from: a */
    private final Set<ByteBuffer> f19143a = new HashSet();

    /* renamed from: a */
    public void mo18864a() {
        this.f19143a.clear();
    }

    /* renamed from: a */
    public boolean mo18865a(String str, byte[] bArr) {
        byte[] bytes = str.getBytes();
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + bArr.length);
        allocate.put(bytes);
        allocate.put(bArr);
        allocate.rewind();
        return this.f19143a.size() == 1000 ? this.f19143a.contains(allocate) : this.f19143a.add(allocate);
    }
}
