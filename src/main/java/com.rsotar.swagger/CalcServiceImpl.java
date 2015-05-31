package com.rsotar.swagger;

import javax.ws.rs.PathParam;

public class CalcServiceImpl implements CalcService{

    @Override
    public int addOperation(int addNum1, int addNum2) {
        return (addNum1 + addNum2);
    }

    @Override
    public int subOperation(@PathParam("subNum1") int subNum1, @PathParam("subNum2") int subNum2) {
        return (subNum1 - subNum2);
    }
}
