package com.jsa.sample.logging.other;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OtherClass {
  // Logger
  private Logger logger;

  public OtherClass(){
    logger = LoggerFactory.getLogger(OtherClass.class);
  }
  
  public void log(){
    logger.error("Error");
    logger.warn("Warn");
    logger.info("Info");
    logger.debug("Debug");
    logger.trace("Trace");
  }
}
