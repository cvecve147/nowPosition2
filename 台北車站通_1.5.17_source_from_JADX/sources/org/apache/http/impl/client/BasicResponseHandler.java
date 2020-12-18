package org.apache.http.impl.client;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.EntityUtils;

@Immutable
public class BasicResponseHandler extends AbstractResponseHandler<String> {
    public String handleEntity(HttpEntity httpEntity) {
        return EntityUtils.toString(httpEntity);
    }

    public String handleResponse(HttpResponse httpResponse) {
        return (String) super.handleResponse(httpResponse);
    }
}
