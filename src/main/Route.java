/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import github.alexozekoski.http.route.RouteGroup;

/**
 *
 * @author alexo
 */
public class Route extends RouteGroup {

    public Route() {
        addGroup(new Controller());
        System.out.println(this);
    }

}
