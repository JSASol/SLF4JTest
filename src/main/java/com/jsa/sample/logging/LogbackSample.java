package com.jsa.sample.logging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SLF4J + Logback Sample Program
 */
public class LogbackSample {
  // Logger
  private static Logger logger;

  /**
   * Entry point
   * @param args
   */
  public static void main(String[] args){
    // Create Logger
    logger = LoggerFactory.getLogger(LogbackSample.class);
    
    logger.error("Error");
    logger.warn("Warn");
    logger.info("Info");
    logger.debug("Debug");
    logger.trace("Trace");
    
    OtherClass other = new OtherClass();
    other.log();
  }
}
