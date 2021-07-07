package models;

import enums.UserRole;

public class Principal extends User {

    public Principal(int id, String name) {
        super(id, name, UserRole.PRINCIPAL);
    }
}
