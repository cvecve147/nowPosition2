package com.nostra13.universalimageloader.core.download;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.nostra13.universalimageloader.core.assist.ContentLengthInputStream;
import com.nostra13.universalimageloader.core.download.ImageDownloader;
import com.nostra13.universalimageloader.utils.IoUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.HttpHeaders;

public class BaseImageDownloader implements ImageDownloader {
    protected static final String ALLOWED_URI_CHARS = "@#&=*+-_.,:!?()/~'%";
    protected static final int BUFFER_SIZE = 32768;
    protected static final String CONTENT_CONTACTS_URI_PREFIX = "content://com.android.contacts/";
    public static final int DEFAULT_HTTP_CONNECT_TIMEOUT = 5000;
    public static final int DEFAULT_HTTP_READ_TIMEOUT = 20000;
    private static final String ERROR_UNSUPPORTED_SCHEME = "UIL doesn't support scheme(protocol) by default [%s]. You should implement this support yourself (BaseImageDownloader.getStreamFromOtherSource(...))";
    protected static final int MAX_REDIRECT_COUNT = 5;
    protected final int connectTimeout;
    protected final Context context;
    protected final int readTimeout;

    /* renamed from: com.nostra13.universalimageloader.core.download.BaseImageDownloader$1 */
    static /* synthetic */ class C42181 {

        /* renamed from: $SwitchMap$com$nostra13$universalimageloader$core$download$ImageDownloader$Scheme */
        static final /* synthetic */ int[] f12540x4730d1a3 = new int[ImageDownloader.Scheme.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.nostra13.universalimageloader.core.download.ImageDownloader$Scheme[] r0 = com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12540x4730d1a3 = r0
                int[] r0 = f12540x4730d1a3     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.nostra13.universalimageloader.core.download.ImageDownloader$Scheme r1 = com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.HTTP     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f12540x4730d1a3     // Catch:{ NoSuchFieldError -> 0x001f }
                com.nostra13.universalimageloader.core.download.ImageDownloader$Scheme r1 = com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.HTTPS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f12540x4730d1a3     // Catch:{ NoSuchFieldError -> 0x002a }
                com.nostra13.universalimageloader.core.download.ImageDownloader$Scheme r1 = com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.FILE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f12540x4730d1a3     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.nostra13.universalimageloader.core.download.ImageDownloader$Scheme r1 = com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.CONTENT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f12540x4730d1a3     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.nostra13.universalimageloader.core.download.ImageDownloader$Scheme r1 = com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.ASSETS     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f12540x4730d1a3     // Catch:{ NoSuchFieldError -> 0x004b }
                com.nostra13.universalimageloader.core.download.ImageDownloader$Scheme r1 = com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.DRAWABLE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f12540x4730d1a3     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.nostra13.universalimageloader.core.download.ImageDownloader$Scheme r1 = com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.core.download.BaseImageDownloader.C42181.<clinit>():void");
        }
    }

    public BaseImageDownloader(Context context2) {
        this(context2, DEFAULT_HTTP_CONNECT_TIMEOUT, DEFAULT_HTTP_READ_TIMEOUT);
    }

    public BaseImageDownloader(Context context2, int i, int i2) {
        this.context = context2.getApplicationContext();
        this.connectTimeout = i;
        this.readTimeout = i2;
    }

    @TargetApi(8)
    private InputStream getVideoThumbnailStream(String str) {
        Bitmap createVideoThumbnail;
        if (Build.VERSION.SDK_INT < 8 || (createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 2)) == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createVideoThumbnail.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    private boolean isVideoContentUri(Uri uri) {
        String type = this.context.getContentResolver().getType(uri);
        return type != null && type.startsWith("video/");
    }

    private boolean isVideoFileUri(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
        return mimeTypeFromExtension != null && mimeTypeFromExtension.startsWith("video/");
    }

    /* access modifiers changed from: protected */
    public HttpURLConnection createConnection(String str, Object obj) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(Uri.encode(str, ALLOWED_URI_CHARS)).openConnection();
        httpURLConnection.setConnectTimeout(this.connectTimeout);
        httpURLConnection.setReadTimeout(this.readTimeout);
        return httpURLConnection;
    }

    /* access modifiers changed from: protected */
    @TargetApi(14)
    public InputStream getContactPhotoStream(Uri uri) {
        ContentResolver contentResolver = this.context.getContentResolver();
        return Build.VERSION.SDK_INT >= 14 ? ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true) : ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
    }

    public InputStream getStream(String str, Object obj) {
        switch (C42181.f12540x4730d1a3[ImageDownloader.Scheme.ofUri(str).ordinal()]) {
            case 1:
            case 2:
                return getStreamFromNetwork(str, obj);
            case 3:
                return getStreamFromFile(str, obj);
            case 4:
                return getStreamFromContent(str, obj);
            case 5:
                return getStreamFromAssets(str, obj);
            case 6:
                return getStreamFromDrawable(str, obj);
            default:
                return getStreamFromOtherSource(str, obj);
        }
    }

    /* access modifiers changed from: protected */
    public InputStream getStreamFromAssets(String str, Object obj) {
        return this.context.getAssets().open(ImageDownloader.Scheme.ASSETS.crop(str));
    }

    /* access modifiers changed from: protected */
    public InputStream getStreamFromContent(String str, Object obj) {
        ContentResolver contentResolver = this.context.getContentResolver();
        Uri parse = Uri.parse(str);
        if (isVideoContentUri(parse)) {
            Bitmap thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, Long.valueOf(parse.getLastPathSegment()).longValue(), 1, (BitmapFactory.Options) null);
            if (thumbnail != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                thumbnail.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
        } else if (str.startsWith(CONTENT_CONTACTS_URI_PREFIX)) {
            return getContactPhotoStream(parse);
        }
        return contentResolver.openInputStream(parse);
    }

    /* access modifiers changed from: protected */
    public InputStream getStreamFromDrawable(String str, Object obj) {
        return this.context.getResources().openRawResource(Integer.parseInt(ImageDownloader.Scheme.DRAWABLE.crop(str)));
    }

    /* access modifiers changed from: protected */
    public InputStream getStreamFromFile(String str, Object obj) {
        String crop = ImageDownloader.Scheme.FILE.crop(str);
        return isVideoFileUri(str) ? getVideoThumbnailStream(crop) : new ContentLengthInputStream(new BufferedInputStream(new FileInputStream(crop), 32768), (int) new File(crop).length());
    }

    /* access modifiers changed from: protected */
    public InputStream getStreamFromNetwork(String str, Object obj) {
        HttpURLConnection createConnection = createConnection(str, obj);
        int i = 0;
        while (createConnection.getResponseCode() / 100 == 3 && i < 5) {
            createConnection = createConnection(createConnection.getHeaderField(HttpHeaders.LOCATION), obj);
            i++;
        }
        try {
            InputStream inputStream = createConnection.getInputStream();
            if (shouldBeProcessed(createConnection)) {
                return new ContentLengthInputStream(new BufferedInputStream(inputStream, 32768), createConnection.getContentLength());
            }
            IoUtils.closeSilently(inputStream);
            throw new IOException("Image request failed with response code " + createConnection.getResponseCode());
        } catch (IOException e) {
            IoUtils.readAndCloseStream(createConnection.getErrorStream());
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public InputStream getStreamFromOtherSource(String str, Object obj) {
        throw new UnsupportedOperationException(String.format(ERROR_UNSUPPORTED_SCHEME, new Object[]{str}));
    }

    /* access modifiers changed from: protected */
    public boolean shouldBeProcessed(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getResponseCode() == 200;
    }
}
