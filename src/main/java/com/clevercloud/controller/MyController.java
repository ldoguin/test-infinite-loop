package com.clevercloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ldoguin on 7/10/17.
 */
@Controller("/clevercloud/resources")
public class MyController {

    @RequestMapping(method = RequestMethod.POST )
    public ProvisioningResponse provision(ProvisioningRequest req) throws Exception {
        System.out.println(req);
        return new ProvisioningResponse();
    }

}

class ProvisioningRequest {
    public String id;

}

class ProvisioningResponse {
    public String id;

}
