package org.principle.SingleResponsibility.impl;

import org.principle.SingleResponsibility.IUserService;

public class GuestUserServiceImpl implements IUserService {
    @Override
    public void advertisement() {
        System.out.println("guest,long advertisement");
    }

    @Override
    public void blueLight() {
        System.out.println("guest,only 720P");
    }
}
