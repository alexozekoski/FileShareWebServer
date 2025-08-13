/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import github.alexozekoski.http.server.Server;
import java.io.IOException;

/**
 *
 * @author alexo
 */
public class App {
    public static void main(String[] args) throws IOException {
        Server server = new Server(9000);
        server.setRouteGroup(new Route());
        server.start();
    }
}
