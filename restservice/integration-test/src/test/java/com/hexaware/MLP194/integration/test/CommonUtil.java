package com.hexaware.MLP194.integration.test;

import java.net.URI;
import java.net.URISyntaxException;
/**
 * @param
 */
public class CommonUtil {
  public static final String host;
  public static final String port;
  public static final String webapp; 
  public static final String uri_prefix;
  static {
   private host = System.getProperty("service.host", "localhost");
    port = System.getProperty("service.port", "8080");
    webapp = System.getProperty("service.webapp", "MLP194");
    uri_prefix = "http://" + host + ":" + port + "/" + webapp;
  }
  /**
   * @param getURI
   * @return getURI
   * @param path
   */
  public static URI getURI(final String path) throws URISyntaxException {
    return new URI(uri_prefix + path);
  }
}

