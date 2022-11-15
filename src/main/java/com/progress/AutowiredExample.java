package com.progress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class AutowiredExample {
    
    @Autowired
    HelloBean helloBean;

    @Autowired
    @Qualifier("standardTransferService")
    TransferService transferService;

    public String getMessage() {
        helloBean.setMessage("Hello world from Autowired");
        transferService.transfer(33);
        return helloBean.getMessage();
    }
}
