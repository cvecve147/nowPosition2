package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.lh */
public final class C3263lh extends C3088fh {

    /* renamed from: d */
    private static final Set<String> f9742d = Collections.synchronizedSet(new HashSet());

    /* renamed from: e */
    private static final DecimalFormat f9743e = new DecimalFormat("#,###");

    /* renamed from: f */
    private File f9744f;

    /* renamed from: g */
    private boolean f9745g;

    public C3263lh(C2749Ug ug) {
        super(ug);
        File cacheDir = this.f9138a.getCacheDir();
        if (cacheDir == null) {
            C2227Cf.m9536d("Context.getCacheDir() returned null");
            return;
        }
        this.f9744f = new File(cacheDir, "admobVideoStreams");
        if (!this.f9744f.isDirectory() && !this.f9744f.mkdirs()) {
            String valueOf = String.valueOf(this.f9744f.getAbsolutePath());
            C2227Cf.m9536d(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.f9744f = null;
        } else if (!this.f9744f.setReadable(true, false) || !this.f9744f.setExecutable(true, false)) {
            String valueOf2 = String.valueOf(this.f9744f.getAbsolutePath());
            C2227Cf.m9536d(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.f9744f = null;
        }
    }

    /* renamed from: a */
    private final File m12974a(File file) {
        return new File(this.f9744f, String.valueOf(file.getName()).concat(".done"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f1, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r1 = r5.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f9, code lost:
        if (r1 < 400) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01fb, code lost:
        r15 = "badUrl";
        r2 = java.lang.String.valueOf(java.lang.Integer.toString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x020b, code lost:
        if (r2.length() == 0) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x020d, code lost:
        r2 = "HTTP request failed. Code: ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0213, code lost:
        r2 = new java.lang.String("HTTP request failed. Code: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 32);
        r4.append("HTTP status code ");
        r4.append(r1);
        r4.append(" at ");
        r4.append(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0240, code lost:
        throw new java.io.IOException(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0241, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r7 = r5.getContentLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0249, code lost:
        if (r7 >= 0) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r1 = java.lang.String.valueOf(r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0255, code lost:
        if (r1.length() == 0) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0257, code lost:
        r0 = "Stream cache aborted, missing content-length header at ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x025c, code lost:
        r0 = new java.lang.String("Stream cache aborted, missing content-length header at ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0262, code lost:
        com.google.android.gms.internal.ads.C2227Cf.m9536d(r0);
        mo9422a(r9, r12.getAbsolutePath(), "contentLengthMissing", (java.lang.String) null);
        f9742d.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0273, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r1 = f9743e.format((long) r7);
        r3 = ((java.lang.Integer) com.google.android.gms.internal.ads.C3390pt.m13458f().mo8515a(com.google.android.gms.internal.ads.C2558Nu.f8001y)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x028b, code lost:
        if (r7 <= r3) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 33) + java.lang.String.valueOf(r31).length());
        r2.append("Content length ");
        r2.append(r1);
        r2.append(" exceeds limit at ");
        r2.append(r9);
        com.google.android.gms.internal.ads.C2227Cf.m9536d(r2.toString());
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02c6, code lost:
        if (r1.length() == 0) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c8, code lost:
        r0 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02cd, code lost:
        r0 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d3, code lost:
        mo9422a(r9, r12.getAbsolutePath(), "sizeExceeded", r0);
        f9742d.remove(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02e1, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 20) + java.lang.String.valueOf(r31).length());
        r4.append("Caching ");
        r4.append(r1);
        r4.append(" bytes from ");
        r4.append(r9);
        com.google.android.gms.internal.ads.C2227Cf.m9532b(r4.toString());
        r5 = java.nio.channels.Channels.newChannel(r5.getInputStream());
        r4 = new java.io.FileOutputStream(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r2 = r4.getChannel();
        r1 = java.nio.ByteBuffer.allocate(1048576);
        r16 = com.google.android.gms.ads.internal.C1697X.m7705l();
        r17 = r16.mo7725a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x033b, code lost:
        r10 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r6 = new com.google.android.gms.internal.ads.C3115gf(((java.lang.Long) com.google.android.gms.internal.ads.C3390pt.m13458f().mo8515a(com.google.android.gms.internal.ads.C2558Nu.f7710B)).longValue());
        r13 = ((java.lang.Long) com.google.android.gms.internal.ads.C3390pt.m13458f().mo8515a(com.google.android.gms.internal.ads.C2558Nu.f7704A)).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0355, code lost:
        r20 = r5.read(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0359, code lost:
        if (r20 < 0) goto L_0x0471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x035b, code lost:
        r11 = r11 + r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x035d, code lost:
        if (r11 <= r3) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x035f, code lost:
        r15 = "sizeExceeded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x036f, code lost:
        if (r1.length() == 0) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0371, code lost:
        r1 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0377, code lost:
        r1 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0383, code lost:
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0384, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0387, code lost:
        r2 = r1;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x038a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x038d, code lost:
        r1 = r10;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x038f, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        r1.flip();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0399, code lost:
        if (r2.write(r1) > 0) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x039b, code lost:
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03aa, code lost:
        if ((r16.mo7725a() - r17) > (1000 * r13)) goto L_0x0425;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03ac, code lost:
        r20 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03b0, code lost:
        if (r8.f9745g != false) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03b6, code lost:
        if (r6.mo9462a() == false) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03b8, code lost:
        r21 = r12.getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03be, code lost:
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03c2, code lost:
        r24 = r10;
        r10 = com.google.android.gms.internal.ads.C3432rf.f10110a;
        r1 = r1;
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r4 = r21;
        r21 = r5;
        r19 = r6;
        r29 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        r1 = new com.google.android.gms.internal.ads.C3117gh(r30, r31, r4, r11, r7, false);
        r10.post(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03e7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03e9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03ea, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03ef, code lost:
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0401, code lost:
        r6 = r19;
        r1 = r20;
        r5 = r21;
        r15 = r22;
        r10 = r24;
        r2 = r25;
        r3 = r26;
        r4 = r27;
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0415, code lost:
        r27 = r4;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0424, code lost:
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0425, code lost:
        r27 = r4;
        r24 = r10;
        r22 = r15;
        r15 = "downloadTimeout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        r0 = java.lang.Long.toString(r13);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0458, code lost:
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0459, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x045c, code lost:
        r2 = r2.toString();
        r1 = r24;
        r10 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0463, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0467, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x046a, code lost:
        r27 = r4;
        r22 = r15;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0471, code lost:
        r27 = r4;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        r27.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0480, code lost:
        if (com.google.android.gms.internal.ads.C2227Cf.m9531a(3) == false) goto L_0x04c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
        r1 = f9743e.format((long) r11);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r31).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r9);
        com.google.android.gms.internal.ads.C2227Cf.m9532b(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04b9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04bb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:?, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04ca, code lost:
        if (r0.isFile() == false) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:?, code lost:
        r0.createNewFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        mo9421a(r9, r12.getAbsolutePath(), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04e0, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        f9742d.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04e5, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04e7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04eb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04ee, code lost:
        r1 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04f0, code lost:
        r15 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04f3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04f6, code lost:
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04fa, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04fd, code lost:
        r27 = r4;
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0500, code lost:
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0506, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0510, code lost:
        throw new java.io.IOException("Invalid protocol.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0511, code lost:
        r1 = r14;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x051b, code lost:
        throw new java.io.IOException("Too many redirects (20)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x051c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x051f, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0522, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0525, code lost:
        r1 = r14;
        r22 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0528, code lost:
        r2 = null;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x052e, code lost:
        com.google.android.gms.ads.internal.C1697X.m7702i().mo8319a(r0, "VideoStreamFullFileCache.preload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x053e, code lost:
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 26);
        r3.append("Preload aborted for URL \"");
        r3.append(r9);
        r3.append("\"");
        com.google.android.gms.internal.ads.C2227Cf.m9534c(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0562, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 25);
        r4.append("Preload failed for URL \"");
        r4.append(r9);
        r4.append("\"");
        com.google.android.gms.internal.ads.C2227Cf.m9535c(r4.toString(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05a1, code lost:
        r0 = "Could not delete partial cache file at ".concat(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05a6, code lost:
        r0 = new java.lang.String("Could not delete partial cache file at ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0130, code lost:
        r15 = "error";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        com.google.android.gms.ads.internal.C1697X.m7710q();
        r1 = ((java.lang.Integer) com.google.android.gms.internal.ads.C3390pt.m13458f().mo8515a(com.google.android.gms.internal.ads.C2558Nu.f7716C)).intValue();
        r3 = new java.net.URL(r9);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014c, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014f, code lost:
        if (r2 > 20) goto L_0x0511;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0151, code lost:
        r5 = r3.openConnection();
        r5.setConnectTimeout(r1);
        r5.setReadTimeout(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015d, code lost:
        if ((r5 instanceof java.net.HttpURLConnection) == false) goto L_0x0506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015f, code lost:
        r5 = (java.net.HttpURLConnection) r5;
        r6 = new com.google.android.gms.internal.ads.C3548vf();
        r6.mo10125a(r5, (byte[]) null);
        r5.setInstanceFollowRedirects(false);
        r7 = r5.getResponseCode();
        r6.mo10124a(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0176, code lost:
        if ((r7 / 100) != 3) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r4 = r5.getHeaderField(org.apache.http.HttpHeaders.LOCATION);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017e, code lost:
        if (r4 == null) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0180, code lost:
        r6 = new java.net.URL(r3, r4);
        r3 = r6.getProtocol();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0189, code lost:
        if (r3 == null) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0191, code lost:
        if (r3.equals(org.apache.http.HttpHost.DEFAULT_SCHEME_NAME) != false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0199, code lost:
        if (r3.equals("https") != false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019b, code lost:
        r2 = java.lang.String.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a7, code lost:
        if (r2.length() == 0) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a9, code lost:
        r1 = "Unsupported scheme: ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ae, code lost:
        r1 = new java.lang.String("Unsupported scheme: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b7, code lost:
        throw new java.io.IOException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b8, code lost:
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c2, code lost:
        if (r4.length() == 0) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c4, code lost:
        r3 = "Redirecting to ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c9, code lost:
        r3 = new java.lang.String("Redirecting to ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01cf, code lost:
        com.google.android.gms.internal.ads.C2227Cf.m9532b(r3);
        r5.disconnect();
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01df, code lost:
        throw new java.io.IOException("Protocol is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e7, code lost:
        throw new java.io.IOException("Missing Location header in redirect");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01eb, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ec, code lost:
        r1 = r14;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:215:0x04d7 */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04b9 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), PHI: r22 r24 r27 
      PHI: (r22v8 java.lang.String) = (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v4 java.lang.String), (r22v16 java.lang.String), (r22v16 java.lang.String) binds: [B:213:0x04d4, B:214:?, B:211:0x04cc, B:212:?, B:201:0x0482, B:202:?, B:171:0x03c0, B:174:0x03e0] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r24v5 java.lang.String) = (r24v1 java.lang.String), (r24v1 java.lang.String), (r24v1 java.lang.String), (r24v1 java.lang.String), (r24v1 java.lang.String), (r24v1 java.lang.String), (r24v9 java.lang.String), (r24v11 java.lang.String) binds: [B:213:0x04d4, B:214:?, B:211:0x04cc, B:212:?, B:201:0x0482, B:202:?, B:171:0x03c0, B:174:0x03e0] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r27v10 java.io.FileOutputStream) = (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v5 java.io.FileOutputStream), (r27v15 java.io.FileOutputStream), (r27v18 java.io.FileOutputStream) binds: [B:213:0x04d4, B:214:?, B:211:0x04cc, B:212:?, B:201:0x0482, B:202:?, B:171:0x03c0, B:174:0x03e0] A[DONT_GENERATE, DONT_INLINE], Splitter:B:174:0x03e0] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x05a1  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x05a6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9423a(java.lang.String r31) {
        /*
            r30 = this;
            r8 = r30
            r9 = r31
            java.io.File r0 = r8.f9744f
            r10 = 0
            r11 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "noCacheDir"
        L_0x000c:
            r8.mo9422a(r9, r10, r0, r10)
            return r11
        L_0x0010:
            java.io.File r0 = r8.f9744f
            if (r0 != 0) goto L_0x0016
            r3 = r11
            goto L_0x0032
        L_0x0016:
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
            r2 = r11
            r3 = r2
        L_0x001d:
            if (r2 >= r1) goto L_0x0032
            r4 = r0[r2]
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = ".done"
            boolean r4 = r4.endsWith(r5)
            if (r4 != 0) goto L_0x002f
            int r3 = r3 + 1
        L_0x002f:
            int r2 = r2 + 1
            goto L_0x001d
        L_0x0032:
            com.google.android.gms.internal.ads.Du<java.lang.Integer> r0 = com.google.android.gms.internal.ads.C2558Nu.f7995x
            com.google.android.gms.internal.ads.Lu r1 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r0 = r1.mo8515a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r3 <= r0) goto L_0x0094
            java.io.File r0 = r8.f9744f
            if (r0 != 0) goto L_0x004a
        L_0x0048:
            r0 = r11
            goto L_0x0089
        L_0x004a:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.io.File[] r0 = r0.listFiles()
            int r3 = r0.length
            r4 = r1
            r2 = r10
            r1 = r11
        L_0x0057:
            if (r1 >= r3) goto L_0x0074
            r6 = r0[r1]
            java.lang.String r7 = r6.getName()
            java.lang.String r12 = ".done"
            boolean r7 = r7.endsWith(r12)
            if (r7 != 0) goto L_0x0071
            long r12 = r6.lastModified()
            int r7 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0071
            r2 = r6
            r4 = r12
        L_0x0071:
            int r1 = r1 + 1
            goto L_0x0057
        L_0x0074:
            if (r2 == 0) goto L_0x0048
            boolean r0 = r2.delete()
            java.io.File r1 = r8.m12974a((java.io.File) r2)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L_0x0089
            boolean r1 = r1.delete()
            r0 = r0 & r1
        L_0x0089:
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "Unable to expire stream cache"
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r0)
            java.lang.String r0 = "expireFailed"
            goto L_0x000c
        L_0x0094:
            com.google.android.gms.internal.ads.C3390pt.m13453a()
            java.lang.String r0 = com.google.android.gms.internal.ads.C3432rf.m13598a((java.lang.String) r31)
            java.io.File r12 = new java.io.File
            java.io.File r1 = r8.f9744f
            r12.<init>(r1, r0)
            java.io.File r0 = r8.m12974a((java.io.File) r12)
            boolean r1 = r12.isFile()
            r13 = 1
            if (r1 == 0) goto L_0x00da
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L_0x00da
            long r0 = r12.length()
            int r0 = (int) r0
            java.lang.String r1 = "Stream cache hit at "
            java.lang.String r2 = java.lang.String.valueOf(r31)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00c9
            java.lang.String r1 = r1.concat(r2)
            goto L_0x00cf
        L_0x00c9:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x00cf:
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r1)
            java.lang.String r1 = r12.getAbsolutePath()
            r8.mo9421a((java.lang.String) r9, (java.lang.String) r1, (int) r0)
            return r13
        L_0x00da:
            java.io.File r1 = r8.f9744f
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = java.lang.String.valueOf(r31)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00f4
            java.lang.String r1 = r1.concat(r2)
            r14 = r1
            goto L_0x00fa
        L_0x00f4:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r14 = r2
        L_0x00fa:
            java.util.Set<java.lang.String> r1 = f9742d
            monitor-enter(r1)
            java.util.Set<java.lang.String> r2 = f9742d     // Catch:{ all -> 0x05bd }
            boolean r2 = r2.contains(r14)     // Catch:{ all -> 0x05bd }
            if (r2 == 0) goto L_0x012a
            java.lang.String r0 = "Stream cache already in progress at "
            java.lang.String r2 = java.lang.String.valueOf(r31)     // Catch:{ all -> 0x05bd }
            int r3 = r2.length()     // Catch:{ all -> 0x05bd }
            if (r3 == 0) goto L_0x0116
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x05bd }
            goto L_0x011c
        L_0x0116:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x05bd }
            r2.<init>(r0)     // Catch:{ all -> 0x05bd }
            r0 = r2
        L_0x011c:
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r0)     // Catch:{ all -> 0x05bd }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ all -> 0x05bd }
            java.lang.String r2 = "inProgress"
            r8.mo9422a(r9, r0, r2, r10)     // Catch:{ all -> 0x05bd }
            monitor-exit(r1)     // Catch:{ all -> 0x05bd }
            return r11
        L_0x012a:
            java.util.Set<java.lang.String> r2 = f9742d     // Catch:{ all -> 0x05bd }
            r2.add(r14)     // Catch:{ all -> 0x05bd }
            monitor-exit(r1)     // Catch:{ all -> 0x05bd }
            java.lang.String r15 = "error"
            com.google.android.gms.ads.internal.C1697X.m7710q()     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            com.google.android.gms.internal.ads.Du<java.lang.Integer> r1 = com.google.android.gms.internal.ads.C2558Nu.f7716C     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            com.google.android.gms.internal.ads.Lu r2 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            java.lang.Object r1 = r2.mo8515a(r1)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            int r1 = r1.intValue()     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            r2.<init>(r9)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            r3 = r2
            r2 = r11
        L_0x014c:
            int r2 = r2 + r13
            r4 = 20
            if (r2 > r4) goto L_0x0511
            java.net.URLConnection r5 = r3.openConnection()     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            r5.setConnectTimeout(r1)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            r5.setReadTimeout(r1)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            boolean r6 = r5 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            if (r6 == 0) goto L_0x0506
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            com.google.android.gms.internal.ads.vf r6 = new com.google.android.gms.internal.ads.vf     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            r6.<init>()     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            r6.mo10125a((java.net.HttpURLConnection) r5, (byte[]) r10)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            r5.setInstanceFollowRedirects(r11)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            int r7 = r5.getResponseCode()     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            r6.mo10124a((java.net.HttpURLConnection) r5, (int) r7)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            int r7 = r7 / 100
            r6 = 3
            if (r7 != r6) goto L_0x01ef
            java.lang.String r4 = "Location"
            java.lang.String r4 = r5.getHeaderField(r4)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            if (r4 == 0) goto L_0x01e0
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r6.<init>(r3, r4)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            java.lang.String r3 = r6.getProtocol()     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            if (r3 == 0) goto L_0x01d8
            java.lang.String r7 = "http"
            boolean r7 = r3.equals(r7)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            if (r7 != 0) goto L_0x01b8
            java.lang.String r7 = "https"
            boolean r7 = r3.equals(r7)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            if (r7 != 0) goto L_0x01b8
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            java.lang.String r1 = "Unsupported scheme: "
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            int r3 = r2.length()     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            if (r3 == 0) goto L_0x01ae
            java.lang.String r1 = r1.concat(r2)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            goto L_0x01b4
        L_0x01ae:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r1 = r2
        L_0x01b4:
            r0.<init>(r1)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            throw r0     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
        L_0x01b8:
            java.lang.String r3 = "Redirecting to "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            int r7 = r4.length()     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            if (r7 == 0) goto L_0x01c9
            java.lang.String r3 = r3.concat(r4)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            goto L_0x01cf
        L_0x01c9:
            java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r3 = r4
        L_0x01cf:
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r3)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r5.disconnect()     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r3 = r6
            goto L_0x014c
        L_0x01d8:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            java.lang.String r1 = "Protocol is null"
            r0.<init>(r1)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            throw r0     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
        L_0x01e0:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            java.lang.String r1 = "Missing Location header in redirect"
            r0.<init>(r1)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            throw r0     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
        L_0x01e8:
            r0 = move-exception
            goto L_0x01eb
        L_0x01ea:
            r0 = move-exception
        L_0x01eb:
            r2 = r10
        L_0x01ec:
            r1 = r14
            goto L_0x052a
        L_0x01ef:
            boolean r1 = r5 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            if (r1 == 0) goto L_0x0245
            int r1 = r5.getResponseCode()     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r2 = 400(0x190, float:5.6E-43)
            if (r1 < r2) goto L_0x0245
            java.lang.String r15 = "badUrl"
            java.lang.String r0 = "HTTP request failed. Code: "
            java.lang.String r2 = java.lang.Integer.toString(r1)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            int r3 = r2.length()     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            if (r3 == 0) goto L_0x0213
            java.lang.String r0 = r0.concat(r2)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r2 = r0
            goto L_0x0218
        L_0x0213:
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
        L_0x0218:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0243, RuntimeException -> 0x0241 }
            java.lang.String r3 = java.lang.String.valueOf(r31)     // Catch:{ IOException -> 0x0243, RuntimeException -> 0x0241 }
            int r3 = r3.length()     // Catch:{ IOException -> 0x0243, RuntimeException -> 0x0241 }
            int r3 = r3 + 32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0243, RuntimeException -> 0x0241 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0243, RuntimeException -> 0x0241 }
            java.lang.String r3 = "HTTP status code "
            r4.append(r3)     // Catch:{ IOException -> 0x0243, RuntimeException -> 0x0241 }
            r4.append(r1)     // Catch:{ IOException -> 0x0243, RuntimeException -> 0x0241 }
            java.lang.String r1 = " at "
            r4.append(r1)     // Catch:{ IOException -> 0x0243, RuntimeException -> 0x0241 }
            r4.append(r9)     // Catch:{ IOException -> 0x0243, RuntimeException -> 0x0241 }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException -> 0x0243, RuntimeException -> 0x0241 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0243, RuntimeException -> 0x0241 }
            throw r0     // Catch:{ IOException -> 0x0243, RuntimeException -> 0x0241 }
        L_0x0241:
            r0 = move-exception
            goto L_0x01ec
        L_0x0243:
            r0 = move-exception
            goto L_0x01ec
        L_0x0245:
            int r7 = r5.getContentLength()     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            if (r7 >= 0) goto L_0x0274
            java.lang.String r0 = "Stream cache aborted, missing content-length header at "
            java.lang.String r1 = java.lang.String.valueOf(r31)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            int r2 = r1.length()     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            if (r2 == 0) goto L_0x025c
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            goto L_0x0262
        L_0x025c:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r0 = r1
        L_0x0262:
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r0)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            java.lang.String r1 = "contentLengthMissing"
            r8.mo9422a(r9, r0, r1, r10)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            java.util.Set<java.lang.String> r0 = f9742d     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r0.remove(r14)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            return r11
        L_0x0274:
            java.text.DecimalFormat r1 = f9743e     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            long r2 = (long) r7     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            java.lang.String r1 = r1.format(r2)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            com.google.android.gms.internal.ads.Du<java.lang.Integer> r2 = com.google.android.gms.internal.ads.C2558Nu.f8001y     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            com.google.android.gms.internal.ads.Lu r3 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            java.lang.Object r2 = r3.mo8515a(r2)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            int r3 = r2.intValue()     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            if (r7 <= r3) goto L_0x02e2
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            int r0 = r0 + 33
            java.lang.String r2 = java.lang.String.valueOf(r31)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            java.lang.String r0 = "Content length "
            r2.append(r0)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r2.append(r1)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            java.lang.String r0 = " exceeds limit at "
            r2.append(r0)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r2.append(r9)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r0)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            java.lang.String r0 = "File too big for full file cache. Size: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            int r2 = r1.length()     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            if (r2 == 0) goto L_0x02cd
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            goto L_0x02d3
        L_0x02cd:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r0 = r1
        L_0x02d3:
            java.lang.String r1 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            java.lang.String r2 = "sizeExceeded"
            r8.mo9422a(r9, r1, r2, r0)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            java.util.Set<java.lang.String> r0 = f9742d     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            r0.remove(r14)     // Catch:{ IOException -> 0x01ea, RuntimeException -> 0x01e8 }
            return r11
        L_0x02e2:
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            int r2 = r2 + r4
            java.lang.String r4 = java.lang.String.valueOf(r31)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            int r4 = r4.length()     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            int r2 = r2 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            java.lang.String r2 = "Caching "
            r4.append(r2)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            r4.append(r1)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            java.lang.String r1 = " bytes from "
            r4.append(r1)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            r4.append(r9)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r1)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            java.io.InputStream r1 = r5.getInputStream()     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            java.nio.channels.ReadableByteChannel r5 = java.nio.channels.Channels.newChannel(r1)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            r4.<init>(r12)     // Catch:{ IOException -> 0x0524, RuntimeException -> 0x0522 }
            java.nio.channels.FileChannel r2 = r4.getChannel()     // Catch:{ IOException -> 0x04fc, RuntimeException -> 0x04fa }
            r1 = 1048576(0x100000, float:1.469368E-39)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ IOException -> 0x04fc, RuntimeException -> 0x04fa }
            com.google.android.gms.common.util.e r16 = com.google.android.gms.ads.internal.C1697X.m7705l()     // Catch:{ IOException -> 0x04fc, RuntimeException -> 0x04fa }
            long r17 = r16.mo7725a()     // Catch:{ IOException -> 0x04fc, RuntimeException -> 0x04fa }
            com.google.android.gms.internal.ads.Du<java.lang.Long> r6 = com.google.android.gms.internal.ads.C2558Nu.f7710B     // Catch:{ IOException -> 0x04fc, RuntimeException -> 0x04fa }
            com.google.android.gms.internal.ads.Lu r10 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ IOException -> 0x04fc, RuntimeException -> 0x04fa }
            java.lang.Object r6 = r10.mo8515a(r6)     // Catch:{ IOException -> 0x04fc, RuntimeException -> 0x04fa }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IOException -> 0x04fc, RuntimeException -> 0x04fa }
            r10 = r14
            long r13 = r6.longValue()     // Catch:{ IOException -> 0x04f5, RuntimeException -> 0x04f3 }
            com.google.android.gms.internal.ads.gf r6 = new com.google.android.gms.internal.ads.gf     // Catch:{ IOException -> 0x04f5, RuntimeException -> 0x04f3 }
            r6.<init>(r13)     // Catch:{ IOException -> 0x04f5, RuntimeException -> 0x04f3 }
            com.google.android.gms.internal.ads.Du<java.lang.Long> r13 = com.google.android.gms.internal.ads.C2558Nu.f7704A     // Catch:{ IOException -> 0x04f5, RuntimeException -> 0x04f3 }
            com.google.android.gms.internal.ads.Lu r14 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ IOException -> 0x04f5, RuntimeException -> 0x04f3 }
            java.lang.Object r13 = r14.mo8515a(r13)     // Catch:{ IOException -> 0x04f5, RuntimeException -> 0x04f3 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ IOException -> 0x04f5, RuntimeException -> 0x04f3 }
            long r13 = r13.longValue()     // Catch:{ IOException -> 0x04f5, RuntimeException -> 0x04f3 }
        L_0x0355:
            int r20 = r5.read(r1)     // Catch:{ IOException -> 0x04f5, RuntimeException -> 0x04f3 }
            if (r20 < 0) goto L_0x0471
            int r11 = r11 + r20
            if (r11 <= r3) goto L_0x0392
            java.lang.String r15 = "sizeExceeded"
            java.lang.String r0 = "File too big for full file cache. Size: "
            java.lang.String r1 = java.lang.Integer.toString(r11)     // Catch:{ IOException -> 0x038c, RuntimeException -> 0x038a }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x038c, RuntimeException -> 0x038a }
            int r2 = r1.length()     // Catch:{ IOException -> 0x038c, RuntimeException -> 0x038a }
            if (r2 == 0) goto L_0x0377
            java.lang.String r0 = r0.concat(r1)     // Catch:{ IOException -> 0x038c, RuntimeException -> 0x038a }
            r1 = r0
            goto L_0x037c
        L_0x0377:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x038c, RuntimeException -> 0x038a }
            r1.<init>(r0)     // Catch:{ IOException -> 0x038c, RuntimeException -> 0x038a }
        L_0x037c:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0386, RuntimeException -> 0x0384 }
            java.lang.String r2 = "stream cache file size limit exceeded"
            r0.<init>(r2)     // Catch:{ IOException -> 0x0386, RuntimeException -> 0x0384 }
            throw r0     // Catch:{ IOException -> 0x0386, RuntimeException -> 0x0384 }
        L_0x0384:
            r0 = move-exception
            goto L_0x0387
        L_0x0386:
            r0 = move-exception
        L_0x0387:
            r2 = r1
            r1 = r10
            goto L_0x038f
        L_0x038a:
            r0 = move-exception
            goto L_0x038d
        L_0x038c:
            r0 = move-exception
        L_0x038d:
            r1 = r10
            r2 = 0
        L_0x038f:
            r10 = r4
            goto L_0x052a
        L_0x0392:
            r1.flip()     // Catch:{ IOException -> 0x0469, RuntimeException -> 0x0467 }
        L_0x0395:
            int r20 = r2.write(r1)     // Catch:{ IOException -> 0x0469, RuntimeException -> 0x0467 }
            if (r20 > 0) goto L_0x0395
            r1.clear()     // Catch:{ IOException -> 0x0469, RuntimeException -> 0x0467 }
            long r20 = r16.mo7725a()     // Catch:{ IOException -> 0x0469, RuntimeException -> 0x0467 }
            long r20 = r20 - r17
            r22 = 1000(0x3e8, double:4.94E-321)
            long r22 = r22 * r13
            int r20 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r20 > 0) goto L_0x0425
            r20 = r1
            boolean r1 = r8.f9745g     // Catch:{ IOException -> 0x0469, RuntimeException -> 0x0467 }
            if (r1 != 0) goto L_0x0415
            boolean r1 = r6.mo9462a()     // Catch:{ IOException -> 0x0469, RuntimeException -> 0x0467 }
            if (r1 == 0) goto L_0x03ef
            java.lang.String r21 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x0469, RuntimeException -> 0x0467 }
            android.os.Handler r1 = com.google.android.gms.internal.ads.C3432rf.f10110a     // Catch:{ IOException -> 0x0469, RuntimeException -> 0x0467 }
            r22 = r15
            com.google.android.gms.internal.ads.gh r15 = new com.google.android.gms.internal.ads.gh     // Catch:{ IOException -> 0x03e9, RuntimeException -> 0x03e7 }
            r23 = 0
            r24 = r10
            r10 = r1
            r1 = r15
            r25 = r2
            r2 = r30
            r26 = r3
            r3 = r31
            r27 = r4
            r4 = r21
            r21 = r5
            r5 = r11
            r19 = r6
            r28 = 3
            r6 = r7
            r29 = r7
            r7 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            r10.post(r15)     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            goto L_0x0401
        L_0x03e7:
            r0 = move-exception
            goto L_0x03ea
        L_0x03e9:
            r0 = move-exception
        L_0x03ea:
            r27 = r4
            r1 = r10
            goto L_0x04f0
        L_0x03ef:
            r25 = r2
            r26 = r3
            r27 = r4
            r21 = r5
            r19 = r6
            r29 = r7
            r24 = r10
            r22 = r15
            r28 = 3
        L_0x0401:
            r6 = r19
            r1 = r20
            r5 = r21
            r15 = r22
            r10 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r7 = r29
            goto L_0x0355
        L_0x0415:
            r27 = r4
            r24 = r10
            r22 = r15
            java.lang.String r15 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0465, RuntimeException -> 0x0463 }
            java.lang.String r1 = "abort requested"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0465, RuntimeException -> 0x0463 }
            throw r0     // Catch:{ IOException -> 0x0465, RuntimeException -> 0x0463 }
        L_0x0425:
            r27 = r4
            r24 = r10
            r22 = r15
            java.lang.String r15 = "downloadTimeout"
            java.lang.String r0 = java.lang.Long.toString(r13)     // Catch:{ IOException -> 0x0465, RuntimeException -> 0x0463 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0465, RuntimeException -> 0x0463 }
            int r1 = r1.length()     // Catch:{ IOException -> 0x0465, RuntimeException -> 0x0463 }
            int r1 = r1 + 29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0465, RuntimeException -> 0x0463 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0465, RuntimeException -> 0x0463 }
            java.lang.String r1 = "Timeout exceeded. Limit: "
            r2.append(r1)     // Catch:{ IOException -> 0x0465, RuntimeException -> 0x0463 }
            r2.append(r0)     // Catch:{ IOException -> 0x0465, RuntimeException -> 0x0463 }
            java.lang.String r0 = " sec"
            r2.append(r0)     // Catch:{ IOException -> 0x0465, RuntimeException -> 0x0463 }
            java.lang.String r10 = r2.toString()     // Catch:{ IOException -> 0x0465, RuntimeException -> 0x0463 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
            java.lang.String r1 = "stream cache time limit exceeded"
            r0.<init>(r1)     // Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
            throw r0     // Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
        L_0x0459:
            r0 = move-exception
            goto L_0x045c
        L_0x045b:
            r0 = move-exception
        L_0x045c:
            r2 = r10
            r1 = r24
            r10 = r27
            goto L_0x052a
        L_0x0463:
            r0 = move-exception
            goto L_0x04be
        L_0x0465:
            r0 = move-exception
            goto L_0x04be
        L_0x0467:
            r0 = move-exception
            goto L_0x046a
        L_0x0469:
            r0 = move-exception
        L_0x046a:
            r27 = r4
            r22 = r15
            r1 = r10
            goto L_0x0502
        L_0x0471:
            r27 = r4
            r24 = r10
            r22 = r15
            r28 = 3
            r27.close()     // Catch:{ IOException -> 0x04ed, RuntimeException -> 0x04eb }
            boolean r1 = com.google.android.gms.internal.ads.C2227Cf.m9531a((int) r28)     // Catch:{ IOException -> 0x04ed, RuntimeException -> 0x04eb }
            if (r1 == 0) goto L_0x04c1
            java.text.DecimalFormat r1 = f9743e     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            long r2 = (long) r11     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            java.lang.String r1 = r1.format(r2)     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            int r2 = r2 + 22
            java.lang.String r3 = java.lang.String.valueOf(r31)     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            int r3 = r3.length()     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            java.lang.String r2 = "Preloaded "
            r3.append(r2)     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            r3.append(r1)     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            java.lang.String r1 = " bytes from "
            r3.append(r1)     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            r3.append(r9)     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r1)     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            goto L_0x04c1
        L_0x04b9:
            r0 = move-exception
            goto L_0x04bc
        L_0x04bb:
            r0 = move-exception
        L_0x04bc:
            r15 = r22
        L_0x04be:
            r1 = r24
            goto L_0x0502
        L_0x04c1:
            r1 = 1
            r2 = 0
            r12.setReadable(r1, r2)     // Catch:{ IOException -> 0x04ed, RuntimeException -> 0x04eb }
            boolean r1 = r0.isFile()     // Catch:{ IOException -> 0x04ed, RuntimeException -> 0x04eb }
            if (r1 == 0) goto L_0x04d4
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            r0.setLastModified(r1)     // Catch:{ IOException -> 0x04bb, RuntimeException -> 0x04b9 }
            goto L_0x04d7
        L_0x04d4:
            r0.createNewFile()     // Catch:{ IOException -> 0x04d7, RuntimeException -> 0x04b9 }
        L_0x04d7:
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x04ed, RuntimeException -> 0x04eb }
            r8.mo9421a((java.lang.String) r9, (java.lang.String) r0, (int) r11)     // Catch:{ IOException -> 0x04ed, RuntimeException -> 0x04eb }
            java.util.Set<java.lang.String> r0 = f9742d     // Catch:{ IOException -> 0x04ed, RuntimeException -> 0x04eb }
            r1 = r24
            r0.remove(r1)     // Catch:{ IOException -> 0x04e9, RuntimeException -> 0x04e7 }
            r0 = 1
            return r0
        L_0x04e7:
            r0 = move-exception
            goto L_0x04f0
        L_0x04e9:
            r0 = move-exception
            goto L_0x04f0
        L_0x04eb:
            r0 = move-exception
            goto L_0x04ee
        L_0x04ed:
            r0 = move-exception
        L_0x04ee:
            r1 = r24
        L_0x04f0:
            r15 = r22
            goto L_0x0502
        L_0x04f3:
            r0 = move-exception
            goto L_0x04f6
        L_0x04f5:
            r0 = move-exception
        L_0x04f6:
            r27 = r4
            r1 = r10
            goto L_0x0500
        L_0x04fa:
            r0 = move-exception
            goto L_0x04fd
        L_0x04fc:
            r0 = move-exception
        L_0x04fd:
            r27 = r4
            r1 = r14
        L_0x0500:
            r22 = r15
        L_0x0502:
            r10 = r27
            r2 = 0
            goto L_0x052a
        L_0x0506:
            r1 = r14
            r22 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x051e, RuntimeException -> 0x051c }
            java.lang.String r2 = "Invalid protocol."
            r0.<init>(r2)     // Catch:{ IOException -> 0x051e, RuntimeException -> 0x051c }
            throw r0     // Catch:{ IOException -> 0x051e, RuntimeException -> 0x051c }
        L_0x0511:
            r1 = r14
            r22 = r15
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x051e, RuntimeException -> 0x051c }
            java.lang.String r2 = "Too many redirects (20)"
            r0.<init>(r2)     // Catch:{ IOException -> 0x051e, RuntimeException -> 0x051c }
            throw r0     // Catch:{ IOException -> 0x051e, RuntimeException -> 0x051c }
        L_0x051c:
            r0 = move-exception
            goto L_0x051f
        L_0x051e:
            r0 = move-exception
        L_0x051f:
            r15 = r22
            goto L_0x0528
        L_0x0522:
            r0 = move-exception
            goto L_0x0525
        L_0x0524:
            r0 = move-exception
        L_0x0525:
            r1 = r14
            r22 = r15
        L_0x0528:
            r2 = 0
            r10 = 0
        L_0x052a:
            boolean r3 = r0 instanceof java.lang.RuntimeException
            if (r3 == 0) goto L_0x0537
            com.google.android.gms.internal.ads.Id r3 = com.google.android.gms.ads.internal.C1697X.m7702i()
            java.lang.String r4 = "VideoStreamFullFileCache.preload"
            r3.mo8319a((java.lang.Throwable) r0, (java.lang.String) r4)
        L_0x0537:
            r10.close()     // Catch:{ IOException | NullPointerException -> 0x053a }
        L_0x053a:
            boolean r3 = r8.f9745g
            if (r3 == 0) goto L_0x0562
            java.lang.String r0 = java.lang.String.valueOf(r31)
            int r0 = r0.length()
            int r0 = r0 + 26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = "Preload aborted for URL \""
            r3.append(r0)
            r3.append(r9)
            java.lang.String r0 = "\""
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.internal.ads.C2227Cf.m9534c(r0)
            goto L_0x0585
        L_0x0562:
            java.lang.String r3 = java.lang.String.valueOf(r31)
            int r3 = r3.length()
            int r3 = r3 + 25
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Preload failed for URL \""
            r4.append(r3)
            r4.append(r9)
            java.lang.String r3 = "\""
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.google.android.gms.internal.ads.C2227Cf.m9535c(r3, r0)
        L_0x0585:
            boolean r0 = r12.exists()
            if (r0 == 0) goto L_0x05af
            boolean r0 = r12.delete()
            if (r0 != 0) goto L_0x05af
            java.lang.String r0 = "Could not delete partial cache file at "
            java.lang.String r3 = r12.getAbsolutePath()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x05a6
            java.lang.String r0 = r0.concat(r3)
            goto L_0x05ac
        L_0x05a6:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            r0 = r3
        L_0x05ac:
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r0)
        L_0x05af:
            java.lang.String r0 = r12.getAbsolutePath()
            r8.mo9422a(r9, r0, r15, r2)
            java.util.Set<java.lang.String> r0 = f9742d
            r0.remove(r1)
            r1 = 0
            return r1
        L_0x05bd:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x05bd }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3263lh.mo9423a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public final void mo9424b() {
        this.f9745g = true;
    }
}
