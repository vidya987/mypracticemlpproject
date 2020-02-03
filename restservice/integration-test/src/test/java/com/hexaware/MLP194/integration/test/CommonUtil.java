package com.hexaware.MLP194.integration.test;

import java.net.URI;
import java.net.URISyntaxException;
/**
 *@author hexaware
 */
public class CommonUtil {
  public static final String hostId;
  public static final String portId;
  public static final String webApp; 
  public static final String uriPreFix;
  static {
    String hostId = System.getProperty("service.host", "localhost");
    portId = System.getProperty("service.port", "8080");
    webApp = System.getProperty("service.webapp", "MLP194");
    uriPreFix = "http://" + hostId + ":" + portId + "/" + webApp;
  }
  /**
   * @param path to get path
   * @return path
   * @throws URISyntaxException for Exception handling.
   */
  public static URI getURI(final String path) throws URISyntaxException {
    return new URI(uriPreFix + path);
  }
}

