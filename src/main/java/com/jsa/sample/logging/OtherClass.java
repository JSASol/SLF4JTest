package com.jsa.sample.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OtherClass {
  // Logger
  private Logger logger;

  public OtherClass(){
    logger = LoggerFactory.getLogger(OtherClass.class);    
    logger.info("Other class created.");
  }
  
  public void log(){
    logger.error("Error");
    logger.warn("Warn");
    logger.info("Info");
    logger.debug("Debug");
    logger.trace("Trace");
  }
}
