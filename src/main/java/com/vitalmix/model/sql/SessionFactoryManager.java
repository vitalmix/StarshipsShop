package com.vitalmix.model.sql;

import com.vitalmix.model.Starship;
import com.vitalmix.model.modules.*;
import com.vitalmix.model.weapons.LaserGun;
import com.vitalmix.model.weapons.MachineGun;
import com.vitalmix.model.weapons.RocketsLauncher;
import com.vitalmix.model.weapons.Weapon;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryManager {

    private static SessionFactory factory;

    public static void createSessionFactory() {
        factory = new Configuration()
                .configure()
                .addAnnotatedClass(Starship.class)
                .addAnnotatedClass(Weapon.class)
                .addAnnotatedClass(LaserGun.class)
                .addAnnotatedClass(MachineGun.class)
                .addAnnotatedClass(RocketsLauncher.class)
                .addAnnotatedClass(Module.class)
                .addAnnotatedClass(ArmorShield.class)
                .addAnnotatedClass(CargoSpaceContraction.class)
                .addAnnotatedClass(EnergyShield.class)
                .addAnnotatedClass(Hyperdrive.class)
                .addAnnotatedClass(SpeedBooster.class)
                .buildSessionFactory();
    }

    public static Session getCurrentSession() {
        return factory.getCurrentSession();
    }

    public static void closeSessionFactory() {
        factory.close();
    }
}
