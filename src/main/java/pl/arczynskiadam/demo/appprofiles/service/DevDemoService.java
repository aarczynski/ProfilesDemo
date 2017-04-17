package pl.arczynskiadam.demo.appprofiles.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.arczynskiadam.demo.appprofiles.config.ServiceProperties;

@Service
public class DevDemoService implements DemoService {

    private static final Logger LOG = LoggerFactory.getLogger(DevDemoService.class);

    @Autowired
    ServiceProperties properties;

    @Override
    public void action() {
        LOG.info("DEV service property: " + properties.getProperty());
    }
}
