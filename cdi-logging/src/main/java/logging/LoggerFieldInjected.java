package logging;

import org.slf4j.Logger;

import javax.inject.Inject;

/**
 * @author Alexis Hassler
 */
public class LoggerFieldInjected {

    @Inject Logger logger;

    public void doSomething() {
        logger.info("I'm doing something");
    }
}
