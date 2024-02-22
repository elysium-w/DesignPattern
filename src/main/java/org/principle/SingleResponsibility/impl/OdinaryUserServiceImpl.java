package org.principle.SingleResponsibility.impl;

import org.principle.SingleResponsibility.IUserService;

public class OdinaryUserServiceImpl implements IUserService {
    @Override
    public void advertisement() {
        System.out.println("ordinary,short advertisement");
    }

    @Override
    public void blueLight() {
        System.out.println("ordinary,1080p");
    }
}
