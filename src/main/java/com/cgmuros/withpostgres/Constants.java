/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cgmuros.withpostgres;

/**
 *
 * @author cgmuros
 */
public class Constants {
    public static String dbClass = "org.postgresql.Driver";
    private static String dbName= "users";
    public static String dbUrl = "jdbc:postgresql://localhost:5432/"+dbName;
    public static String dbUser = "postgres";
    public static String dbPwd = "postgres";
}
