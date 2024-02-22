package org.principle.SingleResponsibility.impl;

import org.principle.SingleResponsibility.IUserService;

public class VipUserServiceImpl implements IUserService {
    @Override
    public void advertisement() {
        System.out.println("Vip,No advertisement");
    }

    @Override
    public void blueLight() {
        System.out.println("Vip,high quality");
    }
}
