package com.whatsmedia.ibeaconshakingproject.shakingDetect;

import android.net.Uri;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;

/* renamed from: com.whatsmedia.ibeaconshakingproject.shakingDetect.j */
public class C5176j {

    /* renamed from: a */
    public static ArrayList<C5170e> f14543a;

    /* renamed from: a */
    public static String m20025a(String str, Uri.Builder builder) {
        StringBuilder sb = new StringBuilder();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setReadTimeout(BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT);
            httpURLConnection.setConnectTimeout(BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT);
            httpURLConnection.setRequestMethod(HttpPost.METHOD_NAME);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(true);
            String encodedQuery = builder.build().getEncodedQuery();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, HTTP.UTF_8));
            bufferedWriter.write(encodedQuery);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static synchronized void m20026a(C5170e eVar) {
        synchronized (C5176j.class) {
            Iterator<C5170e> it = f14543a.iterator();
            while (it.hasNext()) {
                C5170e next = it.next();
                if (next.f14529a.equals(eVar.f14529a)) {
                    next.f14530b = eVar.f14530b;
                    next.f14531c = eVar.f14531c;
                    return;
                }
            }
            f14543a.add(eVar);
        }
    }
}
