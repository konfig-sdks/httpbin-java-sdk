/*
 * httpbin.org
 * A simple HTTP Request & Response Service.<br/> <br/> <b>Run locally: </b> <code>$ docker run -p 80:80 kennethreitz/httpbin</code>
 *
 * The version of the OpenAPI document: 0.9.2
 * Contact: me@kennethreitz.org
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResponseFormatsApi
 */
@Disabled
public class ResponseFormatsApiTest {

    private static ResponseFormatsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ResponseFormatsApi(apiClient);
    }

    /**
     * Returns Brotli-encoded data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void brotliGetDataTest() throws ApiException {
        api.brotliGetData()
                .execute();
        // TODO: test validations
    }

    /**
     * Returns Deflate-encoded data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deflateDataGetTest() throws ApiException {
        api.deflateDataGet()
                .execute();
        // TODO: test validations
    }

    /**
     * Returns page denied by robots.txt rules.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deniedPageGetTest() throws ApiException {
        api.deniedPageGet()
                .execute();
        // TODO: test validations
    }

    /**
     * Returns some robots.txt rules.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRobotsRulesTest() throws ApiException {
        api.getRobotsRules()
                .execute();
        // TODO: test validations
    }

    /**
     * Returns GZip-encoded data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gzipDataGetTest() throws ApiException {
        api.gzipDataGet()
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a simple HTML document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void simpleHtmlGetTest() throws ApiException {
        api.simpleHtmlGet()
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a simple JSON document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void simpleJsonGetTest() throws ApiException {
        api.simpleJsonGet()
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a simple XML document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void simpleXmlGetTest() throws ApiException {
        api.simpleXmlGet()
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a UTF-8 encoded body.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void utf8BodyGetTest() throws ApiException {
        api.utf8BodyGet()
                .execute();
        // TODO: test validations
    }

}