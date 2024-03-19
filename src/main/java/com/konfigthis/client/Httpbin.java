package com.konfigthis.client;

import com.konfigthis.client.api.AnythingApi;
import com.konfigthis.client.api.AuthApi;
import com.konfigthis.client.api.CookiesApi;
import com.konfigthis.client.api.DynamicDataApi;
import com.konfigthis.client.api.HttpMethodsApi;
import com.konfigthis.client.api.ImagesApi;
import com.konfigthis.client.api.RedirectsApi;
import com.konfigthis.client.api.RequestInspectionApi;
import com.konfigthis.client.api.ResponseFormatsApi;
import com.konfigthis.client.api.ResponseInspectionApi;
import com.konfigthis.client.api.StatusCodesApi;

public class Httpbin {
    private ApiClient apiClient;
    public final AnythingApi anything;
    public final AuthApi auth;
    public final CookiesApi cookies;
    public final DynamicDataApi dynamicData;
    public final HttpMethodsApi httpMethods;
    public final ImagesApi images;
    public final RedirectsApi redirects;
    public final RequestInspectionApi requestInspection;
    public final ResponseFormatsApi responseFormats;
    public final ResponseInspectionApi responseInspection;
    public final StatusCodesApi statusCodes;

    public Httpbin() {
        this(null);
    }

    public Httpbin(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.anything = new AnythingApi(this.apiClient);
        this.auth = new AuthApi(this.apiClient);
        this.cookies = new CookiesApi(this.apiClient);
        this.dynamicData = new DynamicDataApi(this.apiClient);
        this.httpMethods = new HttpMethodsApi(this.apiClient);
        this.images = new ImagesApi(this.apiClient);
        this.redirects = new RedirectsApi(this.apiClient);
        this.requestInspection = new RequestInspectionApi(this.apiClient);
        this.responseFormats = new ResponseFormatsApi(this.apiClient);
        this.responseInspection = new ResponseInspectionApi(this.apiClient);
        this.statusCodes = new StatusCodesApi(this.apiClient);
    }

}
