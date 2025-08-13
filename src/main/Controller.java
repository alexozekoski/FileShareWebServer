/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import github.alexozekoski.http.route.RouteMethod;
import java.util.Date;

/**
 *
 * @author alexo
 */
public class Controller {

    @RouteMethod("status")
    public String status() {
        return new Date().toString();
    }
}
