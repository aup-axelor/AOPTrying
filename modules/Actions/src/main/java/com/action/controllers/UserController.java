package com.action.controllers;

import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;

public class UserController {

    public void test(ActionRequest request, ActionResponse response){
        response.setFlash("Hey im a flash");
    }

}
