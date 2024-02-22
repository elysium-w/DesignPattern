package org.principle.SingleRespomsiblity;

import org.principle.SingleResponsibility.IUserService;
import org.principle.SingleResponsibility.impl.GuestUserServiceImpl;

public class ApiTest {
    public static void main(String[] args) {
        IUserService guest = new GuestUserServiceImpl();
        guest.advertisement();
        guest.blueLight();
    }
}
